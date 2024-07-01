package com.avinash.jen.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Javacontroller {

    @GetMapping("/")
    public ModelAndView home(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }
}
