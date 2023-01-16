package practice;

import java.util.Scanner;

public class TriangleAreaCalculation {
    public static void main(String[] args) {
        int edgeA,edgeB,edgeC;

        Scanner scn = new Scanner(System.in);

        System.out.printf("Hesaplatmak istediğiniz ucgenin kenar uzunluklarını giriniz\n1.kenar : ");
        edgeA = scn.nextInt();

        System.out.printf("2.kenar : ");
        edgeB = scn.nextInt();

        System.out.printf("3.kenar : ");
        edgeC = scn.nextInt();

        double triangleHalfPerimeter =(edgeA + edgeB + edgeC) / 2.0;
        double triangleArea = Math.sqrt(triangleHalfPerimeter * (triangleHalfPerimeter - edgeA) * (triangleHalfPerimeter - edgeB) * (triangleHalfPerimeter - edgeC));

        System.out.printf("Ucgenin alanı : %.2f" , triangleArea);
    }

}
