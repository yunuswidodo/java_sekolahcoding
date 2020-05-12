package com.company.dsr_bgt.Abstract;

// ex klas abstract
public abstract class makluk_abstract {
    // metod biasa
    void makan(){
        System.out.println("makan");
    }

    // metod abstract -> tidak perlu implementasi -> langsung titik koma
    abstract void tidur();
}
