package InheritanceUniversityEmployees;

public class Lecturer extends Academician{
    private String doorNo;

    public Lecturer(String nameSurname, String myPno, String eMail, String department, String title, String doorNo) {
        super(nameSurname, myPno, eMail, department, title);
        this.doorNo = doorNo;
    }

    public void senatoToplanti(){
        System.out.println(this.getNameSurname()+" öğretim görevlisinin senato toplantısı vardır" );
    }
    public void sinavYap(){
        System.out.println(this.getNameSurname() + " öğretim görevlisi " + this.doorNo + " dersliğinde sınav yapdı");
    }
    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
}
