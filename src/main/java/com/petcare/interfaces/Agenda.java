package com.petcare.interfaces;

import com.petcare.model.Pet;
import com.petcare.model.Veterinario;
import java.time.LocalDateTime;

public interface Agenda {
    void agendarConsulta(Pet pet, Veterinario vet, LocalDateTime data);
}


