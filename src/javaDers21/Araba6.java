package javaDers21;

public class Araba6 {

    int arabaninHizi;
    String arabaninRengi;

    public Araba6(){
        this(150, "siyah");
        System.out.println("default");
    }

    public Araba6(int hiz){
        this();
        System.out.println("tekli");
    }

    public Araba6(int hiz, String renk){
        arabaninHizi=hiz;
        arabaninRengi=renk;
        System.out.println("ikili");
    }





}
