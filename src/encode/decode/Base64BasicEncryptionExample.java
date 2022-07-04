package encode.decode;

import java.util.Base64;

public class Base64BasicEncryptionExample {
        public static void main(String[] args) {
        // Getting encoder
        Base64.Encoder encoder = Base64.getEncoder();
        // Creating byte array
        byte byteArr[] = {1,2};
        // encoding byte array
        byte byteArr2[] = encoder.encode(byteArr);
        System.out.println("Encoded byte array: "+byteArr2);
        byte byteArr3[] = new byte[5];                // Make sure it has enough size to store copied bytes
        int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written
        System.out.println("Encoded byte array written to another array: "+byteArr3);
        System.out.println("Number of bytes written: "+x);

        String str=encoder.encodeToString("Yogesh".getBytes());
                System.out.println("encoded String "+str);
                Base64.Decoder decoder=Base64.getDecoder();
                String dStr=new String(decoder.decode(str));
                System.out.println("Decoded String "+dStr);
        }
        }