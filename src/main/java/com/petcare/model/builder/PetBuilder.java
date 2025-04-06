package com.petcare.model.builder;

import com.petcare.model.Pet;
import com.petcare.model.Tutor;

public class PetBuilder {
    private Long id;
    private String especie;
    private String raca;
    private String nome;
    private String sexo;
    private Integer idade;
    private Tutor tutor;

    public PetBuilder builderId(Long id){
        this.id = id;
        return this;
    }

    public PetBuilder builderEspecie(String especie){
        this.especie = especie;
        return this;
    }

    public PetBuilder builderRaca(String raca){
        this.raca = raca;
        return this;
    }

    public PetBuilder builderIdade(Integer idade){
        this.idade = idade;
        return this;
    }

    public PetBuilder builderNome(String nome){
        this.nome = nome;
        return this;
    }

    public PetBuilder builderSexo(String sexo){
        this.sexo = sexo;
        return this;
    }

    public PetBuilder builderTutor(Tutor tutor){
        this.tutor = tutor;
        return this;
    }

    public Pet build(){
        return new Pet(id, especie, raca, sexo, idade, nome, tutor);
    }
}
