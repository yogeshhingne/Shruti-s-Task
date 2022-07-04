package encode.decode;

import java.util.Base64;

public class UrlEncryptionDecryption {
    public static void main(String[] args) {
        Base64.Encoder encoder=Base64.getUrlEncoder();
        String str= encoder.encodeToString("localhost:8080/upload-file".getBytes());
        System.out.println(str);
        Base64.Decoder decoder=Base64.getUrlDecoder();
        String dstr=new String(decoder.decode(str));
        System.out.println(dstr);
    }
}
