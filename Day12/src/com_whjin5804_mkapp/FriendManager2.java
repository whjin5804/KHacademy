package com_whjin5804_mkapp;

public class FriendManager2 {
	public static void main(String[] args) {
		Friend[] friend = new Friend[10];
		
		int cnt = 0;

		friend[cnt++] = new UnivFriend("ȫ", "��ǻ��", "010");
		friend[cnt++] = new UnivFriend("Ŵ", "�̼�", "011");
		
		friend[cnt++] = new CompFriend("��", "�λ��", "010");
		friend[cnt++] = new CompFriend("��", "ȸ���", "010");
		friend[cnt++] = new CompFriend("��", "������", "010");

		for (int i = 0; i < cnt; i++) {
			friend[i].showInfo();
			System.out.println();
		}
	}
}
