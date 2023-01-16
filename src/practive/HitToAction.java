package practive;

import java.util.Scanner;
/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */

public class HitToAction {
    public static void main(String[] args) {
        double hit;

        Scanner scn=new Scanner(System.in);
        System.out.print("Havadaki sıcalik durumunu giriniz : ");
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
