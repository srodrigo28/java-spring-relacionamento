package com.serb.projectapp.contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("/")
    public Iterable<Contato> lista(){
        return contatoRepository.findAll();
    }

    @PostMapping("/")         //  PathVariable 
    public Contato cadastrar(@RequestBody Contato obj){
        return contatoRepository.save(obj);
    }
}
