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
 * @date: Created in 2021/6/26 4:33 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class Patrick {
	// 方法注入。 还可以构造器注入，或者set方式注入。道理一样，具体的实现类不存在在patrick中。
	public void study(ICourse iCourse) {
		iCourse.study();
	}
}
