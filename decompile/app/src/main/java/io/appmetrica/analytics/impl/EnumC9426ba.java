package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ba */
/* loaded from: classes6.dex */
public enum EnumC9426ba {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a */
    public final int f7782a;

    EnumC9426ba(int i) {
        this.f7782a = i;
    }

    /* renamed from: a */
    public static EnumC9426ba m5911a(Integer num) {
        if (num != null) {
            for (EnumC9426ba enumC9426ba : values()) {
                if (enumC9426ba.f7782a == num.intValue()) {
                    return enumC9426ba;
                }
            }
        }
        return UNKNOWN;
    }
}
