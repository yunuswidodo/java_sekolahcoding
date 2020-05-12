package com.company.dsr_bgt.CollectionStackAndDequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class LatihanDequeu {
    // metode deque hampir sama dengan stack -- LIFO
    //kelas ini lebih cepat daripada Stack ketika digunakan sbagai stack , dan lebih cepat dibandingkan linkedlist ketika digunakan queue

    public static void main(String[] args) {
        ArrayDeque<String> nama = new ArrayDeque<String>();

        nama.add("hilaman");
        nama.add("endy");
        nama.add("Koko");
        nama.add("tiqa");

        // coba motode pop
        nama.pollFirst();
        //nama.pollLast();

        Iterator itr = nama.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }



}
