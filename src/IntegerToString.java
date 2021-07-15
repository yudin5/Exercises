public class IntegerToString {
    public static void main(String[] args) {
        Integer i = 123;
        System.out.println("i.toString() = " + i.toString());

        String iString = String.valueOf(i);
        System.out.println("iString = " + iString);

        i = null;
        String iStringNull = String.valueOf(i);
        System.out.println("iString = " + iStringNull); // OK

//        i = null;
//        System.out.println("i.toString() = " + i.toString()); - NPE
    }
}
