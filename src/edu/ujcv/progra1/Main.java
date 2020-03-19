package edu.ujcv.progra1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[] elementos = new int [10000];
        Random random = new Random();
        for (int j = 0; j < elementos.length; j++) {
            elementos[j] = Math.abs(random.nextInt(1000));
        }

        BubleSort b = new BubleSort();
//        elementos = s.bubleSort(elementos);

        ShuffleSort s = new ShuffleSort();
//        elementos = s.shuffleSort(elementos);

        MergeSort m = new MergeSort();
//          elementos = s.mergeSort(elementos);

        CombSort c = new CombSort();
//            s.combSort(elementos);

        HeapSort h = new HeapSort();
//        s.heapSort(elementos);


        System.out.println("\nbubleSort");
        System.out.println("tarda "+ b.sort(elementos)+ " milisegundos");
        System.out.println("\nmergeSort");
        System.out.println("tarda "+ m.sort(elementos)+ " milisegundos");
        System.out.println("\ncombSort");
        System.out.println("tarda "+ c.sort(elementos)+ " milisegundos");
        System.out.println("\nheapSort");
        System.out.println("tarda "+ h.sort(elementos)+ " milisegundos");
//        System.out.println("\nShuffleSort");
//        System.out.println("tarda "+ s.sort(elementos)+ " milisegundos");
    }
}




