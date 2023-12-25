package com.serb.projectapp.cliente;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Nome Não pode ser em branco")
    private String nome;

    private String cpf;

    @NotBlank(message="Sexo Não pode ser em branco")
    private String sexo;

    @Temporal(TemporalType.DATE)
    private Date dataInicio = new Date();
    
}
