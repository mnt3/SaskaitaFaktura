package com.SaskaitosFakjturos.Saskaitos;

import com.SaskaitosFakjturos.Saskaitos.model.Saskaita;
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
    private SaskaitaService saskaitaService;

    @Override
    public void run(String... strings) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        Saskaita saskaita1 = new Saskaita("Siuntejas","Gavejas","numeris");

        Saskaita saskaita2 = new Saskaita("Siuntejas2","Gavejas2","numeris2");
        saskaitaService.sukurtiSaskaita(saskaita1);
        saskaitaService.sukurtiSaskaita(saskaita2);
    }
}
