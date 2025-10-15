package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.repository.C11491s;
import ru.rustore.sdk.billingclient.impl.data.repository.C11496x;
import ru.rustore.sdk.billingclient.impl.domain.model.C11511h;
import ru.rustore.sdk.billingclient.impl.domain.model.C11513j;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.m */
/* loaded from: classes5.dex */
public final class C11526m {

    /* renamed from: a */
    public final C11496x f10529a;

    /* renamed from: b */
    public final C11491s f10530b;

    public C11526m(C11496x webAuthorizationInfoRepository, C11491s systemTimeRepository) {
        Intrinsics.checkNotNullParameter(webAuthorizationInfoRepository, "webAuthorizationInfoRepository");
        Intrinsics.checkNotNullParameter(systemTimeRepository, "systemTimeRepository");
        this.f10529a = webAuthorizationInfoRepository;
        this.f10530b = systemTimeRepository;
    }

    /* renamed from: a */
    public final C11513j m7471a() {
        this.f10530b.f10321a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C11511h c11511hM7461a = this.f10529a.m7461a();
        C11513j c11513j = c11511hM7461a != null ? c11511hM7461a.f10496a : null;
        if (c11513j == null) {
            return null;
        }
        if (c11513j.f10504c - ((jCurrentTimeMillis - c11513j.f10502a) / 1000) < 60) {
            return null;
        }
        return c11513j;
    }
}
