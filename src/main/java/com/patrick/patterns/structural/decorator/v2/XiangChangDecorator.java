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
 * @date: Created in 2021/8/23 9:12 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 * 香肠装饰者
 */
public class XiangChangDecorator extends AbstactDecorator {
	public XiangChangDecorator(AbstractJianBing abstractJianBing) {
		super(abstractJianBing);
	}

	@Override
	String getDesc() {
		return super.getDesc() + "加一个香肠";
	}

	@Override
	int price() {
		return super.price() + 3;
	}
}
