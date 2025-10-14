package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ha */
/* loaded from: classes8.dex */
public final class C9576ha implements InterfaceC9115Ob {
    @Override // io.appmetrica.analytics.impl.InterfaceC9115Ob
    @Nullable
    /* renamed from: a */
    public final C9351Y8 mo5456a(@Nullable C9648k7 c9648k7) {
        C9351Y8 c9351y8 = null;
        if ((c9648k7 != null ? c9648k7.f8495b : null) != null && c9648k7.f8496c != null) {
            c9351y8 = new C9351Y8();
            c9351y8.f7568b = c9648k7.f8495b.doubleValue();
            c9351y8.f7567a = c9648k7.f8496c.doubleValue();
            Integer num = c9648k7.f8497d;
            if (num != null) {
                c9351y8.f7573g = num.intValue();
            }
            Integer num2 = c9648k7.f8498e;
            if (num2 != null) {
                c9351y8.f7571e = num2.intValue();
            }
            Integer num3 = c9648k7.f8499f;
            if (num3 != null) {
                c9351y8.f7570d = num3.intValue();
            }
            Integer num4 = c9648k7.f8500g;
            if (num4 != null) {
                c9351y8.f7572f = num4.intValue();
            }
            Long l = c9648k7.f8501h;
            if (l != null) {
                c9351y8.f7569c = TimeUnit.MILLISECONDS.toSeconds(l.longValue());
            }
            String str = c9648k7.f8502i;
            if (str != null) {
                if (Intrinsics.areEqual(str, "gps")) {
                    c9351y8.f7574h = 1;
                } else if (Intrinsics.areEqual(str, "network")) {
                    c9351y8.f7574h = 2;
                }
            }
            String str2 = c9648k7.f8503j;
            if (str2 != null) {
                c9351y8.f7575i = str2;
            }
        }
        return c9351y8;
    }
}
