package com.lovestory.dm.principle.segregation;

public class S2_Segregation {

	public static void main(String[] args) {
		Class3_S2 class3_s2 = new Class3_S2();
		// Class3_S2 ͨ���ӿ�����Class1_S2
		class3_s2.depend1(new Class1_S2());
		class3_s2.depend2(new Class1_S2());
		class3_s2.depend3(new Class1_S2());

		Class4_S2 class4_s2 = new Class4_S2();
		// Class4_S2 ͨ���ӿ�����Class2_S2
		class4_s2.depend1(new Class2_S2());
		class4_s2.depend4(new Class2_S2());
		class4_s2.depend5(new Class2_S2());
	}

}

interface Interface1_S2 {
	void operation1();
}

interface Interface2_S2 {
	void operation2();

	void operation3();
}

interface Interface3_S2 {
	void operation4();

	void operation5();
}

class Class1_S2 implements Interface1_S2, Interface2_S2 {

	@Override
	public void operation1() {
		System.out.println("Class1_S2 ʵ����operation1");

	}

	@Override
	public void operation2() {
		System.out.println("Class1_S2 ʵ����operation2");

	}

	@Override
	public void operation3() {
		System.out.println("Class1_S2 ʵ����operation3");

	}
}

class Class2_S2 implements Interface1_S2, Interface3_S2 {

	@Override
	public void operation1() {
		System.out.println("Class2_S2ʵ����operation1");

	}

	@Override
	public void operation4() {
		System.out.println("Class2_S2ʵ����operation4");

	}

	@Override
	public void operation5() {
		System.out.println("Class2_S2 ʵ����operation5");

	}
}

//Class3_S2ͨ���ӿ�Interface1_S2, Interface2_S2����ʹ��Class1_S2�࣬����ֻ���õ�1,2,3����
class Class3_S2 {
	public void depend1(Interface1_S2 i) {
		i.operation1();
	}

	public void depend2(Interface2_S2 i) {
		i.operation2();
	}

	public void depend3(Interface2_S2 i) {
		i.operation3();
	}
}

// Class4_S2ͨ���ӿ�Interface1_S2, Interface3_S2����ʹ��Class2_S2�࣬����ֻ���õ�1,4,5����
class Class4_S2 {
	public void depend1(Interface1_S2 i) {
		i.operation1();
	}

	public void depend4(Interface3_S2 i) {
		i.operation4();
	}

	public void depend5(Interface3_S2 i) {
		i.operation5();
	}
}
