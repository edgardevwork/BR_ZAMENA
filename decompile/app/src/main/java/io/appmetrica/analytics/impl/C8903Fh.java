package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Fh */
/* loaded from: classes7.dex */
public final class C8903Fh implements InterfaceC9839rn {

    /* renamed from: a */
    public final Map f6620a;

    public C8903Fh(@NonNull Map<String, ?> map) {
        this.f6620a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9839rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9789pn mo5086a(@Nullable String str) {
        return this.f6620a.containsKey(str) ? new C9789pn(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new C9789pn(this, true, "");
    }
}
