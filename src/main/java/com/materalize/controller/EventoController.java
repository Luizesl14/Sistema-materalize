package com.materalize.controller;

import com.materalize.model.EventoCadastro;
import com.materalize.repository.EvendoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {

    @Autowired
    private  EvendoRepository er;

    @RequestMapping(value ="/cadastrarEvento", method=RequestMethod.GET)
    public String form(){
        return "cadastre";
    }

    @RequestMapping(value ="/cadastrarEvento", method=RequestMethod.POST)
    public String form(EventoCadastro eventoCadastro){
        er.save(eventoCadastro);
        return "redirect:/login";
    }

    @GetMapping("/painel")
    public  ModelAndView listaEventos(){
       ModelAndView mv = new ModelAndView();
       mv.setViewName("painel");
       mv.addObject("listaUser", er.findAll());
       return mv;
    }



}
