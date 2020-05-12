package com.company.dsr_bgt.CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class latihan {


    public static void main(String[] args) {


    // colection mirip dengan array
    // bedanya colection dengna array ->1. collection seperti framework dari luar  yang diimport
    //                                  2. kalao array harus menentukan jumlah kotaknya ditentuin dari awal dan tidak flexsibel
    //                                  3. colection bebas mau ditambah atau dikurangi
    //                                  4. class colection bisa gabungin beda tipe data
    //                                  5.  colection tidak bisa dimasuki data primitif harus object
    //                                      // ext primitf = int = 10 | ext object Integer new blabla

    // colection  ada banyak bgt, mengasih klue 2
    // 1. interface -> set, list, que
    // 2. kelas -> vector, linkedlist, hash, arraylist


    //membuat array list
    //ArrayList al = new ArrayList(); // non-generic -> dimana tidak menyebutkan nama/type datanya  secara sepesifik
    ArrayList<String>  al2 = new ArrayList<String>(); // generic-> menyebutkan tipe data nya secara spesific

        // metode biasa
//    al2.add("hilman");
//    al2.add("endi");
//    al2.add("coba tambah");
//    al2.add("coba tambah");
//    //bisa ditambah lagi lo

        //  metode arraylist
       // al2.addAll(Arrays.asList("hilman", "endi", "coba tambah", "coba tambah"));

        //  metode arraylist 2
        String[] nama = new String[]{"hilman", "endi", "coba tambah", "coba tambah"};
        al2.addAll(Arrays.asList(nama));

        // metode menghapus data
        al2.remove("hilman");
        // hapus semua data
        //al2.removeAll(al2);









    // cara mengeluarkan arraylist ke 1
//        for (String nama: al2){
//            System.out.println(nama);
//        }


        // cara mengeluarkan arraylist ke 2 pakai iterator
        Iterator it = al2.iterator();
        // hasNext berfungsi jika masih ada data maka fungsi akan tetap jalan
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
