import javax.xml.bind.DatatypeConverter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alex on 27.01.2016.
 */
public class Tcp_client {
    public void getStringFromTcp(int port) throws IOException {
        Socket socket = new Socket(
                InetAddress.getByName("0.0.0.0"), 6666);

        byte[] buffer = StringToSend.getBufferToSent();
        System.out.println(Arrays.toString(buffer));

        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        outputStream.write(buffer);
//        outputStream.flush();

        InputStream inputStream = socket.getInputStream();
        System.out.println(inputStream.available());

        byte getBuf[] = new byte[256];
        inputStream.read(getBuf);
        System.out.println(Arrays.toString(getBuf));
        socket.close();

    }

    public static byte[] toByteArray(String s) {
        return DatatypeConverter.parseHexBinary(s);
    }


    public static void main(String[] args) throws IOException {
       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   new Tcp_client().getStringFromTcp(6666);
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }).start();
    }
}
