package Parametrization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperAndExtends {

    void SuperAndExtends() {
        System.out.println("slkfdj");
    } // Можно создать метод SuperAndExtends

    // void localVar() {int i; i++} // Локальную переменную надо явно инициализировать
    static void test(int x, int y) {}
    //static void test(int x, int y) {}
    static void test(Integer x, Integer y) {}

    static void varArgs(String s, int i, int j) {}
    static void varArgs(String string, int... a) {}

    static void testFloat(Float x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Integer xI = 1;
        Double xD = 1.0;
        System.out.println(xI.equals(xD)); // xI == xD не компилируется
        System.out.println(xD);
        float xF = 4f;
        testFloat(xF);
        varArgs("asd", 3, 2);
        System.out.println('a' + 1);
        String string = "hello";
        string = string + "";
        switch (string) {
            case "hello":
                System.out.println(string);
                break;
            case "gg":
                System.out.println("gg");
                break;
            case "tt":
                System.out.println("tt");
                break;
            default:
                System.out.println("ha-ha");
        }
        System.out.println(1%9);
        Float[] arrF = new Float[2];
        arrF[0] = 1.9f;
        for (Float f : arrF) {   // если "float f : arrF"  - NullPointerException !!!
            System.out.println(f);
        }
        long l4 = 200;
        int i4 = (int) l4;
        boolean x3 = false;
        boolean y3 = true;
        while(y3 = x3) {}
        int x1 = 1, y1 = 2, z1 = 3;
        System.out.println("test" + (x1 + y1));
        byte g = (byte) 300;
        Float d2 = 4.0f;
        float f2 = 4.0f;
        System.out.println(d2 == f2);
        System.out.println((double) 3/7);
        boolean b2 = true;
        System.out.println("10" + b2);
        System.out.println(Float.NaN);
        byte x = 5;
        char y = 10;
        test(x, y);
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
