package com.lovestory.dm.structure_dm.decorator.be_decorated;

import com.lovestory.dm.structure_dm.decorator.DEC1_Coffee;

public class DEC1_Espresso extends DEC1_Coffee {
	// ���ȵļ۸��ڵ��ʱ���Ӧ��֪����������Ҫ����һ��������
	public DEC1_Espresso() {
		setDescription("���������");
		setPrice(6.0F);
	}
}
