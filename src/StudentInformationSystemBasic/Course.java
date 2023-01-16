package StudentInformationSystemBasic;

public class Course {

    Teacher teacher;
    String name;
    String prefix; //burda brach ile ilgili
    int note;
    int verbalNote;


    Course(String name,String prefix){
        this.name=name;
        this.prefix=prefix;
        this.note=0;
        this.verbalNote=0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.brach.equals(this.prefix)){
            this.teacher=teacher;
        }else {
            System.out.println(teacher.name +" isimli ögretmen bu dersi veremez");
            System.out.println("Nedeni öğretmenin uzmanlık alanı : " + teacher.brach);
        }
    }
    void printCourseTeacher(){
        if (this.teacher != null){
            System.out.println(this.name + " dersinin öğretmeni : " + teacher.name);
        }else{
            System.out.println("bu derse (" + this.name +") öğretmen atanmamıştır.");
        }
        //  System.out.println("Öğretmenin ismi : " + this.teacher.name + "Öğretmenin branşı" + this.teacher.brach + "Öğretmenin tel nosu : " + this.teacher.mpNo);
    }
    /*
    void printTeacherInfo(){ //bu teacher niteliği Teacher sınıfından türetildgi
         teacher.printTeacher(); //icin bu sınıfın metodlarınada erişebiliyoruz.
                                    //sadeece niteliklerinmi almaz hepsini alır.
    }
    */

}
