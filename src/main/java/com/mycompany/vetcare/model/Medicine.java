
package com.mycompany.vetcare.model;

import java.time.LocalDate;


public class Medicine {
    private Integer id;
    private String code;
    private String name;
    private String presentation;
    private String laboratory;
    private Integer stock;
    private Integer minStock;
    private Double unitPrice;
    private Boolean status;
    private LocalDate createdAt;

    public Medicine() {
    }

    public Medicine(String code, String name, String presentation, String laboratory, Integer stock, Integer minStock, Double unitPrice, Boolean status, LocalDate createdAt) {
        this.code = code;
        this.name = name;
        this.presentation = presentation;
        this.laboratory = laboratory;
        this.stock = stock;
        this.minStock = minStock;
        this.unitPrice = unitPrice;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Medicine(Integer id, String code, String name, String presentation, String laboratory, Integer stock, Integer minStock, Double unitPrice, Boolean status, LocalDate createdAt) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.presentation = presentation;
        this.laboratory = laboratory;
        this.stock = stock;
        this.minStock = minStock;
        this.unitPrice = unitPrice;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPresentation() {
        return presentation;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Boolean getStatus() {
        return status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Medicine{" + "code=" + code + ", name=" + name + ", presentation=" + presentation + ", laboratory=" + laboratory + ", stock=" + stock + ", unitPrice=" + unitPrice + ", status=" + status + ", createdAt=" + createdAt + '}';
    }
    
}
