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
 * @date: Created in 2021/6/27 10:03 下午
 * @desc: 制作视频、文章 同属一个产品族
 * @motto: Keep It Simple and Stupid, KISS
 */
public interface ICourseFactory {

	Video makeVideo();

	Article makeArticle();

}
