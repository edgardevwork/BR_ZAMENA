package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.tm */
/* loaded from: classes5.dex */
public final class C9888tm implements TempCacheStorage.Entry {

    /* renamed from: a */
    public final long f9135a;

    /* renamed from: b */
    public final String f9136b;

    /* renamed from: c */
    public final long f9137c;

    /* renamed from: d */
    public final byte[] f9138d;

    public C9888tm(long j, @NotNull String str, long j2, @NotNull byte[] bArr) {
        this.f9135a = j;
        this.f9136b = str;
        this.f9137c = j2;
        this.f9138d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C9888tm.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C9888tm c9888tm = (C9888tm) obj;
        if (this.f9135a == c9888tm.f9135a && Intrinsics.areEqual(this.f9136b, c9888tm.f9136b) && this.f9137c == c9888tm.f9137c) {
            return Arrays.equals(this.f9138d, c9888tm.f9138d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.f9138d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f9135a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.f9136b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f9137c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9138d) + ((Long.hashCode(this.f9137c) + ((this.f9136b.hashCode() + (Long.hashCode(this.f9135a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TempCacheEntry(id=" + this.f9135a + ", scope='" + this.f9136b + "', timestamp=" + this.f9137c + ", data=array[" + this.f9138d.length + "])";
    }
}
