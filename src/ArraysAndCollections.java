import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ArraysAndCollections {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "ABC";
        arr[1] = "EFG";
        arr[2] = "ZXY";

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrList);

        String s1 = "AAA";
        String aa = "AAA";
        String s2 = aa;
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1 == s2);
        //TimeUnit.MILLISECONDS.sleep(500);
    }
}
