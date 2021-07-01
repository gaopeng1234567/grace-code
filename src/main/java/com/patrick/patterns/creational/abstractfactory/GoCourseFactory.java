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
 * @date: Created in 2021/6/27 10:12 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class GoCourseFactory implements ICourseFactory{
	@Override
	public Video makeVideo() {
		return null;
	}

	@Override
	public Article makeArticle() {
		return null;
	}
}
