package ThreadsTest;

class ObjectToLock {
    void f1() {
        System.out.println(Thread.currentThread().getName() + " entered f1()");
        try {
            System.out.println(Thread.currentThread().getName() + " is going to sleep...");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " woke up");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is leaving f1()");
    }

    void f2() {
        System.out.println(Thread.currentThread().getName() + " entered f2()");
        System.out.println(Thread.currentThread().getName() + " is leaving f2()");
    }
}

class Locker1 implements Runnable {
    volatile ObjectToLock obj;

    Locker1(ObjectToLock obj) {
        this.obj = obj;
    }

    public void run() {
        System.out.println(obj.hashCode());
        synchronized (obj) {
            obj.f1();
            obj.f2();
        }
    }
}

class Locker2 implements Runnable {
    volatile ObjectToLock obj;

    Locker2(ObjectToLock obj) {
        this.obj = obj;
    }

    public void run() {
        System.out.println(obj.hashCode());
        synchronized (obj) {
        obj.f1();
        obj.f2();
        }
    }
}

public class ThreadStarter {
    public static void main(String[] args) throws InterruptedException {
        ObjectToLock obj = new ObjectToLock();
        Thread t1 = new Thread(new Locker1(obj));
        Thread t2 = new Thread(new Locker2(obj));
        t1.start();
        t2.start();
    }
}
