package com.lovestory.dm.structure_dm.decorator;

import com.lovestory.dm.structure_dm.decorator.be_decorated.DEC1_LongBlack;
import com.lovestory.dm.structure_dm.decorator.decorator.DEC1_Chocolate;
import com.lovestory.dm.structure_dm.decorator.decorator.DEC1_Milk;

public class DEC1_Bar {
	
	public static void main(String[] args) {
		// 2份巧克力+1份牛奶+LongBlack
		DEC1_Drink order = new DEC1_LongBlack();
		System.out.println(order.getDescription() + " -- 費用：" + order.cost());
		
		order = new DEC1_Milk(order);
		System.out.println("加入一份牛奶 -- 費用：" + order.cost());
		
		order = new DEC1_Chocolate(order);
		System.out.println("加入一份巧克力 -- 費用：" + order.cost());
		
		order = new DEC1_Chocolate(order);
		System.out.println("再加入一份巧克力 -- 費用：" + order.cost());
		
	}
}
