package com.Ciclo4_reto2.reto2_8bits.Service;

import com.Ciclo4_reto2.reto2_8bits.Model.Laptops;
import com.Ciclo4_reto2.reto2_8bits.Repository.LaptopsRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lei20
 */
@Service
public class LaptopsService {

    @Autowired
    private LaptopsRepositorio laptopsRepository;

    public List<Laptops> getAll() {
        return laptopsRepository.getAll();
    }

    public Optional<Laptops> getLaptops(int id) {
        return laptopsRepository.getLaptops(id);
    }

    public Laptops create(Laptops accesory) {
        if (accesory.getId() == null) {
            return accesory;
        } else {
            return laptopsRepository.create(accesory);
        }
    }

    public Laptops update(Laptops laptops) {

        if (laptops.getId() != null) {
            Optional<Laptops> laptopsDb = laptopsRepository.getLaptops(laptops.getId());
            if (!laptopsDb.isEmpty()) {

                if (laptops.getBrand() != null) {
                    laptopsDb.get().setBrand(laptops.getBrand());
                }

                if (laptops.getModel() != null) {
                    laptopsDb.get().setModel(laptops.getModel());
                }
                if (laptops.getProcesor() != null) {
                    laptopsDb.get().setProcesor(laptops.getProcesor());
                }
                if (laptops.getOs() != null) {
                    laptopsDb.get().setOs(laptops.getOs());
                }
                if (laptops.getDescription() != null) {
                    laptopsDb.get().setDescription(laptops.getDescription());
                }
                if (laptops.getMemory() != null) {
                    laptopsDb.get().setMemory(laptops.getMemory());
                }
                if (laptops.getHardDrive() != null) {
                    laptopsDb.get().setHardDrive(laptops.getHardDrive());
                }

                if (laptops.getPrice() != 0.0) {
                    laptopsDb.get().setPrice(laptops.getPrice());
                }
                if (laptops.getQuantity() != 0) {
                    laptopsDb.get().setQuantity(laptops.getQuantity());
                }
                if (laptops.getPhotography() != null) {
                    laptopsDb.get().setPhotography(laptops.getPhotography());
                }
                laptopsDb.get().setAvailability(laptops.isAvailability());
                laptopsRepository.update(laptopsDb.get());
                return laptopsDb.get();
            } else {
                return laptops;
            }
        } else {
            return laptops;
        }
    }

    public boolean delete(int id) {
        return getLaptops(id).map(product -> {
            laptopsRepository.delete(product);
            return true;
        }).orElse(false);
    }
}
