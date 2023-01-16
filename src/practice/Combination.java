package practice;

import java.util.Scanner;
/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
C(n,r) = n! / (r! * (n-r)!)
 */
public class Combination {
    public static void main(String[] args) {
        int n, r, sum = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Elemean sayisini gir : ");
        n = input.nextInt();

        System.out.print("Kaç farklı elamanlı gruplar olsun : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        int nFac = sum;

        sum = 1;
        for (int i = 1; i <= r; i++) {
            sum *= i;
        }
        int rFac = sum;

        sum = 1;
        for (int i = 1; i <= n - r; i++) {
            sum *= i;
        }
        int n_rFac = sum;

        int combination = nFac / (rFac * n_rFac);
        System.out.print("Kombinasyonu : " + combination);

    }
}
