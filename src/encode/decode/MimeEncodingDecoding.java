package encode.decode;

import java.util.Base64;

public class MimeEncodingDecoding {
    public static void main(String[] args) {
        Base64.Encoder encoder=Base64.getMimeEncoder();
        String message="Hi \nHow are You";
        String eStr=encoder.encodeToString(message.getBytes());
        System.out.println(eStr);
        Base64.Decoder decoder=Base64.getMimeDecoder();
        String dStr=new String(decoder.decode(eStr));
        System.out.println(dStr);

    }
}
