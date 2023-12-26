package com.serb.projectapp.trasacao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends CrudRepository<Transacao, Long> {

    /*** */
    @Query(" select nome, sexo from clientes where sexo = 'f'  ")
    List<Transacao> buscarSexoFeminino();
    
    /***  
    @Query(" SELECT transacao.id, clientes.nome, transacao.valor FROM transacao INNER JOIN clientes ON transacao.id_cliente=clientes.id ")
    List<Transacao> buscar();
    */
    
    /***
        @Query("select s from transacao s where s.id_cliente =  ")
        List<Transacao> buscarCliente();
    */

}
