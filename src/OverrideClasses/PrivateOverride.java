package OverrideClasses;

public class PrivateOverride {
    public byte getNumber() {return 1;}
    static void test() {
        System.out.println("Parent static");
    }
    private void f() {
        System.out.println("private f()");
    }
    private void f(Integer i) {
        System.out.println("Super");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f(6); // Вызов родительского приватного метода.
        po.test(); // Вызов родительского метода. По типу ссылки.
    }
}

class Derived extends PrivateOverride {
    public byte getNumber() { return 4;}
    static void test() {
        System.out.println("Child static");
    }
    public void f2() {
        System.out.println("public f()");
    }
    public void f(int i) {
        System.out.println("");
    }
}
