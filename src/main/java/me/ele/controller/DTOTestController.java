package me.ele.controller;

import me.ele.dto.UserDTO;
import me.ele.dto.test.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuhuan
 * @CreateDate: 2019/7/10
 * <p>Copyright: Copyright (c) 2019</p>
 */
@RestController
@Validated
@RequestMapping("/dto")
public class DTOTestController {

    @GetMapping("/test1")
    public ResponseEntity<Object> test1() {
        MaxQConsumeConfig maxQConsumeConfig = MaxQConsumeConfig.builder()
            .codeName("codeName")
            .ezone("ezone")
            .queueName("queuename")
            .build();

        MetaQProduceConfig metaQProduceConfig = MetaQProduceConfig.builder()
            .producerGroup("producerGroup")
            .topic("topic")
            .tag("tag")
            .build();

        TaskConfig taskConfig = TaskConfig.builder()
            .consumeConfig(maxQConsumeConfig)
            .produceConfig(metaQProduceConfig)
            .build();
        return new ResponseEntity<>(taskConfig, HttpStatus.OK);
    }

    @GetMapping("/test2")
    public ResponseEntity<Object> test2() {
        MetaQConsumeConfig metaQConsumeConfig = MetaQConsumeConfig.builder()
            .consumerGroup("consumerGroup")
            .topic("topic")
            .tag("tag")
            .build();

        MaxQProduceConfig maxQProduceConfig = MaxQProduceConfig.builder()
            .codeName("codeName")
            .ezone("ezone")
            .exchangeName("exchangeName")
            .build();



        TaskConfig taskConfig = TaskConfig.builder()
            .consumeConfig(metaQConsumeConfig)
            .produceConfig(maxQProduceConfig)
            .build();
        return new ResponseEntity<>(taskConfig, HttpStatus.OK);
    }

}
