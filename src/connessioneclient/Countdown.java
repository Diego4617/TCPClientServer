package connessioneclient;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Countdown extends Thread 
{
    public void run() 
    {
        for(int c=5000; c>0; c-=1000)
        {
            boolean stop = Thread.currentThread().isInterrupted();
            try{
                sleep(1000);
                System.out.println("Countdown: " + c/1000 + " secondi");
                if(stop)
                {
                    break;
                }
            }catch(InterruptedException ex) {
                System.out.println("Errore");
            }
            
        }
    }
}
