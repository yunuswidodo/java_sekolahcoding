package com.company.dsr_bgt.InerClass;


// inerclas atau class dibagian dalam

class luar{

    private int x = 10;

    class  dalam{
        // bisa akses walaupun data bersifat private

        void tebak(){
            System.out.println("tebak " + x);;
        }



    }

    //extra
    void tampilkan(){
        dalam d = new dalam();
        d.tebak();
    }
}



public class testInerClass {
    public static void main(String[] args) {
        //dalam d = new  dalam(); ini eror karena tidak bisa menggunakan object kelas dalam
        luar l = new luar();
        // l.tebak() -> error harus buat extra
        l.tampilkan();


    }
}
