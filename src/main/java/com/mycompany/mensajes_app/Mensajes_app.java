package com.mycompany.mensajes_app;

import java.sql.Connection;
public class Mensajes_app {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        
        try(Connection cnx = conexion.getConnection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
