
package com.mycompany.vetcare.repository;

import com.mycompany.vetcare.model.Cita;
import java.util.List;


public interface CitaRepository {
   void registrarCita(Cita cita);
   Cita consultarCita(Integer id);
   void actualizarCita(Cita cita);
   void cancelarCita(Integer cita);
   void cambiarEstadoCita(Integer id, Boolean status);
   
}
