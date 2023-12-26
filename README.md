### Projeto Limpo com Java Spring Boot
* Spring Loobok
* Spring Valitation
* Spring Web
* Spring JPA
* Spring Thymelif
* Conexão com Driver Mysql testada

* Ultimo visto
```
https://www.youtube.com/watch?v=6a-zgHSSwD4&list=PLWXw8Gu52TRIRJUOVMZTVtoMd-TqsoKV3&index=5
```

##### Referência em Thymelif
* Dani Leão Thymelif
```
https://www.youtube.com/watch?v=arEf4OXsUXI&t=456s
```

#### Relacionamentos
* Ralf Lima Relacionamentos
```
https://www.youtube.com/watch?v=ETihMlwSAWI&list=PLWXw8Gu52TRIRJUOVMZTVtoMd-TqsoKV3&index=2
```

#### Tipos de Repository ( ### Rodrigo Freitas ### )
##### CrudRepository 
##### JPARepository
##### PaginAndSortingRepository
```
https://www.youtube.com/watch?v=in-Ixdfm5CE
```

#### Exemplo Relacionamento
SELECT transacao.id, clientes.nome, transacao.valor
FROM transacao
INNER JOIN clientes
ON transacao.id_cliente=clientes.id;

SELECT transacao.id, clientes.nome, transacao.valor
FROM transacao
INNER JOIN clientes
ON transacao.id_cliente=clientes.id
WHERE id_cliente = 1;
