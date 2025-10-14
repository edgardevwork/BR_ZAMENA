package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.o3 */
/* loaded from: classes6.dex */
public final class C9744o3 extends AbstractC9264Uh {
    public C9744o3(@NonNull Context context, @NonNull String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9264Uh
    @Nullable
    /* renamed from: a */
    public final Object mo5679a(int i) {
        return Boolean.valueOf(this.f7336a.getResources().getBoolean(i));
    }

    @Nullable
    /* renamed from: b */
    public final Boolean m6568b(int i) {
        return Boolean.valueOf(this.f7336a.getResources().getBoolean(i));
    }
}
