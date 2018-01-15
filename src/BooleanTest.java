import java.math.BigDecimal;
import java.util.*;

public class BooleanTest {

    class Test2 {
        int xxx = 333;
    }

    static final int FIN;
    static char c = 17;
    static char ch;

    static {
        FIN = 5;
    }
    
    int xxx = 555;

    public void doSomething() {
        Test2 test2 = new Test2();
        System.out.println(test2.xxx);
    }

    static void aaa(byte a) {}
    static void aaa(int... a) {}
    static void aaa(float a) {}
    static void aaa(Integer a) {}
    //void test(int i) {        System.out.println(i);    }
    void test(Integer i) { System.out.println(i); }
    //void test(int i) {}
    //void test(float i) {     }
    //void test(double i) {    }
    float naturLog() {return 2.718f;}

    public static void main(String[] args) {
        //int A = 0;
        //System.out.println(++A + --A + A++);
        //System.out.println(A);
        aaa(5);
        // System.out.println(Float.isNaN(0/0)); // java.lang.ArithmeticException: / by zero
        System.out.println(Float.isNaN(0/0f)); // true
        System.out.println(Float.isNaN(0f/0)); // true
        System.out.println(0/0f == 0/0f); // false
        Float f1 = 4.11f;
        Float f2 = 4.11f;
        float ff1 = 3.12f;
        float ff2 = 3.12f;
        System.out.println();
        System.out.println(f1.isNaN() == f1.isNaN()); // true
        System.out.println(f1.isNaN() == f2.isNaN()); // true
        System.out.println(Float.isNaN(ff1) == Float.isNaN(ff1)); // true
        System.out.println(Float.isNaN(5)); // false
        System.out.println("[ " + (c + 1) + " ]"); // Инициализирована по умолчанию
        int ee = 512;
        byte eeB = (byte) ee;
        System.out.println(eeB == 0); // true
        BooleanTest x = new BooleanTest();
        int y = 5;
        int sdf;
        x.test(y);
        System.out.println(ff1 == ff2);
        System.out.println();
        float v = 4.11f;
        double v1 = 4.11;
        Double v3 = 4.11;
        System.out.println(v3 == v1); // true
        System.out.println(v == v1); // false
        System.out.println(Double.isNaN(Math.sqrt(-1)));
        System.out.println(new BigDecimal(0.11)); // 0.11000000000000000055511151231257827021181583404541015625
        System.out.println(f1 != f2); // true
        System.out.println(f1 == f2); // false
        System.out.println(f1.equals(f2)); // true
        System.out.println("XXX " + 10 + 20); // XXX 1020
        BooleanTest btest = new BooleanTest();
        btest.doSomething(); // 333 - выводится переменная xxx, принадлежащая классу Test2
        //test((char) 34, (byte)44);
        //Boolean b = new Boolean("/true");
        //System.out.println(b);
        //BooleanTest.main("test");
        //System.out.println(MAX_VALUE);
        Object ob1 = new Object();
        Object ob2 = new Object();
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        Integer[] array = new Integer[2];
        list.toArray(array);
        System.out.println(list.get(1));

        int a = 0; int b = 3;
        int c = a / b;
        System.out.println(c);

        int z = 077;
        System.out.println(z);
        /*int aa = 0b0;
        int bb = ++a + a++;
        System.out.println(bb);
        System.out.println(aa);*/

        int ff = 50000;
        char aa = (char) (ff >>> 0);
        System.out.println(aa);

        String ss1 = new String("sss");
        String ss2 = new String(ss1);
        System.out.println(ss1 == ss2); // false
        System.out.println(ss1 == "sss"); // false

        byte bbb = 12;
        byte k = bbb++;
        System.out.println(k); // 12
        Integer[] arrInt = new Integer[2];
        arrInt[0] = 1;
        arrInt[1] = 2;
        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(arrInt));
        System.out.println(listInt);
        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1 + c2 + c3);
        int charInt = 1 + ch;
        System.out.println(ch);
        System.out.println(Float.isNaN(ch));
        System.out.println(charInt);
    }
}
