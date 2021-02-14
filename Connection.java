import java.net.ServerSocket;
import java.net.Socket;

public class Connection 
{
    public int ServerPortNumber;
    public Socket currentSocket;
    public ServerSocket currentServerSocket;

    public Connection(int ServerPortNumber,Socket currentSocket,ServerSocket currentServerSocket)
    {
        this.ServerPortNumber = ServerPortNumber;
        this.currentSocket = currentSocket;
        this.currentServerSocket = currentServerSocket;
    }
}
