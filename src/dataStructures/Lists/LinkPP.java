package dataStructures.Lists;

class LinkPP<T> {
    T data;
    LinkPP<T> next;
    //-------------------------------------
    LinkPP(T d){
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