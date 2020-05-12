package com.company.dsr_bgt.CollectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class LatihanQueue {
    // queue == FIFO (first in first out) adalah apa yang dimasukin pertama maka akan keluar pertama,  seperti antrian // mengurutkan abjat loh kalao angka  ya angka
    // queuq hanya bisa mengambil urutan yang pertama dimasukin(selanjutnya boleh asal sudah diambil yang pertama)
    // queue digunakan untuk program yang teratur yang tidak flexsibel yang prinsipnya kayak antrian (tika boleh input ditangah )
    // doc : https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html

    public static void main(String[] args) {
        PriorityQueue<String> nama = new PriorityQueue<String>();

        nama.add("widodo");
        nama.add("hilman");
        nama.add("koko");
        nama.add("coba");
        nama.add("tiqa");

//metod contain liaht didokumen
//        if (nama.contains("koko ")){
//            System.out.println("ada koko disini");
//        }

        //System.out.println("---------hasil dari peek-------------" + nama.peek()); // lihatlah hasilnya adalah hilman karena mengurutkan sesuai dengan abjat
        System.out.println("---hasil dari pool--" + nama.poll()); // yang sudah diambil tidak diprint

        Iterator <String> iterator = nama.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
