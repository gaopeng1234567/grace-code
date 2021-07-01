package com.patrick.principles.dependenceinversion;

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
 * @date: Created in 2021/6/26 4:35 下午
 * @desc: 依赖倒置原则，其实就上层类调用下层类不直接调用实现类，通过接口或者抽象类调用，这样在实现类里面不需要改代码就能实现不一样的功能
 * @motto: Keep It Simple and Stupid, KISS
 */
public class TestDemo {
	public static void main(String[] args) {
		Patrick patrick = new Patrick();
		patrick.study(new JavaStudy());
		patrick.study(new PythonStudy());
	}
}
