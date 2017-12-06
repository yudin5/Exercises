import java.util.ArrayList;
import java.util.List;

public class BooleanTest {

    class Test2 {
        int xxx = 333;
    }

    int xxx = 555;

    public void doSomething() {
        Test2 test2 = new Test2();
        System.out.println(test2.xxx);
    }

    public static void main(String... args) {
        BooleanTest btest = new BooleanTest();
        btest.doSomething();
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

        int ff = 100;
        char aa = (char) (ff >>> 20);
        System.out.println(aa);

        System.out.println(-7%5);
    }
}
