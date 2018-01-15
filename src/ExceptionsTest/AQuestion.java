package ExceptionsTest;

public class AQuestion implements Cloneable
{
    public static void main(String args[]){
        Object x = new Object();
        try {
            Object y = new AQuestion().clone();
            System.out.println();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
