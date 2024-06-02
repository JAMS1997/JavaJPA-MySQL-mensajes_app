package com.mycompany.mensajes_app;
import java.sql.Connection;
import java.util.Scanner;
public class Mensajes_app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int opcion = 0 ;
        do{
            System.out.println("---------------");
            System.out.println("APLICACION DE MENSAJES");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensajes");
            System.out.println("3. eliminar mensajes");
            System.out.println("4. editar mensajes");
            System.out.println("5. salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensaje();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                    break;
                
            }
        }while(opcion != 5);
        
        
    }
}
