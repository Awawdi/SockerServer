import java.io.*;
import java.net.*;

public class Multithread extends Thread
{
    Socket clientSocket;
    ServerSocket clientServerSocket;

    Multithread(Socket s,ServerSocket ServerSocket) 
    {
        clientSocket = s;
        clientServerSocket = ServerSocket;
    }

    public void run() 
    {
        try 
        {
            InputStream is = clientSocket.getInputStream();
            DataInputStream Datais = new DataInputStream(is);

            String email = Datais.readUTF();

            System.out.println(email);


            
        } 
        catch (IOException e) 
        {
            System.out.println(e);
        }
        finally
        {
            try 
            { 
                if (clientSocket != null) 
                { 
                clientSocket.close(); 
                }
                System.out.println("Socket stopped"); 
             } 
            catch(IOException e)
             { 
                e.printStackTrace(); 
             } 
        }
    }
}
