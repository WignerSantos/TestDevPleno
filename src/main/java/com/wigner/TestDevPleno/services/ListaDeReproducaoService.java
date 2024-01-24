package com.wigner.TestDevPleno.services;

import com.wigner.TestDevPleno.model.ListaDeReproducao;
import com.wigner.TestDevPleno.model.exceptions.ObjectNotFoundException;
import com.wigner.TestDevPleno.repositories.ListaDeReproducaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListaDeReproducaoService {

    @Autowired
    ListaDeReproducaoRepository repository;

    public ListaDeReproducao create(ListaDeReproducao listaDeReproducao) {
        return repository.save(listaDeReproducao);
    }

    public List<ListaDeReproducao> findAll() {
        return repository.findAll();
    }

    public ListaDeReproducao findByNome(String nome) {
        Optional<ListaDeReproducao> obj = repository.findByNome(nome);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Lista não encontrada! Nome: " + nome));
    }

    public void delete(String nome) {
        ListaDeReproducao lista = findByNome(nome);

        if(lista == null) {
            throw new ObjectNotFoundException("Lista não encontrada! Nome: " + nome);
        }

        repository.deleteByNome(nome);
    }

}
