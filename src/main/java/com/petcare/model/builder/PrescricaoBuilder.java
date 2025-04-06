package com.petcare.model.builder;

import com.petcare.model.Medicamento;
import com.petcare.model.Prescricao;
import java.util.ArrayList;
import java.util.List;

public class PrescricaoBuilder {
    private Long id;
    private List<Medicamento> medicamentos = new ArrayList<>();
    private String observacoes;

    public PrescricaoBuilder builderId(Long id) {
        this.id = id;
        return this;
    }

    public PrescricaoBuilder builderMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
        return this;
    }

    public PrescricaoBuilder builderListaDeMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos.addAll(medicamentos);
        return this;
    }

    public PrescricaoBuilder builderObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public Prescricao build() {
        return new Prescricao(id, medicamentos, observacoes);
    }
}
