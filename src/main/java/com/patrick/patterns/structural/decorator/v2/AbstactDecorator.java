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
 * @date: Created in 2021/8/23 9:05 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 * <p>
 * 精髓，抽象的装饰者继承 抽象的类
 */
public abstract class AbstactDecorator extends AbstractJianBing {
	private AbstractJianBing abstractJianBing;

	public AbstactDecorator(AbstractJianBing abstractJianBing) {
		this.abstractJianBing = abstractJianBing;
	}

	@Override
	String getDesc() {
		return abstractJianBing.getDesc();
	}

	@Override
	int price() {
		return abstractJianBing.price();
	}
}
