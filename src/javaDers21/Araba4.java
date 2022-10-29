package javaDers21;

public class Araba4 {


    public Araba4() {
        this(200);
        System.out.println("default");
    }

    public Araba4(int hiz){
        this(180, "siyah");
        System.out.println("tekli");
    }

    public Araba4(int hiz, String renk){
        System.out.println("ikili");
    }



}
