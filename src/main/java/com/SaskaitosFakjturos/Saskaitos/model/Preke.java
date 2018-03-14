package com.SaskaitosFakjturos.Saskaitos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by JP17-2 on 2018.03.13.
 */
@Entity
public class Preke {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pavadinimas;
    private int kiekis;
    private String matavimoVienetas;
    private double kaina;
    @ManyToOne
    @JsonIgnore
    private Saskaita saskaita;

    public Saskaita getSaskaita() {
        return saskaita;
    }

    public void setSaskaita(Saskaita saskaita) {
        this.saskaita = saskaita;
    }

    public Preke() {
    }

    public Preke(Long id, String pavadinimas, int kiekis, String matavimoVienetas, double kaina) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.kiekis = kiekis;
        this.matavimoVienetas = matavimoVienetas;
        this.kaina = kaina;
    }

    public Preke(String pavadinimas, int kiekis, String matavimoVienetas, double kaina) {
        this.pavadinimas = pavadinimas;
        this.kiekis = kiekis;
        this.matavimoVienetas = matavimoVienetas;
        this.kaina = kaina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public String getMatavimoVienetas() {
        return matavimoVienetas;
    }

    public void setMatavimoVienetas(String matavimoVienetas) {
        this.matavimoVienetas = matavimoVienetas;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }
}
