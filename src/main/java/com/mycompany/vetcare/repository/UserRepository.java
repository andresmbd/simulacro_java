
package com.mycompany.vetcare.repository;

import com.mycompany.vetcare.model.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
   void registrarUsuario(User user);
   Optional<User> buscarUsername(String username); 
   void actualizarUser(User user);
   void cambiarEstadoUser(Integer id, Boolean status);
   Optional<User> buscarPorId(Integer id);
   List<User> listarTodos();
}
