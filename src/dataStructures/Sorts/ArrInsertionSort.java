package dataStructures.Sorts;

import dataStructures.HighArray;

public class ArrInsertionSort extends HighArray {
    public ArrInsertionSort(int max) {
        super(max);
    }

    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void insertionSort(){
        int marker; // Помеченный игрок, которого хотим вставить в отсортированную часть
        int j; // Будет пробегать по отсортированной части и искать место вставки

        for (marker = 1; marker < nElems; marker++){
            long tmp = a[marker]; // Из строя вытаскиваем
            j = marker;
            while(j > 0 && a[j-1] > tmp){
                a[j] = a[j-1];
                j--;
            }
            a[j] = tmp;
        }

    }
}
