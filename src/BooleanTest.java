import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BooleanTest {

    class Test2 {
        int xxx = 333;
    }

    static final int FIN;
    static char c;

    static {
        FIN = 5;
    }
    
    int xxx = 555;

    public void doSomething() {
        Test2 test2 = new Test2();
        System.out.println(test2.xxx);
    }

    //void test(int i) {        System.out.println(i);    }
    void test(Integer i) { System.out.println(i); }
    void test(int i) {}
    void test(float i) {     }
    void test(double i) {    }
    float naturLog() {return 2.718f;}

    public static void main(String[] args) {
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
        System.out.println("[" + c + "]"); // Инициализирована по умолчанию
        int ee = 512;
        byte eeB = (byte) ee;
        System.out.println(eeB);
        BooleanTest x = new BooleanTest();
        char y = 5;
        x.test(y);
        System.out.println(ff1 == ff2);
        System.out.println();
        float v = 4.11f;
        double v1 = 4.11;
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

        int ff = -1;
        char aa = (char) (ff >>> 0);
        System.out.println(aa);

        String ss1 = new String("sss");
        String ss2 = new String(ss1);
        System.out.println(ss1 == ss2); // false
        System.out.println(ss1 == "sss"); // false

        byte bbb = 12;
        byte k = bbb++;
        System.out.println(k); // 12
    }
}
