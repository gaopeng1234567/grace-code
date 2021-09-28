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
 * @date: Created in 2021/8/23 9:04 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class JianBing extends AbstractJianBing{

	@Override
	String getDesc() {
		return "煎饼";
	}

	@Override
	int price() {
		return 8;
	}
}
