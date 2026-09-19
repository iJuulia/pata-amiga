package br.edu.ifba.saj.ads.poo.model;

import java.util.UUID;

public class Tutor extends AbstractModel<UUID> {
	private String nome;
	private String CPF;

    public Tutor(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

	
}
