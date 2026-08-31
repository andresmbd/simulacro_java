package com.mycompany.vetcare.repository;

import com.mycompany.vetcare.model.Medicine;
import java.util.List;
import java.util.Optional;

public interface MedicineRepository {
    void registrarMedicamento(Medicine medicine);
    void actualizaMedicina(Medicine medicine);
    void cambiarEstadoMedicamentos(Integer id, Boolean status);
    Optional<Medicine> consultarMedicamentoPorId(Integer id);
    void actualizarCantidad(Integer id, Integer stock);
    List<Medicine> consultarBajoInventario();  // La consulta SQL calculará internamente la condición comparando las columnas de la tabla      
    List<Medicine> listarTodos();
    Optional<Medicine> buscarPorCodigo(String code);
}
