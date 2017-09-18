package com.zt.controller;

import com.zt.rabbitmq.send.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitmqController {
    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public String send(String msg) {
        sender.send(msg);
        return "Send OK.";
    }
}
