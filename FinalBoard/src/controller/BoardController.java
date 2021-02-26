package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dto.BoardDTO;
import dto.PageDTO;
import dto.ReplyDTO;
import service.BoardService;
import service.BoardServiceImpl;
import service.ReplySerivce;
import service.ReplyServiceImpl;

@WebServlet("*.bo") // 게시판 기능 처리
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BoardService boardService = new BoardServiceImpl();
	ReplySerivce replySerivce = new ReplyServiceImpl();
//	List<BoardDTO> list = new ArrayList<BoardDTO>();
//	BoardDAO dao = new BoardDAO();

	public BoardController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean isRedirect = false;
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String path = "";
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()); // /chapter6/test에서 /chater6의길이만큼을뺌

		// index.jsp, boardWrite.bo > 리스트
		if (command.equals("/boardList.bo")) {
			String searchValue = request.getParameter("searchValue");
			String searchKeyword = request.getParameter("searchKeyword");
			
			//검색기능(검색이 있으면 넣어줌)
			BoardDTO board = new BoardDTO();
			if(searchValue != null && !searchValue.equals("")){
				board.setSearchValue(searchValue);
				board.setSearchKeyword(searchKeyword);
			}//END 검색기능
			
			//페이징 처리
			PageDTO pageInfo = new PageDTO();	//nowPage = 1;
			
			//현재 클릭한 페이지 번호를 받아 옴
			String nowPage = request.getParameter("nowPage");
			if(nowPage != null) {
				pageInfo.setNowPage(Integer.parseInt(nowPage));
			}
			
			//게시글의 총 수
			int totalCnt = boardService.selectBoardCnt();
			pageInfo.setTotalCnt(totalCnt);
			
			pageInfo.createPage();
			request.setAttribute("pageInfo", pageInfo);
			
			board.setStartNum(pageInfo.getStartNum());
			board.setEndNum(pageInfo.getEndNum());
			
			List<BoardDTO> list = boardService.selectBoardList(board);
			request.setAttribute("list", list);
			
			HttpSession session = request.getSession();
			String memberId = (String)session.getAttribute("memberId");
			request.setAttribute("memberId", memberId);
			path = "boardList.jsp";
		}
		
		//boardList.jsp > 상세보기페이지
		else if(command.equals("/boardDetail.bo")) {
			HttpSession session = request.getSession();
			String memberId = (String)session.getAttribute("memberId"); 
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));//이거못받아옴
			BoardDTO board = boardService.selectBoardDetail(boardNum);
			request.setAttribute("board", board);
			request.setAttribute("memberId", memberId);
			
			String uploadPath = getServletContext().getRealPath("/upload");
			request.setAttribute("upload", uploadPath);
			
			boardService.updateReadCnt(boardNum);
			
			//댓글
			List<ReplyDTO> list = replySerivce.selectReplyAll(boardNum);
			request.setAttribute("list", list);
			path = "boardDetail.jsp";
		}
		
		//boardDetail > (해당 게시글의 댓글목록과 게시글을 모두 삭제)
		else if(command.equals("/deleteBoard.bo")) {
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			boardService.deleteBoard(boardNum);
			
			isRedirect = true;
			path = "boardList.bo";
		}
		
		//boardDeatil > 수정
		else if(command.equals("/updateBoardForm.bo")) {
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			BoardDTO board = boardService.selectBoardDetail(boardNum);
			request.setAttribute("board", board);
			
			path = "updateBoardForm.jsp";
		}
		
		//updateBoardForm.jsp > 수정내용받아 바꾸기
		else if(command.equals("/updateBoard.bo")) {
			int boardNum = Integer.parseInt(request.getParameter("boardNum"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			BoardDTO board = new BoardDTO();
			board.setBoardNum(boardNum);
			board.setTitle(title);
			board.setContent(content);
			
			boardService.updateBoard(board);
			
			path = "boardDetail.bo";
		}
		
		//boardList.jsp > 글쓰기
		else if(command.equals("/boardWriteForm.bo")) {
			
			path = "boardWriteForm.jsp";
		}
		
		//boardWriteForm.jsp > 글 데이터 게시판에 넣기
		else if(command.equals("/boardWrite.bo")) {
			//첨부파일
			
			//파일 넣을 곳 지정
			String uploadPath = getServletContext().getRealPath("/upload");
			System.out.println("[첨부파일경로] : " + uploadPath);
			int size = 1024 * 1024 * 10;
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8" ,new DefaultFileRenamePolicy());
			Enumeration files = multi.getFileNames();
			
			//다음 파일 정보를 가져온다
			String file = (String)files.nextElement();
			//서버에 올라간 파일명
			String fileName = multi.getFilesystemName(file);
			//유저가 첨부한 파일명
			String originFileName = multi.getOriginalFileName(file);
			
			//디비에 글 등록
			HttpSession session = request.getSession();
			BoardDTO board = new BoardDTO();
			board.setTitle(multi.getParameter("title"));
			board.setContent(multi.getParameter("content"));
			board.setMemberId((String)session.getAttribute("memberId"));
			board.setFileName(fileName);
			boardService.insertBoard(board);
			
			isRedirect = true;
			path = "boardList.bo";
		}
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(path); // path의 값 즉b.jsp로 이동한다.
		if (isRedirect) {
			response.sendRedirect(path);
		} else {
			dispatcher.forward(request, response);

		}
	}

}
