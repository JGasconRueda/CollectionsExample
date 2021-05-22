package com.coding.java;

import java.util.*;
import java.util.stream.Stream;

public class MainArray {

    public static void main(String[] args) {

        // ARRAY -> Coeccion de variables del mismo tipo

        // Inicializacion
        char arrayCaracteres[];
        arrayCaracteres = new char[10];
        char arrayChar[] = {'a','b','c','d','e'};
        int []arrayInt = {1,2,3,4,5};
        String [] nombres= new String[] { "pedro", "angel", "oscar","ana","maria"};

        // Matrices
        int matriz[][];
        matriz = new int[2][2];
        int [][]array = { {1,2,3,4}, {5,6,7,8}};

        // longitud de un array
        System.out.println("Longitud de arrayInt: "+arrayInt.length);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

        // Clonacion de array
        int cloneArray[] = arrayInt.clone();

        // Operaciones java.util.Arrays
        String [] copiaNombres = Arrays.copyOf(nombres,3);
        String [] copiaNombresRango = Arrays.copyOfRange(nombres,0,4);
        String[] arrayMismosElementos = new String[3];
        Arrays.fill(arrayMismosElementos,"ana");
        Arrays.equals(nombres,copiaNombres);
        Arrays.sort(nombres);
        int pos = Arrays.binarySearch(arrayInt,4);
        Stream<String> streamString = Arrays.stream(nombres);
        List<String> listaNombres = Arrays.asList(nombres);
    }
}
