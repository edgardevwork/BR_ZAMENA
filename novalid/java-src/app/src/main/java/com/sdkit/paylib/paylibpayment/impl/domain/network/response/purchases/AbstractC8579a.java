package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.a */
/* loaded from: classes6.dex */
public abstract class AbstractC8579a {

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5654a;

        static {
            int[] iArr = new int[PurchaseState.values().length];
            try {
                iArr[PurchaseState.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseState.INVOICE_CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseState.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseState.PAID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseState.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchaseState.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchaseState.CONSUMED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PurchaseState.CLOSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PurchaseState.TERMINATED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5654a = iArr;
        }
    }

    /* renamed from: a */
    public static final String m4546a(PurchaseState purchaseState) {
        Intrinsics.checkNotNullParameter(purchaseState, "<this>");
        switch (a.f5654a[purchaseState.ordinal()]) {
            case 1:
                return "created";
            case 2:
                return "invoice_created";
            case 3:
                return "confirmed";
            case 4:
                return "paid";
            case 5:
                return "paused";
            case 6:
                return "cancelled";
            case 7:
                return "consumed";
            case 8:
                return "closed";
            case 9:
                return "terminated";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
