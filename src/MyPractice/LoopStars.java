package MyPractice;

import java.util.Scanner;

public class LoopStars {
    public static void main(String[] args) {
        int n;
        Scanner inp= new Scanner(System.in);

        System.out.println("n sayısını giriniz : ");
        n=inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n - i; j++) {
                System.out.print(" ");
            }
            //

            for (int j = 1; j <= (2*i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
/*

 *                  5 satır n satır belirtecek yani 1 döngü prinln
 ***                 satır içne yazılacak olan printle 2. döngüde
 *****
 *******
 *********


 */
