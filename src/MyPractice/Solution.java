package MyPractice;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


            if(a >=0 && a <=50 && b >=0 && b <=50 && n >=1 && n <=15){
                int sum=0;

                for ( i = 0; i < n; i++) {
                    sum += a + (Math.pow(2,i) * b);
                    System.out.print((int)sum + " ");
                }
                System.out.println();
            }
        }
        in.close();
    }
}