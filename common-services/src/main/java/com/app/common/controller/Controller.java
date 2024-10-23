package com.app.common.controller;

import com.app.common.service.NotificationService;
import com.app.message.MessageRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {

    @Autowired
    private NotificationService notificationService;

    @GetMapping(value = "/send")
    public Mono<String> sendMessage(MessageRecord messageRecord) {
        

        return notificationService.send(messageRecord);



    }

}
