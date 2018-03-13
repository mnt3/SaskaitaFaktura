package com.SaskaitosFakjturos.Saskaitos.service;

import com.SaskaitosFakjturos.Saskaitos.model.Preke;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.13.
 */
public interface PrekeServiceInt {
    List<Preke> gautiPrekes();
    Preke gautiPreke(String pavadinimas);
    void sukurtiPreke(Preke preke);
    Long surastiPreke(String pavadinimas);
    void istrintiPreke(Long id);
}
