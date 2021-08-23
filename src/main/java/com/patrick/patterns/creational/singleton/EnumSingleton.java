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
 * @date: Created in 2021/8/21 2:28 下午
 * @desc: 枚举类实现单例
 * 原理:
 * 1、私有的构造器
 * 2、序列化方法重写、readResolve
 * 3、反射创建抛出异常
 *
 * @motto: Keep It Simple and Stupid, KISS
 */
public enum EnumSingleton implements OpenAccountHandler{
	INSTANCE{
		@Override
		public void doBusiness() {
			System.out.println("demo");
		}
	}
}


interface OpenAccountHandler {
	void doBusiness();
}