package staticTopic;

public class Calculate {
    public int a;

    public Calculate(int a){
        this.a=a;
    }

    public static void topla( Course[] abc){
        Calculate cal1=new Calculate(5);
        double sum=0;
        for (Course a : abc){
            sum+= a.note;
        }
        System.out.println("Toplam :" + sum / 2);
        System.out.println(cal1.a);
    }

    //tabikide nesne olutrulmadan çağırılamaz
    public void topla( Course[] abc,int A){
        Calculate cal1=new Calculate(5);
        double sum=0;
        for (Course a : abc){
            sum+= a.note;
        }
        System.out.println("Toplam :" + sum / 2);
        System.out.println(cal1.a);
    }



}
