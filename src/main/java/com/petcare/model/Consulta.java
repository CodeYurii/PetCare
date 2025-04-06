package com.petcare.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta{
    private Pet pet;
    private Veterinario veterinario;
    private LocalDateTime data;
    private Diagnostico diagnostico;
    private Prescricao prescricao;
    private String observacao;

    public Consulta() {}

    public Consulta(Pet pet, Veterinario veterinario, LocalDateTime data, Diagnostico diagnostico, Prescricao prescricao, String observacao) {
        this.pet = pet;
        this.veterinario = veterinario;
        this.data = data;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.observacao = observacao;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Prescricao getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(Prescricao prescricao) {
        this.prescricao = prescricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
