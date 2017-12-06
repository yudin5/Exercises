import java.util.*;

public class Exercise {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(numbers);
        Iterator iter = list.iterator();
        System.out.println(list);
        //Logger logger = Logger.getLogger("LoggingException");
        //logger.severe("test");

        for (Map.Entry entry : System.getenv().entrySet()) {
            //System.out.println(entry.getKey() + ": " +
            //entry.getValue());
            //System.out.println(entry.getClass().getCanonicalName());
        }

        A a = new A();
        B b = new B();
        System.out.println(b instanceof A);
        System.out.println(b);

        int[] arr = new int[3];
        arr[0] = 4;
        System.out.println(arr[2]);

        int[][] arr2 = new int[3][2];
    }

}
class A {}
class B extends A {}

