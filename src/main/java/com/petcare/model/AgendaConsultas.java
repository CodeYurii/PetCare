package com.petcare.model;

import com.petcare.interfaces.Agenda;
import com.petcare.model.builder.ConsultaBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AgendaConsultas implements Agenda {
    private List<Consulta> consultasAgendadas = new ArrayList<>();

    @Override
    public void agendarConsulta(Pet pet, Veterinario vet, LocalDateTime data) {
        Consulta consulta = new ConsultaBuilder()
                .builderPet(pet)
                .builderVeterinario(vet)
                .builderData(data)
                .build();

        consultasAgendadas.add(consulta);
        System.out.println("📅 Agendando consulta...\n");
        System.out.println("✅ Consulta agendada com sucesso!\n");
    }

    public void listarConsultas() {
        System.out.println("📋 Consultas Agendadas:");
        for (Consulta c : consultasAgendadas) {
            System.out.println("🐶 Pet: " + c.getPet().getNome() +
                    " | 👩‍⚕️ Veterinário: " + c.getVeterinario().getNome() +
                    " | 📅 Data: " + c.getData().format(DateTimeFormatter.ofPattern("dd/MM/yy - HH:mm'h'\n")));
        }
    }

    public List<Consulta> getConsultasAgendadas() {
        return consultasAgendadas;
    }
}
