package com.isa;

public class Main {
    public static void main (String[] args) {

        //unary = operasi yang digunakan pada satu variable
        int angka = 1;
        System.out.printf("unary '-' , =  %d menjadi %d\n", angka, -angka);
        System.out.printf("unary '+' , =  %d menjadi %d\n", angka, +angka);

        // unary decrement dan increment
        int angka2 = 10;
        
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);


        //prefix = sebelum 'nilai' == ditambah > ditampilkan
        int b = 8;

        System.out.printf("prefix '++b' , = %d \n", ++b);

        // postfix = sesudah 'nilai' == ditampilkan > setelah ditampilkan lagi > ditambah
        int a = 8;
        System.out.printf("postfix 'a++' , = %d \n", a++);
        System.out.printf("hasil postfix 'a++' , = %d \n", a);

        // unary boolean dengan '!' untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);

        

    }
}









