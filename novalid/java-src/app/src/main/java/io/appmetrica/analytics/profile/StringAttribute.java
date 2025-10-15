package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C8940H4;
import io.appmetrica.analytics.impl.C9240Th;
import io.appmetrica.analytics.impl.C9413am;
import io.appmetrica.analytics.impl.C9438bm;
import io.appmetrica.analytics.impl.C9486dk;
import io.appmetrica.analytics.impl.C9897u6;
import io.appmetrica.analytics.impl.InterfaceC9030Km;
import io.appmetrica.analytics.impl.InterfaceC9489dn;
import io.appmetrica.analytics.impl.InterfaceC9668l2;
import io.appmetrica.analytics.impl.InterfaceC9839rn;

/* loaded from: classes5.dex */
public class StringAttribute {

    /* renamed from: a */
    private final InterfaceC9030Km f9650a;

    /* renamed from: b */
    private final C9897u6 f9651b;

    public StringAttribute(String str, C9413am c9413am, InterfaceC9839rn interfaceC9839rn, InterfaceC9668l2 interfaceC9668l2) {
        this.f9651b = new C9897u6(str, interfaceC9839rn, interfaceC9668l2);
        this.f9650a = c9413am;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValue(@NonNull String str) {
        C9897u6 c9897u6 = this.f9651b;
        return new UserProfileUpdate<>(new C9438bm(c9897u6.f9165c, str, this.f9650a, c9897u6.f9163a, new C8940H4(c9897u6.f9164b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValueIfUndefined(@NonNull String str) {
        C9897u6 c9897u6 = this.f9651b;
        return new UserProfileUpdate<>(new C9438bm(c9897u6.f9165c, str, this.f9650a, c9897u6.f9163a, new C9486dk(c9897u6.f9164b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValueReset() {
        C9897u6 c9897u6 = this.f9651b;
        return new UserProfileUpdate<>(new C9240Th(0, c9897u6.f9165c, c9897u6.f9163a, c9897u6.f9164b));
    }
}
