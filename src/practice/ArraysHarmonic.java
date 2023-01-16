package practice;

public class ArraysHarmonic {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6,7,8,9,10,11};
        double sumHarmonic=0;

        for (int i = 0; i < list.length ; i++) {
            sumHarmonic+=(1 / list[i]);
        }

        System.out.printf("Harmonic  ortalaması : %.2f" , (sumHarmonic / list.length));

    }
}
