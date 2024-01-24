package com.wigner.TestDevPleno.services;

import com.wigner.TestDevPleno.model.ListaDeReproducao;
import com.wigner.TestDevPleno.repositories.ListaDeReproducaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaDeReproducaoService {

    @Autowired
    ListaDeReproducaoRepository repository;

    public ListaDeReproducao create(ListaDeReproducao listaDeReproducao) {
        return repository.save(listaDeReproducao);
    }

}
