package edu.ujcv.progra1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        TiempoIndividual tiempo = new TiempoIndividual();
        Funcionamiento funcionamiento = new Funcionamiento();
        MultiPromedio promedio = new MultiPromedio();

        int opcion;

        do {
            System.out.println(" ");
            System.out.println("-------------------------------------");
            System.out.println("Menu");
            System.out.println("1. ver funcionamiento de los sorts");
            System.out.println("2. ver tiempo invidual de cada ejecución");
            System.out.println("3. ver promedio de ejecución de cada sort");
            System.out.println("4. Salir");
            System.out.println("-------------------------------------");
            opcion = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");

            switch (opcion) {
                case 1:
                    System.out.println(" ");
                    int x = leerEntero(sc, "Ingrese el tamaño del arreglo", "Ha ingresado un caracter no valido");
                    System.out.println("");
                    int rango = leerEntero(sc, "Ingrese el limite de los numeros del arreglo", "Ha ingresado un caracter no valido");
                    funcionamiento.funcionamiento(x,rango);
                    break;
                case 2:
                    System.out.println(" ");
                    x = leerEntero(sc, "Ingrese el tamaño del arreglo", "Ha ingresado un caracter no valido");
                    System.out.println("");
                    rango = leerEntero(sc, "Ingrese el limite de los numeros del arreglo", "Ha ingresado un caracter no valido");
                    tiempo.tiempoIndividual(x,rango);
                    break;
                case 3:
                    System.out.println(" ");
                    x = leerEntero(sc, "Ingrese el tamaño del arreglo", "Ha ingresado un caracter no valido");
                    System.out.println("");
                    rango = leerEntero(sc, "Ingrese el limite de los numeros del arreglo", "Ha ingresado un caracter no valido");
                    promedio.multiPromedio(x,rango);
                    break;
            }
        }while (opcion != 4);
    }

    public static int leerEntero(Scanner sc,String mensaje, String mensajeError) {
        int retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }

}




