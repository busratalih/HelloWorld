package javaDers19;

public class multiDimensionalArrays {
    public static void main(String[] args) {


        int [][] sayilar1=new int [2][3]; //2 boyutlu
        int [][][] sayilar2=new int [2][3][2]; // 3 boyutlu

        sayilar1 [0][0]=5;
        sayilar1 [0][1]=7;
        sayilar1 [0][2]=4;

        sayilar1 [1][0]=10;
        sayilar1 [1][1]=20;
        sayilar1 [1][2]=30;

        System.out.println(sayilar1[0][0]);
        System.out.println(sayilar1[1][1]);
        System.out.println(sayilar1[1][2]);


        int [][] notlar= new int [3][5]; // 3 sınıf her sınıfta 5 öğrenci
        // ilk sınıfın notları
        notlar [0][0]=50;
        notlar [0][1]=60;
        notlar [0][2]=70;
        notlar [0][3]=80;
        notlar [0][4]=90;

        //2. sınıfın notları

        notlar [1][0]=50;
        notlar [1][1]=60;
        notlar [1][2]=70;
        notlar [1][3]=80;
        notlar [1][4]=90;

        // 3. sınıfın notları

        notlar [2][0]=50;
        notlar [2][1]=60;
        notlar [2][2]=70;
        notlar [2][3]=80;
        notlar [2][4]=90;


    }
}
