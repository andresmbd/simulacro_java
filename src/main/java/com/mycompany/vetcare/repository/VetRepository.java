
package com.mycompany.vetcare.repository;

import com.mycompany.vetcare.model.Vet;
import java.util.List;
import java.util.Optional;


public interface VetRepository {
    void registrarVet(Vet vet);
    List<Vet> listarTodos();
    void actualizarVet(Vet vet);
    void cambiarEstadoVet(Integer id, Boolean status);
    Optional<Vet> buscarPorId(Integer id);
    List<Vet> buscarPorEspecialidad(); // Puede haber varios vet especializados, retorna una lista
    Optional<Vet> buscarPorIdNumber(String idNumber); // Validar número de documento único
    Optional<Vet> buscarPorTarjetaProfesional(String professionalLicense); // Validar tarjeta profesional única
}