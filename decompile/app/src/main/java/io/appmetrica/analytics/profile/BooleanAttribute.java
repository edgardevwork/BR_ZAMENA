package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C8940H4;
import io.appmetrica.analytics.impl.C9240Th;
import io.appmetrica.analytics.impl.C9486dk;
import io.appmetrica.analytics.impl.C9769p3;
import io.appmetrica.analytics.impl.C9897u6;
import io.appmetrica.analytics.impl.InterfaceC9489dn;
import io.appmetrica.analytics.impl.InterfaceC9668l2;
import io.appmetrica.analytics.impl.InterfaceC9839rn;

/* loaded from: classes5.dex */
public class BooleanAttribute {

    /* renamed from: a */
    private final C9897u6 f9644a;

    public BooleanAttribute(String str, InterfaceC9839rn interfaceC9839rn, InterfaceC9668l2 interfaceC9668l2) {
        this.f9644a = new C9897u6(str, interfaceC9839rn, interfaceC9668l2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValue(boolean z) {
        C9897u6 c9897u6 = this.f9644a;
        return new UserProfileUpdate<>(new C9769p3(c9897u6.f9165c, z, c9897u6.f9163a, new C8940H4(c9897u6.f9164b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValueIfUndefined(boolean z) {
        C9897u6 c9897u6 = this.f9644a;
        return new UserProfileUpdate<>(new C9769p3(c9897u6.f9165c, z, c9897u6.f9163a, new C9486dk(c9897u6.f9164b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValueReset() {
        C9897u6 c9897u6 = this.f9644a;
        return new UserProfileUpdate<>(new C9240Th(3, c9897u6.f9165c, c9897u6.f9163a, c9897u6.f9164b));
    }
}
