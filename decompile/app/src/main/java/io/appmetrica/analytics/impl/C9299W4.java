package io.appmetrica.analytics.impl;

import com.blackhub.bronline.BuildConfig;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.W4 */
/* loaded from: classes5.dex */
public final class C9299W4 implements InterfaceC9349Y6 {

    /* renamed from: a */
    public final String f7388a;

    /* renamed from: b */
    public final String f7389b;

    public C9299W4(@NotNull C9396a5 c9396a5) {
        this.f7388a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c9396a5.mo5829d() ? BuildConfig.CDN_USERNAME : c9396a5.m5827b()}, 1));
        this.f7389b = "db_metrica_" + c9396a5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9349Y6
    @NotNull
    /* renamed from: a */
    public final String mo5702a() {
        return this.f7389b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9349Y6
    @NotNull
    /* renamed from: b */
    public final String mo5703b() {
        return this.f7388a;
    }
}
