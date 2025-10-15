package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11427e;
import ru.rustore.sdk.billingclient.impl.data.repository.C11486n;
import ru.rustore.sdk.billingclient.impl.data.repository.C11488p;
import ru.rustore.sdk.billingclient.impl.data.repository.C11496x;
import ru.rustore.sdk.billingclient.impl.domain.model.C11505b;
import ru.rustore.sdk.billingclient.impl.domain.model.C11506c;
import ru.rustore.sdk.billingclient.impl.domain.model.C11507d;
import ru.rustore.sdk.billingclient.impl.domain.model.C11511h;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.f */
/* loaded from: classes5.dex */
public final class C11519f {

    /* renamed from: a */
    public final C11486n f10514a;

    /* renamed from: b */
    public final C11488p f10515b;

    /* renamed from: c */
    public final C11496x f10516c;

    public C11519f(C11486n ruStoreInstallStatusRepository, C11488p rustoreAuthorizationInfoRepository, C11496x webAuthorizationInfoRepository) {
        Intrinsics.checkNotNullParameter(ruStoreInstallStatusRepository, "ruStoreInstallStatusRepository");
        Intrinsics.checkNotNullParameter(rustoreAuthorizationInfoRepository, "rustoreAuthorizationInfoRepository");
        Intrinsics.checkNotNullParameter(webAuthorizationInfoRepository, "webAuthorizationInfoRepository");
        this.f10514a = ruStoreInstallStatusRepository;
        this.f10515b = rustoreAuthorizationInfoRepository;
        this.f10516c = webAuthorizationInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7469a() {
        C11506c c11506c;
        C11507d c11507d;
        int iM7466a = C11505b.m7466a(this.f10514a.m7456a());
        if (iM7466a == 0) {
            C11427e c11427e = this.f10515b.f10306d;
            synchronized (c11427e) {
                c11506c = c11427e.f10213a;
            }
            if (c11506c != null) {
                c11507d = new C11507d(c11506c.f10487b);
            }
        } else {
            if (iM7466a != 1) {
                throw new NoWhenBranchMatchedException();
            }
            C11511h c11511hM7461a = this.f10516c.m7461a();
            c11507d = c11511hM7461a != null ? new C11507d(c11511hM7461a.f10497b) : null;
        }
        if (c11507d != null) {
            return c11507d.f10489a;
        }
        return false;
    }
}
