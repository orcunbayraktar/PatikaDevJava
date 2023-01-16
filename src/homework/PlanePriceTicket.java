package homework;

import java.util.Scanner;

public class PlanePriceTicket {
    public static void main(String[] args) {
        int distanceKm, age, flightType;
        double perDistanceKmPrice = 0.10, discountAge12low = 0.5, discountAge12_24 = 0.9, discountAge65upper = 0.7, discountFlightType = 0.8, normalPriceTicket = 0;
        boolean isError = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distanceKm = scanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş : ");
        flightType = scanner.nextInt();

        //flight type 2 durumunu && yazamazsın direk hata ne girersen gir ife girmez
        if (distanceKm > 0 && age > 0 && (flightType == 1 || flightType == 2)) {

            normalPriceTicket = perDistanceKmPrice * distanceKm;

            if (age <= 24) {
                if (age < 12) {
                    normalPriceTicket *= discountAge12low;
                } else
                    normalPriceTicket *= discountAge12_24;
            } else if (age > 65) {
                normalPriceTicket *= discountAge65upper;
            }
            if (flightType == 2)
                normalPriceTicket = 2 * normalPriceTicket * discountFlightType;

        } else
            isError = true;

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz");
        } else
            System.out.println("Toplam Tutar : " + normalPriceTicket + " TL");


    }
}
