package dataStructures.Sorts;

import dataStructures.HighArray;

public class ArrBubbleSort extends HighArray {
    public ArrBubbleSort(int max) {
        super(max);
    }

    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    public void bubbleSort(){
        int bound, j ;
        for (bound=nElems-1;  bound > 1; bound--){// в конце каждой итерации еще один элемент в конце найдет свое место
            for (j = 0; j < bound; j++){  // поэтому не надо до конца массива снова пробегаться
                if (a[j] > a[j+1])
                    swap(j, j+1);
            }
        }
    }
}
