package com.diamonstore.controller;

import com.diamonstore.common.Application;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(){
        return Application.HOME_PAGE;
    }

}
