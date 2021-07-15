package inheritance;

class A {
    private A() {
        System.out.print("A ");
    }

    public A(String str) {
        System.out.print("A ");
    }
}

class B extends A {
    public B() {
        super("sdf");
        System.out.print("B ");
    }
}

class C extends B {
    public C() {
        System.out.print("C ");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
