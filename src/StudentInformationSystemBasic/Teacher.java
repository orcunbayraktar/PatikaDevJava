package StudentInformationSystemBasic;

public class Teacher {
    String name;
    String brach;
    String mbPhNo;


    Teacher(String name,String brach,String mbPhNo){
        this.name=name;
        this.brach=brach;
        this.mbPhNo=mbPhNo;
    }

    void printTeacherInfo(){
        System.out.println("Ad :   "+this.name+"\nBranş :   "+this.brach+"\nTel no :   "+this.mbPhNo);
    }
}
