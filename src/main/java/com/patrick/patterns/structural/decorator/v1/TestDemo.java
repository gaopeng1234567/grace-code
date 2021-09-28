package com.patrick.patterns.structural.decorator.v1;

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
 * @date: Created in 2021/8/23 8:59 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 * 加鸡蛋加香肠的煎饼
 * 当要三个鸡蛋，那么就不好扩展，每一个都要写一个类，那么就类爆炸了
 */
public class TestDemo {
	public static void main(String[] args) {
		JIanBing jIanBing = new JIanBing();
		System.out.println(jIanBing.getDesc()+ jIanBing.price());
		JianBingJIaDan jianBingJIaDan = new JianBingJIaDan();
		System.out.println(jianBingJIaDan.getDesc() + jianBingJIaDan.price());
		JianBingJiaXiangChang jianBingJiaXiangChang = new JianBingJiaXiangChang();
		System.out.println(jianBingJiaXiangChang.getDesc() + jianBingJiaXiangChang.price());
	}
}
