package com.mycompany.vetcare;

import com.mycompany.vetcare.conexiondb.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args){
       try(Connection conexion = ConexionDB.conectarDB()){
           if(conexion != null)
                System.out.println("CONEXION EXITOSA A LA BASE DE DATOS DE POSTGRESQL");
       }catch(SQLException e){
           System.out.println("error de conexion: " + e.getMessage());
       }
    }
}
