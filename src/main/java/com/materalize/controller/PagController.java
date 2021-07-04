package com.materalize.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagController {

    @RequestMapping("/")
    public  String index(){
        return "index";
    }

    @RequestMapping("/painel")
    public String painel(){
        return "peinel";
    }


}
