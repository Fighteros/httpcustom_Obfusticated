package xyz.easypro.ecrypt;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import xyz.easypro.ecrypt.utils.C0000a;

public class ProtectedBaseApplication extends Application {

    /* renamed from: b */
    public static final String f0b = ProtectedBaseApplication.class.getSimpleName();

    /* renamed from: c */
    public static ProtectedBaseApplication f1c;

    /* renamed from: a */
    public String f2a = null;

    public static ProtectedBaseApplication getInstance() {
        return f1c;
    }

    /* renamed from: a */
    public final String mo1a() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(getPackageName(), 128)) == null || applicationInfo.metaData == null) {
                return null;
            }
            return applicationInfo.metaData.getString(C0000a.m1c("\u001c>³ÃõÌ*ÈlÛ"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f1c = this;
        try {
            if (new C0000a(this).mo6d(getAssets().open(C0000a.m1c("\u001c>³ÃõÌ[ËuÅ"))) != null) {
                String a = mo1a();
                if (!TextUtils.isEmpty(a)) {
                    this.f2a = a;
                }
            }
        } catch (Exception unused) {
            String a2 = mo1a();
            if (!TextUtils.isEmpty(a2)) {
                this.f2a = a2;
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[ExcHandler: ClassNotFoundException | IllegalArgumentException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:11:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: ClassNotFoundException | IllegalArgumentException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:5:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r13 = this;
            super.onCreate()
            xyz.easypro.ecrypt.utils.C0003d.m8a(r13)
            java.lang.String r0 = r13.f2a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = r13.f2a
            java.lang.String r1 = "\u0018\u0013¥ÈêÑ\u0011}ÛU\u0000(ﾆÉﾍ\u0006\u0012EÑ"
            java.lang.String r1 = xyz.easypro.ecrypt.utils.C0000a.m1c(r1)
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "\u0018\u0013¥ÈêÑ\u0011}ÛU\u0000%ﾊÜﾀ\u0015\u001f¯LîcheûÞ"
            java.lang.String r4 = xyz.easypro.ecrypt.utils.C0000a.m1c(r4)
            r5 = 0
            java.lang.String r6 = "\u001a\b³ÈàÖ\u0001èßLX\rﾝÑﾽ\u000b\u0004¾TÞ"
            java.lang.String r6 = xyz.easypro.ecrypt.utils.C0000a.m1c(r6)
            java.lang.Object r3 = xyz.easypro.ecrypt.utils.C0002c.m7b(r4, r5, r6, r3, r5)
            java.lang.String r6 = "\u0014?®ÏëÜ4ÙlÇLM\u0005ﾝÁﾆ\r"
            java.lang.String r6 = xyz.easypro.ecrypt.utils.C0000a.m1c(r6)
            java.lang.Object r6 = xyz.easypro.ecrypt.utils.C0002c.m6a(r4, r3, r6)
            java.lang.String r7 = "\u0018\u0013¥ÈêÑ\u0011}ÛU\u0000%ﾊÜﾀ\u0015\u001f¯LîcheûÞ\u0017R¤bæ\u0012é\u001béT"
            java.lang.String r7 = xyz.easypro.ecrypt.utils.C0000a.m1c(r7)
            java.lang.String r8 = "\u0010\u0013§Õ"
            java.lang.String r8 = xyz.easypro.ecrypt.utils.C0000a.m1c(r8)
            java.lang.Object r8 = xyz.easypro.ecrypt.utils.C0002c.m6a(r7, r6, r8)
            java.lang.String r9 = "\u0014<±ÊéÑ\u0016ÈhÂJ@"
            java.lang.String r9 = xyz.easypro.ecrypt.utils.C0000a.m1c(r9)
            r10 = 1
            java.lang.Class r11 = java.lang.Class.forName(r1)     // Catch:{  }
            java.lang.reflect.Field r9 = r11.getDeclaredField(r9)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0059, ClassNotFoundException | IllegalArgumentException -> 0x0059, ClassNotFoundException | IllegalArgumentException -> 0x0059 }
            r9.setAccessible(r10)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0059, ClassNotFoundException | IllegalArgumentException -> 0x0059, ClassNotFoundException | IllegalArgumentException -> 0x0059 }
            r9.set(r8, r5)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0059, ClassNotFoundException | IllegalArgumentException -> 0x0059, ClassNotFoundException | IllegalArgumentException -> 0x0059 }
        L_0x0059:
            java.lang.String r9 = "\u00144¯ÓñÑ\u0014Å]ÛUB\rﾊÉﾝ\n\u0019µ"
            java.lang.String r9 = xyz.easypro.ecrypt.utils.C0000a.m1c(r9)
            java.lang.Object r11 = xyz.easypro.ecrypt.utils.C0002c.m6a(r4, r3, r9)
            java.lang.String r12 = "\u0014<­ÖÄÈ\u0005ÅuÈDZ\rﾆÆﾚ"
            java.lang.String r12 = xyz.easypro.ecrypt.utils.C0000a.m1c(r12)
            java.lang.Object r12 = xyz.easypro.ecrypt.utils.C0002c.m6a(r4, r3, r12)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.remove(r11)
            java.lang.String r11 = "\u0014<±ÊéÑ\u0016ÈhÂJ@-ﾇÎﾆ"
            java.lang.String r11 = xyz.easypro.ecrypt.utils.C0000a.m1c(r11)
            java.lang.Object r11 = xyz.easypro.ecrypt.utils.C0002c.m6a(r1, r8, r11)
            android.content.pm.ApplicationInfo r11 = (android.content.pm.ApplicationInfo) r11
            java.lang.String r12 = "\u0018\r±óëÞ\u001a"
            java.lang.String r12 = xyz.easypro.ecrypt.utils.C0000a.m1c(r12)
            java.lang.Object r6 = xyz.easypro.ecrypt.utils.C0002c.m6a(r7, r6, r12)
            android.content.pm.ApplicationInfo r6 = (android.content.pm.ApplicationInfo) r6
            r11.className = r0
            r6.className = r0
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6[r2] = r7
            r6[r10] = r5
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r0[r2] = r5
            java.lang.Class<android.app.Instrumentation> r2 = android.app.Instrumentation.class
            r0[r10] = r2
            java.lang.String r2 = "\u0014\u001cªßÄÈ\u0005ÅuÈDZ\rﾆÆ"
            java.lang.String r2 = xyz.easypro.ecrypt.utils.C0000a.m1c(r2)
            java.lang.Object r0 = xyz.easypro.ecrypt.utils.C0002c.m7b(r1, r8, r2, r6, r0)
            android.app.Application r0 = (android.app.Application) r0
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{  }
            java.lang.reflect.Field r1 = r1.getDeclaredField(r9)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x00bb, ClassNotFoundException | IllegalArgumentException -> 0x00bb, ClassNotFoundException | IllegalArgumentException -> 0x00bb }
            r1.setAccessible(r10)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x00bb, ClassNotFoundException | IllegalArgumentException -> 0x00bb, ClassNotFoundException | IllegalArgumentException -> 0x00bb }
            r1.set(r3, r0)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x00bb, ClassNotFoundException | IllegalArgumentException -> 0x00bb, ClassNotFoundException | IllegalArgumentException -> 0x00bb }
        L_0x00bb:
            if (r0 == 0) goto L_0x00c0
            r0.onCreate()
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xyz.easypro.ecrypt.ProtectedBaseApplication.onCreate():void");
    }
}
