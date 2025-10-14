package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

/* loaded from: classes6.dex */
public /* synthetic */ class PurchaseStateJson$$c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5653a;

    static {
        int[] iArr = new int[PurchaseStateJson.values().length];
        try {
            iArr[PurchaseStateJson.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PurchaseStateJson.INVOICE_CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PurchaseStateJson.CONFIRMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PurchaseStateJson.PAID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PurchaseStateJson.PAUSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PurchaseStateJson.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PurchaseStateJson.CONSUMED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PurchaseStateJson.CLOSED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PurchaseStateJson.TERMINATED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f5653a = iArr;
    }
}
