package com.lovestory.dm.structure_dm.decorator.decorator;

import com.lovestory.dm.structure_dm.decorator.DEC1_Decorator;
import com.lovestory.dm.structure_dm.decorator.DEC1_Drink;

public class DEC1_Milk extends DEC1_Decorator {

	public DEC1_Milk(DEC1_Drink drink) {
		super(drink);
		setDescription("еёдл");
		setPrice(1.5F);
	}

}
