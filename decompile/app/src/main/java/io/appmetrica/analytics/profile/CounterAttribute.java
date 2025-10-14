package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C8797Bb;
import io.appmetrica.analytics.impl.C9276V5;
import io.appmetrica.analytics.impl.C9677lb;
import io.appmetrica.analytics.impl.C9897u6;
import io.appmetrica.analytics.impl.InterfaceC9489dn;

/* loaded from: classes5.dex */
public final class CounterAttribute {

    /* renamed from: a */
    private final C9897u6 f9645a;

    public CounterAttribute(String str, C9677lb c9677lb, C8797Bb c8797Bb) {
        this.f9645a = new C9897u6(str, c9677lb, c8797Bb);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withDelta(double d) {
        return new UserProfileUpdate<>(new C9276V5(this.f9645a.f9165c, d));
    }
}
