package com.patrick.funinterface;

/**
 * @author patrick
 * @date 2021/2/21 3:02 下午
 * @Des @FunctionInterface
 * 最簡單的事是堅持，最難的事還是堅持
 */
public interface FactoryFunction {

    FactoryFunction DEFAULT = (webApplicationType) -> {
        try {
            switch (webApplicationType) {
                case SERVLET:
                    return new Student();
                case REACTIVE:
                    return new Teacher();
                default:
                    return new User();
            }
        } catch (Exception ex) {
            throw new IllegalStateException("Unable create a default ApplicationContext instance, "
                    + "you may need a custom ApplicationContextFactory", ex);
        }
    };


    User create(WebApplicationType webApplicationType);

}

class Student extends User {
    @Override
    void eat(){
        System.out.println("学生要吃饭");
    }
}

class Teacher extends User {
    @Override
    void eat(){
        System.out.println("老师也要吃饭");
    }
}

class User {
    void eat(){}
}

enum WebApplicationType {
    SERVLET,
    REACTIVE
}
