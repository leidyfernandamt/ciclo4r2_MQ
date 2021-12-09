
package com.Ciclo4_reto2.reto2_8bits.ControllerWeb;

import com.Ciclo4_reto2.reto2_8bits.Model.Laptops;
import com.Ciclo4_reto2.reto2_8bits.Service.LaptopsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lei20
 */
@RestController
@RequestMapping("/api/laptop")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class LaptopsController {
    
     @Autowired
    private LaptopsService laptopsService;

    @GetMapping("/all")
    public List<Laptops> getAll(){
        return laptopsService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Laptops laptops){
        laptopsService.create(laptops);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Laptops update(@RequestBody Laptops laptops){
        return laptopsService.update(laptops);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return laptopsService.delete(id);
    }
    
}
