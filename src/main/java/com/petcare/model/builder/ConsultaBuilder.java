package com.petcare.model.builder;

import com.petcare.model.*;

import java.time.LocalDateTime;

public class ConsultaBuilder {
    private Pet pet;
    private Veterinario veterinario;
    private LocalDateTime data;
    private Diagnostico diagnostico;
    private Prescricao prescricao;
    private String observacao;

    public ConsultaBuilder builderPet(Pet pet) {
        this.pet = pet;
        return this;
    }

    public ConsultaBuilder builderVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
        return this;
    }

    public ConsultaBuilder builderData(LocalDateTime data) {
        this.data = data;
        return this;
    }

    public ConsultaBuilder builderDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
        return this;
    }

    public ConsultaBuilder builderPrescricao(Prescricao prescricao) {
        this.prescricao = prescricao;
        return this;
    }

    public ConsultaBuilder builderObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public Consulta build() {
        return new Consulta(pet, veterinario, data, diagnostico, prescricao, observacao);
    }
}
