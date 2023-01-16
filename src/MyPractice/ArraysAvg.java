package MyPractice;

public class ArraysAvg {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6,7,8,9,10,11};
        double sum=0;

        for (int i = 0; i < list.length ; i++) {
            sum+=list[i];
        }

        System.out.println("Dizinin ortalaması : " + sum / list.length);

    }
}
