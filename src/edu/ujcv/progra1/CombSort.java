package edu.ujcv.progra1;

public class CombSort implements SortTester {
    @Override
    public long sort(int[] array) {
            long start = System.currentTimeMillis();
            combSort(array);

            long end = System.currentTimeMillis();

            return end - start;
        }

        public int[] combSort (int [] array){

        int n =  array.length;

        return null;
        }


        
        int ObtenerSiguiente(int Sig) {

            Sig = (Sig * 10) / 13;

            if (Sig < 1){
                return 1;
        }

        return Sig;
    }
}

