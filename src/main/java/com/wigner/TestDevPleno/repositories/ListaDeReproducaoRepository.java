package com.wigner.TestDevPleno.repositories;

import com.wigner.TestDevPleno.model.ListaDeReproducao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ListaDeReproducaoRepository extends JpaRepository<ListaDeReproducao, Integer> {

    Optional<ListaDeReproducao> findByNome(String nome);

    @Transactional
    void deleteByNome(String nome);

}
