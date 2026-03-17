package com.example.meu_primeiro_springboot.service;

import com.example.meu_primeiro_springboot.repository.MensagemRespository;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {
    private final MensagemRespository mensagemRespository;
    public MensagemService(MensagemRespository mensagemRespository){
        this.mensagemRespository = mensagemRespository;
    }
    public String obterMensagem(){
        return mensagemRespository.obterMensagem();
    }
}
