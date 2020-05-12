package com.company.dsr_bgt;

public class Orang_met_void {
    int tinggi = 150;
    String warna = "putih";

    public static void main(String[] args) {

        //namakelasAsal namabaru =  new namakelas asal()
        Orang_met_void udin = new Orang_met_void();
        //cara memanggil
        udin.berjalan();
    }

    //method void
    void berjalan(){
        System.out.println("berjalan prok prok");
    }

}
