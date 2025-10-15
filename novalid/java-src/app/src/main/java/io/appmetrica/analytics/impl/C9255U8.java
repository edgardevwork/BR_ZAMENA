package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.U8 */
/* loaded from: classes5.dex */
public final class C9255U8 extends AbstractC9279V8 {

    /* renamed from: a */
    public final List f7325a;

    public C9255U8(List<Object> list) {
        this.f7325a = CollectionUtils.unmodifiableListCopy(list);
    }

    /* renamed from: a */
    public final List<Object> m5669a() {
        return this.f7325a;
    }
}
