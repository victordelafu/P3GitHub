/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.githubentornosdesarrollo;

import java.util.Scanner;

/**
 *
 * @author Alumno Victor de la fuente
 */
public class Aplicacion {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Archivo de prueba");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        System.out.println("1->Suma\n2->Resta\n3->Multiplicación\n4->Salir");
        int eleccion = entrada.nextInt();
        do {
            switch (eleccion) {
                case 1:
                    suma(num1,num2);
                    break;
                case 2:
                    resta(num1,num2);
                    break;
                case 3:
                    multiplicacion(num1,num2);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    return;
                default:
                    System.out.println("Elige una opción correcta");
            }
        } while (eleccion != 4);
    }

    private static void suma(int num1, int num2) {
        System.out.println(num1+num2+" Es el resultado de la suma de los numeros");
    }

    private static void resta(int num1, int num2) {
        System.out.println(num1-num2+" Es el resultado de la resta de los numeros");
    }

    private static void multiplicacion(int num1, int num2) {
        System.out.println(num1*num2+" Es el resultado de la Multiplicación de los numeros");
    }
}
