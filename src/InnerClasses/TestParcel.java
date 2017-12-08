package InnerClasses;

//: innerclasses/TestParcel.java

import sun.security.krb5.internal.crypto.Des;

class Parcel4 {

    private class PContents implements Contents {
        private int i = 11;
        public int value() { return i; }
    }

    protected class PDestination implements Destination {
        private String label;
        protected PDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() { return label; }
    }


    public Destination destination(String s) {
        return new PDestination(s);
    }
    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        // Запрещено - нет доступа к private-классу:
        // Parcel4.PContents pc = p.new PContents();
        Parcel4.PDestination pdi = p.new PDestination("");
        System.out.println(c instanceof Parcel4);
        System.out.println(d instanceof Parcel4);
    }
}
