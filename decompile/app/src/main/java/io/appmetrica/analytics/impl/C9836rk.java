package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.rk */
/* loaded from: classes6.dex */
public final class C9836rk implements InterfaceC9813qm {

    /* renamed from: d */
    public static final long f9017d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a */
    public final Context f9018a;

    /* renamed from: b */
    public final PermissionExtractor f9019b;

    /* renamed from: c */
    public final CachedDataProvider.CachedData f9020c;

    public C9836rk(Context context) {
        long j = f9017d;
        this.f9020c = new CachedDataProvider.CachedData(j, j, "sim-info");
        this.f9018a = context;
        this.f9019b = C9676la.m6362h().m6371g();
    }

    /* renamed from: b */
    public final C9711mk m6776b() {
        return new C9711mk((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f9018a, "phone", "getting SimMcc", "TelephonyManager", new C9736nk()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f9018a, "phone", "getting SimMnc", "TelephonyManager", new C9761ok()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f9018a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C9811qk(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f9018a, "phone", "getting SimOperatorName", "TelephonyManager", new C9786pk()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC9813qm
    @Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<C9711mk> mo6719a() {
        List<C9711mk> list;
        try {
            List<C9711mk> list2 = (List) this.f9020c.getData();
            if (list2 != null) {
                boolean zIsEmpty = list2.isEmpty();
                list = list2;
                if (zIsEmpty) {
                    list = list2;
                    if (this.f9020c.shouldUpdateData()) {
                        ArrayList arrayList = new ArrayList();
                        if (C9676la.f8552C.f8575u.m6404a().f8465n.f6314d) {
                            if (AndroidUtils.isApiAchieved(23)) {
                                if (this.f9019b.hasPermission(this.f9018a, "android.permission.READ_PHONE_STATE")) {
                                    arrayList.addAll(C9861sk.m6803a(this.f9018a));
                                }
                                if (arrayList.size() == 0) {
                                    arrayList.add(m6776b());
                                }
                            } else {
                                arrayList.add(m6776b());
                            }
                        }
                        this.f9020c.setData(arrayList);
                        list = arrayList;
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (C9676la.f8552C.f8575u.m6404a().f8465n.f6314d) {
                }
                this.f9020c.setData(arrayList2);
                list = arrayList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
