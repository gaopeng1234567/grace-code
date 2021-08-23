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
 * @date: Created in 2021/8/21 3:19 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class Pig implements Cloneable{

	private String name;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		//解决Date对象 实现深clone
		Pig pig = (Pig) super.clone();
		// 开始深clone
		pig.date = (Date) pig.date.clone();
		return pig;
	}

	@Override
	public String toString() {
		return "Pig{" +
				"name='" + name + '\'' +
				", date=" + date +
				'}'+ super.toString();
	}
}
