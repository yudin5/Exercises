package InnerClasses;

import java.io.Serializable;

public class Parcel {

    class Contents {
        private int i = 11;
        public int value() {return i;}
    }

    private class Destination {
        private String label;
        Destination(String whereTo) {label = whereTo;}
        String readLabel() {return label;}
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("Tasmania");
        Destination sdf = p.new Destination("sdsds");
        System.out.println(sdf.readLabel());
    }
}













