package rayat;

public class ExtendingThread extends Thread{
    ExtendingThread(){
        super("Java");
        System.out.println("Extending Thread : "+this);
        start();
    }
    public void run(){
        try{
            for(int i = 5 ; i > 0 ; i--)
            {
                System.out.println("Extending thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Extending interrupted!");
        }
        System.out.println("Exiting to Extending thread.");
    }
}
