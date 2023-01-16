package homework;

import java.util.Scanner;

public class CircleAreaCalculation {
    public static void main(String[] args) {
        int radius,centerAngleMeasure;

        Scanner scn = new Scanner(System.in);

        System.out.print("Hesaplatmak istediginiz dairenin yaricapini giriniz: ");
        radius = scn.nextInt();
        System.out.print("Hesaplatmak istediginiz dairenin merkez aci olcusunu giriniz: ");
        centerAngleMeasure = scn.nextInt();

        double circleArea= Math.PI * radius * radius * centerAngleMeasure / 360.0;
        System.out.printf("Dairenin alanı : %.2f" , circleArea);

    }
}
