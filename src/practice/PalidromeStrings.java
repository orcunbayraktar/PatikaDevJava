package practice;

public class PalidromeStrings {
    public static void main(String[] args) {
        String str="   Adada" ;

        System.out.println(str);
        if (isPalidromeStrings(str)){
            System.out.println(str.trim() + " Kelimesi Palidromdur");
        }else
            System.out.println(str.trim() + " kelimesi Palidrom değildir.");
    }
    static boolean isPalidromeStrings(String str){
        str=str.trim().toLowerCase();
        for (int i = 0,j=str.length()-1; i < str.length() / 2 ; i++,j--) {
            if (str.codePointAt(i) != str.codePointAt(j) )
                return false;
        }
        return true;
    }
}
