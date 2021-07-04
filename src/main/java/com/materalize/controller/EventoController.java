package com.materalize.controller;

import com.materalize.model.EventoCadastro;
import com.materalize.repository.EvendoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {


    @Autowired
    private EvendoRepository er;

    @RequestMapping(value = "/cadastro", method = RequestMethod.GET)
    public String form(){
       return "cadastro";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public  String form(EventoCadastro eventoCadastro){
        er.save(eventoCadastro);
        return "redirect:https://www.casadocodigo.com.br/";
    }



    @RequestMapping("/admim")
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView("painel");
        Iterable<EventoCadastro> evento =  er.findAll();
        mv.addObject("evento", evento);
        return mv;

    }

}
