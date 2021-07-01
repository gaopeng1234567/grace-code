package com.patrick.patterns.creational.simplefactory;

import com.patrick.principles.dependenceinversion.Patrick;

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
 * @date: Created in 2021/6/26 8:31 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class TestDemo {
	public static void main(String[] args) {
//		CarFactory factoryCar = CarFactory.factoryCar;
//		factoryCar.getCar("Audi").produceCar();
//		factoryCar.getCar("Porsche").produceCar();

		CarFactory carFactory = CarFactory.carFactory;
		carFactory.getCar(Audi.class).produceCar();
		carFactory.getCar(Patrick.class).produceCar();
	}
}
