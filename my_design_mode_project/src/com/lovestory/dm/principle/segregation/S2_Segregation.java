package com.lovestory.dm.principle.segregation;

public class S2_Segregation {

	public static void main(String[] args) {
		Class3_S2 class3_s2 = new Class3_S2();
		// Class3_S2 通过接口依赖Class1_S2
		class3_s2.depend1(new Class1_S2());
		class3_s2.depend2(new Class1_S2());
		class3_s2.depend3(new Class1_S2());

		Class4_S2 class4_s2 = new Class4_S2();
		// Class4_S2 通过接口依赖Class2_S2
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
		System.out.println("Class1_S2 实现了operation1");

	}

	@Override
	public void operation2() {
		System.out.println("Class1_S2 实现了operation2");

	}

	@Override
	public void operation3() {
		System.out.println("Class1_S2 实现了operation3");

	}
}

class Class2_S2 implements Interface1_S2, Interface3_S2 {

	@Override
	public void operation1() {
		System.out.println("Class2_S2实现了operation1");

	}

	@Override
	public void operation4() {
		System.out.println("Class2_S2实现了operation4");

	}

	@Override
	public void operation5() {
		System.out.println("Class2_S2 实现了operation5");

	}
}

//Class3_S2通过接口Interface1_S2, Interface2_S2依赖使用Class1_S2类，但是只会用到1,2,3方法
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

// Class4_S2通过接口Interface1_S2, Interface3_S2依赖使用Class2_S2类，但是只会用到1,4,5方法
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
