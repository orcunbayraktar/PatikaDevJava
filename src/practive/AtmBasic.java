package practive;

import java.util.Scanner;

public class AtmBasic {
    public static void main(String[] args) {
        String name,password;

        int right=3,balance=100000,select;
        Scanner scn = new Scanner(System.in);

        while(right > 0){
            System.out.print("Kulanıcı adınız : ");
            name = scn.nextLine();
            System.out.print("Kulanıcı paralanız : ");
            password = scn.nextLine();

            if (name.equals("laleler") && password.equals("12345")){
                System.out.println("Giriş basarılı\nHoş geldiniz");

                do {
                    System.out.println("İşleminizi seçiniz : \n" +
                            "1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Çıkış");
                    select = scn.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = scn.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = scn.nextInt();
                            if(price > balance){
                                System.out.println("Bakiye yetersiz");
                            }else
                                balance-=price;
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : "+ balance);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Hatalı seçim yapdınız");
                            break;
                    }

                }while(select != 4);
                System.out.println("Çıkış başarılı");
                break;
            }else {
                right--;
                System.out.println("Hatalı giriş");
                if (right == 0){
                    System.out.println("Hesabınız bloke omuştur");
                }else {
                    System.out.println("Kalan hak : " + right);
                }

            }






        }
    }
}
