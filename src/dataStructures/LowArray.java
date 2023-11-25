package dataStructures;
// Класс массива с низкоуровневневым интерфейсом
public class LowArray {
    private long[] a; // Ссылка на массив

    public LowArray(int size){
        a = new long[size];
    }

    public void setElem(int index, long value){
        a[index] = value;
    }
    public long getElem(int index){
        return a[index];
    }
}
