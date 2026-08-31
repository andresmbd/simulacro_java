  
package com.mycompany.vetcare.repository;

import com.mycompany.vetcare.model.Cita;
import com.mycompany.vetcare.model.CitaStatus;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;


public interface CitaRepository {
   void registrarCita(Cita cita);
   Optional<Cita> consultarCitaPorId(Integer id); // para que no retorne null
   void actualizarCita(Cita cita);
   void cancelarCita(Integer cita);
   void cambiarEstadoCita(Integer id, CitaStatus status);
   List<Cita> listarTodos();
   List<Cita> consultarPorIdMascota(Integer idPet);
   List<Cita> consultarPorIdVet(Integer idVet);
   List<Cita> consultarPorFecha(LocalDate date);
   Optional<Cita> buscarPorVetFechaYHora(Integer idVet, LocalDate fecha, LocalTime hora); // porque Un veterinario no puede tener dos citas en la misma fecha y hora.
}
