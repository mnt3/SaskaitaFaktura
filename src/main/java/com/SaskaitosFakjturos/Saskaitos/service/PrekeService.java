package com.SaskaitosFakjturos.Saskaitos.service;

import com.SaskaitosFakjturos.Saskaitos.model.Preke;
import com.SaskaitosFakjturos.Saskaitos.repozitory.PrekeRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by JP17-2 on 2018.03.13.
 */
@Service
public class PrekeService implements PrekeServiceInt {

    @Autowired
    private PrekeRepozitory prekeRepozitory;

    @Override
    public List<Preke> gautiPrekes() {
        return prekeRepozitory.findAll();
    }

    @Override
    public Preke gautiPreke(String pavadinimas) {
        List<Preke> prekes = prekeRepozitory.findAll();
        for (Preke visospr:prekes) {
            if (visospr.getPavadinimas().contains(pavadinimas)){
                return visospr;

            }
        }
        return null;
    }

    @Override
    public void sukurtiPreke(Preke preke) {
    prekeRepozitory.save(preke);
    }

    @Override
    public Long surastiPreke(String pavadinimas) {
        List<Preke> prekes = prekeRepozitory.findAll();
        for (Preke visospr:prekes) {
            if (visospr.getPavadinimas().contains(pavadinimas)){
                return visospr.getId();

            }
        }
        return null;
    }

    @Override
    public void istrintiPreke(Long id) {
    prekeRepozitory.deleteById(id);
    }

    @Override
    public Preke rastiPreke(Long id) {
       Preke preke =  prekeRepozitory.findById(id).get();
       return preke;
    }

    public void istrintiPreke(String pavadinimas){
        prekeRepozitory.deleteById(surastiPreke(pavadinimas));
    }
}
