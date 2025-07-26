package Practice.Leetcode;

public class Leetcode441 {
    public static void main(String[] args) {
        Leetcode441 obj1 = new Leetcode441();
        System.out.println(obj1.arrangeCoins(8));
    }
    public int arrangeCoins(int n) {
        int total_stairs = 1;
        int result = -1;
        for(int i = 1; i <= Integer.MAX_VALUE ; i++){
            total_stairs += i;
            if(total_stairs == n){
                return i;
            }
            else if(total_stairs > n) {
                return i - 1;
            }
        }
        return -1;

    }
}
