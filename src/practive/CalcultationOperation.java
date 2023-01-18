package practive;

import java.util.Scanner;

public class CalcultationOperation {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int select;


        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("İşlem seçiniz : ");
            select = scn.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleArea();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı işlem");
                    break;
            }
        } while (select != 0);
    }

    static void plus() {
        Scanner scn = new Scanner(System.in);

        int numbers, sum = 0, counter = 0;
        while (true) {
            System.out.print(++counter + ".sayı :");
            numbers = scn.nextInt();

            if (numbers == 0)
                break;
            sum += numbers;
        }
        System.out.println("Result : " + sum);
    }

    static void minus() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksin : ");
        int counter = scn.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi : ");
            number = scn.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scn = new Scanner(System.in);
        int number, result = 1, counter = 0;

        while (true) {
            System.out.print(++counter + ".sayı :");
            number = scn.nextInt();

            if (number == 1)
                break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksin : ");
        int counter = scn.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi : ");
            number = scn.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("0 a bölünemez");
                continue;
            }
            if (i == 1) {
                result = number;
            }
            result /= number;
        }
        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int number = scn.nextInt();
        System.out.print("Üst sayısını giriniz : ");
        int exponent = scn.nextInt();

        System.out.println("Result : " + ((int) Math.pow(number, exponent)));
    }

    static void factorial() {
        Scanner scn = new Scanner(System.in);
        int result=1;
        System.out.print("Sayı giriniz : ");
        int n=scn.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result : " + result);
    }

    static void mod() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int number = scn.nextInt();
        System.out.print("Modu ne olsun : ");
        int modNumber = scn.nextInt();

        System.out.println("Result : " + (number % modNumber));
    }

    static void rectangleArea() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Uzun kenarı cm cinsinden  giriniz : ");
        int shortNumber = scn.nextInt();
        System.out.print("Kısa kenarı cm cinsinden  giriniz : ");
        int longNumber = scn.nextInt();

        System.out.println("Result : " + (shortNumber *longNumber));
    }
}
