package com.lovestory.dm.principle.segregation;

public class S1_Segregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface InterfaceS1 {
	void operation1();

	void operation2();

	void operation3();

	void operation4();

	void operation5();
}

class Class1_S1 implements InterfaceS1 {

	@Override
	public void operation1() {
		System.out.println("Class1_S1 实现了operation1");

	}

	@Override
	public void operation2() {
		System.out.println("Class1_S1 实现了operation2");

	}

	@Override
	public void operation3() {
		System.out.println("Class1_S1 实现了operation3");

	}

	@Override
	public void operation4() {
		System.out.println("Class1_S1 实现了operation4");

	}

	@Override
	public void operation5() {
		System.out.println("Class1_S1 实现了operation5");

	}

}

class Class2_S1 implements InterfaceS1 {

	@Override
	public void operation1() {
		System.out.println("Class2_S1 实现了operation1");

	}

	@Override
	public void operation2() {
		System.out.println("Class2_S1 实现了operation2");

	}

	@Override
	public void operation3() {
		System.out.println("Class2_S1 实现了operation3");

	}

	@Override
	public void operation4() {
		System.out.println("Class2_S1 实现了operation4");

	}

	@Override
	public void operation5() {
		System.out.println("Class2_S1 实现了operation5");

	}
}

//Class3_S1通过接口InterfaceS1依赖使用Class1_S1类，但是只会用到1,2,3方法
class Class3_S1 {
	public void depend1(InterfaceS1 i) {
		i.operation1();
	}
	public void depend2(InterfaceS1 i) {
		i.operation2();
	}
	public void depend3(InterfaceS1 i) {
		i.operation3();
	}
}

// Class4_S1通过接口InterfaceS1依赖使用Class2_S1类，但是只会用到1,4,5方法
class Class4_S1 {
	public void depend1(InterfaceS1 i) {
		i.operation1();
	}
	public void depend4(InterfaceS1 i) {
		i.operation4();
	}
	public void depend5(InterfaceS1 i) {
		i.operation5();
	}
}
