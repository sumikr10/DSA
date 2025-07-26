package Practice.Leetcode;

public class Leetcode69 {
    public static void main(String[] args) {
        System.out.println(mysqrt(4));
    }
    public static int mysqrt(int x){

        if(x == 0 || x == 1){
            return x;
        }
        int left = 1;
        int right = x;
        int result = 0;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            }else if(square < x){
                result = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
}
