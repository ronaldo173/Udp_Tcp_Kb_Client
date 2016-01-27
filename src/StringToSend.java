import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by Alex on 27.01.2016.
 */
public class StringToSend {
    public static byte[] getBufferToSent() throws UnsupportedEncodingException {


        byte[] bytes = new byte[]{37, 0, 0, 0, 3, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 'R', 'E', 'S', 'E', 'T',
                'A', 'L', 'L', 0};
        System.out.println(Arrays.toString(bytes));

        String str = new String(bytes, StandardCharsets.UTF_8);
//        SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();
//        for (Map.Entry<String, Charset> stringCharsetEntry : stringCharsetSortedMap.entrySet()) {
//            System.out.println(stringCharsetEntry.getKey() + "--" + stringCharsetEntry.getValue());
//        }
        bytes=str.getBytes();
        System.out.println(Arrays.toString(bytes));



        return bytes;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        getBufferToSent();
    }
}
/*
     ABuffer[1] :=#$25;
     ABuffer[2] :=#0;
     ABuffer[3] :=#0;
     ABuffer[4] :=#0;
     ABuffer[5] :=#$3;
     ABuffer[6] :=#0;
     ABuffer[7] :=#0;
     ABuffer[8] :=#0;
     ABuffer[9] :=#0;
     ABuffer[10]:=#0;
     ABuffer[11]:=#$1;
     ABuffer[12]:=#0;
     ABuffer[13]:=#0;
     ABuffer[14]:=#0;
     ABuffer[15]:=#0;
     ABuffer[16]:=#0;
     ABuffer[17]:=#0;
     ABuffer[18]:='R';
     ABuffer[19]:='E';
     ABuffer[20]:='S';
     ABuffer[21]:='E';
     ABuffer[22]:='T';
     ABuffer[23]:='A';
     ABuffer[24]:='L';
     ABuffer[25]:='L';
     ABuffer[26]:=#0;
 */