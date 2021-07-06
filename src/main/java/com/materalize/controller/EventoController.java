package com.materalize.controller;

import com.materalize.model.EventoCadastro;
import com.materalize.model.EventoVotar;
import com.materalize.repository.EventoRepository;
import com.materalize.repository.EventoVotarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EventoController {



    @Autowired
    private EventoRepository er;

    @Autowired
    private EventoVotarRepository cv;


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

    @RequestMapping(value ="/cadastroVoto", method=RequestMethod.GET)
    public String votar(){
        return "pagVotacao";
    }

    @RequestMapping(value ="/cadastroVoto", method=RequestMethod.POST)
    public String votar(EventoVotar eventoVotar){

            cv.save(eventoVotar);

        return "redirect:/cadastroVoto";
    }









}
