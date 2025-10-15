package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.jj */
/* loaded from: classes7.dex */
public final class C9635jj extends AbstractC8802Bg {
    public C9635jj(@NonNull C8892F6 c8892f6) {
        super(c8892f6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC8802Bg, io.appmetrica.analytics.impl.InterfaceC8827Cg
    /* renamed from: a */
    public final boolean mo5003a(@Nullable Boolean bool) {
        return !this.f6380a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
