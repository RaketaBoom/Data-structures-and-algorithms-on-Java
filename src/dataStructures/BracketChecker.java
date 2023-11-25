package dataStructures;

public class BracketChecker { //Чекер скобок
    private String input;
    //-----------------
    public BracketChecker(String in){
        input = in;
    }

    public void check(){
        int stackSize = input.length();

        StackX<Character> theStack = new StackX<Character>(stackSize);
        for(int j = 0; j < stackSize; j++){
            Character ch = input.charAt(j);
            switch(ch){
                case '{':
                case'[':
                case'(':
                    theStack.push(ch);
                    break;
                case '}':
                case']':
                case')':
                    if( !theStack.isEmpty()){
                        Character chx = theStack.pop();
                        if( (ch == '}' && chx!='{') ||
                                (ch == ']' && chx!='[') ||
                                (ch == ')' && chx!='(') )
                            System.out.println("Error: " + ch + " at " + j);
                    }
                    else // преждевременная нехватка элементов
                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default: // для остальных элементов не выполняется проверка
                    break;
            }
        }
        if (!theStack.isEmpty())
            System.out.println("Error: missing right delimiter");
    }
}
