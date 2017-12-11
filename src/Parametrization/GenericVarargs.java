package Parametrization;

//: generics/GenericVarargs.java
import java.util.*;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        System.out.println(result.getClass().getName());
        for(T item : args)
            result.add(item);
        return result;
    }
    public static void main(String[] args) {
        List<String> ls = makeList("A");
        //System.out.println(ls.getClass().getName());
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
        Integer[] a = new Integer[2];
        a[0] = 5;
        a[1] = 10;
        List<Integer> listTest = Arrays.asList(a);
        System.out.println(listTest.getClass());
        for (int i : listTest) {
            System.out.println(i);
        }
    }
}
