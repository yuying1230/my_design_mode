package com.lovestory.dm.principle.liskov_substitution;

public class L2_Liskov {
	public static void main(String[] args) {
		L1_A a = new L1_A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));

		System.out.println("-----------------------");
		L1_B b = new L1_B();
		System.out.println("11-3=" + b.func1(11, 3));// 这里本意是求出 11-3
		System.out.println("1-8=" + b.func1(1, 8));// 1-8 System.out.println("11+3+9=" + b.func2(11, 3));

	}
}

class L1_A {
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

class L1_B extends L1_A {
	public int func1(int num1, int num2) {
		return num1 + num2;
	}

	public int func2(int num1, int num2) {
		return func1(num1, num2) + 1;
	}
}