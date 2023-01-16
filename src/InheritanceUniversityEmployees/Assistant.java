package InheritanceUniversityEmployees;

public class Assistant extends Academician {
    private int officeHour;

    public Assistant(String nameSurname, String myPno, String eMail, String department, String title, int officeHour) {
        super(nameSurname, myPno, eMail, department, title);
        this.officeHour = officeHour;
    }
    public void doQuiz(){
        System.out.println(this.getNameSurname()+" asistenı "+ this.officeHour +" saatinde quiz yapacak." );
    }
    public int getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }
}
