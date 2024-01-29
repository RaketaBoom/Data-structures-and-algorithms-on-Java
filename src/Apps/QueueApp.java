package Apps;

import dataStructures.Queue;

public class QueueApp {
    public static void main(String[] args){
        Queue<Integer> theQueue = new Queue<Integer>(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);


        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while( !theQueue.isEmpty()){
            Integer n = theQueue.remove();
            System.out.print(n + " ");
        }


    }
}
