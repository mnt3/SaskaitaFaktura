package com.SaskaitosFakjturos.Saskaitos.controller;

import com.SaskaitosFakjturos.Saskaitos.model.Preke;
import com.SaskaitosFakjturos.Saskaitos.model.Saskaita;
import com.SaskaitosFakjturos.Saskaitos.service.PrekeService;
import com.SaskaitosFakjturos.Saskaitos.service.SaskaitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.13.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/saskaitos")
public class SaskaitaController {

    private SaskaitaService saskaitaService;
    private PrekeService prekeService;

    public SaskaitaController(SaskaitaService saskaitaService,PrekeService prekeService) {
        this.saskaitaService = saskaitaService;
        this.prekeService = prekeService;
    }
    @RequestMapping(method = RequestMethod.GET)
    List<Saskaita> gautiVisasSaskaitas(){
        return saskaitaService.perziuretiVisasSaskaitas();
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    Saskaita rastiSaskaita(@PathVariable final Long id){
       return saskaitaService.rastiSaskaita(id);
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    void istrintiSaskaita(@PathVariable final Long id){
        saskaitaService.istrintiSaskaita(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    void sukurtiSaskaita(@RequestBody final Saskaita saskaita){
        saskaitaService.sukurtiSaskaita(saskaita);
    }

    @RequestMapping(path = "/{id}/preke",method = RequestMethod.POST)
    Saskaita pridetiPreke(@RequestBody final Preke preke,@PathVariable final Long id){
        saskaitaService.rastiSaskaita(id).getPrekes().add(preke);
        prekeService.sukurtiPreke(preke);
        preke.setSaskaita(saskaitaService.rastiSaskaita(id));
        return saskaitaService.rastiSaskaita(id);
    }
    @RequestMapping(path = "/{id1}/preke/{id2}",method = RequestMethod.DELETE)
    Saskaita pasalintiPreke(@PathVariable final Long id1,@PathVariable final Long id2){
        saskaitaService.rastiSaskaita(id1).getPrekes().remove(prekeService.rastiPreke(id2));
        prekeService.istrintiPreke(id2);


        return saskaitaService.rastiSaskaita(id1);
    }

}
