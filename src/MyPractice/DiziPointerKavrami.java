package MyPractice;

public class DiziPointerKavrami {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix.length; x++)
        {
            int[] row = matrix[x];// güzel örnek her satırının adresini yeni row dizi atıyor lenthlede bunun boyunu alıyor

            for (int y = 0; y < row.length; y++)
            {
                row[y] = number;
                number++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i]); //görüldüğü üzere adresileri tutuyor
            //legth o veri kümesinin başlagıç adresini alarak boyutunu buluyor
        }
    }
}
