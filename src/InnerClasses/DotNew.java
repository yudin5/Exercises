package InnerClasses;

//: innerclasses/DotNew.java
// Непосредственное создание внутреннего класса в синтаксисе .new

import java.util.ArrayList;

public class DotNew {
    private class Inner {
        private int i = 5;
        private void test() {
            System.out.println("test");
        }

        private class Inner2 extends Inner {

        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        dni.test();
        System.out.println(dni.i);
        dni.i = 10;
        System.out.println(dni.i);

        Object o = new Object();
        o = "slkfdj";
        String s = (String) o;
        //s = o;
        //s = (String) o;
        ArrayList<AA> list = new ArrayList<>();
        for (Object object : list) {
            System.out.println(object);
        }
    }
}

class AA {}
class BB extends AA {}
