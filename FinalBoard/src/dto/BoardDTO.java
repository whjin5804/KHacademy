package dto;

//  BOARD_NUM NUMBER PRIMARY KEY
//, TITLE VARCHAR2(100) NOT NULL
//, CONTENT VARCHAR2(1000)
//, MEMBER_ID VARCHAR2(100) REFERENCES BOARD_MEMBER(MEMBER_ID) 
//, CREATE_DATE DATE DEFAULT SYSDATE
//, READ_CNT NUMBER DEFAULT 0
//, FILE_NAME VARCHAR2(100)
public class BoardDTO {
	//테이블과 매칭될 수 있도록 변수를 만들고
	//getter, setter를 만드세요.
	
	private int boardNum;
	private String title;
	private String content;
	private String memberId; 
	private String createDate;
	private int readCnt;
	private String fileName;
	
	//검색기능을 위한 변수
	private String searchKeyword;
	private String searchValue;
	
	//페이징처리를 위한 변수
	private int startNum;
	private int endNum;

	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public int getEndNum() {
		return endNum;
	}
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	} 
	
	
}
