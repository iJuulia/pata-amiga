package br.edu.ifba.saj.ads.poo.model;

import java.time.LocalDateTime;

public abstract class AbstractModel<ID> {
	private ID id;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private Usuario createdBy;
	private Usuario updatedBy;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Usuario getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Usuario createdBy) {
        this.createdBy = createdBy;
    }

    public Usuario getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Usuario updatedBy) {
        this.updatedBy = updatedBy;
    }

	
}
