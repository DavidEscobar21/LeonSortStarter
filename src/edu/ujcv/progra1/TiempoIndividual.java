package edu.ujcv.progra1;

import java.util.Random;

public class TiempoIndividual {


    public void tiempoIndividual(int x, int rango) {

        int[] arr1 = new int[x];
        int[] arr2 = new int[x];
        int[] arr3 = new int[x];
        int[] arr4 = new int[x];


        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.abs(random.nextInt(rango));
            arr2[i] = Math.abs(random.nextInt(rango));
            arr3[i] = Math.abs(random.nextInt(rango));
            arr4[i] = Math.abs(random.nextInt(rango));

        }

        BubleSort b = new BubleSort();

        MergeSort m = new MergeSort();

        CombSort c = new CombSort();

        HeapSort h = new HeapSort();


        System.out.println("\nbubleSort");
        System.out.println("tarda " + b.sort(arr1) + " milisegundos");
        System.out.println("\nmergeSort");
        System.out.println("tarda " + m.sort(arr2) + " milisegundos");
        System.out.println("\ncombSort");
        System.out.println("tarda " + c.sort(arr3) + " milisegundos");
        System.out.println("\nheapSort");
        System.out.println("tarda " + h.sort(arr4) + " milisegundos");
    }

}
