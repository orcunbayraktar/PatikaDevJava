package InheritanceUniversityEmployees;

public class Memur extends Employee{
    private String department;
    private String shift;

    public Memur(String nameSurname, String myPno, String eMail, String department, String shift) {
        super(nameSurname, myPno, eMail);
        this.department = department;
        this.shift = shift;
    }

    public void calıs(){
        System.out.println(this.getNameSurname() + "kisisi"+this.department+"depatınamnında "+ this.shift + " saat çalışdı.");
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void print(){
        System.out.println();
    }
}
