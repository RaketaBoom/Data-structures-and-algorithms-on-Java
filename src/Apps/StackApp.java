package Apps;

import dataStructures.StackX;

public class StackApp {
    public static void main(String[] args){
        StackX<Character> theStack = new StackX<Character>(10);
        theStack.push('L');
        theStack.push('E');
        theStack.push('H');
        theStack.push('A');

        while (!theStack.isEmpty()){
            Character value = theStack.pop();
            System.out.print(value + " ");
        }
    }
}
