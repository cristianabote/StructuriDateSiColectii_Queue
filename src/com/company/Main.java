package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// Definirea instantei unei cozi cu proprietati de lista
        Queue<Integer> q=new LinkedList<Integer>();

        //Adaugarea numerelor { 0,1,2,3,4} in coada
        for(int i=0; i<5;i++){
            q.add(i);
            System.out.println(((LinkedList<Integer>) q).get(i));
        }

        //Afiseaza elementele din coada
        System.out.println("Elementele cozii: "+q);

        //Stergerea primului element din coada
        int elementSters=q.remove();
        System.out.println("Elementul eliminat este "+elementSters);
        System.out.println(q);

        //Selectarea primului element din coada care urmeaza sa fie procesat
        int head=q.peek();
        System.out.println("Elementul care urmeaza sa fie procesat este "+head);

        //Afisarea dimensiunii cozii
        int size=q.size();
        System.out.println("Dimensiunea cozii este "+size);

        Iterator iterator=q.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
