package com.SaskaitosFakjturos.Saskaitos;

import com.SaskaitosFakjturos.Saskaitos.model.Preke;
import com.SaskaitosFakjturos.Saskaitos.model.Saskaita;
import com.SaskaitosFakjturos.Saskaitos.service.PrekeService;
import com.SaskaitosFakjturos.Saskaitos.service.SaskaitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by JP17-2 on 2018.03.13.
 */
@Service
public class Testas implements CommandLineRunner {

    @Autowired
    private PrekeService prekeService;

    @Autowired
    private SaskaitaService saskaitaService;

    @Override
    public void run(String... strings) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        Saskaita saskaita1 = new Saskaita("numeris","Siuntejas","Gavejas");

        Saskaita saskaita2 = new Saskaita("numeris2","Siuntejas2","Gavejas2");


        Preke preke1 = new Preke("pienas",5,"vnt",0.85);
        Preke preke2 = new Preke("riesutai",300,"gr",5.8);
        Preke preke3 = new Preke("zuvis",850,"gr",15.99);
        Preke preke4 = new Preke("mesa",850,"gr",15.99);
        Preke preke5 = new Preke("kiausiniai",10,"vnt",15.99);

        saskaita1.getPrekes().add(preke1);
        saskaita1.getPrekes().add(preke2);
        saskaita2.getPrekes().add(preke3);



        prekeService.sukurtiPreke(preke1);
        prekeService.sukurtiPreke(preke2);
        prekeService.sukurtiPreke(preke3);

        saskaitaService.sukurtiSaskaita(saskaita1);
        saskaitaService.sukurtiSaskaita(saskaita2);







    }
}
