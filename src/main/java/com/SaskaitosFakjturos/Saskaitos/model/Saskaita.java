package com.SaskaitosFakjturos.Saskaitos.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by JP17-2 on 2018.03.13.
 */
@Entity
public class Saskaita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date data = new Date();
    private String numeris;
    private String imone;
    private String gavejas;
    @OneToMany
    Set<Preke> prekes = new HashSet<>();

    public Set<Preke> getPrekes() {
        return prekes;
    }

    public void setPrekes(Set<Preke> prekes) {
        this.prekes = prekes;
    }

    public Saskaita(String localDate, String siuntejas2, String gavejas2, LocalDate numeris2) {
    }

    public Saskaita() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Saskaita(Date data, String numeris, String imone, String gavejas) {
        this.data = data;
        this.numeris = numeris;
        this.imone = imone;
        this.gavejas = gavejas;
    }

    public Saskaita(Long id, String numeris, String imone, String gavejas) {
        this.id = id;
        this.numeris = numeris;
        this.imone = imone;
        this.gavejas = gavejas;
    }

    public Saskaita(String numeris, String imone, String gavejas) {
        this.numeris = numeris;
        this.imone = imone;
        this.gavejas = gavejas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getImone() {
        return imone;
    }

    public void setImone(String imone) {
        this.imone = imone;
    }

    public String getGavejas() {
        return gavejas;
    }

    public void setGavejas(String gavejas) {
        this.gavejas = gavejas;
    }
}
