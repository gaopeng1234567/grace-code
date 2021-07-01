package com.patrick.patterns.creational.simplefactory;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

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
 * @date: Created in 2021/6/26 8:22 下午
 * @desc: 简单工厂的function写法，这种简单工厂只适合很少if判断，不超过三个，如果还是要if扩展的话，就违背了开闭原则，在同一个类里面进行了修改
 * 所以进行改进，传入class进行生产对象，这样就避免了扩展的时候添加if else等问题
 * @motto: Keep It Simple and Stupid, KISS
 */
@FunctionalInterface
public interface CarFactory {
	//version1  如果扩展违背了开闭原则，适合生产对象已知的情况
//	CarFactory factoryCar = type -> {
//		if (type == "Porsche")
//			return new Porsche();
//		if ("Audi".equals(type))
//			return new Audi();
//		else return null;
//	};

	// version2 方便扩展，无需添加额外代码
	CarFactory carFactory = clazz -> {
		Car car = null;
		try {
			car = (Car) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return car;
	};

	//	Car getCar(String type);
	Car getCar(Class clazz);

}
