package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vm */
/* loaded from: classes7.dex */
public final class C9938vm {

    /* renamed from: a */
    public final String f9236a;

    /* renamed from: b */
    public final int f9237b;

    /* renamed from: c */
    public final long f9238c;

    /* renamed from: d */
    public final String f9239d;

    /* renamed from: e */
    public final Integer f9240e;

    /* renamed from: f */
    public final List f9241f;

    public C9938vm(String str, int i, long j, String str2, Integer num, List list) {
        this.f9236a = str;
        this.f9237b = i;
        this.f9238c = j;
        this.f9239d = str2;
        this.f9240e = num;
        this.f9241f = list == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(list);
    }
}
