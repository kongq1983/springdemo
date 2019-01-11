package com.kq.mynamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main
 *
 * @author kq
 * @date 2019/1/9
 */
public class Main {

    public static void main(String args[]) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[] {"application.xml"});

        MyDate date = ctx.getBean(MyDate.class);
        System.out.println("date="+date);

        Server server = ctx.getBean(Server.class);
        System.out.println("server="+server);

    }

}
