package javaDers13;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

        int sayi=85;
        if (sayi>0) {
            System.out.println("sayi pozitif");
        }else {
            System.out.println("sayi negatif");
        }

        String gun="Cuma";
        if (gun.equals("Pazar")) {
            System.out.println("Pazar gunundesiniz");
        }else if (gun.equals("Cumartesi")) {
            System.out.println("Cumartesi gunundesiniz");
        }else {
            System.out.println("Hafta icindesiniz");
        }















    }
}
