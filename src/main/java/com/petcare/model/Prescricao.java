package com.petcare.model;

import java.util.List;

public class Prescricao {
    private Long id;
    private List<Medicamento> medicamentos;
    private String observacoes;

    public Prescricao() {}

    public Prescricao(Long id, List<Medicamento> medicamentos, String observacoes) {
        this.id = id;
        this.medicamentos = medicamentos;
        this.observacoes = observacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
