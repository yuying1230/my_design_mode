package com.lovestory.dm.principle.liskov_substitution;

public class L1_Liskov {
	public static void main(String[] args) {
		L2_A a = new L2_A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));

		System.out.println("-----------------------");
		L2_B b = new L2_B();
		// L2_B类不再继承L2_A，因此调用者不会再调用func1进行求减法
		// 而是调用明确的func3功能
		System.out.println("11+3=" + b.func1(11, 3));// 这里本意是求出 11-3
		System.out.println("1+8=" + b.func1(1, 8));// 1-8 System.out.println("11+3+9=" + b.func2(11, 3));
		System.out.println("4-1=" + b.func3(4, 1));

	}
}

// 创建一个更加基础的基类
class Base {

}

class L2_A extends Base {
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

class L2_B extends Base {
	// 如果L2_B需要使用L2_A类的方法，可以使用组合关系
	private L2_A a = new L2_A();

	public int func1(int num1, int num2) {
		return num1 + num2;
	}

	public int func2(int num1, int num2) {
		return func1(num1, num2) + 1;
	}

	public int func3(int num1, int num2) {
		return this.a.func1(num1, num2);
	}
}