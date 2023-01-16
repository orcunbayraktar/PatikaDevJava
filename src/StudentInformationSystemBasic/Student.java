package StudentInformationSystemBasic;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    Course course4;

    String name,stuNo;
    int classes;
    double courseVerbalGradeRatio1; //for math
    double courseVerbalGradeRatio2; //for physics
    double courseVerbalGradeRatio3; //for biology
    double courseVerbalGradeRatio4; //for chemical

    double avarange;
    boolean isPass;

    Student(String name,String stuNo,int classes,Course course1,Course course2,Course course3, Course course4){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.course4=course4;

        this.isPass=false;
        this.courseVerbalGradeRatio1=0.4;
        this.courseVerbalGradeRatio2=0.2;
        this.courseVerbalGradeRatio3=0.1;
        this.courseVerbalGradeRatio4=0.2;
    }

    void addBulkExamNote(int courseNote1,int courseNote2,int courseNote3,int courseNote4){
        if (0<=courseNote1 && courseNote1 <= 100){
            this.course1.note=courseNote1;
        }
        if (0<=courseNote2 && courseNote2 <= 100){
            this.course2.note=courseNote2;
        }
        if (0<=courseNote3 && courseNote3 <= 100){
            this.course3.note=courseNote3;
        }
        if (0<=courseNote4 && courseNote4 <= 100){
            this.course4.note=courseNote4;
        }
    }
    void addBulkVerbalNote(int courseVerbalNote1,int courseVerbalNote2,int courseVerbalNote3,int courseVerbalNote4){
        if (0<=courseVerbalNote1 && courseVerbalNote1 <= 100){
            this.course1.verbalNote=courseVerbalNote1;
        }
        if (0<=courseVerbalNote2 && courseVerbalNote2 <= 100){
            this.course2.verbalNote=courseVerbalNote2;
        }
        if (0<=courseVerbalNote3 && courseVerbalNote3 <= 100){
            this.course3.verbalNote=courseVerbalNote4;
        }
        if (0<=courseVerbalNote4 && courseVerbalNote4 <= 100){
            this.course4.verbalNote=courseVerbalNote4;
        }
    }
    void isPAss(){
        if (this.course1.note==0 && this.course2.note==0 && this.course3.note==0 &&this.course4.note==0)
            System.out.println("Sınav notlarını girmeyi unuttunuz.");
        if ((this.course1.verbalNote==0 &&this.course2.verbalNote==0 && this.course3.verbalNote==0 && this.course4.verbalNote==0))
            System.out.println("Sözlü notlarını girmeyi unuttunuz.");

        else if (this.course1.note==0 ||this.course2.note==0 || this.course3.note==0 || this.course4.note==0)
            System.out.println("Notları notlarını yanlış girdiniz.");
        else if ((this.course1.verbalNote==0 ||this.course2.verbalNote==0 || this.course3.verbalNote==0 || this.course4.verbalNote==0))
            System.out.println("Sözlü notlarını yanlış girdiniz.");
        else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("--------------------------");
            System.out.println("Ortlama : " + this.avarange);
            if (this.isPass)
                System.out.println("Sınıfı gecdi");
            else
                System.out.println("Sınıfda kaldı");
        }
    }

    void calcAvarage(){ //güzel return yapmaya gerek yok zaten avage hesapnıp ona atanıyor !!!!!!!!!!!!!!!

        this.avarange = (((this.course1.note * ( 1 - courseVerbalGradeRatio1)) + (this.course1.verbalNote * this.courseVerbalGradeRatio1)) +
                ((this.course2.note * ( 1 - courseVerbalGradeRatio2)) + (this.course2.verbalNote * this.courseVerbalGradeRatio2)) +
                ((this.course3.note * ( 1 - courseVerbalGradeRatio3)) + (this.course3.verbalNote * this.courseVerbalGradeRatio3)) +
                ((this.course4.note * ( 1 - courseVerbalGradeRatio4)) + (this.course4.verbalNote * this.courseVerbalGradeRatio4))) / 4.0 ;

    }
    boolean isCheckPass(){
        calcAvarage();
        return this.avarange >= 60;
    }
    void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.print(this.course1.name + " Notu : " + this.course1.note);
        System.out.println(" Sozlu Notu : " + this.course1.verbalNote);
        System.out.print(this.course2.name +" Notu : " + this.course2.note);
        System.out.println(" Sozlu Notu : " + this.course2.verbalNote);
        System.out.print(this.course3.name + " Notu : " + this.course3.note);
        System.out.println(" Sozlu Notu : " + this.course3.verbalNote);
        System.out.print(this.course4.name + " Notu : " + this.course4.note);
        System.out.println(" Sozlu Notu : " + this.course4.verbalNote);
    }

}
