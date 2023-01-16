package practive;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNearNumbers {
    public static void main(String[] args) {
        int [] list = {61,5,6,8,7,44,55,33,21,17,43,69,77,98,54,24,};
        int minListElement= Integer.MAX_VALUE;
        int maxListElement = Integer.MIN_VALUE;

        Scanner scanner =new Scanner(System.in);

        System.out.println(Arrays.toString(list));
        System.out.print("Girilen Sayı : ");
        int inputNumber = scanner.nextInt();


        int[] tempArrayList = Arrays.copyOf(list,list.length);
        Arrays.sort(tempArrayList);

        for (int i =0 ; i< tempArrayList.length ; i++) {
            if(inputNumber-tempArrayList[i] <= 0){
                maxListElement=tempArrayList[i];
                minListElement=tempArrayList[i-1];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minListElement);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxListElement);
    }
}

