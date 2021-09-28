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
 * @date: Created in 2021/8/23 9:25 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class TestDemo {
	public static void main(String[] args) {
		AbstractJianBing jianBing = new JianBing();
		jianBing = new EggDecorator(jianBing);
		jianBing = new EggDecorator(jianBing);
		jianBing = new XiangChangDecorator(jianBing);
		System.out.println(jianBing.getDesc()+jianBing.price());

	}
}
