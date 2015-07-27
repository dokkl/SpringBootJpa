package com.hoon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hoon on 2015-07-25.
 */
@Controller
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String hello(Model model) {
        log.debug(">>>> ㅎㅎ hello called");
        model.addAttribute("name", "애봉이의 스프링부트 시작!!");
        return "hello";
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("foo", "Hello 프로젝트 시작!");
        return "index";
    }
}
