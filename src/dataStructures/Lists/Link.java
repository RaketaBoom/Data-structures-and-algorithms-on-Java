package dataStructures.Lists;

class  Link <T> {
    T data;
    Link<T> next;
    //-------------------------------------
    Link(T d){
        data = d;
    }
    //-------------------------------------
    void displayLink(){
        System.out.print("{" + data + "} ");
    }
}
/*
* В данном случае я решил дать полям package-private доступ,
* Чтобы LinkList мог манипулировать данными свободно
* */