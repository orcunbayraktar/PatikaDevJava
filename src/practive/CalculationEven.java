package practive;

import java.util.Scanner;

public class CalculationEven {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int sum=0;
        int i=0;

        do {
            System.out.print("Sayı girin : ");
            i = scn.nextInt() ;
            if (i % 4 ==0)
                sum+=i;

        }while(i % 2 == 0);

        System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıları toplamı : "+ sum);
    }
}
