package com.company.dsr_bgt;

final  class binatangfinal{

    //final
    // jika digunakan divariabel maka varieabel tersebut tidak bisa diubah lagi dan harus mempunya nilai default
    // jika digunakan dimethod maka tidak bisa diubah dan tidak bisa digunakan ditempat lain (kelas anaknya) jika mempunya nilai nama yang sama
    // jika diguanakan didalam kelas maka kelas tidak bisa diturunkan
    final  int umur = 20;

    final  int getUmur(){
        //umur = 20; error karena value tidak bisa diganti tetapi bisa dipanggil seperti biasanya
        return umur;
    }


}


//public class Herbivora_MetFinal extends binatangfinal {
//
//    public static void main(String[] args) {
//
//    }
//}
