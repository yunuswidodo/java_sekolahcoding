package com.company.dsr_bgt.Herbivora_InheritencePerwarisan;

//dikasi public error hehe
class Binatang {
    //inhertance adalah konsep dimana bisa mewarisakan suatu kelas pada kelas baru // kelas baru bisa mengakses metode mrtode dan data data dari kelas utama

    int umur;
    String warna;

    int get_umur(){
        return umur;
    }
}
class Herbivora_InheritencePerwarisan extends Binatang{

    public static void main(String[] args) {
        Herbivora_InheritencePerwarisan h = new Herbivora_InheritencePerwarisan();
     //   h.umur= 20;
        //System.out.println(h.umur);

        h.setUmur(20);
        System.out.println(h.get_umur());

    }

    void setUmur(int umur){
        this.umur = umur;
    }
}
