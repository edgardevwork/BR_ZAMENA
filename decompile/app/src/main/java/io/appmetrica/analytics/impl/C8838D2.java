package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.D2 */
/* loaded from: classes8.dex */
public final class C8838D2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9320X1 fromModel(@NonNull C8888F2 c8888f2) {
        C9320X1 c9320x1 = new C9320X1();
        EnumC8863E2 enumC8863E2 = c8888f2.f6567a;
        if (enumC8863E2 != null) {
            int iOrdinal = enumC8863E2.ordinal();
            if (iOrdinal == 0) {
                c9320x1.f7434a = 1;
            } else if (iOrdinal == 1) {
                c9320x1.f7434a = 2;
            } else if (iOrdinal == 2) {
                c9320x1.f7434a = 3;
            } else if (iOrdinal == 3) {
                c9320x1.f7434a = 4;
            } else if (iOrdinal == 4) {
                c9320x1.f7434a = 5;
            }
        }
        Boolean bool = c8888f2.f6568b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c9320x1.f7435b = 1;
            } else {
                c9320x1.f7435b = 0;
            }
        }
        return c9320x1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8888F2 toModel(@NonNull C9320X1 c9320x1) {
        EnumC8863E2 enumC8863E2;
        int i = c9320x1.f7434a;
        Boolean bool = null;
        if (i == 1) {
            enumC8863E2 = EnumC8863E2.ACTIVE;
        } else if (i == 2) {
            enumC8863E2 = EnumC8863E2.WORKING_SET;
        } else if (i == 3) {
            enumC8863E2 = EnumC8863E2.FREQUENT;
        } else if (i != 4) {
            enumC8863E2 = i != 5 ? null : EnumC8863E2.RESTRICTED;
        } else {
            enumC8863E2 = EnumC8863E2.RARE;
        }
        int i2 = c9320x1.f7435b;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new C8888F2(enumC8863E2, bool);
    }
}
