package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.Wg */
/* loaded from: classes7.dex */
public final class C9311Wg extends AbstractC9722n6 {

    /* renamed from: d */
    public final AbstractC9293Vm f7411d;

    public C9311Wg(@NonNull Context context, @NonNull AbstractC9293Vm abstractC9293Vm, @NonNull InterfaceC9697m6 interfaceC9697m6, @Nullable ICrashTransformer iCrashTransformer) {
        this(abstractC9293Vm, interfaceC9697m6, iCrashTransformer, new C9017K9(context));
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: c */
    public final AbstractC9293Vm m5719c() {
        return this.f7411d;
    }

    public C9311Wg(AbstractC9293Vm abstractC9293Vm, InterfaceC9697m6 interfaceC9697m6, ICrashTransformer iCrashTransformer, C9017K9 c9017k9) {
        super(interfaceC9697m6, iCrashTransformer, c9017k9);
        this.f7411d = abstractC9293Vm;
    }
}
