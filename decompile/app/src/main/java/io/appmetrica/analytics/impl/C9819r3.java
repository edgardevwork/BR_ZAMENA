package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.r3 */
/* loaded from: classes7.dex */
public final class C9819r3 extends AbstractC9273V2 {
    public C9819r3(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @VisibleForTesting(otherwise = 3)
    /* renamed from: b */
    public final int m6724b() {
        return this.f7349a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9030Km
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] mo5338a(@Nullable byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i = this.f7349a;
        if (length <= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f7351c.warning("\"%s\" %s exceeded limit of %d bytes", this.f7350b, bArr, Integer.valueOf(this.f7349a));
        return bArr2;
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    /* renamed from: a */
    public final String m6722a() {
        return this.f7350b;
    }
}
