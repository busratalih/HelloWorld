package javaDers20;

public class forEachLoop {
    public static void main(String[] args) {

       String [] isimler= {"Ali", "Veli" ,"Ahmet"};

        for (int i = 0; i <isimler.length ; i++) {
            System.out.println(isimler[i]);
        }

        for (String data : isimler){
            System.out.println(data);
        }







    }
}
