package com.manman.proxy1;

/**
 * @author 满满
 * createDate 2022/5/11 12:33
 *
 * 此时我们的图书购买业务和事物切面耦合在一起
 */
public class BookServiceImpl {

    public  void buy() {
        try {
            System.out.println("事物开启.......");
            System.out.println("图书购买业务功能提交!!!");
            System.out.println("事物提交........");
        } catch (Exception e) {
            System.out.println("事物回滚.......");
        }
    }
}
