import java.io.*;
import java.net.*;

public class Multithread extends Thread {
    Socket clientSocket;

    Multithread(Socket s) {
        clientSocket = s;
    }

    public void run() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            DataInputStream DatainputStream = new DataInputStream(inputStream);

            String email = DatainputStream.readUTF();
            System.out.println(email);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
