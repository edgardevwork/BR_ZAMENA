package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Id */
/* loaded from: classes8.dex */
public abstract class AbstractC8973Id {

    /* renamed from: a */
    public final int f6777a = -1;

    /* renamed from: b */
    public final int f6778b = 0;

    /* renamed from: c */
    public final int f6779c = 1;

    /* renamed from: a */
    public final int m5268a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.f6777a;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return this.f6778b;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return this.f6779c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m5269a(int i) {
        if (i == this.f6778b) {
            return Boolean.FALSE;
        }
        if (i == this.f6779c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
