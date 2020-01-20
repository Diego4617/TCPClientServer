package connessioneclient;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
* @author Diego 
*/
public class Client {

    public static void main(String[] args) 
    {
        Socket socket = null;
        try {
            socket = new Socket("localhost",2000);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
