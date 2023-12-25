package com.serb.projectapp.conta;

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
@Entity(name="contas")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Valor Não pode ser em branco")
    private String valor;

    @NotBlank(message="Banco Não pode ser em branco")
    private String banco;

    @NotBlank(message="Pix Não pode ser em branco")
    private String pix;

    @Temporal(TemporalType.DATE)
    private Date dataInicio = new Date();
    
}
