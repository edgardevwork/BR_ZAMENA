package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Hd */
/* loaded from: classes7.dex */
public final class C8949Hd implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@Nullable Boolean bool) {
        int i;
        if (bool == null) {
            i = -1;
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            i = 1;
        } else {
            if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return m5246a(((Number) obj).intValue());
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m5246a(int i) {
        if (i != -1) {
            if (i == 0) {
                return Boolean.FALSE;
            }
            if (i == 1) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
