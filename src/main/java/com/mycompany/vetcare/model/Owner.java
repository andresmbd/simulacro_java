package com.mycompany.vetcare.model;

import java.time.LocalDateTime;


public class Owner {
    private Integer id;
    private String idType;
    private String idNumber;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String address;
    private Boolean status;
    private LocalDateTime createdAt;

    public Owner() {
    }

    public Owner(Integer id, String idType, String idNumber, String fullName, String phoneNumber, String email, String address, Boolean status, LocalDateTime createdAt) {
        this.id = id;
        this.idType = idType;
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Owner(String idType, String idNumber, String fullName, String phoneNumber, String email, String address, Boolean status, LocalDateTime createdAt) {
        this.idType = idType;
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public String getIdType() {
        return idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Owner{" + "id=" + id + ", idNumber=" + idNumber + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", status=" + status + '}';
    }


}
