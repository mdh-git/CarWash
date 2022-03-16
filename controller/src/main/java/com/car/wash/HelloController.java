package com.car.wash;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MDH
 * 2022/3/16 18:49
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello11";
    }
}
