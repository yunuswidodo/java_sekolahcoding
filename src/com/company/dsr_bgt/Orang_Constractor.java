package com.company.dsr_bgt;

public class Orang_Constractor {

    int tinggi ;
    String warna;

    //construktor adalah fungsi yang pertama kali dijalankan ketika membuat object dari sutau kelas
    //nama constraktor harus sama dengan kelas // constructor bisa diisi parameter ataupun dibiarkan kosong

// name variable berbeda tidak menggunakan this
//    public Orang_Constractor(int tinggi_baru){
//        tinggi = tinggi_baru;
//    }

    // this. adalah kata kunci yang mengacu pada object atau kelas utamanya. jika name varibel beda tidak harus menggunakan this
    public Orang_Constractor(int tinggi, String warna){
        this.tinggi = tinggi;  //tinggi yang pertama adalah punya kelas/ tinggi yang kedua adalah parameter
        this.warna = warna;

    }
    public static void main(String[] args) {

        //constructor otomatis dibuat ketika membuat object
        Orang_Constractor test = new Orang_Constractor(150, "putihh");
        Orang_Constractor test2 = new Orang_Constractor(200, "hitam");

        System.out.println(test.tinggi + test.warna);
        System.out.println(test2.tinggi + test2.warna) ;
    }
}
