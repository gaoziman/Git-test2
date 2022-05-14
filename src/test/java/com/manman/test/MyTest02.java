package com.manman.test;

import com.manman.proxy4.Agent;
import com.manman.proxy4.BookServiceImpl;
import com.manman.proxy4.Service;
import com.manman.proxy4.TranslationAop;
import org.junit.Test;

/**
 * @author 满满
 * createDate 2022/5/15 9:27
 */
public class MyTest02 {
    @Test
    public void bookTest(){
        Service agent = new Agent(new BookServiceImpl(),new TranslationAop());
        Service agent1 = new Agent(agent,new TranslationAop());
        agent1.buy();
        agent1.buy();
        System.out.println("hello git");
        System.out.println("git !!!!");
    }
}
