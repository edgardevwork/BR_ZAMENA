package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.T */
/* loaded from: classes5.dex */
public final class C9222T {

    /* renamed from: a */
    public final C9938vm f7269a;

    /* renamed from: b */
    public final List f7270b;

    /* renamed from: c */
    public final String f7271c;

    public C9222T(C9938vm c9938vm, ArrayList arrayList, String str) {
        this.f7269a = c9938vm;
        this.f7270b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f7271c = str;
    }
}
