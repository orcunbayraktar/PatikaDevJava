package practive;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random rndm= new Random();
        Scanner snc =new Scanner(System.in);

        int guessRight=0,gapNumber=10;
        boolean isWin=false;

        int[] guessArray= new int[5];

        int number= rndm.nextInt(gapNumber); //girilen sayı dahil degil


        System.out.println("Sayı Tahmin etme oyunu sayı aralıkları [0-" + (gapNumber-1) +"]" );

        while(guessRight < 5) {
            System.out.print("Sayıyı tahmin edeniz "+ (guessRight+1) +". tahmininiz : ");
            int guessNumber =snc.nextInt();

            if (guessNumber < 0 || guessNumber >= gapNumber){
                System.out.println("Hatalı Aralık Girişi");
                guessArray[guessRight] = guessNumber;
                guessRight++;
            }
            else if (number == guessNumber){
                guessRight++;
                isWin=true;
                break;
            }else{
                if (number > guessNumber){
                    System.out.println("Yukarı çık");
                    guessArray[guessRight] = guessNumber;

                }
                else{
                    System.out.println("Asağı in");
                    guessArray[guessRight] = guessNumber;
                }
                guessRight++;
            }

        }

        if (isWin)
            System.out.println("Kazandınız buldunuz sayı : " + number +"\n"+ guessRight+ ". Tahminde buldunuz."+
                    "\nÖnceki Tahminleriniz " + Arrays.toString(guessArray));
        else
            System.out.println("Kaybettiniz  bulmanız gereken sayı : " + number +
                    "\nÖnceki Tahminleriniz " + Arrays.toString(guessArray));





    }
}
