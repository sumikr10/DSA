package Practice.Strings;

public class Pallindrome {
    public static void main(String[] args) {
        String input = "";
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String str){
        if(str == null || str.length() == 0) return true;
        str = str.toLowerCase();
        for(int i = 0; i <= str.length() / 2; i++){
            char start = str.charAt(i);
            char end  = str.charAt(str.length() - 1 - i);

            if(start  != end) return false;

        }
        return true;
    }
}
