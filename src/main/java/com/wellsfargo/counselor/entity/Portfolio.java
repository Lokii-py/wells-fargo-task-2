package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portFolio;

    @Column(nullable = false)
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "ClientId")
    private Client client;

    public Portfolio() {
    }

    public Portfolio(LocalDate creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public Long getportFolio() {
        return portFolio;
    }

    public LocalDate getcreationDate() {
        return creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setcreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
