package com.manman.proxy4;

/**
 * @author 满满
 * createDate 2022/5/12 10:50
 */
public class TranslationAop implements Aop{
    @Override
    public void before() {
        System.out.println("事务开启.....");
    }

    @Override
    public void after() {
        System.out.println("事务提交.......");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚......");
    }
}
