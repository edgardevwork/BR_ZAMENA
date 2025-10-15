package com.sdkit.paylib.paylibnative.p033ui.utils.ext;

import com.sdkit.paylib.paylibnative.api.entity.PaylibResultCase;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8368e {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3673a;

        static {
            int[] iArr = new int[EnumC8105d.values().length];
            try {
                iArr[EnumC8105d.SUCCESSFUL_PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8105d.CLOSED_BY_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8105d.UNHANDLED_FORM_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8105d.PAYMENT_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC8105d.DECLINED_BY_SERVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC8105d.RESULT_UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3673a = iArr;
        }
    }

    /* renamed from: a */
    public static final PaylibResultCase m3439a(EnumC8105d finishCode, String invoiceId) {
        Intrinsics.checkNotNullParameter(finishCode, "finishCode");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        switch (a.f3673a[finishCode.ordinal()]) {
            case 1:
                return new PaylibResultCase.Succeed(new PaylibResultPayment.Invoice.Completion(invoiceId));
            case 2:
                return new PaylibResultCase.Cancelled(new PaylibResultPayment.Invoice.Completion(invoiceId));
            case 3:
            case 4:
            case 5:
            case 6:
                return m3443a(invoiceId);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public static final PaylibResultCase m3440a(EnumC8105d finishCode, String purchaseId, String invoiceId) {
        Intrinsics.checkNotNullParameter(finishCode, "finishCode");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        switch (a.f3673a[finishCode.ordinal()]) {
            case 1:
                return new PaylibResultCase.Succeed(new PaylibResultPayment.PaymentMethodChange.Completion(purchaseId, invoiceId));
            case 2:
                return new PaylibResultCase.Cancelled(new PaylibResultPayment.PaymentMethodChange.Completion(purchaseId, invoiceId));
            case 3:
            case 4:
            case 5:
            case 6:
                return m3444a(purchaseId, invoiceId, (Integer) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public static final PaylibResultCase m3441a(EnumC8105d finishCode, String applicationId, String purchaseId, String invoiceId) {
        Intrinsics.checkNotNullParameter(finishCode, "finishCode");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        switch (a.f3673a[finishCode.ordinal()]) {
            case 1:
                return new PaylibResultCase.Succeed(new PaylibResultPayment.Application.Completion(applicationId, purchaseId, invoiceId));
            case 2:
                return new PaylibResultCase.Cancelled(new PaylibResultPayment.Application.Completion(applicationId, purchaseId, invoiceId));
            case 3:
            case 4:
            case 5:
            case 6:
                return m3445a(applicationId, purchaseId, invoiceId, (Integer) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public static final PaylibResultCase m3442a(EnumC8105d finishCode, String str, String purchaseId, String productId, String invoiceId) {
        Intrinsics.checkNotNullParameter(finishCode, "finishCode");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        switch (a.f3673a[finishCode.ordinal()]) {
            case 1:
                return new PaylibResultCase.Succeed(new PaylibResultPayment.Product.Completion(str, purchaseId, productId, invoiceId));
            case 2:
                return new PaylibResultCase.Cancelled(new PaylibResultPayment.Product.Completion(str, purchaseId, productId, invoiceId));
            case 3:
            case 4:
            case 5:
            case 6:
                return m3446a(purchaseId, invoiceId, str, null, productId, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public static final PaylibResultCase m3443a(String str) {
        return new PaylibResultCase.Failed(new PaylibResultPayment.Invoice.Failure(str));
    }

    /* renamed from: a */
    public static final PaylibResultCase m3444a(String str, String str2, Integer num) {
        return new PaylibResultCase.Failed(new PaylibResultPayment.PaymentMethodChange.Failure(str, str2, num));
    }

    /* renamed from: a */
    public static final PaylibResultCase m3445a(String applicationId, String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return new PaylibResultCase.Failed(new PaylibResultPayment.Application.Failure(applicationId, str, str2, num));
    }

    /* renamed from: a */
    public static final PaylibResultCase m3446a(String str, String str2, String str3, Integer num, String str4, Integer num2) {
        return new PaylibResultCase.Failed(new PaylibResultPayment.Product.Failure(str, str2, str3, num, str4, num2));
    }
}
