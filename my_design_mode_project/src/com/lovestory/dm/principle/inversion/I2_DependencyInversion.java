package com.lovestory.dm.principle.inversion;

public class I2_DependencyInversion {
	public static void main(String[] args) {
		Person_I2 person = new Person_I2();
		person.receive(new Email_I2());
		person.receive(new WeChat_I2());
	}
}

// ����һ���ӿڣ�ʹPerson_I2����ӿ�I2_Receiver����������ϵ��
// Email_I2,WeChat_I2����ʵ��I2_Receiver�ӿ�
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
	
	// �ɶԾ�����������ת��Ϊ�Խӿڵ�����
	public void receive(I2_Receiver receiver) {
		System.out.println(receiver.getInfo());
	}
}