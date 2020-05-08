package com.lovestory.dm.structure_dm.decorator.decorator;

import com.lovestory.dm.structure_dm.decorator.DEC1_Decorator;
import com.lovestory.dm.structure_dm.decorator.DEC1_Drink;

public class DEC1_Chocolate extends DEC1_Decorator {

	public DEC1_Chocolate(DEC1_Drink drink) {
		super(drink);
		setDescription("ги©ка╕");
		setPrice(1.2F);
	}

}
