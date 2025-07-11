package Practice;
import java.util.Arrays;
public class Swap {
    static void swap(int[] array, int i, int j){
        int temp= array[i];
        array[i]= array[j];
        array[j]= temp;
    }
    static void reverse(int[] array){
        int size= array.length;
        int start= 0;
        int end= size-1;
        while(start<end) {
            swap(array, start, end);
            start++;
            end--;
        }

    }
    public static void main(String[] args){
        int[] array= {1,2,3,4,5};
        reverse(array);
        System.out.println(Arrays.toString(array));

    }
    public static void print(int[] arr1){

    }
}

