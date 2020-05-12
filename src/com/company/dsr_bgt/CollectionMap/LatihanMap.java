package com.company.dsr_bgt.CollectionMap;

import java.util.*;

public class LatihanMap {

    // Map mempunyai => key - value || penamaan key bebas bisa (text, string, nomor dll)
    // jenis jenis Map ; HashMap, LinkedHashMap, TreeMap
    //hashmap => acak, LinkesHashMap => berurutan sesuai dengan inputan, TreeMap => mengurutkan dengan melihat key
    // doc : https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html

    // latihan hasMap
    public static void main(String[] args) {
       // HashMap<Integer, String> nama = new HashMap<Integer, String>();     // <key, value> || yang diawal bisa pakai map aja
        LinkedHashMap<Integer, String> nama = new LinkedHashMap<Integer, String>();
      //  TreeMap<Integer, String> nama= new TreeMap<Integer, String>();

        nama.put(4, "coba");
        nama.put(1, "hilaman");
        nama.put(9, "coba");
        nama.put(5, "coba");
        nama.put(2, "Endy");
        nama.put(3, "Tiqa");


        //tipedata namabaru : namaMap.entrySet()

        for (HashMap.Entry namaBaru: nama.entrySet()){
            System.out.println("kunci " + namaBaru.getKey() + " nilai: " + namaBaru.getValue());
        }

    }
}
