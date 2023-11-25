package dataStructures;

public class Queue <T>{
    private final int maxSize;
    private Object[] queArray;
    private int front; // Перед
    private int rear; // Зад
    //--------------------------------
    public Queue(int s){
        maxSize = s + 1; // Создается массив на одну ячейку больше
        queArray = new Object [maxSize]; //
        front = 0;
        rear = -1; // Genios!

    }

    public void insert(T j){
        if (rear == maxSize - 1)
            rear = -1;// Genios!
        queArray[++rear] = j;
    }

    @SuppressWarnings("unchecked")
    public T remove(){
        T temp = (T)queArray[front++];
        if (front == maxSize)
            front = 0;
        return temp;
    }

    @SuppressWarnings("unchecked")
    public T peek(){
        return (T)queArray[front];
    }

    public boolean isEmpty(){
        return (rear + 1 == front) || (front + maxSize - 1 == rear);
    }
    public boolean isFull(){
        return (rear + 2 == front) || (front + maxSize - 2 == rear);
    }

    public int size(){
        if(front <= rear)
            return rear - front + 1;
        else
            return (maxSize - front) + (rear+1);
    }
}

