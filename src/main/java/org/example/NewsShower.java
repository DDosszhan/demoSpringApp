package org.example;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("newsShower")
public class NewsShower {

    private News[] news;

    @Value("${date}")
    public String date;


    @Autowired
    public NewsShower(News[] news) {
        this.news = news;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void getNews(){
        int randomIndex = ThreadLocalRandom.current().nextInt(news.length);
        System.out.println("Hello, " + news[randomIndex].showNews());
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("I am initializing");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("I am destroying");
    }
}
