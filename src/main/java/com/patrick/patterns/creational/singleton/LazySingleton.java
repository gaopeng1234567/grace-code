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
public class LazySingleton {
	private static LazySingleton lazySingleton = null;

	private LazySingleton() {

	}

	/**
	 * 直接静态方法上锁，锁得是class文件，力度有点大。 可以优化一下，doubleCheck
	 * @return  lazySingleton
	 */
	private synchronized static LazySingleton getLazySingleton() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}
