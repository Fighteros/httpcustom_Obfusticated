package xyz.easypro.ecrypt.utils;

import java.io.UnsupportedEncodingException;

public class eCrypt {
    static {
        System.loadLibrary(C0000a.m1c("&\u0018ÈüÈ\u0001"));
    }

    /* renamed from: a */
    public static String m10a(String str) {
        byte[] bArr;
        try {
            if (str.length() < 1) {
                bArr = null;
            } else {
                bArr = new byte[(str.length() / 2)];
                for (int i = 0; i < str.length() / 2; i++) {
                    int i2 = i * 2;
                    int i3 = i2 + 1;
                    bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
                }
            }
            return new String(easyCrypt(bArr), C0000a.m1c(",)½"));
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static native byte[] easyCrypt(byte[] bArr);

    public static native byte[] load(byte[] bArr);
}
