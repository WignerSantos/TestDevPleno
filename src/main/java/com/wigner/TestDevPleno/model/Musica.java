package com.wigner.TestDevPleno.model;

public class Musica {

    private String titulo;
    private String artista;
    private String album;
    private String ano;
    private String genero;

    public Musica() {
    }

    public Musica(String titulo, String artista, String album, String ano, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", ano='" + ano + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
