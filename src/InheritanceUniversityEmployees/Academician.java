package InheritanceUniversityEmployees;

public class Academician extends Employee {
    private  String department;
    private  String title;

    public  Academician(String nameSurname,String myPno,String eMail,String department,String title) {
        super(nameSurname, myPno, eMail);
        this.department = department;
        this.title = title;
    }

    public void dersGir(){
        System.out.println(this.getNameSurname() +" akademisyeni derse girdi.");
    }

    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
