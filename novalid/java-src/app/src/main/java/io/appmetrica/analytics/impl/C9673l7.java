package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.l7 */
/* loaded from: classes6.dex */
public final class C9673l7 implements Converter {

    /* renamed from: a */
    public final C8949Hd f8544a;

    public C9673l7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9773p7 fromModel(@NotNull C9648k7 c9648k7) {
        C9773p7 c9773p7 = new C9773p7();
        Boolean bool = c9648k7.f8494a;
        if (bool != null) {
            c9773p7.f8875a = this.f8544a.fromModel(bool).intValue();
        }
        Double d = c9648k7.f8496c;
        if (d != null) {
            c9773p7.f8877c = d.doubleValue();
        }
        Double d2 = c9648k7.f8495b;
        if (d2 != null) {
            c9773p7.f8876b = d2.doubleValue();
        }
        Long l = c9648k7.f8501h;
        if (l != null) {
            c9773p7.f8882h = l.longValue();
        }
        Integer num = c9648k7.f8499f;
        if (num != null) {
            c9773p7.f8880f = num.intValue();
        }
        Integer num2 = c9648k7.f8498e;
        if (num2 != null) {
            c9773p7.f8879e = num2.intValue();
        }
        Integer num3 = c9648k7.f8500g;
        if (num3 != null) {
            c9773p7.f8881g = num3.intValue();
        }
        Integer num4 = c9648k7.f8497d;
        if (num4 != null) {
            c9773p7.f8878d = num4.intValue();
        }
        String str = c9648k7.f8502i;
        if (str != null) {
            c9773p7.f8883i = str;
        }
        String str2 = c9648k7.f8503j;
        if (str2 != null) {
            c9773p7.f8884j = str2;
        }
        return c9773p7;
    }

    public C9673l7(@NotNull C8949Hd c8949Hd) {
        this.f8544a = c8949Hd;
    }

    public /* synthetic */ C9673l7(C8949Hd c8949Hd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C8949Hd() : c8949Hd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9648k7 toModel(@Nullable C9773p7 c9773p7) {
        if (c9773p7 == null) {
            return new C9648k7(null, null, null, null, null, null, null, null, null, null);
        }
        C9773p7 c9773p72 = new C9773p7();
        Boolean boolM5246a = this.f8544a.m5246a(c9773p7.f8875a);
        double d = c9773p7.f8877c;
        Double dValueOf = ((d > c9773p72.f8877c ? 1 : (d == c9773p72.f8877c ? 0 : -1)) == 0) ^ true ? Double.valueOf(d) : null;
        double d2 = c9773p7.f8876b;
        Double dValueOf2 = (d2 == c9773p72.f8876b) ^ true ? Double.valueOf(d2) : null;
        long j = c9773p7.f8882h;
        Long lValueOf = j != c9773p72.f8882h ? Long.valueOf(j) : null;
        int i = c9773p7.f8880f;
        Integer numValueOf = i != c9773p72.f8880f ? Integer.valueOf(i) : null;
        int i2 = c9773p7.f8879e;
        Integer numValueOf2 = i2 != c9773p72.f8879e ? Integer.valueOf(i2) : null;
        int i3 = c9773p7.f8881g;
        Integer numValueOf3 = i3 != c9773p72.f8881g ? Integer.valueOf(i3) : null;
        int i4 = c9773p7.f8878d;
        Integer numValueOf4 = Integer.valueOf(i4);
        if (i4 == c9773p72.f8878d) {
            numValueOf4 = null;
        }
        String str = c9773p7.f8883i;
        String str2 = Intrinsics.areEqual(str, c9773p72.f8883i) ^ true ? str : null;
        String str3 = c9773p7.f8884j;
        return new C9648k7(boolM5246a, dValueOf2, dValueOf, numValueOf4, numValueOf2, numValueOf, numValueOf3, lValueOf, str2, Intrinsics.areEqual(str3, c9773p72.f8884j) ^ true ? str3 : null);
    }
}
