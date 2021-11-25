package rayat;

public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();
    Deadlock(){
        Thread.currentThread().setName("MainTread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");

    }

    public void run(){
        b.bar(a);
        System.out.println("Back in other thread");

    }
}
