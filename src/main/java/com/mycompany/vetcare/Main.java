package com.mycompany.vetcare;

import com.mycompany.vetcare.conexiondb.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args){
       try(Connection conexion = ConexionDB.conectarDB()){
           /**
            * Si el servidor de PostgreSQL está apagado, 
            * las credenciales son incorrectas o el 
            * puerto está bloqueado, el método de 
            * conexión podría devolver un valor 
            * null
            */
           if(conexion != null) // si el objeto de conexión existe en memoria
                System.out.println("CONEXION EXITOSA A LA BASE DE DATOS DE POSTGRESQL");
           
       }catch(SQLException e){
           System.out.println("error de conexion: " + e.getMessage());
       }
    }
}
