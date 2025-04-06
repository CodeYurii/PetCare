package com.petcare.model.builder;

import com.petcare.model.Tutor;

public class TutorBuilder {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;

    public TutorBuilder builderId(Long id){
        this.id = id;
        return this;
    }
    public TutorBuilder builderNome(String nome){
        this.nome = nome;
        return this;
    }
    public TutorBuilder builderCpf(String cpf){
        this.cpf = cpf;
        return this;
    }

    public TutorBuilder builderEmail(String email){
        this.email = email;
        return this;
    }

    public TutorBuilder builderTelefone(String telefone){
        this.telefone = telefone;
        return this;
    }

    public TutorBuilder builderEndereco(String endereco){
        this.endereco = endereco;
        return this;
    }

    public TutorBuilder builderCidade(String cidade){
        this.cidade = cidade;
        return this;
    }

    public Tutor build(){
        return new Tutor(id, nome, cpf, email, telefone, endereco, cidade);
    }
}
