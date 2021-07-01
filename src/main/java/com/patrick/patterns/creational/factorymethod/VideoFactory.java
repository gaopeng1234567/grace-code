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
 * @date: Created in 2021/6/26 9:39 下午
 * @desc: 什么时候抽象？什么时候接口？
 * 当你对这个类一无所知的时候就是接口，当你对这个类部分已知但是部分未知的时候就是抽象类
 * @motto: Keep It Simple and Stupid, KISS
 */
public abstract class VideoFactory {
	public abstract Video produceVideo();
}
