package com.wigner.TestDevPleno.controller;

import com.wigner.TestDevPleno.model.ListaDeReproducao;
import com.wigner.TestDevPleno.services.ListaDeReproducaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping(value = "/lists")
public class ListaDeReproducaoController {

    @Autowired
    ListaDeReproducaoService listaDeReproducaoService;

    @PostMapping
    public ResponseEntity<ListaDeReproducao> create(@Valid @RequestBody ListaDeReproducao listaDeReproducao) {
        ListaDeReproducao list = listaDeReproducaoService.create(listaDeReproducao);

        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }

    @GetMapping
    public ResponseEntity<List<ListaDeReproducao>> findAll() {
        List<ListaDeReproducao> list = listaDeReproducaoService.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{listName}")
    public ResponseEntity<ListaDeReproducao> findByName(@PathVariable String listName) {
        ListaDeReproducao list = listaDeReproducaoService.findByNome(listName);

        return ResponseEntity.ok().body(list);
    }

    @DeleteMapping(value = "/{listName}")
    public ResponseEntity<ListaDeReproducao> delete(@PathVariable String listName) {
        listaDeReproducaoService.delete(listName);


        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
