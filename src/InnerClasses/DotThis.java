package InnerClasses;

//: innerclasses/DotThis.java
// Обращение к объекту внешнего класса.
public class DotThis {

    void f() { System.out.println("DotThis.f()"); }

    public Inner inner() { return new Inner(); }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
    ////////////////////////////////////////////////
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this"
        }
    }
}
