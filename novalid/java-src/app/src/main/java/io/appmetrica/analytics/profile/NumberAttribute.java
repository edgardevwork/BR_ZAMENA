package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C8790B4;
import io.appmetrica.analytics.impl.C8797Bb;
import io.appmetrica.analytics.impl.C8799Bd;
import io.appmetrica.analytics.impl.C8940H4;
import io.appmetrica.analytics.impl.C9240Th;
import io.appmetrica.analytics.impl.C9486dk;
import io.appmetrica.analytics.impl.C9677lb;
import io.appmetrica.analytics.impl.C9897u6;
import io.appmetrica.analytics.impl.InterfaceC9489dn;

/* loaded from: classes5.dex */
public final class NumberAttribute {

    /* renamed from: a */
    private final C9897u6 f9649a;

    public NumberAttribute(String str, C9677lb c9677lb, C8797Bb c8797Bb) {
        this.f9649a = new C9897u6(str, c9677lb, c8797Bb);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValue(double d) {
        return new UserProfileUpdate<>(new C8799Bd(this.f9649a.f9165c, d, new C9677lb(), new C8940H4(new C8797Bb(new C8790B4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C8799Bd(this.f9649a.f9165c, d, new C9677lb(), new C9486dk(new C8797Bb(new C8790B4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValueReset() {
        return new UserProfileUpdate<>(new C9240Th(1, this.f9649a.f9165c, new C9677lb(), new C8797Bb(new C8790B4(100))));
    }
}
