package com.lovestory.dm.structure_dm.decorator;

public abstract class DEC1_Drink {
	public String description;
	private float price = 0.0F;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public abstract float cost();

}
