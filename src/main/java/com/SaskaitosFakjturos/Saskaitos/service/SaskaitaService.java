package com.SaskaitosFakjturos.Saskaitos.service;

import com.SaskaitosFakjturos.Saskaitos.model.Saskaita;
import com.SaskaitosFakjturos.Saskaitos.repozitory.SaskaitaRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.13.
 */
@Service
public class SaskaitaService implements SaskaitaServiceInt {

    @Autowired
    private SaskaitaRepozitory saskaitaRepozitory;

    @Override
    public List<Saskaita> perziuretiVisasSaskaitas() {
        return  saskaitaRepozitory.findAll();
    }

    @Override
    public Saskaita rastiSaskaita(Long id) {
        return saskaitaRepozitory.findById(id).get();
    }

    @Override
    public void sukurtiSaskaita(Saskaita saskaita) {
        saskaitaRepozitory.save(saskaita);
    }

    @Override
    public void istrintiSaskaita(Long id) {

        saskaitaRepozitory.deleteById(id);
    }

    @Override
    public void pakeistiSaskaita(Saskaita saskaita, Long id) {
Saskaita senaSaskaita = saskaitaRepozitory.findById(id).get();
senaSaskaita.setGavejas(saskaita.getGavejas());
senaSaskaita.setGavejas(saskaita.getImone());
senaSaskaita.setNumeris(saskaita.getNumeris());

    }
}
