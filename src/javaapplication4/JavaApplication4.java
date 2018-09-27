/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        String usuario = "administrador";
        String clave = "123456";
        String x, y;
        System.out.print("Ingrese el nombre de Usuario: ");
        x = en.nextLine();
        System.out.print("Ingrese la clave: ");
        y = en.nextLine();
        if (x.equals(usuario)) {
            if (y.equals(clave)) {
                System.out.println("Bienvenido al Sistema");
            } else {
                System.out.println("Error en la clave");
            }
        } else {
            if(y.equals(clave)){
                System.out.println("Error en el usuario");
            }
            else {
                System.out.println("Usuario no registrado");
            }
        }

    }
}
