package com.company.dsr_bgt.Encapsulation;

public class hewan {

    // Encapsulation adalah  hanya bisa digunakan klas lain tapi tidak bisa dirubah // ecapcapculation -> hanya bisa menggunakan data dan metod yang tersedia saja
    // untuk memebuat encapsulation data data harus bersifat private dan metode public

    private int tinggi;
    private  String warna;

    // method public || metod default kyaknya bisa hehe
     public int  get_tinggi(){
        return tinggi;
    }

    // metod untuk mengukur tinggi
    public void set_tingg(int tinggi){
        this.tinggi = tinggi;

    }
}
