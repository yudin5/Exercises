public class BextendsA {
    public static void main(String[] args) {
        BB obj = new BB();
    }
}

class AA {

    static {
        System.out.println("Static parent");
    }

    {
        System.out.println("Dynamic parent");
    }

    AA() {
        System.out.println("Constructor parent");
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
        System.out.println("Constructor child");
    }
}
