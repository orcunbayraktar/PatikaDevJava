package InheritanceUniversityEmployees;

public class Computing extends Memur{
    private String görev;

    public Computing(String nameSurname, String myPno, String eMail, String department, String shift, String görev) {
        super(nameSurname, myPno, eMail, department, shift);
        this.görev = görev;
    }
    public void setupNetwork(){
        System.out.println(this.getNameSurname() + " kişisi görevi"+ this.görev +" network kurulumu gerçekleştirdi.");
    }
    public String getGörev() {
        return görev;
    }

    public void setGörev(String görev) {
        this.görev = görev;
    }
}
