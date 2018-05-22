package me.aiden.learn.impl;

import me.aiden.learn.api.HelloController;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Aiden
 * @Date: 2018/5/22 10:55
 */
@RestController
public class HelloControllerImpl implements HelloController {

    @Override
    public String index() {
        return "Hello World";
    }


}
