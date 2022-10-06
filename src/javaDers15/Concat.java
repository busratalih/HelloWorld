package javaDers15;

public class Concat {
    public static void main(String[] args) {

      // String isim="Kerem";
      // String soyIsim="Kartal";
      // System.out.println(isim);
      // System.out.println(soyIsim);

      // String adSoyad= isim + " " + soyIsim;
      // System.out.println(adSoyad);
      // System.out.println(adSoyad.length());

      // String bilgi="Benim ismim " + isim + " ve soy ismim " +  soyIsim;
      // System.out.println(bilgi);
      // System.out.println(bilgi.length());


      // String soyIsimBilgi ="Soy isim = " + soyIsim;
      // System.out.println(soyIsimBilgi);

        String isim= "Kerem";
        String  soyIsim="Kartal";
        String adSoyad= isim.concat(soyIsim);
        System.out.println(adSoyad);

        String isim2="Ayse";
        String soyIsim2="Yılmaz";
        String bosluk=" ";

        String adSoyad2= isim2.concat(bosluk).concat(soyIsim2);
        System.out.println(adSoyad2);










    }
}
