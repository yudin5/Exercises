public class BextendsA {
    public static void main(String[] args) {
        BB obj = new BB();
    }
}

class AA {
    AA() {
        System.out.println("A");
    }
}
class BB extends AA {

    {
        System.out.println("i");
    }


    BB() {
        System.out.println("B");
    }
}
