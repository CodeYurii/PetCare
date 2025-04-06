package com.petcare.util;

public class ConfigSistema {

    private static ConfigSistema instancia;

    private String nomeClinica;
    private String endereco;
    private String bancoDeDadosUrl;
    private String usuarioBanco;
    private String senhaBanco;

    private ConfigSistema() {
        this.nomeClinica = "Clínica PetCare";
        this.endereco = "Rua das Patinhas, 123";
        this.bancoDeDadosUrl = "jdbc:mysql://localhost:3306/clinica";
        this.usuarioBanco = "root";
        this.senhaBanco = "admin";
    }

    public static ConfigSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfigSistema();
        }
        return instancia;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBancoDeDadosUrl() {
        return bancoDeDadosUrl;
    }

    public String getUsuarioBanco() {
        return usuarioBanco;
    }

    public String getSenhaBanco() {
        return senhaBanco;
    }
}
