package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.d7 */
/* loaded from: classes7.dex */
public final class C9473d7 implements ProtobufConverter {

    /* renamed from: a */
    public final C8949Hd f7898a;

    /* renamed from: b */
    public final C9673l7 f7899b;

    public C9473d7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9748o7 fromModel(@NotNull C9523f7 c9523f7) {
        C9748o7 c9748o7 = new C9748o7();
        Integer num = c9523f7.f8065a;
        if (num != null) {
            c9748o7.f8806a = num.intValue();
        }
        String str = c9523f7.f8066b;
        if (str != null) {
            c9748o7.f8807b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c9523f7.f8067c;
        if (str2 != null) {
            c9748o7.f8808c = StringUtils.correctIllFormedString(str2);
        }
        Long l = c9523f7.f8068d;
        if (l != null) {
            c9748o7.f8809d = l.longValue();
        }
        C9648k7 c9648k7 = c9523f7.f8069e;
        if (c9648k7 != null) {
            c9748o7.f8810e = this.f7899b.fromModel(c9648k7);
        }
        String str3 = c9523f7.f8070f;
        if (str3 != null) {
            c9748o7.f8811f = str3;
        }
        String str4 = c9523f7.f8071g;
        if (str4 != null) {
            c9748o7.f8812g = str4;
        }
        Long l2 = c9523f7.f8072h;
        if (l2 != null) {
            c9748o7.f8813h = l2.longValue();
        }
        Integer num2 = c9523f7.f8073i;
        if (num2 != null) {
            c9748o7.f8814i = num2.intValue();
        }
        Integer num3 = c9523f7.f8074j;
        if (num3 != null) {
            c9748o7.f8815j = num3.intValue();
        }
        String str5 = c9523f7.f8075k;
        if (str5 != null) {
            c9748o7.f8816k = str5;
        }
        EnumC8894F8 enumC8894F8 = c9523f7.f8076l;
        if (enumC8894F8 != null) {
            c9748o7.f8817l = enumC8894F8.f6578a;
        }
        String str6 = c9523f7.f8077m;
        if (str6 != null) {
            c9748o7.f8818m = str6;
        }
        EnumC9426ba enumC9426ba = c9523f7.f8078n;
        if (enumC9426ba != null) {
            c9748o7.f8819n = enumC9426ba.f7782a;
        }
        EnumC9675l9 enumC9675l9 = c9523f7.f8079o;
        if (enumC9675l9 != null) {
            c9748o7.f8820o = enumC9675l9.f8551a;
        }
        Boolean bool = c9523f7.f8080p;
        if (bool != null) {
            c9748o7.f8821p = this.f7898a.fromModel(bool).intValue();
        }
        Integer num4 = c9523f7.f8081q;
        if (num4 != null) {
            c9748o7.f8822q = num4.intValue();
        }
        byte[] bArr = c9523f7.f8082r;
        if (bArr != null) {
            c9748o7.f8823r = bArr;
        }
        return c9748o7;
    }

    public C9473d7(@NotNull C8949Hd c8949Hd, @NotNull C9673l7 c9673l7) {
        this.f7898a = c8949Hd;
        this.f7899b = c9673l7;
    }

    public /* synthetic */ C9473d7(C8949Hd c8949Hd, C9673l7 c9673l7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C8949Hd() : c8949Hd, (i & 2) != 0 ? new C9673l7(null, 1, null) : c9673l7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9523f7 toModel(@NotNull C9748o7 c9748o7) {
        EnumC9675l9 enumC9675l9;
        C9748o7 c9748o72 = new C9748o7();
        int i = c9748o7.f8806a;
        Integer numValueOf = i != c9748o72.f8806a ? Integer.valueOf(i) : null;
        String str = c9748o7.f8807b;
        String str2 = Intrinsics.areEqual(str, c9748o72.f8807b) ^ true ? str : null;
        String str3 = c9748o7.f8808c;
        String str4 = Intrinsics.areEqual(str3, c9748o72.f8808c) ^ true ? str3 : null;
        long j = c9748o7.f8809d;
        Long lValueOf = j != c9748o72.f8809d ? Long.valueOf(j) : null;
        C9648k7 model = this.f7899b.toModel(c9748o7.f8810e);
        String str5 = c9748o7.f8811f;
        String str6 = Intrinsics.areEqual(str5, c9748o72.f8811f) ^ true ? str5 : null;
        String str7 = c9748o7.f8812g;
        String str8 = Intrinsics.areEqual(str7, c9748o72.f8812g) ^ true ? str7 : null;
        long j2 = c9748o7.f8813h;
        Long lValueOf2 = Long.valueOf(j2);
        if (j2 == c9748o72.f8813h) {
            lValueOf2 = null;
        }
        int i2 = c9748o7.f8814i;
        Integer numValueOf2 = i2 != c9748o72.f8814i ? Integer.valueOf(i2) : null;
        int i3 = c9748o7.f8815j;
        Integer numValueOf3 = i3 != c9748o72.f8815j ? Integer.valueOf(i3) : null;
        String str9 = c9748o7.f8816k;
        String str10 = Intrinsics.areEqual(str9, c9748o72.f8816k) ^ true ? str9 : null;
        int i4 = c9748o7.f8817l;
        Integer numValueOf4 = Integer.valueOf(i4);
        if (i4 == c9748o72.f8817l) {
            numValueOf4 = null;
        }
        EnumC8894F8 enumC8894F8M5128a = numValueOf4 != null ? EnumC8894F8.m5128a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = c9748o7.f8818m;
        String str12 = Intrinsics.areEqual(str11, c9748o72.f8818m) ^ true ? str11 : null;
        int i5 = c9748o7.f8819n;
        Integer numValueOf5 = Integer.valueOf(i5);
        if (i5 == c9748o72.f8819n) {
            numValueOf5 = null;
        }
        EnumC9426ba enumC9426baM5911a = numValueOf5 != null ? EnumC9426ba.m5911a(Integer.valueOf(numValueOf5.intValue())) : null;
        int i6 = c9748o7.f8820o;
        Integer numValueOf6 = Integer.valueOf(i6);
        if (i6 == c9748o72.f8820o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            EnumC9675l9[] enumC9675l9ArrValues = EnumC9675l9.values();
            int length = enumC9675l9ArrValues.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    EnumC9675l9 enumC9675l92 = enumC9675l9ArrValues[i7];
                    EnumC9675l9[] enumC9675l9Arr = enumC9675l9ArrValues;
                    if (enumC9675l92.f8551a == iIntValue) {
                        enumC9675l9 = enumC9675l92;
                        break;
                    }
                    i7++;
                    enumC9675l9ArrValues = enumC9675l9Arr;
                } else {
                    enumC9675l9 = EnumC9675l9.NATIVE;
                    break;
                }
            }
        } else {
            enumC9675l9 = null;
        }
        Boolean boolM5246a = this.f7898a.m5246a(c9748o7.f8821p);
        int i8 = c9748o7.f8822q;
        Integer numValueOf7 = i8 != c9748o72.f8822q ? Integer.valueOf(i8) : null;
        byte[] bArr = c9748o7.f8823r;
        return new C9523f7(numValueOf, str2, str4, lValueOf, model, str6, str8, lValueOf2, numValueOf2, numValueOf3, str10, enumC8894F8M5128a, str12, enumC9426baM5911a, enumC9675l9, boolM5246a, numValueOf7, Arrays.equals(bArr, c9748o72.f8823r) ^ true ? bArr : null);
    }
}
