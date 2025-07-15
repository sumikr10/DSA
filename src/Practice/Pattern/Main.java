package Practice.Pattern;

public class Main {

    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int columns = 1; columns <= 5; columns++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int columns = 1; columns <= 5 - row + 1; columns++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4( int n){
        for(int row = 1; row <= n; row++){
            for(int columns = 1; columns <= row; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row = 0; row < 2 * n -1 ; row++){
            int c;
            if(row > n - 1){
                c = 2 * n - row - 1; //n - (row - n)
            }else{
                c = row + 1;
            }
            for(int col = 0; col < c; col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern28(int n){
        for(int rows = 0; rows < 2*n; rows++){
            int c;
            int g;
            if(rows > n -1){
                c = 2 * n - rows - 1;
            }else{
                c = rows + 1;
            }
            int totalSpaces = n - c;
            for(int gap = 0; gap < totalSpaces; gap++){
                System.out.print(" ");
            }
            for(int col = 0; col < c; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern28(5);
    }

}
