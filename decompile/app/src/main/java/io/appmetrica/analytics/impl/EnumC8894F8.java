package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.F8 */
/* loaded from: classes6.dex */
public enum EnumC8894F8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a */
    public final int f6578a;

    EnumC8894F8(int i) {
        this.f6578a = i;
    }

    /* renamed from: a */
    public static EnumC8894F8 m5128a(Integer num) {
        if (num != null) {
            for (EnumC8894F8 enumC8894F8 : values()) {
                if (enumC8894F8.f6578a == num.intValue()) {
                    return enumC8894F8;
                }
            }
        }
        return NONE;
    }
}
