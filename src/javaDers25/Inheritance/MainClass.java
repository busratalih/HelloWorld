package javaDers25.Inheritance;

public class MainClass {
    public static void main(String[] args) {

        Ogretmen nesne=new Ogretmen();
        System.out.println(nesne.brans);
        System.out.println(nesne.isim);
        System.out.println(nesne.bilgi);
        System.out.println(nesne.maas);
        nesne.deneme();

        Mudur nesne1=new Mudur();
        System.out.println(nesne1.bilgi);


    }
}
