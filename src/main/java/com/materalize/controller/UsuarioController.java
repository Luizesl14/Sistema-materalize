package com.materalize.controller;

import com.materalize.model.Usuario;
import com.materalize.model.Voto;
import com.materalize.repository.UsuarioRepository;
import com.materalize.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsuarioController {



    @Autowired
    private UsuarioRepository ur;

    @Autowired
    VotoRepository vt;


    // mapea e recebe
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public  String form(){
        return "cadastro";

    }

    // mapea cadastra no banco
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
    public  String form(Usuario usuario){
        ur.save(usuario);
        return "redirect:/eventoLogin";
    }

    // mapea e recebe
    @RequestMapping(value = "/eventoLogin", method = RequestMethod.GET)
    public  String login(){
        return "login";

    }

    // mapea e recebe
    @RequestMapping(value = "/eventoLogin", method = RequestMethod.POST)
    public  String login(Usuario usuario){

        String user = usuario.getEmail();
        String pass = usuario.getSenha();

        if(user.equals("user@votar.com")&& pass.equals("123")){
            return "redirect:/eventoVotar";
        }

        if(user.equals("admin@votar.com")&& pass.equals("admin")){
            return "redirect:/painel";
        }


        return "redirect:/eventoLogin";
    }



    @RequestMapping(value = "/eventoVotar", method = RequestMethod.GET)
    public  String formVoto(){
        return "votar";

    }


    @RequestMapping(value = "/eventoVotar", method = RequestMethod.POST)
    public  String formVoto(Voto voto) {
        vt.save(voto);
        return "redirect:/eventoLogin";
    }


    @GetMapping("/painel")
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("painel");
        mv.addObject("listaUser", ur.findAll());
        mv.addObject("listaUser2", vt.findAll());
        return mv;
    }









}
