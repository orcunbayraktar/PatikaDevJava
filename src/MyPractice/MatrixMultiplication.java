package MyPractice;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int dizi[][]=new int[3][2];
        int dizi2[][]=new int[2][3];

        arrayRandomValue(dizi);
        arrayRandomValue(dizi2);

        printArrays(dizi);
        System.out.println("----------------");
        printArrays(dizi2);
        System.out.println("----------------");
        arryMul(dizi,dizi2);
    }
    static void arrayRandomValue(int [][] arry){
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                arry[i][j]=((int)(Math.random() * 9)) + 1;
            }
        }
    }

    static void arryMul(int[][] arr,int[][] arr2){

        int[][] result=new int[arr.length][arr2[0].length];

        if (arr[0].length == arr2.length){

            for (int i = 0; i < result.length ; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    for (int k = 0; k < arr2.length; k++) {
                        result[i][j]+= arr[i][k] * arr2[k][j];
                    }
                }
            }
            printArrays(result);
        }else{
            System.out.println("1. sütün sayısı 2. satır sayısına eşit olmalıdır.");
        }
    }

    static void printArrays(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
