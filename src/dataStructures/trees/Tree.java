package dataStructures.trees;

public class Tree {
    private Node root;

    public Node find(int key){
        Node current = root;

        while(current.iData != key){
            if (key < current.iData){ // Не может быть, чтобы с самого начала был пустой узел
                current = current.leftChild;
            }
            else {
                current = current.rightChild;
            }
            if (current == null) // Если переход в null, то значит нет такого элемента
                return null;
        }
        return current;
    }

    public void insert (int id, double dd){
        // Вставка данных в созданный узел
        Node newNode = new Node(id, dd);
        if (root == null)
            root = newNode;
        else {
            Node current = root;

            while(true){
                Node parrent = current;
                if (id < current.iData){
                    current = current.leftChild;
                    if(current == null){
                        parrent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    current = current.rightChild;
                    if(current == null){
                        parrent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    private void inOrder(Node localRoot){
        if(localRoot != null){
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.iData);
            inOrder(localRoot.rightChild);
        }
    }

    public Node minimum(){
        Node current, last;
        last = root;
        current = root;
        while(current != null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node maximum(){
        Node current, last;
        last = root;
        current = root;
        while(current != null){
            last = current;
            current = current.rightChild;
        }
        return last;
    }


    public boolean delete(int key){ // Удаление по ключу, предполагается, что дерево не пусто
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true; // Глубокого смысла в нем нет, просто мы удаляем через родителя, нам нужно точно знать кого

        while(current.iData != key){ // Поиск узла по ключу
            parent = current;
            if (current.iData < key){
                current = current.leftChild;
                isLeftChild = true;
            }
            else{
                current = current.rightChild;
                isLeftChild = false;
            }
            if (current == null)
                return false; // Нет такого узла
        }

        // Нашли узел, но пока рано открывать шампанское

        //Первый случай. Листовой
        if (current.rightChild == null && current.leftChild == null){ // Узел листовой
            if (current == root) // Если узел корневой
                root = null;
            else if(isLeftChild){
                parent.leftChild = null;
            }
            else{
                parent.rightChild = null;
            }
        }

        //Второй случай. Один потомок
        // Нет правого потомка
        else if(current.rightChild == null){
            if (current == root)
                root = current.leftChild;
            else if(isLeftChild){
                parent.leftChild = current.leftChild;
            }
            else{
                parent.rightChild = current.leftChild;
            }
        }
        // Нет левого потомка
        else if(current.leftChild == null){
            if(current == root)
                root = current.rightChild;
            else if(isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        }


        // Третий случай
    }
}
