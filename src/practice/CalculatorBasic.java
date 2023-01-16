package practice;

import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {
        int selectAction;
        double number1,number2,result;
        String strActions;

        Scanner scn=new Scanner(System.in);

        System.out.print("1. saiyi giriniz : ");
        number1= scn.nextDouble();
        System.out.print("2. saiyi giriniz : ");
        number2= scn.nextDouble();

        System.out.println("Lutfen yapmakistediz islemi seciniz" +
                "\nToplama icin - 1 -" +
                "\nCıkarma icin - 2 -" +
                "\nCarpma icin - 3 -" +
                "\nBolme icin - 4 -");
        selectAction=scn.nextInt();

        switch (selectAction){
            case 1 :
                //+ işleminde dikkat n1 n2 str algılayıp strolarak ekler işlem yapmaz digerleri icin gecerli degıl
                System.out.println("Toplama islemin sonucu : "  +(number1 + number2));
                break;

            case 2 :
                System.out.println("Cıkarma islemin sonucu : " + (number1 - number2));
                break;

            case 3 :
                System.out.println("Carpma islemin sonucu : " + (number1 * number2));
                break;

            case 4 :
                if (number2 !=0)
                    System.out.println("Carpma islemin sonucu : " + (number1 / number2));
                System.out.println("Herhangi bir sayi 0'a bolunemez");
                break;

            default:
                System.out.println("Yanlıs secim yapdiniz");
                break;
        }

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