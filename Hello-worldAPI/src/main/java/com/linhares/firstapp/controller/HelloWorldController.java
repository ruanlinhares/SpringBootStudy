package com.linhares.firstapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.linhares.firstapp.services.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController //combinação dos comandos @Controller e @ResponseBody 
// STATELESS(APIREST) -> A cada requisição o cliente precisa se identificar e mandar para o servidor as informações necessarias para a funcionalidade que deseja fazer  
// STATEFULL(APIRESTFULL) -> O estado de cada cliente é mantido no servidor, portanto não é necessario fazer mais requisições
@RequestMapping("/hello-world")//@RequestMapping é um endpoint
public class HelloWorldController {
    
    @Autowired
    private HelloWorldService helloWorldService;
    //post, ger, delete, put, patch, options, head são metodos HTTP que minha função pode reponder
    @GetMapping//vai responder a requisição GET no endpoint /helloworld
    public String helloWorld(){
        return helloWorldService.helloworld("Ruan");
    }
}
