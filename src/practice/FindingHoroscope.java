package practice;

import java.util.Scanner;

public class FindingHoroscope {
    public static void main(String[] args) {
        int mounth,days;
        //deeger atamalısın vurca if elsen burca atamayi garanti edemezsin
        String burc="";
        //gun olup olmaması kosulunu (2 durum 0 1)asağıya aktarmak icin boolean kullandık
        boolean isError=false;

        Scanner input=new Scanner(System.in);

        System.out.print("Dogum gununuzu giriniz : " );
        days=input.nextInt();

        System.out.print("Dogum ayini (rakam olarak 1-12) giriniz : " );
        mounth=input.nextInt();

        if (1 <= mounth && mounth <=12){
            if (mounth == 1 ){
                if (0 < days && days <=31){
                    if(days<=21)
                        burc="Oglak";
                    else
                        burc="Kova";
                }else
                    isError=true;
            }
            else if (mounth == 2 ){
                if (0 < days && days <=28) {
                    if (days <= 19)
                        burc = "Kova";
                    else
                        burc = "Balik";
                }else
                    isError=true;
            }
            else if (mounth == 3 ){
                if (0 < days && days <=31) {
                    if (days <= 20)
                        burc = "Balik";
                    else
                        burc = "Koc";
                }else
                    isError=true;
            }
            else if (mounth == 4 ){
                if (0 < days && days <=30) {
                    if (days <= 20)
                        burc = "Koc";
                    else
                        burc = "Boğa";
                }else
                    isError=true;
            }
            else if (mounth == 5 ){
                if (0 < days && days <=31) {
                    if (days <= 21)
                        burc = "Boğa";
                    else
                        burc = "İkizler";
                }
            }
            else if (mounth == 6 ){
                if (0 < days && days <=30) {
                    if (days <= 22)
                        burc = "İkizler";
                    else
                        burc = "Yengeç";
                }else
                    isError=true;
            }
            else if (mounth == 7 ){
                if (0 < days && days <=31) {
                    if (days <= 22)
                        burc = "Yengeç";
                    else
                        burc = "Aslan";
                }else
                    isError=true;
            }
            else if (mounth == 8 ){
                if (0 < days && days <=31) {
                    if (days <= 22)
                        burc = "Aslan";
                    else
                        burc = "Basak";
                }else
                    isError=true;
            }
            else if (mounth == 9){
                if (0 < days && days <=30) {
                    if (days <= 22)
                        burc = "Basak";
                    else
                        burc = "Terazi";
                }else
                    isError=true;
            }
            else if (mounth == 10 ){
                if (0 < days && days <=31) {
                    if (days <= 22)
                        burc = "Terazi";
                    else
                        burc = "Akrep";
                }else
                    isError=true;
            }
            else if (mounth == 11 ){
                if (0 < days && days <=30) {
                    if (days <= 21)
                        burc = "Akrep";
                    else
                        burc = "Yay";
                }else
                    isError=true;
            }
            else if (mounth == 12 ) {
                if (0 < days && days <= 31) {
                    if (days <= 21)
                        burc = "Yay";
                    else
                        burc = "Oglak";
                }else
                    isError=true;
            }

        } else
            isError=true;

        if (isError)
            System.out.print("Hatali gun ay girdiniz");
        else
            System.out.print("Burcunuz : " + burc);





    }
}

