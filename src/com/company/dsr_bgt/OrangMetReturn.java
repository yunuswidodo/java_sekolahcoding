package com.company.dsr_bgt;

public class OrangMetReturn {
    String warna = "putoh";
    public static void main(String[] args) {

        OrangMetReturn udin = new OrangMetReturn();
        //udin.test();
        String variable = udin.test();
        System.out.println(variable);
    }

    //metode teturn adalah metode untuk mengembalikan nilai
    // penulisan method return =  typedata /wajib sama data yang akan dikembalikan/ namafungsi(){ return terserah}

    String test(){
        //bisa langsug dikasih value
        warna = "hitam";
        return  warna;
    }
}
