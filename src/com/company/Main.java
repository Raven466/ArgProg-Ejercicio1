package com.company;

public class Main {

    public static void main(String[] args) {

        // 1. a) Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.
        boolean estoyEnElEjercicio1 = true;
        int numeroInicio = 5;
        int numeroFin = 14;
        while(numeroInicio <= numeroFin) {
            System.out.print(numeroInicio + ", ");
            numeroInicio++;
        }
        estoyEnElEjercicio1 = false;


        // 1. b) A lo anterior, solo muestre los números pares.
//        int numeroInicio = 5;
//        int numeroFin = 14;
//
//        while(numeroInicio <= numeroFin) {
//            if (numeroInicio % 2 == 0){
//                System.out.print(numeroInicio + ", ");
//            }
//            numeroInicio++;
//        }


        // 1. c) A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares.
//        int numeroInicio = 8;
//        int numeroFin = 14;
//        boolean soloPares = true;
//
//        while (numeroInicio <= numeroFin) {
//            boolean esUnPar = true;
//            if ((soloPares && numeroInicio % 2 == 0) || (!soloPares && numeroInicio % 2 == 1)) {
//                System.out.println(numeroInicio + ", ");
//            }
//            numeroInicio++;
//        }


        // 1. d) Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden.
//        int numeroInicio = 5;
//        int numeroFin = 14;
//
//        for (;numeroInicio <= numeroFin; numeroFin--) {
//            if (numeroFin % 2 == 0){
//                System.out.print(numeroFin + ", ");
//            }
//        }


        // 2. a)  Lea atentamente el texto, primero que nada piense cuáles son las variables de entrada.
//        int ingresosMensuales;
//        int cantidadVeículosNuevos;
//        int cantidadInmuebles;
//        boolean poseeActivos;

        // 2) Vea si puede resolver el problema utilizando código Java.
//        float ingresosMensuales = 300000;
//        int cantidadVeículosNuevos = 2;
//        int cantidadInmuebles = 2;
//        boolean poseeActivos = true;
//
//        if (ingresosMensuales >= 489083 || cantidadVeículosNuevos >= 3 || cantidadInmuebles >= 3 || poseeActivos) {
//            System.out.println("Pertenece al segmento de ingresos altos");
//        } else {
//            System.out.println("Pertenece al segmento de ingresos bajos");
//        }
    }
}
