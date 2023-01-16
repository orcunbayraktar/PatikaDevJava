package epi1;

import java.util.Scanner;

public class GradePointAvg {
    public static void main(String[] args) {
        double coursePassingGrade=60.0;
        int gradePointMath,gradePointPhysics,gradePointChemistry ,gradePointHistory,gradePointTurkish,gradePointMusic;
        String str=" notunuzu giriniz : ";

        Scanner scn=new Scanner(System.in);

        System.out.print("Matematik" + str);
        gradePointMath=scn.nextInt();

        System.out.print("Fizik" + str);
        gradePointPhysics=scn.nextInt();

        System.out.print("Kimya" + str);
        gradePointChemistry=scn.nextInt();

        System.out.print("Tarih" + str);
        gradePointHistory=scn.nextInt();

        System.out.print("Türkçe" + str);
        gradePointTurkish=scn.nextInt();

        System.out.print("Müzik"+ str);
        gradePointMusic=scn.nextInt();

        double avgGradePoint=(gradePointMath + gradePointChemistry + gradePointPhysics + gradePointHistory + gradePointTurkish + gradePointMusic)/6.0;

        String courseStatus = (avgGradePoint > coursePassingGrade) ? "Tekrikler sinifi gecdiniz " : "Malesef Sinifda kaldiniz";

        System.out.printf(courseStatus + "\nOrtalama Ders notunuz : %.2f" , avgGradePoint);

    }
}
