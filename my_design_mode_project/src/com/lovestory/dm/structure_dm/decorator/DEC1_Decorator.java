package com.lovestory.dm.structure_dm.decorator;

public class DEC1_Decorator extends DEC1_Drink {

	private DEC1_Drink drink;

	public DEC1_Decorator(DEC1_Drink drink) {
		this.drink = drink;
	}

	@Override
	public float cost() {
		// getPrice 是调料自己的价格
		return super.getPrice() + drink.cost();
	}

	@Override
	public String getDescription() {
		return super.description + " " + super.getPrice() + " && " + drink.getDescription();
	}
}
