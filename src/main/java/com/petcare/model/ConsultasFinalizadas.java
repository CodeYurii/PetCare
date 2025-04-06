package com.petcare.model;

import java.util.List;

public class ConsultasFinalizadas {
    private List<Consulta> consultas;
    private Consulta consulta;

    public ConsultasFinalizadas() {}
    public ConsultasFinalizadas(Consulta consulta) {
        this.consulta = consulta;
    }


    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
