package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {


    @Autowired
    private HttpServletRequest request;

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @GetMapping("/session")
    public String mysession(){
        request.getSession().setAttribute("myname", "abcdefghijklmn");
        redisTemplate.opsForValue().set("adfdadfa", "abcdefghijklmn");
        return "success";
    }

}
