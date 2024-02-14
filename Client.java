import java.net.*;
import java.io.*;

public class Client{
public static void main(String[] args) throws IOException {
    String hostName = "localhost"; //indirizzo del server
    int port = 12345; //Porta del server

    try (Socket socket = new Socket(hostName, port);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())))
        {
            String fromServer;
            while ((fromSever = in.readLine()) != null )
            {
                System.out.println("Server: " + fromServer);
                break; //Uscire dal loop dopo aver ricevuto il messaggio
            }
        }
}
}