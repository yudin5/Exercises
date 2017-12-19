package OverrideClasses;

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }
    private void f(Integer i) {
        System.out.println("Super");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f(6);
    }
}

class Derived extends PrivateOverride {

    public void f2() {
        System.out.println("public f()");
    }
    public void f(int i) {
        System.out.println("");
    }
}
