package edu.ujcv.progra1;

import java.util.Random;

public class MultiPromedio {

    public static void main(String[] args) {

        int x = 100000;
        int rango = 1000;

        int[] arr1 = new int[x];
        int[] arr2 = new int[x];
        int[] arr3 = new int[x];
        int[] arr4 = new int[x];
        int[] arr5 = new int[x];

        Random random = new Random();



        BubleSort b = new BubleSort();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.abs(random.nextInt(rango));
            arr2[i] = Math.abs(random.nextInt(rango));
            arr3[i] = Math.abs(random.nextInt(rango));
            arr4[i] = Math.abs(random.nextInt(rango));
            arr5[i] = Math.abs(random.nextInt(rango));
        }

            long time1 = b.sort(arr1);
            long time2 = b.sort(arr2);
            long time3 = b.sort(arr3);
            long time4 = b.sort(arr4);
            long time5 = b.sort(arr5);

            double promedio = time1 + time2 + time3 + time4 + time5;

            System.out.println("\nbubleSort");
            System.out.println("arr1:" + time1 + " arr2:" + time2 + " arr3:" + time3 + " arr4:" + time4 + " arr5:" + time5);
            System.out.println("\nPromedio");
            System.out.println(promedio / 5 + " milisegundos");


            MergeSort m = new MergeSort();

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = Math.abs(random.nextInt(rango));
                arr2[i] = Math.abs(random.nextInt(rango));
                arr3[i] = Math.abs(random.nextInt(rango));
                arr4[i] = Math.abs(random.nextInt(rango));
                arr5[i] = Math.abs(random.nextInt(rango));
            }

                time1 = m.sort(arr1);
                time2 = m.sort(arr2);
                time3 = m.sort(arr3);
                time4 = m.sort(arr4);
                time5 = m.sort(arr5);

                promedio = time1 + time2 + time3 + time4 + time5;

                System.out.println("\nmergeSort");
                System.out.println("arr1:" + time1 + " arr2:" + time2 + " arr3:" + time3 + " arr4:" + time4 + " arr5:" + time5);
                System.out.println("\nPromedio");
                System.out.println(promedio / 5 + " milisegundos");


                CombSort c = new CombSort();

                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = Math.abs(random.nextInt(rango));
                    arr2[i] = Math.abs(random.nextInt(rango));
                    arr3[i] = Math.abs(random.nextInt(rango));
                    arr4[i] = Math.abs(random.nextInt(rango));
                    arr5[i] = Math.abs(random.nextInt(rango));
                }

                    time1 = c.sort(arr1);
                    time2 = c.sort(arr2);
                    time3 = c.sort(arr3);
                    time4 = c.sort(arr4);
                    time5 = c.sort(arr5);

                    promedio = time1 + time2 + time3 + time4 + time5;

                    System.out.println("\ncombSort");
                    System.out.println("arr1:" + time1 + " arr2:" + time2 + " arr3:" + time3 + " arr4:" + time4 + " arr5:" + time5);
                    System.out.println("\nPromedio");
                    System.out.println(promedio / 5 + " milisegundos");


                    HeapSort h = new HeapSort();

                    for (int i = 0; i < arr1.length; i++) {
                        arr1[i] = Math.abs(random.nextInt(rango));
                        arr2[i] = Math.abs(random.nextInt(rango));
                        arr3[i] = Math.abs(random.nextInt(rango));
                        arr4[i] = Math.abs(random.nextInt(rango));
                        arr5[i] = Math.abs(random.nextInt(rango));
                    }

                        time1 = h.sort(arr1);
                        time2 = h.sort(arr2);
                        time3 = h.sort(arr3);
                        time4 = h.sort(arr4);
                        time5 = h.sort(arr5);

                        promedio = time1 + time2 + time3 + time4 + time5;

                        System.out.println("\nheapSort");
                        System.out.println("arr1:" + time1 + " arr2:" + time2 + " arr3:" + time3 + " arr4:" + time4 + " arr5:" + time5);
                        System.out.println("\nPromedio");
                        System.out.println(promedio / 5 + " milisegundos");

                    }
                }

