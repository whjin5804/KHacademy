package dto;

//REPLY_NUM NUMBER PRIMARY KEY
//, CONTENT VARCHAR2(100)
//, CREATE_DATE DATE DEFAULT SYSDATE
//, MEMBER_ID VARCHAR2(100)  REFERENCES BOARD_MEMBER(MEMBER_ID)
//, BOARD_NUM NUMBER REFERENCES BOARD(BOARD_NUM)
public class ReplyDTO {
	//테이블과 매칭될 수 있도록 변수를 만들고
	//getter, setter를 만드세요.
	private int replyNum;
	private String content;
	private String createDate;
	private String memberId;
	private int boardNum;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public int getReplyNum() {
		return replyNum;
	}
	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}
	
	
	
}
