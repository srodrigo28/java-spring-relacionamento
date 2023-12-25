package com.serb.projectapp.trasacao;

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
@Entity(name="transacao")
public class Transacao {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    // Inicio | Aposte | Saque
    @NotBlank(message="Tipo não pode ser em branco")
    private String tipo;

    @NotBlank(message="Valor não pode ser em branco")
    private Double valor;

    @Temporal(TemporalType.DATE)
    private Date dataTransacao = new Date();

}
