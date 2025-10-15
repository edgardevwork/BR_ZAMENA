package com.samsung.android.sdk.pass;

/* loaded from: classes6.dex */
public class SpassInvalidStateException extends IllegalStateException {
    public static final int STATUS_OPERATION_DENIED = 1;

    /* renamed from: a */
    public int f997a;

    public SpassInvalidStateException(String str, int i) {
        super(str);
        this.f997a = i;
    }

    public int getType() {
        return this.f997a;
    }
}
