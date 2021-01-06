package com_whjin5804_mkapp;

public class FriendManager {
	public static void main(String[] args) {
		UnivFriend[] univFriends = new UnivFriend[5];
		CompFriend[] compFriends = new CompFriend[5];
		
		int uCnt = 0;
		int cCnt = 0;

		univFriends[uCnt] = new UnivFriend("홍", "컴퓨터", "010");
		uCnt++;
		univFriends[uCnt] = new UnivFriend("킴", "미술", "011");
		uCnt++;
		
		compFriends[cCnt] = new CompFriend("이", "인사부", "010");
		cCnt++;
		compFriends[cCnt] = new CompFriend("박", "회계부", "010");
		cCnt++;
		
		for (int i = 0; i < uCnt; i++) {
			univFriends[i].showInfo(); 
		}
		
		for (int i = 0;  i < cCnt; i++) {
			compFriends[i].showInfo(); 
		}
		
		
		
		}
}
