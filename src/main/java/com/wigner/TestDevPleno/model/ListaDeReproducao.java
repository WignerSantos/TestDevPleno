package com.wigner.TestDevPleno.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class ListaDeReproducao {

    @Id
    private String nome;

    @NotBlank(message = "A Descrição não pode ficar em branco!")
    private String descricao;

    @NotBlank(message = "A lista de música não pode ficar em branco!")
    @OneToMany(targetEntity = Musica.class, cascade = CascadeType.PERSIST)
    private List<Musica> musicas;

    public ListaDeReproducao() {
    }

    public ListaDeReproducao(String nome, String descricao, List<Musica> musicas) {
        this.nome = nome;
        this.descricao = descricao;
//        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//    public List<Musica> getMusicas() {
//        return musicas;
//    }
//
//    public void setMusicas(List<Musica> musicas) {
//        this.musicas = musicas;
//    }

    @Override
    public String toString() {
        return "ListaDeReproducao{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
//                ", musicas=" + musicas +
                '}';
    }
}
