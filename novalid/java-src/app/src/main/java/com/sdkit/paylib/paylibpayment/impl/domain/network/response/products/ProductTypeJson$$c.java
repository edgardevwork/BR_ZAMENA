package com.sdkit.paylib.paylibpayment.impl.domain.network.response.products;

/* loaded from: classes6.dex */
public /* synthetic */ class ProductTypeJson$$c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5581a;

    static {
        int[] iArr = new int[ProductTypeJson.values().length];
        try {
            iArr[ProductTypeJson.NON_CONSUMABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductTypeJson.CONSUMABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductTypeJson.SUBSCRIPTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductTypeJson.APPLICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f5581a = iArr;
    }
}
