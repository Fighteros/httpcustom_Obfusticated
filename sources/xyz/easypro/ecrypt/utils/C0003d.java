package xyz.easypro.ecrypt.utils;

/* renamed from: xyz.easypro.ecrypt.utils.d */
public class C0003d {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f A[Catch:{ Exception -> 0x0063 }, LOOP:0: B:9:0x0038->B:11:0x003f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056 A[Catch:{ Exception -> 0x0063 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057 A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[EDGE_INSN: B:20:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8a(android.content.Context r6) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch:{ Exception -> 0x001f }
            java.lang.String r2 = r6.getPackageName()     // Catch:{ Exception -> 0x001f }
            r3 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ Exception -> 0x001f }
            android.content.pm.Signature[] r1 = r1.signatures     // Catch:{ Exception -> 0x001f }
            int r2 = r1.length     // Catch:{ Exception -> 0x001f }
            if (r2 <= 0) goto L_0x001f
            r1 = r1[r0]     // Catch:{ Exception -> 0x001f }
            byte[] r1 = r1.toByteArray()     // Catch:{ Exception -> 0x001f }
            java.lang.String r1 = m9b(r1)     // Catch:{ Exception -> 0x001f }
            goto L_0x0021
        L_0x001f:
            java.lang.String r1 = ""
        L_0x0021:
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = "\u001c>³ÃõÌ&À{Å\u000bL\rﾇ"
            java.lang.String r2 = xyz.easypro.ecrypt.utils.C0000a.m1c(r2)     // Catch:{ Exception -> 0x0063 }
            java.io.InputStream r6 = r6.open(r2)     // Catch:{ Exception -> 0x0063 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0063 }
            r2.<init>()     // Catch:{ Exception -> 0x0063 }
            r3 = 10240(0x2800, float:1.4349E-41)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0063 }
        L_0x0038:
            int r4 = r6.read(r3)     // Catch:{ Exception -> 0x0063 }
            r5 = -1
            if (r4 == r5) goto L_0x0043
            r2.write(r3, r0, r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0038
        L_0x0043:
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0063 }
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x0063 }
            byte[] r0 = xyz.easypro.ecrypt.utils.eCrypt.load(r0)     // Catch:{ Exception -> 0x0063 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0063 }
            boolean r6 = r1.equals(r6)     // Catch:{ Exception -> 0x0063 }
            if (r6 == 0) goto L_0x0057
            return
        L_0x0057:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0063 }
            java.lang.String r0 = "*\u0014¦ÔäÌ\u0000ÛyAA\u0001ﾚﾇ\f\u0002ûXÛyh"
            java.lang.String r0 = xyz.easypro.ecrypt.utils.C0000a.m1c(r0)     // Catch:{ Exception -> 0x0063 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0063 }
            throw r6     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "*\u0014¦ÔäÌ\u0000Ûy@\\\u0016ﾆÚ"
            java.lang.String r0 = xyz.easypro.ecrypt.utils.C0000a.m1c(r0)
            r6.<init>(r0)
            goto L_0x0070
        L_0x006f:
            throw r6
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: xyz.easypro.ecrypt.utils.C0003d.m8a(android.content.Context):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        java.lang.System.exit(0);
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9b(byte[] r3) {
        /*
            java.lang.String r0 = "!Sô¼"
            java.lang.String r0 = xyz.easypro.ecrypt.utils.C0000a.m1c(r0)     // Catch:{ Exception -> 0x0045 }
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ Exception -> 0x0045 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0045 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0045 }
            java.security.cert.Certificate r3 = r0.generateCertificate(r1)     // Catch:{ Exception -> 0x0045 }
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ Exception -> 0x0045 }
            byte[] r3 = r3.getEncoded()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "4\u0019ô"
            java.lang.String r0 = xyz.easypro.ecrypt.utils.C0000a.m1c(r0)     // Catch:{ Exception -> 0x0045 }
            r1 = 0
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            java.lang.System.exit(r1)     // Catch:{ Exception -> 0x0045 }
            r0 = 0
        L_0x0029:
            r0.update(r3)     // Catch:{ Exception -> 0x0045 }
            byte[] r3 = r0.digest()     // Catch:{ Exception -> 0x0045 }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ Exception -> 0x0045 }
            r2 = 1
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0045 }
            r3[r1] = r0     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "\\Mòý"
            java.lang.String r0 = xyz.easypro.ecrypt.utils.C0000a.m1c(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = java.lang.String.format(r0, r3)     // Catch:{ Exception -> 0x0045 }
            return r3
        L_0x0045:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xyz.easypro.ecrypt.utils.C0003d.m9b(byte[]):java.lang.String");
    }
}
