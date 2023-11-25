package dataStructures.Sorts;

import dataStructures.HighArray;

public class ArrSelectionSort extends HighArray {

    public ArrSelectionSort(int max) {
        super(max);
    }

    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void selectionSort(){
        int bound, j;
        int min; // Мы храним индекс минимального
        for(bound = 0; bound < nElems; bound++){
            min = bound;
            for(j = bound + 1; j < nElems; j++){
                if (a[min] > a[j])
                    min = j;
            }
            swap(min, bound);
        }
    }
}
