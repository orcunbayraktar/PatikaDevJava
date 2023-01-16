package practive;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int number;
        double sum=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Harmoniği  hesaplanacak sayıyı giriniz : ");
        number=input.nextInt();

        for(int i=1;i<=number;i++){
            sum+=(1.0/i);
        }
        System.out.printf("Result : %.2f" , sum);
    }
}
