package edu.ujcv.progra1;

public class CombSort implements SortTester {

    @Override
    public long sort(int[] array) {
            long start = System.currentTimeMillis();
            combSort(array);

            long end = System.currentTimeMillis();

            return end - start;
        }

        public void combSort (int [] array) {

            int n = array.length;
            int Sig = n;
            boolean x = true;

            while (Sig != 1 || x == true) {

                Sig = ObtenerSiguiente(Sig);
                x = false;

                for (int i = 0; i < n - Sig; i++) {
                    if (array[i] > array[i + Sig]) {

                        int temp = array[i];
                        array[i] = array[i + Sig];
                        array[i + Sig] = temp;
                        x = true;
                    }
                }

        }}


       public int ObtenerSiguiente(int Sig) {

            Sig = (Sig * 10) / 13;

            if (Sig < 1){
                return 1;
        }

        return Sig;
    }
}

