package com.manman.proxy4;

/**
 * @author 满满
 * createDate 2022/5/12 10:49
 */
public class LogAop implements Aop{
    @Override
    public void before() {
        System.out.println("前置日志功能实现.......");

    }
}
