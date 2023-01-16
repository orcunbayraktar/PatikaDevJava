package InheritanceUniversityEmployees;

public class SecurityGuard extends Memur{
    private String belge;

    public SecurityGuard(String nameSurname, String myPno, String eMail, String department, String shift, String belge) {
        super(nameSurname, myPno, eMail, department, shift);
        this.belge = belge;
    }
    public void keepWatch(){
        System.out.println(this.getNameSurname()+" güvenlik görevlisi " + this.getShift() +" saatleri arasında nöbet tutacakdır.");
    }
    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    /*
    //super class memurda protected department tanımlarsan
    //miras alan classdan dorudan erişim alıbiliyoruz
    public protectedNedir(){
        this.department;
        super.department; //şuanlık net açıklamadı.
    }
    */
}
