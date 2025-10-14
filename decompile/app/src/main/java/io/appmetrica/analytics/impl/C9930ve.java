package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ve */
/* loaded from: classes5.dex */
public final class C9930ve implements InterfaceC9111O7 {

    /* renamed from: a */
    @NonNull
    public final C8974Ie f9228a;

    /* renamed from: b */
    @NonNull
    public final List<C9905ue> f9229b;

    public C9930ve(@NonNull C8974Ie c8974Ie, @NonNull List<C9905ue> list) {
        this.f9228a = c8974Ie;
        this.f9229b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9111O7
    @NonNull
    /* renamed from: a */
    public final List<C9905ue> mo5321a() {
        return this.f9229b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9111O7
    @Nullable
    /* renamed from: b */
    public final Object mo5322b() {
        return this.f9228a;
    }

    @Nullable
    /* renamed from: c */
    public final C8974Ie m6898c() {
        return this.f9228a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f9228a + ", candidates=" + this.f9229b + '}';
    }
}
