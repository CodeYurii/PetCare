package com.petcare.model.factory;

import com.petcare.model.*;
import com.petcare.model.builder.ConsultaBuilder;

import java.time.LocalDateTime;

public class ConsultaFactory {
    public static Consulta criarConsultaAgendada(Consulta consultaAgendada) {
        return new ConsultaBuilder()
                .builderPet(consultaAgendada.getPet())
                .builderVeterinario(consultaAgendada.getVeterinario())
                .builderData(LocalDateTime.now())
                .builderObservacao("Consulta iniciada.")
                .build();
    }

    public static Consulta finalizarConsulta(Consulta consultaAgendada, Prescricao prescricao, Diagnostico diagnostico) {
        return new ConsultaBuilder()
                .builderPet(consultaAgendada.getPet())
                .builderVeterinario(consultaAgendada.getVeterinario())
                .builderData(consultaAgendada.getData())
                .builderDiagnostico(diagnostico)
                .builderPrescricao(prescricao)
                .builderObservacao("Consulta finalizada.")
                .build();
    }
}
