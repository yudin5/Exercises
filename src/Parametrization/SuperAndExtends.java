package Parametrization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperAndExtends {
    public static void main(String[] args) {
        char ch = 65;
        System.out.println(ch);
        Integer N1 = 100;
        Integer N2 = 100;
        System.out.println(N1 == N2);
        int a = 0;
        int[] b = new int[3];
        b[++a] = a = 4;
        System.out.println(a);
        System.out.println(Arrays.toString(b));
        a = 0;
        System.out.println(a++ + ++a);
        System.out.println(a);
        System.out.println();
        List<? extends AAA> aaaList = new ArrayList<BBB>(0);
        List<? extends BBB> bbbList = new ArrayList<BBB>(1);
        System.out.println(aaaList.getClass().getName());
        System.out.println(bbbList.getClass().getName());
        String aaaS = aaaList.getClass().getName();
        String bbbS = bbbList.getClass().getName();
        System.out.println(aaaS == bbbS);

        List<? extends Number> list = new ArrayList<Integer>(5);
        System.out.println(list.size());
        for (Object o : list) {
            System.out.println(o);
        }
        AAA o = new CCC();
        System.out.println(o.object);
        System.out.println(o.getObject());
        //intList.add(new Float(10.0f));
    }
}

class AAA {
    int object = 3;
    int getObject() {return  object;}
}

class BBB extends AAA {
    public int object = 55;
    int getObject() {return  object;}
}

class CCC extends BBB {
    public int object = 777;
    int getObject() {return object;}
}
