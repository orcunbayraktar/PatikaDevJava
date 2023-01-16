package practive;

import java.util.Scanner;
//basamak sayılı yapımı
public class PalindromeNumbers {
    public static void main(String[] args) {
        int palidromeNumber;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        palidromeNumber = inp.nextInt();

        boolean isPalidromeNumber=isPalidromeNumber(palidromeNumber);

        if (isPalidromeNumber)
            System.out.println(palidromeNumber+ " palidrom sayıdır.");
        else
            System.out.println(palidromeNumber+ " palidrom sayı değildir.");

    }
    static boolean isPalidromeNumber(int number){
        int reverseNumber=reverseBumberMethod(number);

        if (reverseNumber == number)
            return true;

        return false;
    }
    static int reverseBumberMethod(int number){
        int numberOfDigrit=numberOfDigrit(number),reverseNumber=0,tempNumber,counter;

        counter=1;
        tempNumber=number;

        while(number!=0){
            tempNumber=number%10;
            reverseNumber += tempNumber * Math.pow(10,numberOfDigrit-counter);
            number/=10;
            counter++;
        }

        return reverseNumber;
    }
    static int numberOfDigrit(int number){
        int numberOfDigrit=0;

        while(number!=0){
            number/=10;
            numberOfDigrit++;
        }

        return numberOfDigrit;
    }


}
