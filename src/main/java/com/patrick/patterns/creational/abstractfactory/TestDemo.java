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
 * @date: Created in 2021/6/27 10:13 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class TestDemo {
	public static void main(String[] args) {
		ICourseFactory iCourseFactory = new JavaCourseFactory();
		Article article = iCourseFactory.makeArticle();
		Video video = iCourseFactory.makeVideo();
		article.produceArticle();
		video.playVideo();
	}
}
