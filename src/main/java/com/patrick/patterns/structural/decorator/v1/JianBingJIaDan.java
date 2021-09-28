package com.patrick.patterns.structural.decorator.v1;

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
 * @date: Created in 2021/8/23 8:57 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class JianBingJIaDan extends JIanBing {
	@Override
	public String getDesc() {
		return super.getDesc() + "  加个蛋";
	}

	@Override
	public int price() {
		return super.price() + 2;
	}
}
