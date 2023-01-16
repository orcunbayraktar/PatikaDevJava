package MyPractice;

public class ForEach {
    public static void main(String[] args) {
        String[] kelimeler ={"Selam", "Sana","Yüce","Sezar"};

        for (String i: kelimeler) {
            System.out.println(i);
        }

        String[][] kelimeler2 ={{"Selam", "Sana","Yüce","Sezar"},
                {"Selam", "Sana","Yüce","Timur"}};

        for (String[] a : kelimeler2) {
            for (String i : a) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        int[][] abc2={{3,2},{2,3},{1,1}}; // V
        int[][] abc3=new int[3][2]; // V
        int[][] abc=new int[3][];//çok boyutlularda satırdan sonrasını belirtmene gerek yok
        /*
        abc[0]={1,2}; //hata verir böyle bir atama yapamazsın yukarda boyut tam değilse
        abc[1]={1,2};
        abc[2]={1,2};
        */
        int[][] abc4=new int[2][]; //böyle yapman lazım veya int[][] abc=new int[3][2];direk bunu ya
        abc[0]=new int[3]; //bunda hata vermez
        // abc[0]={1,2};  bunda verir xd
        abc[0]=new int[]{1,2,3}; //bundada vermez nedeni sutun 2.satırın sutun degerine garanti
        //görürp atıyor degerleri

        int[][] belirsiz=new int[3][];
        belirsiz[0]=new int[2];
        belirsiz[1]=new int[3];
        belirsiz[2]=new int[4]; //eğer bunu !!!belirmezsen dizinin tüm elemanlarını arıyamazsın
        //aramaz için ref degeri null konturol et
        //bunu yazdırma
        for (int i = 0; i <belirsiz.length ; i++) {
            int[] refDiziAdres=belirsiz[i]; //dizinin satırlarını adreslerini tutuyor
            for (int j = 0; j < refDiziAdres.length ; j++) {
                System.out.print(belirsiz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        int[][] belirsiz2=new int[3][];
        belirsiz2[0]=new int[2];
        belirsiz2[1]=new int[3];

        for (int i = 0; i <belirsiz2.length ; i++) {
            int[] refDiziAdres=belirsiz2[i];
            if (refDiziAdres != null) {

                for (int j = 0; j < refDiziAdres.length; j++) {
                    System.out.print(belirsiz2[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}

