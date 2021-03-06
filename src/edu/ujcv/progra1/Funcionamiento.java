package edu.ujcv.progra1;

import java.util.Random;

public class Funcionamiento {

    public void funcionamiento(int x, int rango){

        int [] arr1 = new int[x];
        int [] arr2 = new int[x];
        int [] arr3 = new int[x];
        int [] arr4 = new int[x];
        int [] arr5 = new int[x];

        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.abs(random.nextInt(rango));
            arr2[i] = Math.abs(random.nextInt(rango));
            arr3[i] = Math.abs(random.nextInt(rango));
            arr4[i] = Math.abs(random.nextInt(rango));
            arr5[i] = Math.abs(random.nextInt(rango));
        }

        BubleSort b = new BubleSort();
        arr1 = b.bubleSort(arr1);

        ShuffleSort s = new ShuffleSort();
        arr2 = s.shuffleSort(arr2);

        MergeSort m = new MergeSort();
        arr3 = m.mergeSort(arr3);

        CombSort c = new CombSort();
        c.combSort(arr4);

        HeapSort h = new HeapSort();
        h.heapSort(arr5);

        System.out.println("BubleSort");
            for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
  }
        System.out.println("");
        System.out.println("ShuffleSort");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+", ");
        }
        System.out.println("");
        System.out.println("MergeSort");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+", ");
        }
        System.out.println("");
        System.out.println("CombSort");

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]+", ");
        }
        System.out.println("");
        System.out.println("HeapSort");

        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i]+", ");
        }
    }


}
