package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Uh */
/* loaded from: classes5.dex */
public abstract class AbstractC9264Uh {

    /* renamed from: a */
    @NonNull
    protected final Context f7336a;

    /* renamed from: b */
    public final String f7337b;

    /* renamed from: c */
    public final String f7338c;

    public AbstractC9264Uh(Context context, String str, String str2) {
        this.f7336a = context;
        this.f7337b = str;
        this.f7338c = str2;
    }

    @Nullable
    /* renamed from: a */
    public final Object m5678a() {
        int identifier = this.f7336a.getResources().getIdentifier(this.f7337b, this.f7338c, this.f7336a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return mo5679a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public abstract Object mo5679a(int i);
}
