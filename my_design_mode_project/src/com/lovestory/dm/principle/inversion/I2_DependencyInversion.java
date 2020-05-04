package com.lovestory.dm.principle.inversion;

public class I2_DependencyInversion {
	public static void main(String[] args) {
		Person_I2 person = new Person_I2();
		person.receive(new Email_I2());
		person.receive(new WeChat_I2());
	}
}

// 引入一个接口，使Person_I2类与接口I2_Receiver发生依赖关系。
// Email_I2,WeChat_I2各自实现I2_Receiver接口
interface I2_Receiver {
	String getInfo();
}

class Email_I2 implements I2_Receiver {
	public String getInfo() {
		return "email: hello world.";
	}
}

class WeChat_I2 implements I2_Receiver {
	public String getInfo() {
		return "wechat: hello world.";
	}
}

class Person_I2 {
	
	// 由对具体对象的依赖转换为对接口的依赖
	public void receive(I2_Receiver receiver) {
		System.out.println(receiver.getInfo());
	}
}