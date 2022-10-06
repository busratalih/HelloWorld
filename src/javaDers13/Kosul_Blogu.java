package javaDers13;

public class Kosul_Blogu {
    public static void main(String[] args) {

       int sayi=95;
       if (sayi>=50) {
           System.out.println("Sayi 50'den buyuk ");
       }


       if (sayi<50) {
           System.out.println("Sayi 50'den kucuk");
       }


       String diller="arapca, ingilizce,fransizca, ispanyolca";
       if (diller.contains("turkce")) {
           System.out.println("turkce biliyorsunuz");
       }
        if (diller.contains("ingilizce")) {
            System.out.println("ingilizce biliyorsunuz");
        }

        String cinsiyet="Erkek";
        int yas=25;
        if (yas>=20 && cinsiyet.equals("Erkek")) {
            System.out.println("Askere gidebilirsiniz");
        }








    }
}
