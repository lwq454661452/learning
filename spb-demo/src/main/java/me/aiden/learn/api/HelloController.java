package me.aiden.learn.api;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Aiden
 * @Date: 2018/5/22 10:54
 */
public interface HelloController {

    /**
     * test api
     *
     * @return
     */
    @GetMapping("/hello")
    String index();

}
