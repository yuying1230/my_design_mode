package com.lovestory.dm.principle.inversion;

public class I1_DependencyInversion {
	public static void main(String[] args) {
		Person_I1 person = new Person_I1();
		person.receive(new Email_I1());
	}
}

class Email_I1 {
	public String getInfo() {
		return "email: hello world.";
	}
}

// �÷�ʽʵ�ּ�
// �����ȡ�Ķ�����QQ��΢�ŵȷ�ʽ��Person����Ҫ������Ӧ�Ľ��շ���
class Person_I1 {
	public void receive(Email_I1 email) {
		System.out.println(email.getInfo());
	}
}