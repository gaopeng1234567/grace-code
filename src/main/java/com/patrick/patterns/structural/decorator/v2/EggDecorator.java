package com.patrick.patterns.structural.decorator.v2;

/**
 * ｜                 ,;,,;;
 * ｜               ,;;'()     风
 * ｜     __      ,;;' ' \     流
 * ｜  /'  '\'~~'~' \ /'\.)    堪
 * ｜ ,;(      )    /  |.      比
 * ｜,;' \    /-.,,(   ) \     丶
 * ｜    ) /       ) / )|      城
 * ｜    ||        ||  \)      管
 * ｜   (_\       (_\          希
 * @author: 城管丶希
 * @date: Created in 2021/8/23 9:11 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 * 蛋装饰者
 */
public class EggDecorator extends AbstactDecorator {
	public EggDecorator(AbstractJianBing abstractJianBing) {
		super(abstractJianBing);
	}

	@Override
	String getDesc() {
		return super.getDesc() + "加一个鸡蛋";
	}

	@Override
	int price() {
		return super.price() + 2;
	}
}
