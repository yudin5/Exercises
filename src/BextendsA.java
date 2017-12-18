public class BextendsA {
    public static void main(String[] args) {
        AA obj = new BB();
    }
}



class AA {

    static {
        System.out.println("Static super");
    }

    {
        System.out.println("Dynamic super");
    }

    AA() {
        System.out.println("AA");
    }
}
class BB extends AA {

    static {
        System.out.println("Static child");
    }

    {
        System.out.println("Dynamic child");
    }

    BB() {
        System.out.println("BB");
    }
}
