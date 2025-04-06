package com.petcare.model.factory;

import com.petcare.model.Medicamento;
import com.petcare.model.Prescricao;
import com.petcare.model.builder.PrescricaoBuilder;

public class PrescricaoFactory {
    public static Prescricao prescricaoBasica(Medicamento medicamento) {
        return new PrescricaoBuilder()
                .builderId(0L)
                .builderMedicamento(medicamento)
                .builderObservacoes("Tomar 1 comprimido em 12/12 horas")
                .build();
    }
}
