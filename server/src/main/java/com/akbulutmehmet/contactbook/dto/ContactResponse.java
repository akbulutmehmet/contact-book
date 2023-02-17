package com.akbulutmehmet.contactbook.dto;

public class ContactResponse {
    private Long id;
    private String name;
    private String surName;
    private Long phoneNumber;

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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

    public ContactResponse(Long id, String name, String surName, Long phoneNumber) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
    }
}
