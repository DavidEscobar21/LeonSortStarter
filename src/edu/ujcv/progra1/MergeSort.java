package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        mergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] mergeSort(int[] a) {

        int[] inf = new int [a.length/2];
        int[] sup = new int [a.length - inf.length];
        int k =0;

        if(a.length <= 1){
        return a;
        }

        for (int i = 0; i < inf.length; i++) {

            inf [i] = a [k++];

        }

        for (int i = 0; i < sup.length; i++) {

            sup[i]= a[k++];
        }


        return merge(inf,sup);
    }

    public static int[] merge(int[] inf, int[] sup ){
        return new int[5];
    }


}
