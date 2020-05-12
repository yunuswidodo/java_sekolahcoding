package com.company.dsr_bgt;



class binatang {
    //data - super
//    int umur =  12;

    int umur ;   // umur construc



    // metod - super
    int get_umur_super(){
        return umur;
    }

    // constructor - super
    public binatang(int umurCunstructor){
        this.umur =umurCunstructor;
    }
}

public class Herbivora_OveridingdanSuper extends binatang{
    // overriding adalah jika mempunyai data/metode yang mempunyai nama yang sama dengan kelas induk maka akan menjalankan data/metode yang ada dalam kelasnya sendiri terlebih dahulu, jika namanya tidak ada maka akan mencari kekelas induk
    // super adallah jika ingin mengambil data yang ada dikelas utama

 //   int umur = 20;   //ex data overide jika  muncul ini menggunakan overiding karena menjalankan apa yang ada didalam kelasnya tersendiri dahulu jika tidak ada maka

//    int get_umur(){ // ex metode overide || jika yang muncul ini
//        return 25;
//    }


//    int get_umur(){
//        return super.umur;  // ex memangambil data dari indux dikasih super untuk mengambil kelas utama/indux
//    }



    // -------- penggunaan super dapa cunstructor ------------------

    int tayo;
    public Herbivora_OveridingdanSuper(int umurConstructorc){
        super(20);
        this.tayo = umurConstructorc;
    }





    //ex memangambil metod dari indux dikasih super untuk mengambil kelas utama/indux ||  ngggunakan metod luar unutuk mengambil metod yang ada dikelas indux
    // --------------------------- metod luar untuk mengambil metod di kelas utama------------------------
    void  test(){
        System.out.println(super.get_umur_super());
    }
    //--------------------------------------------------------------------------------------



    //note metod static tidak dapat dimasuki metod this dan supper . static hanya untuk static
    public static void main(String[] args) {
        //Herbivora_OveridingdanSuper h = new Herbivora_OveridingdanSuper(); // object biasa
        Herbivora_OveridingdanSuper h = new Herbivora_OveridingdanSuper(23);  // untuk print construktor abaikan 12
       // System.out.println(h.umur);  // memanggil data overide
        //System.out.println(h.get_umur());  // memanggil metode overide

//        System.out.println(h.get_umur());  // memanggil data super dari kelas induk(super)
        h.test();   // menggil metod yang ada dikelas induk(super)

    //    h.test();

    }



}

