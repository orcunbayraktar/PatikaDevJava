package homework;

import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        int number;

        Scanner scn = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        number = scn.nextInt();

        patternRecursive(number);

    }

    static void patternRecursive(int number, int count,boolean isContinue) {
        if(number<=0)
            isContinue=false;
        if(number>0 && isContinue ==true){
            System.out.print(number + " ");
            patternRecursive(number-5,++count,isContinue);
        }else{
            System.out.print(number + " ");
            if (count == 0)
                return;
            patternRecursive(number+5,--count,isContinue);
        }
    }
    static void patternRecursive ( int number){
        patternRecursive(number, 0,true);

    }

}


