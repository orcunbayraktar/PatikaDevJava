package practive;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int number1,number2,eBoB=0,eKoK,minNumber;

        Scanner input=new Scanner(System.in);

        System.out.print("1.Sayi : ");
        number1=input.nextInt();
        System.out.print("2.Sayi : ");
        number2=input.nextInt();

        if(number1>number2)
            minNumber=number2;
        else
            minNumber=number1;


        int i=1;

        while (i<=minNumber){
            if (number1 % i == 0 && number2 % i == 0){
                eBoB=i;
            }
            i++;
        }

        eKoK= ( number1 * number2 ) / eBoB ;

        System.out.println("Result EBOB  :  " + eBoB);
        System.out.println("Result EKOK  :  " + eKoK);

    }
}
