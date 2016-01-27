import java.io.IOException;
import java.lang.reflect.Array;
import java.net.*;
import java.util.Arrays;

/**
 * Created by Alex on 27.01.2016.
 */
public class Udp_Client {
    public  void  getStringFromUdp(int port) throws IOException {
        DatagramSocket socket = new DatagramSocket(port);
        InetAddress inetAddress = InetAddress.getByName("0.0.0.0");

            byte[] buf = new byte[25];
            DatagramPacket packet = new DatagramPacket(buf, buf.length,
                    inetAddress, port);
            socket.receive(packet);

            System.out.println(packet.getData());
            System.out.println(Arrays.toString(buf));
            String string = new String(buf);
            System.out.println(string);
            System.out.println(packet.getSocketAddress());

        ///...
        byte[] bufSent = StringToSend.getBufferToSent();
        DatagramPacket datagramPacket= new DatagramPacket(buf, buf.length,
                packet.getSocketAddress());
        socket.send(datagramPacket);
        System.out.println("sended");

        socket.close();
    }

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new Udp_Client().getStringFromUdp(7777);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
