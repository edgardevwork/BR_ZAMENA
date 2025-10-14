package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC9504ed;
import io.appmetrica.analytics.impl.InterfaceC9489dn;

/* loaded from: classes5.dex */
public class UserProfileUpdate<T extends InterfaceC9489dn> {

    /* renamed from: a */
    private final InterfaceC9489dn f9654a;

    public UserProfileUpdate(AbstractC9504ed abstractC9504ed) {
        this.f9654a = abstractC9504ed;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.f9654a;
    }
}
