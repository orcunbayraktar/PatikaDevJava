package homework;

import java.util.Scanner;

public class BmiCalculation {
    public static void main(String[] args) {
        double height,weight;

        Scanner scnr = new Scanner(System.in);


        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        height = scnr.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : ");
        weight = scnr.nextDouble();

        double bmi =weight/(height*height);

        System.out.printf("Vucut kitle indeksiniz : %.1f" ,bmi);

    }
}