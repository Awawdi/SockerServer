import java.net.*;
import java.io.*;

public class Server 
{
	public static void main(String args[]) throws IOException
	{
        ServerSocket GServerSocket = new ServerSocket(4000);
        Socket Gsocket = null;

        ServerSocket WServerSocket = new ServerSocket(3000);
        Socket Wsocket = null;

        ServerSocket YServerSocket = new ServerSocket(2000);
        Socket YSocket = null;

        Multithread GmailThread= new Multithread(Gsocket,GServerSocket);
        Multithread WallaThread= new Multithread(Wsocket,WServerSocket);
        Multithread YahooThread= new Multithread(YSocket,YServerSocket);

        while(true)
        {
            System.out.println("server.accept()...");

            WallaThread.clientSocket = WallaThread.clientServerSocket.accept();
            WallaThread.start();

            YahooThread.clientSocket = YahooThread.clientServerSocket.accept();
            YahooThread.start();

        }
    }
}
    