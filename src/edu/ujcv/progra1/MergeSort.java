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
        int[] inf = new int [a.length -( a.length/2)];
        int[] sup = new int [a.length - inf.length];



        return merge(inf,sup);
    }

    public static int[] merge(int[] inf, int[] sup ){
        return new int[5];
    }


}
