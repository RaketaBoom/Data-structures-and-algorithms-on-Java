package dataStructures;

public class StackX<T> {
    private final int masSize; // Размер массива
    private final Object[] stackArray;
    private int top;  // индекс вершины стека
    //-----------------------------------------

    public StackX(int s){
        masSize = s;
        stackArray = new Object[masSize]; // Сам класс указывается
        top = -1;  // пока нет ни одного элемента
    }


    public void push(T j){ // Размещение элемента на вершине
        stackArray[++top] = j;
    }

    public T pop(){ // Извлечение вершины
        @SuppressWarnings("unchecked") // Чтобы чек не горел
        T t = (T)stackArray[top--];
        return t;
    }

    public T peek(){ // Только чтение
        @SuppressWarnings("unchecked") // Чтобы чек не горел
        T t = (T)stackArray[top];
        return t;
    }
    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == masSize-1);
    }

}
