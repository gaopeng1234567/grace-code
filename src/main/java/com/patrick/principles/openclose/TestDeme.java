package com.patrick.principles.openclose;

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
 * @date: Created in 2021/6/26 4:08 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class TestDeme {
	public static void main(String[] args) {
		ICourse java = new PatrickCourse("java", "20", 999d);
		System.out.println(java.getCouresePrice());
	}
}
