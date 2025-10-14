package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.He */
/* loaded from: classes7.dex */
public final class C8950He implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@NonNull EnumC9159Q7 enumC9159Q7) {
        int iOrdinal = enumC9159Q7.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC9159Q7 toModel(@NonNull Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return EnumC9159Q7.f7146c;
        }
        if (iIntValue == 2) {
            return EnumC9159Q7.f7148e;
        }
        if (iIntValue != 3) {
            return EnumC9159Q7.f7145b;
        }
        return EnumC9159Q7.f7147d;
    }
}
