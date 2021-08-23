package com.patrick.patterns.creational.builder;

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
 * @date: Created in 2021/7/1 9:10 下午
 * @desc:
 *
 * @motto: Keep It Simple and Stupid, KISS
 */
public class TestDemo {
	public static void main(String[] args) {
		PatrickUser patrick = PatrickUser.newBuilder()
				.buildUserAge("123").buildUserName("patrick").buildUserSex("1").build();
		System.out.println(patrick);
	}
}
