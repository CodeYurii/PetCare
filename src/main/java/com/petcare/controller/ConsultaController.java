package com.petcare.controller;

import com.petcare.model.Consulta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ConsultaController {

    public static void exibirDetalhesConsulta(Consulta consulta) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy - HH:mm'h'");

        System.out.println("📋 Detalhes da Consulta:");
        System.out.println("🐾 Pet: " + consulta.getPet().getNome());
        System.out.println("👩‍⚕️ Veterinário: " + consulta.getVeterinario().getNome());
        System.out.println("📅 Data: " + consulta.getData().format(formatter));

        if (consulta.getDiagnostico() != null) {
            System.out.println("🩺 Diagnóstico: " + consulta.getDiagnostico().getPatologia());
        } else {
            System.out.println("🩺 Diagnóstico: Não informado.");
        }

        if (consulta.getPrescricao() != null) {
            System.out.println("💊 Prescrição: " + consulta.getPrescricao().getMedicamentos().getFirst().getNome()
                    + " - " + consulta.getPrescricao().getMedicamentos().getFirst().getCategoria());
        } else {
            System.out.println("💊 Prescrição: Não informada.");
        }

        if (consulta.getObservacao() != null) {
            System.out.println("📝 Observação: " + consulta.getObservacao());
        }
    }

    //AGUARDANDO APLICACAO DO PADRAO DAO PARA CONSTRUCAO E CRUD
}
