package com.SaskaitosFakjturos.Saskaitos.repozitory;

import com.SaskaitosFakjturos.Saskaitos.model.Saskaita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by JP17-2 on 2018.03.13.
 */
public interface SaskaitaRepozitory extends JpaRepository<Saskaita,Long> {

}
