package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        NewsShower newsShower = context.getBean("newsShower", NewsShower.class);

        newsShower.getNews();

        System.out.println(newsShower.date);


        context.close();
    }
}
