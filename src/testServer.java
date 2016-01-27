import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;

/**
 * Created by Alex on 27.01.2016.
 */
public class testServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        byte[] rec = new byte[50];
        byte[] send = new byte[50];

        while (true){
            String forSent = "sendUtp";
            send = forSent.getBytes();

           DatagramPacket packet = new DatagramPacket(send, send.length, InetAddress.getByName("127.0.0.1"), 7778);
            datagramSocket.send(packet);

            DatagramPacket recievePack = new DatagramPacket(rec, rec.length);
            datagramSocket.receive(recievePack);
            System.out.println(Arrays.toString(recievePack.getData()));

            System.out.println(datagramSocket.isConnected());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
