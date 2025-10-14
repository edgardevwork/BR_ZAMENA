package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dl */
/* loaded from: classes7.dex */
public final class C9487dl extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a */
    @Nullable
    public final String f7965a;

    /* renamed from: b */
    @Nullable
    public final String f7966b;

    /* renamed from: c */
    @Nullable
    public final Map<String, String> f7967c;

    /* renamed from: d */
    public final boolean f7968d;

    /* renamed from: e */
    @Nullable
    public final List<String> f7969e;

    public C9487dl(@NonNull C9370Z3 c9370z3) {
        this(c9370z3.m5795a().m5563d(), c9370z3.m5795a().m5565e(), c9370z3.m5795a().m5557a(), c9370z3.m5795a().m5569i(), c9370z3.m5795a().m5559b());
    }

    /* renamed from: a */
    public final boolean m6031a(@NonNull C9487dl c9487dl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b */
    public final C9487dl mergeFrom(@NonNull C9487dl c9487dl) {
        return new C9487dl((String) WrapUtils.getOrDefaultNullable(this.f7965a, c9487dl.f7965a), (String) WrapUtils.getOrDefaultNullable(this.f7966b, c9487dl.f7966b), (Map) WrapUtils.getOrDefaultNullable(this.f7967c, c9487dl.f7967c), this.f7968d || c9487dl.f7968d, c9487dl.f7968d ? c9487dl.f7969e : this.f7969e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f7965a + "', installReferrerSource='" + this.f7966b + "', clientClids=" + this.f7967c + ", hasNewCustomHosts=" + this.f7968d + ", newCustomHosts=" + this.f7969e + '}';
    }

    public C9487dl(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, boolean z, @Nullable List<String> list) {
        this.f7965a = str;
        this.f7966b = str2;
        this.f7967c = map;
        this.f7968d = z;
        this.f7969e = list;
    }

    public C9487dl() {
        this(null, null, null, false, null);
    }
}
