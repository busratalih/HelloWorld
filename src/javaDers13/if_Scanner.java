package javaDers13;

import java.util.Scanner;

public class if_Scanner {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
     //  int ortalama=input.nextInt();
     //  if (ortalama>=45) {
     //      System.out.println("Dersi geçtiniz");
     //  }
     //  if (ortalama<45) {
     //      System.out.println("Dersten kaldınız");
     //  }


        System.out.println("İslem seciniz");
        String secim= input.next();
        System.out.println("İlk sayiyi giriniz : ");
        int sayi1=input.nextInt();
        System.out.println("İkinci sayiyi giriniz : ");
        int sayi2= input.nextInt();
        System.out.println("sayi1+sayi2");
        if (secim.equals("+")) {
            System.out.println("Toplam :" + (sayi1+sayi2));
        }

        if (secim.equals("-")) {
            System.out.println("Fark :" + (sayi1-sayi2));
        }

        if (secim.equals("*")) {
            System.out.println("Carpim :" + (sayi1*sayi2));
        }

        if (secim.equals("/")) {
            System.out.println("Bolum :" + (sayi1/sayi2));
        }



    }
}
