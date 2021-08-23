package com.patrick.patterns.creational.prototype.clone;

import java.util.Date;

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
 * @date: Created in 2021/8/21 3:20 下午
 * @desc: 深clone 和浅clone  clone是不会走构造方法的
 *  1、修改一个对象的中的对象，会对浅clone的对象造成印象
 *  解决: 把这个对象中所有也是对象的对象都重写
 * Pig{name='patrick', date=Thu Jan 01 08:00:00 CST 1970}com.patrick.patterns.creational.prototype.clone.Pig@4909b8da
 * Pig{name='patrick', date=Thu Jan 01 08:00:00 CST 1970}com.patrick.patterns.creational.prototype.clone.Pig@3a03464
 * @motto: Keep It Simple and Stupid, KISS
 */
public class TestDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Pig pig = new Pig();
		pig.setDate(new Date());
		pig.setName("patrick");
		Pig clone = (Pig) pig.clone();
		pig.getDate().setTime(0);
		System.out.println(pig);
		System.out.println(clone);

	}
}
