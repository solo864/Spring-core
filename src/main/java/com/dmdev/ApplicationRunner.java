package com.dmdev;

import com.dmdev.database.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        var a  = context.getBean("p3");
        System.out.println(a);
    }
}
