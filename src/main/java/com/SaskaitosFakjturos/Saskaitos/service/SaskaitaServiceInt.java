package com.SaskaitosFakjturos.Saskaitos.service;

import com.SaskaitosFakjturos.Saskaitos.model.Saskaita;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.13.
 */
public interface SaskaitaServiceInt {
    List<Saskaita> perziuretiVisasSaskaitas();
    Saskaita rastiSaskaita(Long id);
    void sukurtiSaskaita(Saskaita saskaita);
    void istrintiSaskaita(Long id);
    void pakeistiSaskaita(Saskaita saskaita,Long id);
}
