package MyPractice;

public class ArrayMaxMin {
    public static void main(String[] args) {

        int [] list = {15,12,788,1,-1,-778,2,0};
        int minListElement=list[0];
        int maxListElement=list[0];

        for (int i = 0; i < list.length; i++) {
            if(list[i] < minListElement){
                minListElement=list[i];
            }

            if(list[i] > maxListElement){
                maxListElement=list[i];
            }
        }
        System.out.println("Min : " + minListElement);
        System.out.println("Max : " + maxListElement);
    }
}

