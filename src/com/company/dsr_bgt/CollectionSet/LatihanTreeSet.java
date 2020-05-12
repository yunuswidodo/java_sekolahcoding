package com.company.dsr_bgt.CollectionSet;

import java.util.Iterator;
import java.util.TreeSet;

public class LatihanTreeSet {
    // treeset agak lama dari teman"nya karena akan mengurutkan dari alfabet jika variabel string dan mengurutkan angka jika menggunakan wariable int

    public static void main(String[] args) {

        TreeSet<String> nama = new TreeSet<String>();

        nama.add("hilaman");
        nama.add("edi");
        nama.add("tiqa");
        nama.add("tiqa"); // akan kebaca 1 . khusus interface set akan hanya mencari data yang unix(data yang tidak sama) jika ada data yang sama akan akan terbaca satu saja
        Iterator itr = nama.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
