package dataStructures.Arrays;
// Класс массива с низкоуровневневым интерфейсом
public class HighArray {
    protected long[] a;
    protected int nElems;
    //----------------------------------
    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; ++j)
            if (a[j] == searchKey)
                break;
        return j != searchKey; // Если j == searchKey, значит не найден элемент
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j;
        for(j = 0; j < nElems; ++j)
            if (a[j] == value)
                break;
        if (j == nElems)
            return false;
        else{
            for(; j < nElems - 1; ++j)
                a[j] = a[j+1];
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
