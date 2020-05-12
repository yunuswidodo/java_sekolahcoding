package com.company.dsr_bgt.Polimorfism;


// review polimorfism == overiding  bisa membuat metode  dengan nama yang sama pada subclas atau pada kelas yang diwariskan / jadi nama metodenya sama tetapi bisa melakukna hal yanglain

class hewan {
    // metode
    void suara(){
        System.out.println("suara hewan biasa");
    }
}


class kucing  extends  hewan{
    // metode sama tapi malakukan hal berbeda
    void suara(){
        System.out.println(" meong miaw");
    }
}


class anjing extends hewan{
    // metode sama tapi malakukan hal berbeda
    void suara(){
        System.out.println("guk guk ");
    }
}


public class demo {
    public static void main(String[] args) {
        // object
        hewan h = new hewan();
        h.suara();

        hewan k = new kucing();
        k.suara();

        hewan a = new anjing();
        a.suara();


    }
}
