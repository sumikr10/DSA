package Practice.Strings;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Sumit Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('K'));
        System.out.println("   Sumit    ".strip()); //used to remove the Whitespaces

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
