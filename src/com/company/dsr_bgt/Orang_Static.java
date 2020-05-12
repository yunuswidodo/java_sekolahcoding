package com.company.dsr_bgt;

public class Orang_Static {

    //static = sifat yang bisa diberikan kepada suatu metode atau data yang gunanya tidak perlu membuat object terlebih dahulu  sebelum memanggil data atau metode
    // ext object = orang test = new orang

    static int tinggi;
    String warna;
    public static void main(String[] args) {
        tinggi = 200;
        System.out.println(get_tinggi());
       // System.out.println(printwarna());

    }

    //static hanya bisa memanggil metode static
    //static hanya bisa memanggil data data yang bersifat static
    // metode static tidak bisa memanggil metode this

    static int get_tinggi(){
       // prinWarna() erro karena metode tidak bersifat static
        return tinggi;
    }

    // biar bisa dioanggil metod void
    void printWarna(){
        System.out.println(warna);
    }
}

