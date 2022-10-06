package javaDers8;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        System.out.println("lütfen yasinizi giriniz");
        String isim=input.next();
        System.out.println("İsminiz : " + isim);
        int yas=input.nextInt();
        System.out.println("yas = " + yas);
        System.out.println("Girilen isim :" + isim + "\nGirilen yas :" + yas);



        











    }
}
