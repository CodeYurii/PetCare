package com.petcare.model.factory;

import com.petcare.model.Pet;
import com.petcare.model.Tutor;
import com.petcare.model.builder.PetBuilder;

public class PetFactory {
    public static Pet criarPetBasico(String nome, String especie, Tutor tutor) {
        return new PetBuilder()
                .builderNome(nome)
                .builderEspecie(especie)
                .builderTutor(tutor)
                .builderIdade(0)
                .builderSexo("Indefinido")
                .build();
    }
}
