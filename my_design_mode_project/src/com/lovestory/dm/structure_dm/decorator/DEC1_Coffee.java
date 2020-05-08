package com.lovestory.dm.structure_dm.decorator;

public class DEC1_Coffee extends DEC1_Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}

}
