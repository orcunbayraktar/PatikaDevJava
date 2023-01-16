package practive;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int counter =0;
        int [] list = {1,5,5,7,8,9,11,9,9,9,15,25,37,15,4,2,2,8,15,16,18,14,12,14,14};
        int[] duplicateArr=new int[list.length];

        for (int i = 0; i < list.length ; i++) {
            for (int j = i+1; j < list.length; j++) {
                if ( list[i]==list[j] ){
                    if (isBeforeDup(duplicateArr,list[i])){
                        duplicateArr[counter++]=list[i];
                    }
                    break;
                }
            }
        }
        for (int i:duplicateArr)
            if (i % 2 ==0 && i !=0){
                System.out.print(i + " ");
            }
    }

    static boolean isBeforeDup(int[] arr,int value){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == value){
                return false;
            }
        }
        return true;
    }
}
