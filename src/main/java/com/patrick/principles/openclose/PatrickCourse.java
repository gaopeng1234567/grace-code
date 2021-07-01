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
 * @date: Created in 2021/6/26 4:07 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class PatrickCourse implements ICourse {
	private String name;
	private String count;
	private Double price;

	public PatrickCourse(String name, String count, Double price) {
		this.name = name;
		this.count = count;
		this.price = price;
	}

	@Override
	public String getCourseName() {
		return this.name;
	}

	@Override
	public String getCourseCount() {
		return this.count;
	}

	@Override
	public Double getCouresePrice() {
		return this.price;
	}
}
