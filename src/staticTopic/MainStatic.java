package staticTopic;

import staticTopic.Course;
/*
BİR PROJEDE 200 SINIFDA OLUBİLİR
BU YÜZDEN HEPSİNİ ÇALIŞTIRMIYOR HAFIZA ALMIYOR(STATİKLİLERİ)
 BAKIYOR kullanılacağı zaman yani

O SINIFIN İSMİ GEÇİYOR İSE VEYA NESNESİ OLUŞTUYORSA O METODU ÇAĞIRIYO
YANİ COURSEYİ GÖRDÜ BEYA CALCULATE GÖRDÜ ONU STATİKLERİ KOYAR ÇALIŞTIRM SIRASI
 */


public  class MainStatic {

    static int i;
    static{
        System.out.println("i");
    }



    public static void main(String[] args) {
        // ***** nemli yani gidip static direk hafızaya koymadı  main çalıştırıp o sınıf kulalnıldı mı??
        //bakdı evet var Course 29 30 var Static çapırımda dahil ****Intger.MAX mesela burdada Integer görünce
        //bu satırdan sonra derleyici hafıcaya alacak çalıştıracak
        //28 işlendiğinde hafızada i= değeri atanmış ama static kod bloğu işlenmemiş
        System.out.println("Program başlarken" );

        Course c1=new Course("orcoo",61);
        Course c2=new Course("orcoo2",100);

        Course[] courseArray={c1,c2};
        Calculate.topla(courseArray);

        System.out.println("Counter son deger " + Course.counter);

        // Calculate cal1= new Calculate(1);


        //Course[] courseArray={c1,c2};

        //Calculate.topla(courseArray);

        //nesne oluşturulmadan çağıramazsın hata
        //cal1.topla(courseArray,6);

        System.out.println("Program bitti");



    }
}