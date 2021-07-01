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
 * @date: Created in 2021/6/26 4:34 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class PythonStudy implements ICourse {

	@Override
	public void study() {
		System.out.println("学习python");
	}
}
