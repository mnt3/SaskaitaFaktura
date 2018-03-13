package com.SaskaitosFakjturos.Saskaitos.controller;

import com.SaskaitosFakjturos.Saskaitos.model.Saskaita;
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

    @Autowired
    public SaskaitaController(SaskaitaService saskaitaService) {
        this.saskaitaService = saskaitaService;
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

}
