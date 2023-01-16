package StudentInformationSystemBasic;

public class Main {
    public static void main(String[] args) {


        Course math=new Course("Matematik","MATH");
        Course phy=new Course("Fizik","FZK");
        Course bio=new Course("Biyoloji","BIO");
        Course che=new Course("Kimya","KMY");

        Teacher t1 =new Teacher("Cemil","MATH","05554444999");
        Teacher t2 =new Teacher("Aysel","FZK","05554444888");
        Teacher t3 =new Teacher("Neşe","BIO","05554444777");
        Teacher t4 =new Teacher("Hamdi","KMY","05554444666");

        math.addTeacher(t1);
        phy.addTeacher(t2);
        bio.addTeacher(t3);
        che.addTeacher(t4);


        Student s1=new Student("Zeki","1759",4,math,phy,bio,che);
        s1.addBulkExamNote(10,20,30,100);
        s1.addBulkVerbalNote(100,100,100,100);
        s1.isPAss();
        // phy.printCourseTeacher();






    }

}