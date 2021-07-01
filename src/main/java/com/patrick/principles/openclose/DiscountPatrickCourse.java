package com.patrick.principles.openclose;

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
 * @date: Created in 2021/6/26 4:10 下午
 * @desc: 如果新增一个业务需求打折，我们要满足开闭原则，所以不能直接修改接口，不然很多实现这个接口的的类都要修改，
 * 所以可以通过继承的方式进行扩展，而不必修改原来的类
 * @motto: Keep It Simple and Stupid, KISS
 */
public class DiscountPatrickCourse extends PatrickCourse {
	public DiscountPatrickCourse(String name, String count, Double price) {
		super(name, count, price);
	}

	@Override
	public Double getCouresePrice() {
		return super.getCouresePrice() * 0.8;
	}
}
