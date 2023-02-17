package com.akbulutmehmet.contactbook.model;


import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surName;

    @Column(name = "phone_number",unique = true)
    private Long phoneNumber;

    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public Contact () {
        super();
    }
    public Contact(String name, String surName, Long phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
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
}
