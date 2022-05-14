package com.manman.proxy2;

/**
 * @author 满满
 * createDate 2022/5/11 12:38
 * 使用子类代理的方式进行图书馆业务与事物切面拆分
 */
public class BookServiceImpl {
//    在父类只有干干净净的的业务

    public void buy(){
        System.out.println("图书购买功能实现......");
    }
}
