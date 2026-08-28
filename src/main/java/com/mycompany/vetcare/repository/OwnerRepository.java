
package com.mycompany.vetcare.repository;

import com.mycompany.vetcare.model.Owner;
import java.util.List;
import java.util.Optional;

public interface OwnerRepository {
    void registrarOwner(Owner owner);
    List<Owner> consultarOwners();
    void actualizarOwner(Owner owner);
    void cambiarEstadoOwner(Integer id, Boolean estado);
    Optional<Owner> buscarPorId(Integer id);
}
