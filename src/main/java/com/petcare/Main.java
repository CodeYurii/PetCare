package com.petcare;

import com.petcare.controller.ConsultaController;
import com.petcare.interfaces.Agenda;
import com.petcare.model.*;
import com.petcare.model.builder.TutorBuilder;
import com.petcare.model.factory.ConsultaFactory;
import com.petcare.model.factory.PetFactory;
import com.petcare.model.factory.PrescricaoFactory;
import com.petcare.util.ConfigSistema;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigSistema config = ConfigSistema.getInstancia();
        System.out.println("🐾 Bem-vindo à " + config.getNomeClinica());
        System.out.println("📍 Endereço: " + config.getEndereco());
        System.out.println("🔧 Conectando ao banco de dados: " + config.getBancoDeDadosUrl());
        System.out.println("✅ Conectado ao banco de dados com sucesso!\n");
        Tutor tutor = new TutorBuilder()
                .builderNome("Carlos Adão")
                .builderEndereco("Rua José da Silva")
                .builderCpf("123.456.789-10")
                .builderTelefone("(11)99867-5423")
                .build();

        Pet pet = PetFactory.criarPetBasico("Brian", "Cão", tutor);
        Veterinario vet = new Veterinario(0L,"Dra. Paula", "paula.vet@petcare.com", "(11)94123-0978","CRMV-005");
        AgendaConsultas agenda = new AgendaConsultas();
        agenda.agendarConsulta(pet,vet,LocalDateTime.now().plusDays(2));
        agenda.listarConsultas();
        System.out.println("🩺 Iniciando Consulta...\n");
        Consulta consulta = ConsultaFactory.criarConsultaAgendada(agenda.getConsultasAgendadas().getFirst());
        Diagnostico diagnostico = new Diagnostico(0L,"Virose");
        Medicamento medicamento = new Medicamento (0L, "Dipirona", "Analgésico");
        Prescricao prescricao = PrescricaoFactory.prescricaoBasica(medicamento);
        consulta = ConsultaFactory.finalizarConsulta(consulta, prescricao, diagnostico);
        System.out.println("✅ Consulta Finalizada!\n");
        ConsultaController consultaController = new ConsultaController();
        ConsultaController.exibirDetalhesConsulta(consulta);
    }
}