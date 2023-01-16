package practive;

import java.util.Scanner;

public class UserPsBasic {
    public static void main(String[] args) {
        String realUserName="orcoco",realPassword="6161",userName,password;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Kullanici girinizi yapiniz\nUsername : ");
        userName = scnr.nextLine();

        System.out.print("Password : ");
        password = scnr.nextLine();

        if(userName.equals(realUserName)||password.equals(realPassword)){ // 0 0 - 1 0 - 1 1
            if (userName.equals(realUserName) && password.equals(realPassword)){ // 1 1
                System.out.print("Giris basarili");
            }
            else if (userName.equals(realUserName)) { //1 0
                System.out.println("Sifrenizi yanlis girdiniz şifrenizi sıfırlamak ister misiniz");
                System.out.println("!!!Hatirlatma sifreniz onceki sifrenizle aynı olmamali \n/Y");
                String passwordChoice=scnr.nextLine();

                if(passwordChoice.equals("Y")||passwordChoice.equals("y")){
                    password = scnr.nextLine();

                    if (!realPassword.equals(password)){
                        realPassword=password;
                        System.out.println("Sfire olusturuldu");
                    }else {
                        System.out.println("Sifre olusturulamadı, lufen baska sıfre giriniz ");
                    }
                }
                else
                    System.out.println("Sifre hatali olduğundan giris yapilamiyor");
            }
            else // 0 1
                System.out.println("UserName hatalı girdiniz");
        }
        else // 0 0
            System.out.println("Bilgileriniz yanlıs girdiniz");


    }
}
