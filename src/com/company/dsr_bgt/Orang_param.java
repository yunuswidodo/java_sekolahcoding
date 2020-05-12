package com.company.dsr_bgt;

public class Orang_param {

    public static void main(String[] args) {

        Orang_param udin = new Orang_param();
        // pemanggilan dengan metod
        udin.berjalan("prok prok", 20);
    }

    //method param
    //juka munulis parameter type data -> nama variabel
    void berjalan(String suara, int angka){
        System.out.println("berjalan " +  suara + " " + angka);
    }
}
