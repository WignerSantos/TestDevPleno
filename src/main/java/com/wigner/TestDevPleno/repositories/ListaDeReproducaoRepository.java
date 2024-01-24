package com.wigner.TestDevPleno.repositories;

import com.wigner.TestDevPleno.model.ListaDeReproducao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaDeReproducaoRepository extends JpaRepository<ListaDeReproducao, String> {
}
