package com.patrick.singleton;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author patrick
 * @date 2021/2/23 5:01 下午
 * @Des 单例模式-懒汉方式实现
 * 最簡單的事是堅持，最難的事還是堅持
 * <p>
 * 特点:
 * 1、使用的时候采取加载
 * 2、静态属性
 * 3、私有构造函数
 * 4、获取实例的方法 getInstance
 */
public class LazySingletonDemo {
    //测试
    public static void main(String[] args) {
        //*********************线程安全问题*********************
        new Thread(() -> {
            System.out.println(LazySingleton_v2.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(LazySingleton_v2.getInstance());
        }).start();
        //*********************线程安全问题*********************

    }


}

//第一版 单例模式 存在线程安全问题，创建出多个对象。
class LazySingleton_v1 {

    private static LazySingleton_v1 instance;

    private LazySingleton_v1() {

    }

    public static LazySingleton_v1 getInstance() {
        if (instance == null) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton_v1();
        }
        return instance;
    }
}

// 添加synchronized关键字解决线程安全问题
class LazySingleton_v2 {

    private volatile static LazySingleton_v2 instance;

    private LazySingleton_v2() {

    }

    public /**synchronized**/ static LazySingleton_v2 getInstance() {
        //放在这里加锁，性能不高，仅当instance等于null才需要加锁
        if (instance == null) {
            synchronized (LazySingleton_v2.class) {
                instance = Optional.ofNullable(instance).orElse(new LazySingleton_v2());
            }
        }
        return instance;
    }
}
