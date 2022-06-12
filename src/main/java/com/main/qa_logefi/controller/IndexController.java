package com.main.qa_logefi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("Login/login");
    }
}


