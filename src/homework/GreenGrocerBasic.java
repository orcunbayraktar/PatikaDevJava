package homework;

import java.util.Scanner;

public class GreenGrocerBasic {
    public static void main(String[] args) {

        double priceArmut=2.14,priceElma=3.67,priceDomates=1.11,priceMuz=0.95,pricePatlıcan=5;
        String str = " Kac Kilo alacaksın : ";

        Scanner scn=new Scanner(System.in);

        System.out.print("Armut" + str);
        int perKilosArmut=scn.nextInt();

        System.out.print("Elma" + str);
        int perKilosElma=scn.nextInt();

        System.out.print("Domates" + str);
        int perKilosDomates=scn.nextInt();

        System.out.print("Muz" + str);
        int perKilosMuz=scn.nextInt();

        System.out.print("Patlıcan" + str);
        int perKilosPatlıcan=scn.nextInt();

        double totalResult=(priceDomates*perKilosDomates)+(priceElma*perKilosElma)+(priceArmut*perKilosArmut)+(priceMuz*perKilosMuz)+(pricePatlıcan*perKilosPatlıcan);
        System.out.printf("Toplam tutar : %.2f TL", totalResult );

    }
}
