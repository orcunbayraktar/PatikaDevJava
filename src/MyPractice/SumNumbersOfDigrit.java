package MyPractice;

import java.util.Scanner;

public class SumNumbersOfDigrit {
    public static void main(String[] args) {
        int number,numberOfDigrit=0,totalNumbersOfDigrit=0,saveNumber;

        Scanner inp=new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = inp.nextInt();

        saveNumber=number;

        while(number!=0){
            totalNumbersOfDigrit += (number % 10);
            number/=10;

        }
        System.out.print("Basamak sayılarının toplamı : " + totalNumbersOfDigrit);
    }
}
