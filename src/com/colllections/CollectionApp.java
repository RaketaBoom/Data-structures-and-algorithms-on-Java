package com.colllections;

import java.util.*;




public class CollectionApp {
    public static void main(String[] args) {
        Collection<Integer> c = new LinkedList<>();
        c.add(3);
        c.add(6);
        c.add(2);
        c.add(4);
        c.add(1);
        c.add(9);



        Iterator<Integer> it = c.iterator();

        int ans = it.next();

        System.out.println(ans);


        it.remove();
        it.next();
        System.out.println(c);
    }
}
