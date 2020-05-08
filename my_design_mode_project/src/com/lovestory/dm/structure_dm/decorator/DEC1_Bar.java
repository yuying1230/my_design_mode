package com.lovestory.dm.structure_dm.decorator;

import com.lovestory.dm.structure_dm.decorator.be_decorated.DEC1_LongBlack;
import com.lovestory.dm.structure_dm.decorator.decorator.DEC1_Chocolate;
import com.lovestory.dm.structure_dm.decorator.decorator.DEC1_Milk;

public class DEC1_Bar {
	
	public static void main(String[] args) {
		// 2���ɿ���+1��ţ��+LongBlack
		DEC1_Drink order = new DEC1_LongBlack();
		System.out.println(order.getDescription() + " -- �M�ã�" + order.cost());
		
		order = new DEC1_Milk(order);
		System.out.println("����һ��ţ�� -- �M�ã�" + order.cost());
		
		order = new DEC1_Chocolate(order);
		System.out.println("����һ���ɿ��� -- �M�ã�" + order.cost());
		
		order = new DEC1_Chocolate(order);
		System.out.println("�ټ���һ���ɿ��� -- �M�ã�" + order.cost());
		
	}
}
