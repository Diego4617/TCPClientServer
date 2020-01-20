package connessioneclient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Server1 {

    public static void main(String[] args) 
    {
        ServerSocket serverSocket = null;
        Socket connection;
        Countdown count = new Countdown();
        try {
            serverSocket = new ServerSocket(2000);
            System.out.println("In attesa di connessioni");
            serverSocket.setSoTimeout(5000);
            count.start();
            Socket socket = serverSocket.accept();
            System.out.println("Connessione stabilita");
            System.out.println("Server socket: " + socket.getLocalSocketAddress());
            System.out.println("Client socket: " + socket.getRemoteSocketAddress());
        
        } catch (IOException ex) {
            System.out.println("Errore di input/output");
        }
        
        
        try {
            serverSocket.close();
            
        } catch (IOException ex) {
            System.out.println("Errore nella chiusura della connessione");
        }
        System.out.println("Connessione chiusa");
        count.interrupt();
    }
    
}