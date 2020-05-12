package com.company.dsr_bgt.Abstract;

// kelas abstract adalah kelas yang mengandung satu metode abstract atau lebih
// kelas abstract digunakan unutk membuat atau mendeklarasikan beberapa metode tanpa ada implementasinya langsung

public class hewan extends  makluk_abstract {
    public static void main(String[] args) {
    //    makluk_abstract m = new makluk_abstract() -> tidak bisa diinisialisasi langsung // kelas abstrak akan berguna jika melakukan penurunan sutau class

        makluk_abstract m = new hewan();
        m.tidur();
    }
    // dari kelas makluk // implemettasi dari kelas abctrak
    void tidur(){
// tempat implemetasi
        System.out.println("asusus");
        System.out.println("coaba");
    }

}
