package com.company.dsr_bgt.CollectionStackAndDequeue;

import java.util.Iterator;
import java.util.Stack;

public class LatihanStack {

    //stack -LIFO- && Deque || LIFO adalah last in first out
    // metoda yang digunakan POP yang dikeluari yang paling akhir
    //cocument : https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html

    public static void main(String[] args) {
        Stack<String> nama = new Stack<String>();

        nama.push("hilman");
        nama.push("endy");
        nama.push("koko");
        nama.push("tiqa");

        // metode pop mengahpus/ menghapus mulai dari belakang
        //nama.pop();

        // metode peek untuk mengintip
        nama.peek();

        Iterator<String> iterator = nama.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
