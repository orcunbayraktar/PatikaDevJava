package MyPractice;

import java.util.Scanner;

public class LoopEvenNumber {
    public static void main(String[] args) {
        int number;

        Scanner input=new Scanner(System.in);
        System.out.print("Girdiniz sayiya kadar çift sayi bululancak\nLutfen sayi giriniz : ");
        number=input.nextInt();

        int counter=0;
        while(counter<=number){
            if (counter % 2 ==0){
                System.out.print(counter + "  ");
            }
            counter++;
        }
    }
}
