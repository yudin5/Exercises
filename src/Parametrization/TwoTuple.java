package Parametrization;

public class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A a, B b) { first = a; second = b; }
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;
    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> obj = new TwoTuple<>("Friday", 13);
        System.out.println(obj);
        TwoTuple<String, String> obj2 = new TwoTuple<>("abc", "def");
        System.out.println(obj2);
        ThreeTuple<String, Integer, Double> obj3 = new ThreeTuple<>("Third", 12, 4d);
        System.out.println(obj3);
    }
}
