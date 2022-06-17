package qandun.Hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Hash {
    public static byte[] getSHA(String input) throws Exception {

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(input.getBytes(StandardCharsets.UTF_8));

    }

    public static String getHexString(byte[] bytes) {

        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();

    }

    public static int getFirstByte(byte[] bytes) {

        return (int) bytes[0];

    }
}
