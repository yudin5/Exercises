package InnerClasses;

class MNA {
    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

class AB {
    void abm() {
        System.out.println("ABm method");
    }
}

class ABC extends AB {
    void abm() {
        System.out.println("ABCm method");
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
        AB ab = new ABC();
        ab.abm();
    }
}