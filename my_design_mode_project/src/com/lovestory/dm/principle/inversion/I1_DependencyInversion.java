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

// 该方式实现简单
// 如果获取的对象是QQ、微信等方式，Person类需要增加相应的接收方法
class Person_I1 {
	public void receive(Email_I1 email) {
		System.out.println(email.getInfo());
	}
}