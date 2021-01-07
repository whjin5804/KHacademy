package com_whjin5804_mkapp;

public class FriendManager2 {
	public static void main(String[] args) {
		Friend[] friend = new Friend[10];
		
		int cnt = 0;

		friend[cnt++] = new UnivFriend("홍", "컴퓨터", "010");
		friend[cnt++] = new UnivFriend("킴", "미술", "011");
		
		friend[cnt++] = new CompFriend("이", "인사부", "010");
		friend[cnt++] = new CompFriend("박", "회계부", "010");
		friend[cnt++] = new CompFriend("진", "재정부", "010");

		for (int i = 0; i < cnt; i++) {
			friend[i].showInfo();
			System.out.println();
		}
	}
}
