package com.petcare.model;

public class Diagnostico {
    private Long id;
    private String patologia;

    public Diagnostico() {}

    public Diagnostico(Long id, String patologia) {
        this.id = id;
        this.patologia = patologia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }
}
