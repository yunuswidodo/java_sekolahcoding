package com.company.dsr_bgt;

public class OrangMetSetandGet {

    int tinggi = 15;
    String warna = "putih";

    public static void main(String[] args) {

        //cunstructor
        OrangMetSetandGet udin = new OrangMetSetandGet();
        System.out.println(udin.warna);

        udin.setWarna("hitam");
        System.out.println(udin.warna);

        //getter
        String Warna_baru = udin.getWarna();
        System.out.println(Warna_baru);
    }

    //method setter dan getter
    // set adalah void digunakan untuk mensetting nilai atau mengubah nilai
    // get adalah return

    void setWarna(String warnaParam){
        warna = warnaParam;
    }

    String getWarna(){
        return warna;
    }
}
