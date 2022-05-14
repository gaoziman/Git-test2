package com.manman.test;

import com.manman.proxy2.BookServiceImpl;
import com.manman.proxy2.SubBookServiceImpl;
import com.manman.proxy3.Service;
import org.junit.Test;

/**
 * @author 满满
 * createDate 2022/5/12 9:27
 */
public class MyTest {
    @Test
    public void bookTest(){
        BookServiceImpl service = new SubBookServiceImpl();
        service.buy();
    }

    @Test
    public void bookTest02(){
        Service  target = (Service) new BookServiceImpl();
        target.buy();
    }
}
