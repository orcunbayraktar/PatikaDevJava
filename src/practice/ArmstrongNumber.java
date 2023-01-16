package practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number,numberOfDigrit=0,totalArmstrong=0,saveNumber;

        Scanner inp=new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = inp.nextInt();

        saveNumber=number;

        while(number!=0){
            number/=10;
            numberOfDigrit++;
        }

        for (int i = 0,tempNumber=saveNumber; i < numberOfDigrit; i++) {
            totalArmstrong += Math.pow(tempNumber % 10,numberOfDigrit);
            tempNumber/=10;
        }

        if (totalArmstrong == saveNumber){

        }else
            System.out.print(saveNumber + " sayısı armstrong sayı değildir");

    }
}
