package InheritanceUniversityEmployees;

public class Employee {
    private String nameSurname;
    private String myPno;
    private String eMail;

    public Employee(String nameSurname, String myPno, String eMail){
        super();
        this.nameSurname = nameSurname;
        this.myPno=myPno;
        this.eMail=eMail;

    }

    public void login(){
        System.out.println(this.nameSurname + " üniversiye giris yapdı.");
    }

    public void exit(){
        System.out.println(this.nameSurname + " üniversiden çıkış yapdı.");
    }
    public void yemekhane(){
        System.out.println(this.nameSurname + "yemekğe gitti.");
    }

    public String getNameSurname() {
        return nameSurname;
    }
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMyPno(){
        return this.myPno;
    }

    public void setMyPno(String myPno){
        this.myPno=myPno;
    }

    public String getEMail(){
        return this.eMail;
    }

    public void seteMail(String eMail){
        this.eMail=eMail;
    }
}
