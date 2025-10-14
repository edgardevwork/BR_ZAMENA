package com.sdkit.paylib.paylibnative.sbol.utils;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SbolPayFinishState;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultCase;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.sbol.utils.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8088a {

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.utils.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1727a;

        static {
            int[] iArr = new int[SbolPayFinishState.values().length];
            try {
                iArr[SbolPayFinishState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SbolPayFinishState.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SbolPayFinishState.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SbolPayFinishState.INCORRECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SbolPayFinishState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1727a = iArr;
        }
    }

    /* renamed from: a */
    public static final PaylibResultCase m1778a(SbolPayFinishState finishState, String invoiceId) {
        Intrinsics.checkNotNullParameter(finishState, "finishState");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        int i = a.f1727a[finishState.ordinal()];
        if (i == 1) {
            return new PaylibResultCase.Succeed(new PaylibResultPayment.Invoice.Completion(invoiceId));
        }
        if (i == 2) {
            return new PaylibResultCase.Cancelled(new PaylibResultPayment.Invoice.Completion(invoiceId));
        }
        if (i == 3 || i == 4 || i == 5) {
            return m1779a(invoiceId);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final PaylibResultCase m1779a(String str) {
        return new PaylibResultCase.Failed(new PaylibResultPayment.Invoice.Failure(str));
    }
}
