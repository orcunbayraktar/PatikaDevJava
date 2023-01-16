package practice;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        int number;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fibonaccisi hesaplanacak sayyı'yı giriniz : ");
        number = inp.nextInt();

        System.out.print("Fibonnacci F("+number+") = " + fib(number));
    }
    static int fib(int n){
        if(n == 0 ||n == 1)
            return n;

        return fib(n-1) + fib(n-2);
    }
}
