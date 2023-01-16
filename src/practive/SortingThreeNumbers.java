package practive;

import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        int num1,num2,num3;

        Scanner scn=new Scanner(System.in);
        System.out.print("Kucukden Buyuge sıralanması istedginiz 1.sayiyi gir : ");
        num1=scn.nextInt();
        System.out.print("Kucukden Buyuge sıralanması istedginiz 2.sayiyi gir : ");
        num2=scn.nextInt();
        System.out.print("Kucukden Buyuge sıralanması istedginiz 3.sayiyi gir : ");
        num3=scn.nextInt();

        if (num1<num2 && num1<num3) {
            if (num2 < num3)
                System.out.println("Sıralama sayi1 < sayi2 < sayi3");
            else
                System.out.println("Sıralama sayi1 < sayi3 < sayi2");
        } else if (num2<num1 && num2<num3) {
            if (num1 < num3)
                System.out.println("Sıralama sayi2 < sayi1 < sayi3");
            else
                System.out.println("Sıralama sayi2 < sayi3 < sayi1");
        }else if (num3<num1 && num3<num2) {
            if (num1 < num2)
                System.out.println("Sıralama sayi3 < sayi1 < sayi2");
            else
                System.out.println("Sıralama sayi3 < sayi2 < sayi1");
        }
    }
}
