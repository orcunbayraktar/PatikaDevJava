package MyPractice;

import java.util.Scanner;


/*
tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift
ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
//ne kadar giriş girilebileceği belli değig while
//ve ilk degeri aldırıp bida loopda aldırana kadar do while hallediyoruz
    public class LoopNegativeOddNumber {
        public static void main(String[] args) {
        int number,sum=0;

        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz : ");
            number=input.nextInt();
            if (number % 3 == 0 && number % 4 == 0)
                sum+=number;

        }while(number % 2 == 0);
        ///System.out.print("Sayi giriniz : ");
        //number=input.nextInt();
        System.out.print("Result : " + sum);

    }
    }

