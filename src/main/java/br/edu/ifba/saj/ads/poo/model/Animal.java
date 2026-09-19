package br.edu.ifba.saj.ads.poo.model;

import java.util.UUID;

public class Animal extends AbstractModel<UUID> {
	private String nome;
	private Especie especie;
	private int idadeMeses;
	private Tutor tutor;

    public Animal(String nome, Especie especie, int idadeMeses, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.idadeMeses = idadeMeses;
        this.tutor = tutor;
    }

    // implicitos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getIdadeMeses() {
        return idadeMeses;
    }

    public void setIdadeMeses(int idadeMeses) {
        this.idadeMeses = idadeMeses;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

	
}
