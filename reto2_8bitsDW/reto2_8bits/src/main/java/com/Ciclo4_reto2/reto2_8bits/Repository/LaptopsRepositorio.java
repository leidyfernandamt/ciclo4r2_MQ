/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Ciclo4_reto2.reto2_8bits.Repository;

import com.Ciclo4_reto2.reto2_8bits.Model.Laptops;
import com.Ciclo4_reto2.reto2_8bits.interfaz.LaptopsInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lei20
 */
@Repository
public class LaptopsRepositorio {
    @Autowired
    private LaptopsInterface laptopsrepository;

    public List<Laptops> getAll() {
        return laptopsrepository.findAll();
    }

    public Optional<Laptops> getLaptops(int id) {
        return laptopsrepository.findById(id);
    }
    public Laptops create(Laptops laptops) {
        return laptopsrepository.save(laptops);
    }

    public void update(Laptops laptops) {
        laptopsrepository.save(laptops);
    }
    
    public void delete(Laptops laptops) {
        laptopsrepository.delete(laptops);
    }
}
