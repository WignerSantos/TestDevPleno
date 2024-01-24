package com.wigner.TestDevPleno.controller;

import com.wigner.TestDevPleno.model.ListaDeReproducao;
import com.wigner.TestDevPleno.services.ListaDeReproducaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping(value = "/lists")
public class ListaDeReproducaoController {

    @Autowired
    ListaDeReproducaoService listaDeReproducaoService;

    @PostMapping
    public ResponseEntity<ListaDeReproducao> create(@Valid @RequestBody ListaDeReproducao listaDeReproducao) {
        ListaDeReproducao list = listaDeReproducaoService.create(listaDeReproducao);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(listaDeReproducao.getNome()).toUri();

        return ResponseEntity.created(uri).body(list);
    }

}
