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
 * @date: Created in 2021/8/21 11:54 上午
 * @desc: 懒汉模式
 * @motto: Keep It Simple and Stupid, KISS
 */
public class DoubleCheckLazySingleton {

	private volatile static DoubleCheckLazySingleton lazySingleton = null;

	private DoubleCheckLazySingleton() {

	}

	private static DoubleCheckLazySingleton getLazySingleton() {
		if (lazySingleton == null) {
			synchronized (DoubleCheckLazySingleton.class) {
				if (lazySingleton == null) {
					lazySingleton = new DoubleCheckLazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
