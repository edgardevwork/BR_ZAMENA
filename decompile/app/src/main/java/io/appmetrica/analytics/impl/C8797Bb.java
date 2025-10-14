package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Bb */
/* loaded from: classes7.dex */
public final class C8797Bb implements InterfaceC9668l2 {

    /* renamed from: a */
    public final C8790B4 f6369a;

    public C8797Bb(@NonNull C8790B4 c8790b4) {
        this.f6369a = c8790b4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9668l2
    @Nullable
    /* renamed from: a */
    public final C9514en mo4988a(@NonNull C9464cn c9464cn, @NonNull C9514en c9514en) {
        int i = c9464cn.f7882b;
        int i2 = this.f6369a.f6362a;
        if (i == i2) {
            if (((C9514en) ((HashMap) c9464cn.f7881a.get(c9514en.f8037b)).get(new String(c9514en.f8036a))) != null) {
                ((HashMap) c9464cn.f7881a.get(c9514en.f8037b)).put(new String(c9514en.f8036a), c9514en);
            }
        } else if (i < i2) {
            ((HashMap) c9464cn.f7881a.get(c9514en.f8037b)).put(new String(c9514en.f8036a), c9514en);
            c9464cn.f7882b++;
        }
        return c9514en;
    }
}
