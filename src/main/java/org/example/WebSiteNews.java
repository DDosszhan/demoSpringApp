package org.example;


import org.springframework.stereotype.Component;

@Component
public class WebSiteNews implements News{
    @Override
    public String showNews(){
        return "Showing News from Web Site";
    }
}
