
package com.Ciclo4_reto2.reto2_8bits.interfaz;

import com.Ciclo4_reto2.reto2_8bits.Model.Laptops;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author lei20
 */
public interface LaptopsInterface extends MongoRepository<Laptops, Integer>{
   
    
}
