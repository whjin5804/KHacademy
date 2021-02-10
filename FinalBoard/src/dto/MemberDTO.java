package dto;

//CREATE TABLE BOARD_MEMBER (
//	    MEMBER_ID VARCHAR2(100) PRIMARY KEY
//	    , PASSWORD VARCHAR2(100) NOT NULL
//	    , NAME VARCHAR2(100)
//	);
public class MemberDTO {
    
	private String memberId;
	private String password;
	private String name;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
