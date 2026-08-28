
package com.mycompany.vetcare.repository;

import com.mycompany.vetcare.model.Pet;
import java.util.List;
import java.util.Optional;


public interface PetRepository {
    void registrarPet(Pet pet);
    void actualizarPet(Pet pet);
    List<Pet> consultarPets();
    Optional<Pet> buscarPetPorId(Integer id);
    
}
