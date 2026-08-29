package com.mycompany.vetcare.model;


public class Vet {
    private String id;
    private String idNumber;
    private String name;
    private String professionalLicense;
    private String specialty;
    private String phoneNumber;
    private String email;
    private Boolean status;

    public Vet() {
    }

    public Vet(String idNumber, String name, String professionalLicense, String specialty, String phoneNumber, String email, Boolean status) {
        this.idNumber = idNumber;
        this.name = name;
        this.professionalLicense = professionalLicense;
        this.specialty = specialty;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status;
    }

    public Vet(String id, String idNumber, String name, String professionalLicense, String specialty, String phoneNumber, String email, Boolean status) {
        this.id = id;
        this.idNumber = idNumber;
        this.name = name;
        this.professionalLicense = professionalLicense;
        this.specialty = specialty;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getProfessionalLicense() {
        return professionalLicense;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessionalLicense(String professionalLicense) {
        this.professionalLicense = professionalLicense;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vet{" + "idNumber=" + idNumber + ", name=" + name + ", specialty=" + specialty + ", phoneNumber=" + phoneNumber + ", email=" + email + ", status=" + status + '}';
    }
    
    
}
