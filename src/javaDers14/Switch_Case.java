package javaDers14;

public class Switch_Case {
    public static void main(String[] args) {

      int gun=3;

       // if (gun==1) {
       //     System.out.println("Pazartesi");
       // }else if (gun==2) {
       //     System.out.println("Salı");
       // }else if (gun==3) {
       //     System.out.println("Carsamba");
       // }else if (gun==4) {
       //     System.out.println("Persembe");
       // }else if (gun==5) {
       //     System.out.println("Cuma");
       // }else if (gun==6) {
       //     System.out.println("Cumartesi");
       // }else if (gun==7) {
       //     System.out.println("Pazar");
       // }

        switch (gun) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("yanlis sayi girdiniz");
                break;
        }










    }
}
