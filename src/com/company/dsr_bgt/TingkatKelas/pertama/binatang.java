package com.company.dsr_bgt.TingkatKelas.pertama;

//default -> hnaya bisa diakses dalam 1 package
//ini adalah kelas default (tanpa tulisan public)
class binatang {

    //tingkat class akses kelas: default || public
    //tingkat class akses menentukan apakah kelas bisa diimport atau tidak

    //tinggkat akses class member data || metode
    //tingkat akses class dalam memeber mempunyai pilihan : default || public || protected || private

    // public
    // bisa diakses dalam 1 package dan package lain jika dimport.  ex =  com.company.dsr_bgt.TingkatKelas.pertama.binatang_public; // berada kelas tujuan

    //protected
    //protected bisa digunakan jika berada dalam satu package dan tidak bisa diguanakan lain package || bisa diakses (lain package) jika asal turunananya
    // 2 kasus protected, 1 = jika berada dalam satu package langsung bisa panggil kelas asli ex = kelasAsli b = new klasAsli
                //        2 = jika berada dipackage lain maka dengan cara mewariskan kelas asli ex = kelasturunan  b  = new kelasturunan

    //private
    // hanya bisa diakses dalam 1 kelas, kasih kata kunci private didepan data type: ex private int ringgi =10

    //data
    //int tinggi = 12;

    protected int tinggi = 20;
    //metode
    int getTingi(){
        return tinggi;
    }
}
