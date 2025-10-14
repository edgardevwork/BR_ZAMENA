package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.r7 */
/* loaded from: classes7.dex */
public final class C9823r7 implements ProtobufConverter {

    /* renamed from: a */
    public final C8949Hd f8984a;

    public C9823r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9798q7 fromModel(@NotNull C9873t7 c9873t7) {
        C9798q7 c9798q7 = new C9798q7();
        Long l = c9873t7.f9087a;
        if (l != null) {
            c9798q7.f8932a = l.longValue();
        }
        Long l2 = c9873t7.f9088b;
        if (l2 != null) {
            c9798q7.f8933b = l2.longValue();
        }
        Boolean bool = c9873t7.f9089c;
        if (bool != null) {
            c9798q7.f8934c = this.f8984a.fromModel(bool).intValue();
        }
        return c9798q7;
    }

    public C9823r7(@NotNull C8949Hd c8949Hd) {
        this.f8984a = c8949Hd;
    }

    public /* synthetic */ C9823r7(C8949Hd c8949Hd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C8949Hd() : c8949Hd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9873t7 toModel(@NotNull C9798q7 c9798q7) {
        C9798q7 c9798q72 = new C9798q7();
        long j = c9798q7.f8932a;
        Long lValueOf = Long.valueOf(j);
        if (j == c9798q72.f8932a) {
            lValueOf = null;
        }
        long j2 = c9798q7.f8933b;
        return new C9873t7(lValueOf, j2 != c9798q72.f8933b ? Long.valueOf(j2) : null, this.f8984a.m5246a(c9798q7.f8934c));
    }
}
