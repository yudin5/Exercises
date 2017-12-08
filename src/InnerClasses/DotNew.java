package InnerClasses;

//: innerclasses/DotNew.java
// Непосредственное создание внутреннего класса в синтаксисе .new
public class DotNew {
    public class Inner {
        private int i = 5;
        private void test() {
            System.out.println("test");
        }
    }
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        dni.test();
        System.out.println(dni.i);
        dni.i = 10;
        System.out.println(dni.i);
    }
}
