package practice;

import java.util.Scanner;

public class Loop3_4Avg {
    public static void main(String[] args) {

        int number,sum=0,divisibleCounter=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Girdiginiz sayiya kadar 3 ve 4 tam bolunen sayiların ortalaması bulunacakdır\nLutfen sayi giriniz : ");
        number=input.nextInt();

        //0tam bolune bildiğinden counter 1den baslat
        int counter=1;
        while(counter<=number){
            if (counter % 3 ==0 && counter % 4 ==0){
                sum+=counter;
                divisibleCounter++;
            }
            counter++;
        }
        System.out.print("Girdiginiz sayiya kadar 3 ve 4 tam bolunen sayiların ortalaması : " + (sum/divisibleCounter));

    }
}
