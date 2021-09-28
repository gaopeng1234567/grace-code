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
 * @date: Created in 2021/8/23 8:58 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class JianBingJiaXiangChang extends JianBingJIaDan {
	@Override
	public String getDesc() {

		return super.getDesc() + "  加香肠";
	}

	@Override
	public int price() {
		return super.price() + 3;
	}
}
