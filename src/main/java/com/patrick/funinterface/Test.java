package com.patrick.funinterface;

/**
 * @author patrick
 * @date 2021/2/21 3:33 下午
 * @Des 测试
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class Test {
    private static FactoryFunction factoryFunction = FactoryFunction.DEFAULT;

    public static void main(String[] args) {
        factoryFunction.create(WebApplicationType.SERVLET).eat();
    }
}
