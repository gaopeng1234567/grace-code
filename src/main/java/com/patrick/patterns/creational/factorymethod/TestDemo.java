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
 * @date: Created in 2021/6/26 9:43 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class TestDemo {
	public static void main(String[] args) {
		VideoFactory goVideoFactory = new GoVideoFactory();
		VideoFactory javaVideoFactory = new JavaVideoFactory();
		VideoFactory pythonVideoFactory = new PythonVideoFactory();
		goVideoFactory.produceVideo().play();
		javaVideoFactory.produceVideo().play();
		pythonVideoFactory.produceVideo().play();
	}
}
