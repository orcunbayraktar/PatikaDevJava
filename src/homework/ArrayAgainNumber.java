package homework;

import java.util.Arrays;

public class ArrayAgainNumber {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicateArr = new int[list.length];

        System.out.print("Dizi : ");
        for (int i : list)
            System.out.print(i + " ");

        System.out.println("\nTekrar Sayıları");

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    duplicateArr[i] += 1;
                }
            }
            i += duplicateArr[i];//sıralayınca birbirne aynı sayılar yapışıyorlar
            //fazladan ne kadar dup olmuşsa atlatıyoruz
        }
        for (int i = 0; i < duplicateArr.length; i++) {
            System.out.println(list[i] + " sayısı " + (duplicateArr[i] + 1) + " kere tekrar edildi.");
            i += duplicateArr[i];
        }
    }
}
