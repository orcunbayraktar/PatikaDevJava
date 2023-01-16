package homework;

import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        int arraySize, tempNumber;
        int[] sortingArray, arr;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutu n : ");
        arraySize = scanner.nextInt();
        arr = new int[arraySize];

        setArrayElements(arr);
        sortingArrayMethod(arr);

        System.out.print("Sıralama : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    static void setArrayElements(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ".Elemanı : ");
            arr[i] = scanner.nextInt();

        }
    }

    static void sortingArrayMethod(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
    }


}
