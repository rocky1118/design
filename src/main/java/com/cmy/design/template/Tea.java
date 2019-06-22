package com.cmy.design.template;

public class Tea extends Bevegrage{

	//原材料放到杯中
	@Override
	public void pourInCup() {
		System.out.println("将茶叶放入杯中");
	}

	//房辅料
	@Override
	public void addCoundiments() {
		System.out.println("添加蜂蜜");
	}

}
