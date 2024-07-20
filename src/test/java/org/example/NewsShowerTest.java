package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class NewsShowerTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @After
    public void tearDown() {
        context.close();
    }

    @Test
    public void testNewsShower1() {
        NewsShower newsShower1 = context.getBean("newsShower1", NewsShower.class);

        assertNotNull(newsShower1);
        newsShower1.getNews();
    }

    @Test
    public void testNewsShower2() {
        NewsShower newsShower2 = context.getBean("newsShower2", NewsShower.class);

        assertNotNull(newsShower2);
        newsShower2.getNews();
    }
}