package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

/* loaded from: classes6.dex */
public /* synthetic */ class InvoiceStatusJson$$c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5501a;

    static {
        int[] iArr = new int[InvoiceStatusJson.values().length];
        try {
            iArr[InvoiceStatusJson.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InvoiceStatusJson.EXECUTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InvoiceStatusJson.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InvoiceStatusJson.PAID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InvoiceStatusJson.CONFIRMED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InvoiceStatusJson.REVERSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[InvoiceStatusJson.REFUNDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[InvoiceStatusJson.WAIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f5501a = iArr;
    }
}
