package homework;

import java.util.Scanner;

public class RecursiveExponents {
    public static void main(String[] args) {
        int baseNumber,exponentNumber;

        Scanner inp = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz : ");
        baseNumber = inp.nextInt();
        System.out.print("Üstü sayısını giriniz : ");
        exponentNumber = inp.nextInt();

        System.out.print(baseNumber + " üssü " +exponentNumber +" = " + recursiveExponents(baseNumber,exponentNumber));

    }
    static int recursiveExponents(int baseNumber,int exponentNumber){

        if (exponentNumber == 0)
            return 1;

        return baseNumber * recursiveExponents(baseNumber,exponentNumber-1);
    }

}
