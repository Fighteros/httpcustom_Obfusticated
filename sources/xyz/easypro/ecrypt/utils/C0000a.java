package xyz.easypro.ecrypt.utils;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: xyz.easypro.ecrypt.utils.a */
public class C0000a {

    /* renamed from: a */
    public Context f3a = null;

    /* renamed from: b */
    public Class<?> f4b = null;

    /* renamed from: c */
    public WeakReference<?> f5c = null;

    public C0000a(Context context) {
        this.f3a = context;
        try {
            Class<?> cls = Class.forName(m1c("\u0018\u0013¥ÈêÑ\u0011}ÛU\u0000%ﾊÜﾀ\u0015\u001f¯LîcheûÞ"));
            Object invoke = cls.getDeclaredMethod(m1c("\u001a\b³ÈàÖ\u0001èßLX\rﾝÑﾽ\u000b\u0004¾TÞ"), new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField(m1c("\u0014- ÙîÙ\u0012Ìo"));
            declaredField.setAccessible(true);
            this.f5c = (WeakReference) ((Map) declaredField.get(invoke)).get(context.getPackageName());
            this.f4b = Class.forName(m1c("\u0018\u0013¥ÈêÑ\u0011}ÛU\u0000(ﾆÉﾍ\u0006\u0012EÑ"));
        } catch (Exception unused) {
            throw new RuntimeException(m1c("5\u0012 Þ¥Ü\u0010Ñ<ÎKM\u0016ﾐØﾝ\n\u0019µ\u0015ßyhoè"));
        }
    }

    /* renamed from: c */
    public static String m1c(String str) {
        String str2 = str;
        try {
            char[] cArr = {'y', '}', 193, 186, 133, 184, 'u', 169, 28, 171, '%', '.', 'd', 65513, 168, 65513, 'c', 'v', 219, '5', 186, 11, 26, 0, 154, 186, '3', 209, '\"', 212, ' ', 143, '|', 141, 203, 'z', 157, '5', 230, 131, 172, 65510, 27, 2, '{', 'q', 65493, 162, 'K', 6, 'T', 65518, 133, 209, 219, 180, '}', 141, 205, 143, 178, 65516, 221, 160, 25, 65528, 178, '<', 222, 218, 21, 225, 'K', '|', 65521, '}', 'T', 9, 65481, 65514, 181, '9', 175, 65521, '3', 128, 219, 177, 7, 65526, 229, 'L', 214, 65521, 199, 189, 65526, '?', 207, 186, '2', 'W', '~', '6', 203, 170, 192, 4, 169, '~', 65524, '&', 216, 240, 137, 'u', '%', 65491, 65515, '9', 138, '0', 'C', '<', 241, 174, 5, 216, 'L', 218, 23, 'y', 195, 'f', 187, 17, 'p', 'm', 65508, 215, ';', 65529, 'b', 203, 151, 19, 191, 180, 207, 211, 218, 176, 140, 224, 65529, 65534, 65524, 'h', 65456, '>', 241, 239, 'R', 'b', 131, '5', 19, 8, '\'', 'e', 'b', 'S', ',', 208, 224, 152, 26, 0, '%', 'F', 182, 24, 145, '<', 152, 161, '{', 65511, 22, 'b', 231, 11, 65531, 'z', 65515, 183, '+', 200, 2, 157, 162, 'S', 65460, 5, 200, 'a', 150, 'R', '4', 'n', '*', 171, 156, 'H', 157, 65506, 172, 'O', '5', 188, 182, 183, 190, 197, 142, 'Z', 65475, '@', '{', 'M', 221, 162, 'k', '2', ',', 164, 221, 15, ' ', 65519, 158, 18, 190, 198, 144, 65514, 167, '`', 1, 'y', 'w', '>', 8, 'W', 220, 151, '=', 146, 176, 203, 202, 181, 131, 169, 65511};
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) (str2.charAt(i) ^ cArr[i % 265]));
            }
            return sb.toString();
        } catch (Exception unused) {
            try {
                new String(new byte[0], m1c(",)½"));
            } catch (UnsupportedEncodingException unused2) {
            }
            return str2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.ClassLoader mo4a(java.io.InputStream r9, java.lang.String r10, java.lang.ClassLoader r11) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f3a
            java.lang.String r1 = "\u001c>³ÃõÌ*ÆxÎ]"
            java.lang.String r1 = m1c(r1)
            r2 = 0
            java.io.File r0 = r0.getDir(r1, r2)
            java.io.File r1 = new java.io.File
            android.content.Context r3 = r8.f3a
            java.lang.String r4 = "\u001c>³ÃõÌ*ÍyÓ"
            java.lang.String r4 = m1c(r4)
            java.io.File r3 = r3.getDir(r4, r2)
            r1.<init>(r3, r10)
            android.content.Context r10 = r8.f3a
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()
            java.lang.String r10 = r10.nativeLibraryDir
            java.io.File r3 = r1.getParentFile()
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x0039
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L_0x0039
            r3.mkdirs()
        L_0x0039:
            r3 = 0
            boolean r4 = r1.exists()     // Catch:{ FileNotFoundException | IOException -> 0x007f, all -> 0x0077 }
            if (r4 == 0) goto L_0x0043
            r1.delete()     // Catch:{ FileNotFoundException | IOException -> 0x007f, all -> 0x0077 }
        L_0x0043:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x007f, all -> 0x0077 }
            r4.<init>(r1)     // Catch:{ FileNotFoundException | IOException -> 0x007f, all -> 0x0077 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            r3.<init>()     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            r5 = 5242880(0x500000, float:7.34684E-39)
            byte[] r5 = new byte[r5]     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
        L_0x0051:
            int r6 = r9.read(r5)     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            r7 = -1
            if (r6 == r7) goto L_0x005c
            r3.write(r5, r2, r6)     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            goto L_0x0051
        L_0x005c:
            byte[] r3 = r3.toByteArray()     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            byte[] r3 = xyz.easypro.ecrypt.utils.eCrypt.load(r3)     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            int r5 = r3.length     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            r4.write(r3, r2, r5)     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            r4.flush()     // Catch:{ FileNotFoundException | IOException -> 0x0075, all -> 0x0072 }
            xyz.easypro.ecrypt.utils.C0001b.m5a(r9)
            xyz.easypro.ecrypt.utils.C0001b.m5a(r4)
            goto L_0x0085
        L_0x0072:
            r10 = move-exception
            r3 = r4
            goto L_0x0078
        L_0x0075:
            r3 = r4
            goto L_0x007f
        L_0x0077:
            r10 = move-exception
        L_0x0078:
            xyz.easypro.ecrypt.utils.C0001b.m5a(r9)
            xyz.easypro.ecrypt.utils.C0001b.m5a(r3)
            throw r10
        L_0x007f:
            xyz.easypro.ecrypt.utils.C0001b.m5a(r9)
            xyz.easypro.ecrypt.utils.C0001b.m5a(r3)
        L_0x0085:
            r1.exists()
            if (r11 == 0) goto L_0x0098
            dalvik.system.DexClassLoader r9 = new dalvik.system.DexClassLoader
            java.lang.String r2 = r1.getAbsolutePath()
            java.lang.String r3 = r0.getAbsolutePath()
            r9.<init>(r2, r3, r10, r11)
            goto L_0x00ab
        L_0x0098:
            dalvik.system.DexClassLoader r9 = new dalvik.system.DexClassLoader
            java.lang.String r11 = r1.getAbsolutePath()
            java.lang.String r2 = r0.getAbsolutePath()
            android.content.Context r3 = r8.f3a
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r9.<init>(r11, r2, r10, r3)
        L_0x00ab:
            java.io.File r10 = r0.getAbsoluteFile()
            r8.mo5b(r10)
            java.io.File r10 = r1.getParentFile()
            r8.mo5b(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xyz.easypro.ecrypt.utils.C0000a.mo4a(java.io.InputStream, java.lang.String, java.lang.ClassLoader):java.lang.ClassLoader");
    }

    /* renamed from: b */
    public final void mo5b(File file) {
        for (File delete : file.listFiles()) {
            delete.delete();
        }
        file.delete();
    }

    /* renamed from: d */
    public ClassLoader mo6d(InputStream inputStream) {
        ClassLoader classLoader;
        String c = m1c("\u0014>­ÛöË9Æ}Ï@\\");
        try {
            Field declaredField = this.f4b.getDeclaredField(c);
            declaredField.setAccessible(true);
            classLoader = (ClassLoader) declaredField.get(this.f5c.get());
        } catch (Exception unused) {
            classLoader = null;
        }
        try {
            ClassLoader a = mo4a(inputStream, m1c("\u001a\u0011 ÉöÝ\u0006xÎ]"), classLoader);
            try {
                Field declaredField2 = this.f4b.getDeclaredField(c);
                declaredField2.setAccessible(true);
                declaredField2.set(this.f5c.get(), a);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused2) {
            }
            return a;
        } catch (Exception unused3) {
            return null;
        }
    }
}
