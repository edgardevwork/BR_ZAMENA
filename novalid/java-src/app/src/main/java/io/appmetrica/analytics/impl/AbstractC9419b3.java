package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* renamed from: io.appmetrica.analytics.impl.b3 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC9419b3 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f7762a;

    static {
        int[] iArr = new int[ProductType.values().length];
        f7762a = iArr;
        try {
            iArr[ProductType.INAPP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7762a[ProductType.SUBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
