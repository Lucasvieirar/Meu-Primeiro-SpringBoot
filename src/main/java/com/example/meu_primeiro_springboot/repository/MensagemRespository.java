package com.example.meu_primeiro_springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRespository {

    public  String obterMensagem(){
        return "Olá do repositorio";
    }
}
