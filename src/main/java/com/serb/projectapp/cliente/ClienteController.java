package com.serb.projectapp.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente obj){
        return clienteRepository.save(obj);
    }

    @GetMapping("/")    
    public Iterable<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    public void deleteClienjte(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }
}
