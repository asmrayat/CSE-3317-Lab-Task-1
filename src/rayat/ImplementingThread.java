package rayat;

public class ImplementingThread  implements Runnable{
    Thread t;
    ImplementingThread(){
        t = new Thread(this,"Thread_One");
        System.out.println("Implementing Thread : "+t);
        t.start();
    }
    public void run(){
        try{
            for(int i = 5 ; i > 0 ; i--)
            {
                System.out.println("Implementing thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Implementing interrupted!");
        }
        System.out.println("Exiting to Implementing thread.");
    }
}
