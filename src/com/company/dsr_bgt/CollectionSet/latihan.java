package com.company.dsr_bgt.CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class latihan {
    // perbedaan interface list dan set || list jika ada data yang sama maka akan dikeluarkan semuanya || set jika menemukan data yang kembar maka akan menghapus salah satu datanya

    //set : HashSet, LinkedSed, TreeSet

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("hilman");
        hashSet.add("andi");
        hashSet.add("tika");

        // print with metode iterator
        Iterator <String> itr = hashSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
// note : hasilnya tidak urut karenan hahsettidak menggunakan norder. untuk lebih lengkap baca dioracles java doc

}
