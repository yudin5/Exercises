public class NullToMethod {
    static void method(Object object) {
        System.out.println("Object");
    }
    static void method(ClassCastException runtime) {
        System.out.println("ClassCastException");
    }

    static void method(RuntimeException exception) {
        System.out.println("RuntimeException");
    }

    static void method(int integer) {
        System.out.println("Integer");
    }

    static void method() {
        System.out.println("null");
    }

    public static void main(String[] args) {
        method(null);
    }
}
