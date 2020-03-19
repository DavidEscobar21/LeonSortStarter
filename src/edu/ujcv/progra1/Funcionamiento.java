package edu.ujcv.progra1;

import java.util.Random;

public class Funcionamiento {

    public static void main(String[] args){

        int [] arr1 = new int[10];
        int [] arr2 = new int[10];
        int [] arr3 = new int[10];
        int [] arr4 = new int[10];
        int [] arr5 = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.abs(random.nextInt(1000));
            arr2[i] = Math.abs(random.nextInt(1000));
            arr3[i] = Math.abs(random.nextInt(1000));
            arr4[i] = Math.abs(random.nextInt(1000));
            arr5[i] = Math.abs(random.nextInt(1000));
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
