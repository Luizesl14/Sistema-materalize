package com.materalize.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping("/")
    public  String home(){
        return "index";
    }

    @RequestMapping("/painel")
    public String painel(){
        return "painel";
    }

    @RequestMapping("/cadastre")
    public String cad(){
        return "cadastre";
    }

    @RequestMapping("/login")
    public String log(){
        return "login";
    }


}
