import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Alex on 27.01.2016.
 */
public class testServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
//        serverSocket.accept();


        while (true){
//            System.out.println(1);
//            Socket socket = serverSocket.accept();
//            System.out.println(2);
//
//            OutputStream os = socket.getOutputStream();
//            os.write(1111);
            InetAddress inetAddress = serverSocket.getInetAddress();
            System.out.println(inetAddress);
        }
    }
}
