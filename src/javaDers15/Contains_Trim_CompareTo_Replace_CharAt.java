package javaDers15;

public class Contains_Trim_CompareTo_Replace_CharAt {
    public static void main(String[] args) {

        String diller=" ingilizce, fransızca, ispanyolca, turkce ";
        System.out.println(diller.contains("ingilizce"));
        System.out.println(diller.contains("arapca"));
        System.out.println(diller.trim());
        System.out.println(diller.charAt(20));
        System.out.println(diller.replace("ispanyolca" , "arapca"));
        String bilgi= "Ben Java yı sevmiyorum";
        System.out.println(bilgi.replace("sevmiyorum", "seviyorum"));
        System.out.println(bilgi.replace(" ", ""));

        String isim1="Ahmet";
        String isim2="Mehmet";
        System.out.println(isim1.compareTo(isim2));














    }
}
