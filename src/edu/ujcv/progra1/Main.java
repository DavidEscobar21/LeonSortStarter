package edu.ujcv.progra1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[] elementos ={3,2,4,5,6,7,9,9,10,3,5,4,5,6,11,9,1};

//        ShuffleSort s = new ShuffleSort();
//        elementos = s.shuffleSort(elementos);

//          MergeSort s = new MergeSort();
//          elementos = s.mergeSort(elementos);

            CombSort s = new CombSort();
            s.combSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\ntarda "+ s.sort(elementos)+ " milisegundos");
    }
}




//    Random random = new Random();
//        for (int j = 0; j < elementos.length; j++) {
//            elementos[j] = Math.abs(random.nextInt(10000000));
//        }