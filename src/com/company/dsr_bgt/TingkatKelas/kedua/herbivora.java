package com.company.dsr_bgt.TingkatKelas.kedua;
//import dilain package class harus bersifat public
import  com.company.dsr_bgt.TingkatKelas.pertama.binatang_public;  // contoh import
//import  com.company.dsr_bgt.TingkatKelas.pertama.binatang; // tidak bisa diakses karena tidak klass bintang bersifat default


 class herbivora extends binatang_public {
    public static void main(String[] args) {
        binatang_public b = new binatang_public();
       // System.out.println(b.tinggi_public); // hal ini error karena tinggi masih bersifat default, jika ingin mengubahnya maka kasih 'public ' didepan data class asa;
        System.out.println(b.tinggi_public);
        //System.out.println(b.tinggi_protected); tidak bisa diakses karena bersifat protected
    }
}
