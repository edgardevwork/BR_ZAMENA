package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.Zc */
/* loaded from: classes6.dex */
public final class C9379Zc {

    /* renamed from: a */
    public final Context f7633a;

    /* renamed from: b */
    public final InterfaceC8970Ia f7634b;

    /* renamed from: c */
    public final C9900u9 f7635c;

    /* renamed from: d */
    public final C9236Td f7636d;

    /* renamed from: e */
    public final C9764on f7637e;

    /* renamed from: f */
    public volatile IdentifiersResult f7638f;

    public C9379Zc(Context context, InterfaceC8970Ia interfaceC8970Ia) {
        this(context, interfaceC8970Ia, AbstractC9404ad.m5854a(context), new C9236Td(context), new C9764on());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult m5808a() {
        IdentifiersResult identifiersResult = this.f7638f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C9764on c9764on = this.f7637e;
            String str = identifiersResult.f9419id;
            c9764on.getClass();
            if (C9764on.m6610a(str)) {
                return identifiersResult;
            }
        }
        try {
            C9900u9 c9900u9 = this.f7635c;
            c9900u9.f9170a.lock();
            c9900u9.f9171b.m5715a();
            identifiersResult = this.f7638f;
            if (identifiersResult == null || identifiersResult.status != IdentifierStatus.OK) {
                String strM5242a = AbstractC8946Ha.m5242a(FileUtils.getFileFromSdkStorage(this.f7636d.f7288a, "uuid.dat"));
                this.f7637e.getClass();
                if (!C9764on.m6610a(strM5242a)) {
                    strM5242a = this.f7636d.m5614a(this.f7634b.mo5266a(this.f7633a));
                }
                this.f7637e.getClass();
                if (C9764on.m6610a(strM5242a)) {
                    IdentifiersResult identifiersResult2 = new IdentifiersResult(strM5242a, IdentifierStatus.OK, null);
                    try {
                        this.f7638f = identifiersResult2;
                    } catch (Throwable unused) {
                    }
                    identifiersResult = identifiersResult2;
                }
            } else {
                C9764on c9764on2 = this.f7637e;
                String str2 = identifiersResult.f9419id;
                c9764on2.getClass();
                if (C9764on.m6610a(str2)) {
                }
            }
        } catch (Throwable unused2) {
        }
        C9900u9 c9900u92 = this.f7635c;
        c9900u92.f9171b.m5716b();
        c9900u92.f9170a.unlock();
        return identifiersResult != null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
    }

    public C9379Zc(Context context, InterfaceC8970Ia interfaceC8970Ia, C9900u9 c9900u9, C9236Td c9236Td, C9764on c9764on) {
        this.f7633a = context;
        this.f7634b = interfaceC8970Ia;
        this.f7635c = c9900u9;
        this.f7636d = c9236Td;
        this.f7637e = c9764on;
        try {
            c9900u9.m6852a();
            c9236Td.m5615a();
            c9900u9.m6853b();
        } catch (Throwable unused) {
            this.f7635c.m6853b();
        }
    }
}
