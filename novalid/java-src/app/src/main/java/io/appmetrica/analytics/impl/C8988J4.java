package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.J4 */
/* loaded from: classes6.dex */
public final class C8988J4 implements InterfaceC9895u4 {

    /* renamed from: a */
    public final Context f6807a;

    /* renamed from: b */
    public final C9060M4 f6808b;

    /* renamed from: c */
    public final ResultReceiver f6809c;

    public C8988J4(@NonNull Context context, @NonNull C9060M4 c9060m4, @NonNull C8865E4 c8865e4) {
        this.f6807a = context;
        this.f6808b = c9060m4;
        this.f6809c = c8865e4.f6524c;
        c9060m4.m5377a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9895u4
    /* renamed from: a */
    public final void mo5290a(@NonNull C9252U5 c9252u5, @NonNull C8865E4 c8865e4) {
        this.f6808b.mo5023a(c8865e4.f6523b);
        this.f6808b.m5379a(c9252u5, this);
    }

    @NonNull
    /* renamed from: b */
    public final C9060M4 m5292b() {
        return this.f6808b;
    }

    @NonNull
    /* renamed from: c */
    public final Context m5293c() {
        return this.f6807a;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: d */
    public final ResultReceiver m5294d() {
        return this.f6809c;
    }

    /* renamed from: a */
    public final void m5291a(@NonNull C9595i4 c9595i4) {
        ResultReceiverC8817C6.m5020a(this.f6809c, c9595i4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9895u4
    /* renamed from: a */
    public final void mo5289a() {
        this.f6808b.m5382b(this);
    }
}
