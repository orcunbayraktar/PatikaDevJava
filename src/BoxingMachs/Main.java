package BoxingMachs;


public class Main {
    public static void main(String[] args) {

        Fighters fighter1= new Fighters("Orcun",100,85,35,65);
        Fighters fighter2= new Fighters("Gizem",65,80,27,85);

        Match mach1=new Match(fighter1,fighter2,65,100);
        mach1.run();
    }
}
