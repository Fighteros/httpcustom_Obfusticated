package xyz.easypro.ecrypt.utils;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: xyz.easypro.ecrypt.utils.b */
public class C0001b {
    /* renamed from: a */
    public static final void m5a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
