package com.serb.projectapp.trasacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @PostMapping("/")
    public Transacao cadastrar(@RequestBody Transacao obj){
        return transacaoRepository.save(obj);
    }

    @GetMapping("/")
    public Iterable<Transacao> lista(){
        return transacaoRepository.findAll();
    }

}
