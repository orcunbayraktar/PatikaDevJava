package homework;

import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {
        int primeNumber;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz : ");
            primeNumber = inp.nextInt();

            if (recursivePrimeNumber(primeNumber))
                System.out.println(primeNumber +" asal sayıdır.");
            else
                System.out.println(primeNumber +" asal sayı değildir.");
        }while (primeNumber<2);

    }
    static boolean recursivePrimeNumber(int number,int startDivision){
        if(number<=2)
            return (number==2) ? true : false ;
        if(number % startDivision== 0)
            return false;
        if (startDivision * startDivision > number)
            return true;
        return recursivePrimeNumber(number,startDivision+1);
    }
    static boolean recursivePrimeNumber(int number){
        return recursivePrimeNumber(number,2);
    }


}

