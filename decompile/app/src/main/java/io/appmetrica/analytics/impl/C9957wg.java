package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.wg */
/* loaded from: classes5.dex */
public final class C9957wg extends AbstractC9632jg {

    /* renamed from: b */
    public final C9141Pd f9264b;

    /* renamed from: c */
    public final ProtobufStateStorage f9265c;

    /* renamed from: d */
    public final C8913G2 f9266d;

    /* renamed from: e */
    public final C9493e2 f9267e;

    /* renamed from: f */
    public final C10018z2 f9268f;

    public C9957wg(C9571h5 c9571h5, C9141Pd c9141Pd) {
        this(c9571h5, c9141Pd, C9268Ul.m5684a(C9272V1.class).m5697a(c9571h5.getContext()), new C8913G2(c9571h5.getContext()), new C9493e2(), new C10018z2(c9571h5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        C9571h5 c9571h5 = this.f8444a;
        c9571h5.f8229b.toString();
        if (!c9571h5.f8249v.m6945c() || !c9571h5.m6227x()) {
            return false;
        }
        C9272V1 c9272v1 = (C9272V1) this.f9265c.read();
        List list = c9272v1.f7346a;
        C8888F2 c8888f2 = c9272v1.f7347b;
        C8913G2 c8913g2 = this.f9266d;
        c8913g2.getClass();
        C9272V1 c9272v12 = null;
        C8888F2 c8888f2M5015a = AndroidUtils.isApiAchieved(28) ? C8813C2.m5015a(c8913g2.f6652a, c8913g2.f6653b) : null;
        List list2 = c9272v1.f7348c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f9268f.f9382a, "getting available providers", "location manager", Collections.emptyList(), new C9993y2());
        C9141Pd c9141Pd = this.f9264b;
        Context context = this.f8444a.f8228a;
        c9141Pd.getClass();
        ArrayList arrayListM6258a = new C9584hi(context, new SafePackageManager()).m6258a();
        if (CollectionUtils.areCollectionsEqual(arrayListM6258a, list)) {
            arrayListM6258a = null;
        }
        if (arrayListM6258a != null || !AbstractC9664kn.m6343a(c8888f2, c8888f2M5015a) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListM6258a != null) {
                list = arrayListM6258a;
            }
            c9272v12 = new C9272V1(list, c8888f2M5015a, list3);
        }
        if (c9272v12 != null) {
            C9625j9 c9625j9 = c9571h5.f8242o;
            C9252U5 c9252u5M5637a = C9252U5.m5637a(c9252u5, c9272v12.f7346a, c9272v12.f7347b, this.f9267e, c9272v12.f7348c);
            c9625j9.m6308a(c9252u5M5637a, C9338Xj.m5752a(c9625j9.f8421c.m5756b(c9252u5M5637a), c9252u5M5637a.f7317i));
            long jCurrentTimeSeconds = c9625j9.f8428j.currentTimeSeconds();
            c9625j9.f8430l = jCurrentTimeSeconds;
            c9625j9.f8419a.m6593a(jCurrentTimeSeconds).m6648b();
            this.f9265c.save(c9272v12);
            return false;
        }
        if (!c9571h5.m6203A()) {
            return false;
        }
        C9625j9 c9625j92 = c9571h5.f8242o;
        C9252U5 c9252u5M5637a2 = C9252U5.m5637a(c9252u5, c9272v1.f7346a, c9272v1.f7347b, this.f9267e, c9272v1.f7348c);
        c9625j92.m6308a(c9252u5M5637a2, C9338Xj.m5752a(c9625j92.f8421c.m5756b(c9252u5M5637a2), c9252u5M5637a2.f7317i));
        long jCurrentTimeSeconds2 = c9625j92.f8428j.currentTimeSeconds();
        c9625j92.f8430l = jCurrentTimeSeconds2;
        c9625j92.f8419a.m6593a(jCurrentTimeSeconds2).m6648b();
        return false;
    }

    public C9957wg(C9571h5 c9571h5, C9141Pd c9141Pd, ProtobufStateStorage protobufStateStorage, C8913G2 c8913g2, C9493e2 c9493e2, C10018z2 c10018z2) {
        super(c9571h5);
        this.f9264b = c9141Pd;
        this.f9265c = protobufStateStorage;
        this.f9266d = c8913g2;
        this.f9267e = c9493e2;
        this.f9268f = c10018z2;
    }
}
