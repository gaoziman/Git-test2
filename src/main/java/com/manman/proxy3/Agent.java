package com.manman.proxy3;

/**
 * @author 满满
 * createDate 2022/5/12 9:38
 */
public class Agent implements Service {
//    设计成员变量的类型为接口 为了灵活切换目标对象

    public Service target;
// 使用构造方法进行目标对象的传入

    public Agent(Service target){
        this.target = target;
    }


    @Override
    public void buy() {
//        切面功能
        try {
            System.out.println("事务开启......");
//        业务功能
            target.buy();
//        切面功能
            System.out.println("事务提交......");
        } catch (Exception e) {
            System.out.println("事务回滚......");
        }
    }
}
