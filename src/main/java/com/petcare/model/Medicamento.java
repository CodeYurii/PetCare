package com.petcare.model;

public class Medicamento {
    private Long id;
    private String categoria;
    private String nome;

    public Medicamento(){}

    public Medicamento(Long id, String categoria, String nome) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
