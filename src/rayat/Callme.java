package rayat;

public class Callme {
    void call(String msg){ //it can be synchronized
        System.out.print("[" +msg);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println("Interrupted!");
        }
        System.out.println("]");

    }
}

