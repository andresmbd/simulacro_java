
package com.mycompany.vetcare.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Cita {
    private Integer id;
    private Pet pet;
    private Vet vet;
    private LocalDate date;
    private LocalTime time;
    private String reason;
    private CitaStatus status;
    private LocalDateTime createdAt;

    public Cita() {
    }

    public Cita(Integer id, Pet pet, Vet vet, LocalDate date, LocalTime time, String reason, CitaStatus status, LocalDateTime createdAt) {
        this.id = id;
        this.pet = pet;
        this.vet = vet;
        this.date = date;
        this.time = time;
        this.reason = reason;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Cita(Pet pet, Vet vet, LocalDate date, LocalTime time, String reason, CitaStatus status, LocalDateTime createdAt) {
        this.pet = pet;
        this.vet = vet;
        this.date = date;
        this.time = time;
        this.reason = reason;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }

    public Vet getVet() {
        return vet;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

    public CitaStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(CitaStatus status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Cita{" + "id=" + id + ", pet=" + pet + ", vet=" + vet + ", date=" + date + ", time=" + time + ", reason=" + reason + ", status=" + status + ", createdAt=" + createdAt + '}';
    }
    
    
}
