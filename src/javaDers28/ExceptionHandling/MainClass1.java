package javaDers28.ExceptionHandling;

public class MainClass1 {
    public static void main(String[] args) {

        int num1=50;
        int num2=0;

        try {
          if (num2==0){
             throw new ArithmeticException();
          }else {
              System.out.println("num1/num2");
          }
        }catch (ArithmeticException e){
            System.out.println("hata yakalandı" +e);

        }catch(Exception e){


        }


        System.out.println(".....");







    }
}
