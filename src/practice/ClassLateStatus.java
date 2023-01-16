package practice;

import java.util.Scanner;

public class ClassLateStatus {
    public static void main(String[] args) {
        double coursePassingGrade=55.0,numberOfLesson=0.0;
        int gradePointMath,gradePointPhysics,gradePointChemistry ,gradePointTurkish,gradePointMusic;

        Scanner scn=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        gradePointMath=scn.nextInt();

        if (0 <= gradePointMath && gradePointMath <= 100){
            numberOfLesson++;
        }else
            gradePointMath=0;

        System.out.print("Fizik notunuzu giriniz : ");
        gradePointPhysics=scn.nextInt();
        if (0 <= gradePointPhysics && gradePointPhysics <= 100){
            numberOfLesson++;
        }else
            gradePointPhysics=0;

        System.out.print("Kimya notunuzu giriniz : ");
        gradePointChemistry=scn.nextInt();
        if (0 <= gradePointChemistry && gradePointChemistry <= 100){
            numberOfLesson++;
        }else
            gradePointChemistry=0;

        System.out.print("Türkçe notunuzu giriniz : " );
        gradePointTurkish=scn.nextInt();
        if (0 <= gradePointTurkish && gradePointTurkish <= 100){
            numberOfLesson++;
        }else
            gradePointTurkish=0;

        System.out.print("Müzik notunuzu giriniz : ");
        gradePointMusic=scn.nextInt();
        if (0 <= gradePointMusic && gradePointMusic <= 100){
            numberOfLesson++;
        }else
            gradePointMusic=0;

        double avgGradePoint=(gradePointMath + gradePointChemistry + gradePointPhysics  + gradePointTurkish + gradePointMusic)/numberOfLesson;

        String courseStatus = (avgGradePoint > coursePassingGrade) ? "Tekrikler sinifi gecdiniz " : "Malesef Sinifda kaldiniz";

        System.out.printf(courseStatus + "\nOrtalama Ders notunuz : %.2f" , avgGradePoint);
    }

}

