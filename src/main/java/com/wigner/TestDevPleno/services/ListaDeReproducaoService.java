package com.wigner.TestDevPleno.services;

import com.wigner.TestDevPleno.repositories.ListaDeReproducaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaDeReproducaoService {

    @Autowired
    ListaDeReproducaoRepository listaDeReproducaoRepository;

}
