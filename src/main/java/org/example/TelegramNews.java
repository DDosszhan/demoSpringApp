package org.example;


import org.springframework.stereotype.Component;

@Component
public class TelegramNews implements News{
    @Override
    public String showNews() {
        return "Showing news from Telegram";
    }
}
