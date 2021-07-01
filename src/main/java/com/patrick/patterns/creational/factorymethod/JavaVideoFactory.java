package com.patrick.patterns.creational.factorymethod;

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
 * @date: Created in 2021/6/26 9:42 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class JavaVideoFactory extends VideoFactory {
	@Override
	public Video produceVideo() {
		return new JavaVideo();
	}
}
