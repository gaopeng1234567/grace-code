package com.patrick.patterns.creational.abstractfactory;

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
 * @date: Created in 2021/6/27 10:07 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class JavaCourseFactory implements ICourseFactory {
	@Override
	public Video makeVideo() {
		return new JavaCourse();
	}

	@Override
	public Article makeArticle() {
		return new JavaArticle();
	}
}
