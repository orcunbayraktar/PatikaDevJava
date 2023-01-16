package BoxingMachs;

public class Match {

    Fighters f1;
    Fighters f2;

    int minMachSiklet;
    int maxMachSiklet;

    Match(Fighters f1, Fighters f2, int minMAchSiklet, int maxMachSiklet) {
        this.f1 = f1;
        this.f2 = f2;
        this.minMachSiklet = minMAchSiklet;
        this.maxMachSiklet = maxMachSiklet;
        siklet(this.f1, this.f2);
    }

    void run() {
        if (ischeckWeight()) {
            System.out.println("----------------MAÇ BAŞLIYOR----------------");
            int i = 0;
            while (f1.healty > 0 && f2.healty > 0) {
                System.out.println((i + 1) + ". RAUNT BAŞLIYOR");
                if (whoFirstHitFighters()) {

                    f2.healty = f1.hit(f2);
                    if (f2.healty < 0)
                        f2.healty = 0;

                    if (isWin()) {
                        System.out.println("Maçı " + f1.name + " kazandı");
                        break;
                    }

                    f1.healty = f2.hit(f1);
                    if (f1.healty < 0)
                        f2.healty = 0;
                    if (isWin()) {
                        System.out.println("Maçı " + f2.name + " kazandı");
                        break;
                    }

                } else {
                    f2.healty = f1.hit(f2);
                    if (f2.healty < 0)
                        f2.healty = 0;

                    if (isWin()) {
                        System.out.println("Maçı " + f1.name + " kazandı");
                        break;
                    }

                    f1.healty = f2.hit(f1);
                    if (f1.healty < 0)
                        f2.healty = 0;
                    if (isWin()) {
                        System.out.println("Maçı " + f2.name + " kazandı");
                        break;
                    }

                }
                System.out.println(f1.name + " kalan canı : " + f1.healty);
                System.out.println(f2.name + " kalan canı : " + f2.healty);
                System.out.println("-----------------------------------");
                i++;

            }
        }
    }

    boolean whoFirstHitFighters() {
        int randomNumber = (int) (Math.random() * 101);

        return (randomNumber > 50) ? true : false;

    }

    boolean isWin() {
        if (f1.healty == 0 || f2.healty == 0) {
            return true;
        }
        return false;
    }


    void siklet(Fighters fighter, Fighters fighter2) {
        if (isSıklet(fighter, fighter2)) {
            System.out.println("Sikletler uygun");
        } else
            System.out.println("Sikletler uygun degil");
    }

    boolean isSıklet(Fighters fighter, Fighters fighter2) {
        if ((fighter.weight >= minMachSiklet && fighter.weight <= maxMachSiklet) ||
                (fighter2.weight >= minMachSiklet && fighter2.weight <= maxMachSiklet))
            return true;
        return false;
    }

    boolean ischeckWeight() {
        return (f1.weight >= minMachSiklet && f1.weight <= maxMachSiklet) && (f2.weight >= minMachSiklet && f2.weight <= maxMachSiklet);
    }


}
