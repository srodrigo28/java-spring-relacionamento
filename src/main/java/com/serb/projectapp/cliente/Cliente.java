package com.serb.projectapp.cliente;

import java.util.Date;
import java.util.List;

import com.serb.projectapp.trasacao.Transacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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

    @OneToMany
    @JoinColumn(name = "id_cliente", referencedColumnName = "id") 
    private List<Transacao> transacao;

    @Temporal(TemporalType.DATE)
    private Date dataInicio = new Date();
    
}
