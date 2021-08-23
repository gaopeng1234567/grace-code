package com.patrick.patterns.creational.singleton;

import javax.lang.model.element.VariableElement;

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
 * @date: Created in 2021/8/21 12:21 下午
 * @desc:   利用类在创建的时候是线程安全的
 * @motto: Keep It Simple and Stupid, KISS
 */
public class InnerStaticClassSingleton {

	private static class InnerClass {
		private static InnerStaticClassSingleton innerStaticClassSingleton = new InnerStaticClassSingleton();
	}

	public static InnerStaticClassSingleton getInnerStaticClassSingleton() {
		return InnerClass.innerStaticClassSingleton;
	}

}
