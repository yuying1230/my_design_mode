package com.lovestory.dm.structure_dm.decorator.be_decorated;

import com.lovestory.dm.structure_dm.decorator.DEC1_Coffee;

public class DEC1_Espresso extends DEC1_Coffee {
	// 咖啡的价格在点的时候就应该知道，所以需要设置一个构造器
	public DEC1_Espresso() {
		setDescription("意大利咖啡");
		setPrice(6.0F);
	}
}
