package com.yunji.liveChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.yunji.liveChat"})
public class LiveChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveChatApplication.class, args);
    }

}
