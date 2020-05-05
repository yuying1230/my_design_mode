package com.lovestory.dm.principle.liskov_substitution;

public class L1_Liskov {
	public static void main(String[] args) {
		L2_A a = new L2_A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));

		System.out.println("-----------------------");
		L2_B b = new L2_B();
		// L2_B�಻�ټ̳�L2_A����˵����߲����ٵ���func1���������
		// ���ǵ�����ȷ��func3����
		System.out.println("11+3=" + b.func1(11, 3));// ���ﱾ������� 11-3
		System.out.println("1+8=" + b.func1(1, 8));// 1-8 System.out.println("11+3+9=" + b.func2(11, 3));
		System.out.println("4-1=" + b.func3(4, 1));

	}
}

// ����һ�����ӻ����Ļ���
class Base {

}

class L2_A extends Base {
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

class L2_B extends Base {
	// ���L2_B��Ҫʹ��L2_A��ķ���������ʹ����Ϲ�ϵ
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