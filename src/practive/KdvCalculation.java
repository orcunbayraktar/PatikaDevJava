package practive;

import java.util.Scanner;

public class KdvCalculation {
    public static void main(String[] args) {
        double productPrice,kdvRatio,productKdvPrice;

        Scanner scn = new Scanner(System.in);

        System.out.print("Kdv hesaplatmak istediginiz urunun fiyatını giriniz : ");
        productPrice = scn.nextDouble();

        kdvRatio = (productPrice > 0 && productPrice <=1000) ? 0.18 : 0.08;
        productKdvPrice = productPrice * kdvRatio;


        //tl min ucret 1 kuruş 0.00 nere kadar yazdırıyoruz
        System.out.printf("\nUrunuzun KDV'siz tutari : %.2f", productPrice );
        System.out.printf("\nUrunuzun KDV'li tutari : %.2f", productKdvPrice + productPrice);
        System.out.printf("\nUrunuzun KDVsi : %.2f\n", productKdvPrice);

    }

    public static class HitToAction {
        public static void main(String[] args) {
            double hit;

            Scanner scn=new Scanner(System.in);
            System.out.print("Havadaki sıcalik durumunu giriniz");
            hit=scn.nextDouble();

            if (hit>25)
                System.out.println("Yüzmeye gidebilirsin");
            else if (hit>=15)
                System.out.println("Piknik yapabilirsin");
            else if (hit >= 5)
                System.out.println("Sinemaya gidebilirsin");
            else
                System.out.println("Kayak yapabilirsin");

        }
    }
}
