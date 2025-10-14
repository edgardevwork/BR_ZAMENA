package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: io.appmetrica.analytics.impl.Zl */
/* loaded from: classes5.dex */
public final class C9388Zl extends AbstractC9264Uh {
    public C9388Zl(@NonNull Context context, @NonNull String str) {
        super(context, str, TypedValues.Custom.S_STRING);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9264Uh
    @Nullable
    /* renamed from: a */
    public final Object mo5679a(int i) {
        return this.f7336a.getString(i);
    }

    @Nullable
    /* renamed from: b */
    public final String m5820b(int i) {
        return this.f7336a.getString(i);
    }
}
