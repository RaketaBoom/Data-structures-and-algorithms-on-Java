package dataStructures.Arrays;

public class OrdArray {
    private long[] a;
    private int nElems;
    //-----------------------------------------------
    public OrdArray(int max){
        a = new long[max];
        nElems = 0;
    }
    //---------------------------------------
    public int size(){
        return nElems;
    }
    private int binary_search(long SearchKey, int lowBound, int upBound){
        int middle = (lowBound + upBound)/2;
        if (a[middle]== SearchKey)
            return middle;
        if (lowBound == upBound)
            return -1;
        if (a[middle] < SearchKey)
            return binary_search(SearchKey, middle + 1, upBound);
        if (SearchKey < a[middle])
            return binary_search(SearchKey, lowBound, middle-1);
        return -1;
    }

    private int ReqBinSearch(long SearchKey, int lowBound, int upBound){
        int middle = (lowBound + upBound) / 2;
        if(a[middle] == SearchKey){
            return middle;
        }
        else if(lowBound > upBound){
            return nElems;
        }
        else{
            if(a[middle] < SearchKey){
                return ReqBinSearch(SearchKey, middle+1, upBound);
            }
            else{
                return ReqBinSearch(SearchKey, lowBound, middle-1);
            }
        }
    }

    public int find (long SearchKey){
        return binary_search(SearchKey, 0, nElems-1);
    }

    public void insert(long value){
        int j;
        for (j=0; j < nElems; j++) // Находим место для вставки
            if (a[j] > value)
                break;
        for (int k = nElems; k > j; k--) // Передвигаем последующие элементы
            a[k] = a[k-1];
        a[j] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j = find(value);
        if (j == -1) // Если не нащли даем ложь
            return false;
        else{ // Если такой элемент есть
            for(int k = j; k < nElems; k++) // Перемещение следующих элементов на шаг назад
                a[k] = a[k+1]; // То есть затирается элемент
            nElems--;
            return true;
        }
    }
    public void display(){
        for(int j = 0; j < nElems; ++j)
            System.out.print(a[j] + " ");
        System.out.println();
    }
}
