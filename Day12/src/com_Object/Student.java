package com_Object;

public class Student {
	private String name;
	private String addr;
	private int age;
	
	public Student(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	@Override //source���� �ҷ��鿩�� �� �ִ�.
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
}
