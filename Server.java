import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        
            // create new server socket for emails - listening on port 4000
            ServerSocket ServerSocket = new ServerSocket(4000);

            try {
            

            while (true) {
                System.out.println("server.accept()...");

                //GMAIL thread socket listening to the port on a unique thread                
                Multithread GmailThread = new Multithread(ServerSocket.accept());
                GmailThread.start();

                //WALLA thread socket listening to the port on a unique thread                
                Multithread WallaThread = new Multithread(ServerSocket.accept());
                WallaThread.start();

                //YAHOO thread socket listening to the port on a unique thread                
                Multithread YahooThread = new Multithread(ServerSocket.accept());
                YahooThread.start();

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ServerSocket.close();

            System.out.println("Server closes");
            
        }
    }
}
