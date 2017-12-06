import java.io.*;

public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Test/x.file"));
        Alien mystery = (Alien) in.readObject();
        System.out.println(mystery.getClass());
        /*
        Alien mystery2 = (Alien) mystery;
        System.out.println(mystery2.i);*/
    }
}
