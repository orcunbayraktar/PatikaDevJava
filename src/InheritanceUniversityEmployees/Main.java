package InheritanceUniversityEmployees;

public class Main {
    public static void main(String[] args) {
        Academician a1=new Academician("Özge Soy","0555555555","Özge@gmail.com","mat","Doc");
        a1.login();

        SecurityGuard sg1=new SecurityGuard("Hasan Koruyucu","05555555555","HasanKoruyucu@gmail.com","Security","20.00 - 23.00","Secury101");
        sg1.keepWatch();

        //sonradan açıklıcak ama
        // memura ait metodlara erişemiyor
        //sadece Çalışan sınıfının niteliklerine dolaylı ve metodlarına doğrudan erişebiliyor
        //Ama MEMUR SINIFINI METOTLARINA ERİŞEMİYOR.
        Employee m1=new Memur("Ali","055555555555","Ali@gmail.com","Güvemlik","10:00-15:00");

    }

    public static class LabAsistant extends Assistant{
        public LabAsistant(String nameSurname, String myPno, String eMail, String department, String title, int officeHour){
            super(nameSurname,myPno,eMail,department,title,officeHour);
        }
        public void loginLabs(){
            System.out.println(this.getNameSurname()+" lab asistanı " +this.getDepartment()+ " bölümünde lab derslerine giriyor.");
        }
    }
}
