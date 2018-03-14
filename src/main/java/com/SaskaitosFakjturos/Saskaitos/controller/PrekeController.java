package com.SaskaitosFakjturos.Saskaitos.controller;

import com.SaskaitosFakjturos.Saskaitos.model.Preke;
import com.SaskaitosFakjturos.Saskaitos.service.PrekeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.13.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/prekes")
public class PrekeController {

    private PrekeService prekeService;
    @Autowired
    public PrekeController(PrekeService prekeService) {
        this.prekeService = prekeService;
    }


    @RequestMapping(method = RequestMethod.GET)
    List<Preke> gautiPrekes(){
        return prekeService.gautiPrekes();
    }

}
