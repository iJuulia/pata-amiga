package br.edu.ifba.saj.ads.poo.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Consulta extends AbstractModel<UUID> {
	private Animal animal;
	private Veterinario veterinario;
	private LocalDateTime dataHora;
	private String motivo;
	private StatusConsulta status;

    public Consulta(Animal animal, Veterinario veterinario, LocalDateTime dataHora, String motivo, StatusConsulta status) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.dataHora = dataHora;
        this.motivo = motivo;
        this.status = status;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusConsulta status) {
        this.status = status;
    }

	
}
