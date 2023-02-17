package com.akbulutmehmet.contactbook.dto;

import javax.validation.constraints.*;

public class ContactRequest {
    private Long id;

    @NotBlank(message = "name is requried")
    @NotEmpty
    private String name;
    @NotBlank(message = "Surname is requried")
    @NotEmpty
    private String surName;

    private Long phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ContactRequest(Long id, String name, String surName, Long phoneNumber) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
    }
}
