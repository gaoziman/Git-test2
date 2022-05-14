package com.manman.proxy4;

/**
 * @author 满满
 * createDate 2022/5/12 9:38
 */
public class Agent implements Service {
//    设计成员变量的类型为接口 为了灵活切换目标对象

    public Service target;
    public Aop aop;

// 使用构造方法进行目标对象的传入 进行初始化

    public Agent(Service target,Aop aop ){
        this.target = target;
        this.aop= aop;
    }


    @Override
    public void buy() {
//        切面功能
        try {
            aop.before();
//        业务功能
            target.buy();
//        切面功能
            aop.after();
        } catch (Exception e) {
   //        切面功能
        aop.exception();
        }
    }
}
