/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.*;
import models.*;
/**
 *
 * @author ronal
 */
public class LoginConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Login> listaLogins = new ArrayList<>();
        boolean continuarRegistro = true;
        
        while (continuarRegistro) {
            System.out.println("\nSeleccione el tipo de registro:");
            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente
            
            System.out.print("Ingrese nombre de usuario: ");
            String usuario = sc.nextLine();
            
            System.out.print("Ingrese contraseña: ");
            String contrasena = sc.nextLine();
            
            switch (opcion) {
                case 1:
                    listaLogins.add(new Cliente(usuario, contrasena));
                    break;
                case 2:
                    listaLogins.add(new Admin(usuario, contrasena));
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            
            System.out.print("¿Desea registrar otro usuario? (s/n): ");
            String resp = sc.nextLine();
            if (!resp.equalsIgnoreCase("s")) {
                continuarRegistro = false;
            }
        }
        
        // Mostrar todos los logins registrados utilizando el método que usa wildcard
        mostrarLogins(listaLogins);
        simularLogin(listaLogins, sc);
        
    }
    public static void mostrarLogins(List<? extends Login> logins) {
        System.out.println("\n--- Listado de Logins Registrados ---");
        String tipo;
        for (Login login : logins) {
            if (login instanceof Cliente) {
                tipo = "Cliente";
            }else{
                tipo = "Administrador.";
            }
            System.out.println(login.toString()+" Tipo: "+tipo);
        }
    }
     public static void simularLogin(List<Login> listaLogins, Scanner sc) {
        System.out.println("\n--- Simulación de Login ---");
        System.out.print("Ingrese su usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = sc.nextLine();
        
        // Buscamos si existe un usuario con esas credenciales
        boolean encontrado = false;
        for (Login login : listaLogins) {
            if (login.getUser().equals(usuario) && login.getPass().equals(contrasena)) {
                encontrado = true;
                // Se identifica el tipo de usuario
                if (login instanceof Cliente) {
                    System.out.println("¡Login correcto! Eres cliente.");
                } else if (login instanceof Admin) {
                    System.out.println("¡Login correcto! Eres admin.");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Credenciales incorrectas. No se encontró el usuario.");
        }
    }
    
}
