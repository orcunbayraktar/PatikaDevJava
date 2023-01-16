package staticTopic;

public class Course {
    String name;
    int note;
    static int counter;

    static {
        int a=5;
        System.out.println("statiikc bloğa girdi" + counter);
        counter = (int)(Math.random()*10);
        System.out.println("statiikc bloğa girdi" + counter);
    }

    static{
        System.out.println("Couter static kod bloğo başlarken"+ counter);
        counter=(int )(Math.random()*10);
        System.out.println("Couter static kod bloğo bittiğinde"+ counter);
    }

    Course(String name,int note){
        this.name=name;
        this.note=note;
        System.out.println("Couter nesne oluşturup artırılmadan"+ counter);
        counter++;
        System.out.println("Couter nesne oluşturup artırıldı"+ counter);
    }
}
