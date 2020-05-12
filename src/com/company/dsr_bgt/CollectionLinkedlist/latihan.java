package com.company.dsr_bgt.CollectionLinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class latihan {
    // list -> arraylist ->linkedlist
    //queuw ->prioriti queue
    //set ->hashset ->linkedHashset

    // perbedaan arraylist dan linkedlist || linkedlist untuk data insert and remove  || arraylist untuk search (algoritma mencari)

    public static void main(String[] args) {


    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("test");
    linkedList.add("test2");

    //mengganti isi dari linkedlist
        linkedList.set(1, "ganti");

        //Iterator <String> itr = linkedList.iterator();

//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        if (itr.hasNext()){
//            while (itr.hasNext()){
//                System.out.println(itr.next());
//            }
//        }else {
//            System.out.println("data kosong");
//        }

        //print bagian tertentu
        System.out.println(linkedList.get(0));
    }
}
