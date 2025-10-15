package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.q6 */
/* loaded from: classes7.dex */
public final class C9797q6 {

    /* renamed from: a */
    public final C9352Y9 f8927a;

    /* renamed from: b */
    public final C9647k6 f8928b;

    /* renamed from: c */
    public final Context f8929c;

    /* renamed from: d */
    public final C9328X9 f8930d;

    public C9797q6(Context context) {
        this(context, new C9352Y9(), new C9647k6(), C9328X9.m5742a(context));
    }

    /* renamed from: a */
    public final void m6694a(C9168Qg c9168Qg) {
        boolean zMkdir;
        C9900u9 c9900u9M5743a;
        PrintWriter printWriter;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f8929c);
        this.f8928b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            try {
                if (crashesDirectory.exists()) {
                    if (!crashesDirectory.isDirectory()) {
                        if (!crashesDirectory.delete()) {
                            return;
                        } else {
                            zMkdir = crashesDirectory.mkdir();
                        }
                    }
                    C9213Se c9213Se = c9168Qg.f7165e.f7616a;
                    String str = c9213Se.f7251a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c9213Se.f7251a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                    c9900u9M5743a = this.f8930d.m5743a(str);
                    c9900u9M5743a.f9170a.lock();
                    c9900u9M5743a.f9171b.m5715a();
                    this.f8927a.getClass();
                    printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                    printWriter.write(new C9527fb(c9168Qg.f7161a, c9168Qg.f7165e, c9168Qg.f7164d).m6123k());
                    AbstractC9664kn.m6341a((Closeable) printWriter);
                    c9900u9M5743a.m6854c();
                    return;
                }
                zMkdir = crashesDirectory.mkdir();
                printWriter.write(new C9527fb(c9168Qg.f7161a, c9168Qg.f7165e, c9168Qg.f7164d).m6123k());
                AbstractC9664kn.m6341a((Closeable) printWriter);
                c9900u9M5743a.m6854c();
                return;
            } catch (Throwable unused) {
                AbstractC9664kn.m6341a((Closeable) printWriter);
                c9900u9M5743a.m6854c();
                return;
            }
            c9900u9M5743a.f9170a.lock();
            c9900u9M5743a.f9171b.m5715a();
            this.f8927a.getClass();
            printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
        } catch (Throwable unused2) {
            printWriter = null;
        }
        if (!zMkdir) {
            return;
        }
        C9213Se c9213Se2 = c9168Qg.f7165e.f7616a;
        String str2 = c9213Se2.f7251a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c9213Se2.f7251a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        c9900u9M5743a = this.f8930d.m5743a(str2);
    }

    public C9797q6(Context context, C9352Y9 c9352y9, C9647k6 c9647k6, C9328X9 c9328x9) {
        this.f8929c = context;
        this.f8927a = c9352y9;
        this.f8928b = c9647k6;
        this.f8930d = c9328x9;
    }
}
