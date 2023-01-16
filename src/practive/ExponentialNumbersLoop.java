package practive;

import java.util.Scanner;

public class ExponentialNumbersLoop {
    public static void main(String[] args) {
        int a,p,sum=1;

        Scanner input=new Scanner(System.in);

        System.out.print("Üslü olacak sayiyi : ");
        a=input.nextInt();

        System.out.print("Üs kaç olsun : ");
        p=input.nextInt();

        for (int i=0;i<p;i++){
            sum*=a;
        }
        System.out.println("Result : " + sum);
    }
}
