package com.patrick.patterns.creational.singleton;

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
 * @date: Created in 2021/8/21 12:32 下午
 * @desc:   饿汗，直接在类加载的时候就进行创建对象
 * @motto: Keep It Simple and Stupid, KISS
 */
public class HungrySingleton {
	private static HungrySingleton hungrySingleton = new HungrySingleton();

	private HungrySingleton() {

	}

	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
}
