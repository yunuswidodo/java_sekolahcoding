package com.company.dsr_bgt.CollectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LatihanLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String > nama = new LinkedHashSet<>();

        nama.add("hilman");
        nama.add("edi");
        nama.add("tiqa");

        Iterator<String> iterator = nama.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    // hashSet -> tidak mengurutkan yang dimasukin
    //linkedhashset -> mengurutkan yang dimasukin
}
