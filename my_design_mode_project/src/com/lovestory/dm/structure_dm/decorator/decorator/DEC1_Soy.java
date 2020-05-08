package com.lovestory.dm.structure_dm.decorator.decorator;

import com.lovestory.dm.structure_dm.decorator.DEC1_Decorator;
import com.lovestory.dm.structure_dm.decorator.DEC1_Drink;

public class DEC1_Soy extends DEC1_Decorator {

	public DEC1_Soy(DEC1_Drink drink) {
		super(drink);
		setDescription("¶¹½¬");
		setPrice(1.8F);
	}

}
