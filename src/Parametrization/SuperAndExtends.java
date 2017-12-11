package Parametrization;

import java.util.ArrayList;
import java.util.List;

public class SuperAndExtends {
    public static void main(String[] args) {
        List<? extends AAA> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<? extends Number> intList = new ArrayList<Integer>();
        for (Object o : intList) {
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
