package homework;

import java.util.Scanner;

public class FibonacciLoop {
    public static void main(String[] args) {
        int number,fibTotal=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Kaç tane fibbonacci sayısı bulunsun : ");
        number=input.nextInt();

        int fib0=0,fib1=1;


        for (int i=1;i<=number;i++){
            if((i-1) == 0 || (i-1) == 1){
                System.out.print((i-1) + " ");
                continue;
            }

            fibTotal=fib0 + fib1;
            fib0=fib1;
            fib1=fibTotal;

            System.out.print(fibTotal + " ");
        }

    }
}

