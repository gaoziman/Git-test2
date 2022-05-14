package com.manman.proxy4;

/**
 * @author 满满
 * createDate 2022/5/12 10:47
 */
public interface Aop {
//    使用JDK8的新特性

    default void before(){}
    default void after(){}
    default void exception(){}

}
