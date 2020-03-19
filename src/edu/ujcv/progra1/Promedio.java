package edu.ujcv.progra1;

import java.util.Random;

public class Promedio {

    public static void main(String[] args){

        int [] arr1 = new int[100];
        int [] arr2 = new int[100];
        int [] arr3 = new int[100];
        int [] arr4 = new int[100];
        int [] arr5 = new int[100];

        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.abs(random.nextInt(1000));
            arr2[i] = Math.abs(random.nextInt(1000));
            arr3[i] = Math.abs(random.nextInt(1000));
            arr4[i] = Math.abs(random.nextInt(1000));
            arr5[i] = Math.abs(random.nextInt(1000));
        }

        BubleSort s = new BubleSort();
//        ShuffleSort s = new ShuffleSort();
//        MergeSort s = new MergeSort();
//        CombSort s = new CombSort();
//        HeapSort s = new HeapSort();

        long time1 = s.sort(arr1);
        long time2 = s.sort(arr2);
        long time3 = s.sort(arr3);
        long time4 = s.sort(arr4);
        long time5 = s.sort(arr5);
        double promedio = time1+time2+time3+time4+time5;

        System.out.println("arr1:"+time1+" arr2:"+time2+" arr3:"+time3+" arr4:"+time4+" arr5:"+time5);
        System.out.println("\nPromedio");
        System.out.println(promedio/5+" milisegundos");



    }

}
