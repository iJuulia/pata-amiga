package br.edu.ifba.saj.ads.poo.model;

import java.util.UUID;

public class Veterinario extends AbstractModel<UUID> {
	private String nome;
	private String CRMV;
	private Especialidade especialidade;
	private boolean disponivel;

    public Veterinario(String nome, String CRMV, Especialidade especialidade) {
        this.nome = nome;
        this.CRMV = CRMV;
        this.especialidade = especialidade;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRMV() {
        return CRMV;
    }

    public void setCRMV(String CRMV) {
        this.CRMV = CRMV;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

	
}
