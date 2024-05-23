package com.example.tasksphere.chatwebsockets;

import com.example.tasksphere.chatwebsockets.config.DotEnv;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChatwebsocketsApplication {

    public static void main(String[] args) {

        SpringApplication.run(ChatwebsocketsApplication.class, args);
    }



}
