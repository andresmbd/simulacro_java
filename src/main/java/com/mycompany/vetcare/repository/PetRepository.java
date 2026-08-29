
package com.mycompany.vetcare.repository;

import com.mycompany.vetcare.model.Pet;
import java.util.List;
import java.util.Optional;
/**
 * la responsabilidad de cada repositorio 
 * está ligada a la tabla que administra 
 * en la base de datos.
 */

public interface PetRepository {
    void registrarPet(Pet pet);
    void actualizarPet(Pet pet); 
    List<Pet> buscarPorIdOwner(Integer ownerId); // Busca en la BD todas las filas de la tabla pets donde owner_id sea igual al ID del dueño consultado ownerId.
    List<Pet> buscarPorNombre(String nombre);
    List<Pet> listarTodas();
    Optional<Pet> buscarPorId(Integer id); // si en caso retorna null se controla con Optional
    void cambiarEstadoPet(Integer id, Boolean status); // Se ejecuataria una consulta sql donde el id sea igual al buscado id
}
