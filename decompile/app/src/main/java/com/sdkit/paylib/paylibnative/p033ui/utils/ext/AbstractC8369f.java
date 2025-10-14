package com.sdkit.paylib.paylibnative.p033ui.utils.ext;

import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatus;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.entity.BankOpenUnavailableException;
import com.sdkit.paylib.paylibnative.p033ui.core.sbolpay.SbolPayDeeplinkResolver;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.DefaultPaymentException;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.PaylibIllegalStateException;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.screens.loading.LoadingViewModel;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8395a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibBackendFailure;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainerKt;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.f */
/* loaded from: classes5.dex */
public abstract class AbstractC8369f {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.f$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3674a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3675b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f3676c;

        static {
            int[] iArr = new int[PaymentStatus.values().length];
            try {
                iArr[PaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentStatus.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentStatus.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3674a = iArr;
            int[] iArr2 = new int[PurchaseState.values().length];
            try {
                iArr2[PurchaseState.CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PurchaseState.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PurchaseState.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PurchaseState.CONSUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PurchaseState.PAID.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f3675b = iArr2;
            int[] iArr3 = new int[PaymentWay.Type.values().length];
            try {
                iArr3[PaymentWay.Type.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PaymentWay.Type.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PaymentWay.Type.NEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PaymentWay.Type.TPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PaymentWay.Type.SBOLPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[PaymentWay.Type.SBP.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            f3676c = iArr3;
        }
    }

    /* renamed from: a */
    public static final AbstractC8128b m3447a(AsyncState asyncState, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(asyncState, "<this>");
        if (z) {
            return AbstractC8128b.b.f1933a;
        }
        if (asyncState instanceof AsyncState.None ? true : asyncState instanceof AsyncState.Loading) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return new AbstractC8128b.d(str, str2);
        }
        if (!(asyncState instanceof AsyncState.Content)) {
            if (asyncState instanceof AsyncState.Error) {
                return m3449a(((AsyncState.Error) asyncState).getError(), false, 1, (Object) null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return new AbstractC8128b.d(str, str2);
    }

    /* renamed from: b */
    public static final EnumC8105d m3459b(PaymentStatus paymentStatus) {
        Intrinsics.checkNotNullParameter(paymentStatus, "<this>");
        int i = a.f3674a[paymentStatus.ordinal()];
        if (i == 1) {
            return EnumC8105d.SUCCESSFUL_PAYMENT;
        }
        if (i == 2) {
            return EnumC8105d.CLOSED_BY_USER;
        }
        if (i == 3) {
            return EnumC8105d.UNHANDLED_FORM_ERROR;
        }
        if (i == 4) {
            return EnumC8105d.PAYMENT_TIMEOUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public static final EnumC8105d m3462c(Throwable th) {
        if (m3461b(th)) {
            return null;
        }
        return EnumC8105d.UNHANDLED_FORM_ERROR;
    }

    /* renamed from: a */
    public static final AbstractC8128b m3448a(Throwable th, boolean z) {
        return z ? AbstractC8128b.b.f1933a : ((th instanceof PayLibServiceFailure.PaymentFailure.InsufficientFundsError) || (th instanceof PayLibServiceFailure.PaymentFailure.InvoiceIsInProgressError) || (th instanceof PayLibServiceFailure.PaymentFailure.PurchaseCheckingError) || (th instanceof PayLibServiceFailure.PaymentFailure) || (th instanceof PayLibBackendFailure.ClientError) || (!(th instanceof PayLibBackendFailure.TimeoutError) && ((th instanceof SbolPayDeeplinkResolver.SbolPayDeeplinkError) || (th instanceof LoadingViewModel.UnknownPayment) || (th instanceof DefaultPaymentException) || (th instanceof PaylibIllegalStateException) || (th instanceof BankOpenUnavailableException) || th == null))) ? AbstractC8128b.a.f1932a : AbstractC8128b.h.f1940a;
    }

    /* renamed from: b */
    public static final EnumC8105d m3460b(PurchaseState purchaseState) {
        Intrinsics.checkNotNullParameter(purchaseState, "<this>");
        int i = a.f3675b[purchaseState.ordinal()];
        return (i == 3 || i == 4 || i == 5) ? EnumC8105d.SUCCESSFUL_PAYMENT : EnumC8105d.UNHANDLED_FORM_ERROR;
    }

    /* renamed from: c */
    public static final AbstractC8128b m3463c(PaymentStatus paymentStatus) {
        Intrinsics.checkNotNullParameter(paymentStatus, "<this>");
        return m3449a(m3457a(paymentStatus), false, 1, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC8128b m3449a(Throwable th, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m3448a(th, z);
    }

    /* renamed from: b */
    public static final boolean m3461b(Throwable th) {
        Throwable cause;
        if (th instanceof PayLibBackendFailure.NoInternetError) {
            return true;
        }
        return (th == null || (cause = th.getCause()) == null || !m3461b(cause)) ? false : true;
    }

    /* renamed from: c */
    public static final AbstractC8128b m3464c(PurchaseState purchaseState) {
        Intrinsics.checkNotNullParameter(purchaseState, "<this>");
        return m3449a(m3458a(purchaseState), false, 1, (Object) null);
    }

    /* renamed from: a */
    public static final C8302e m3450a(Invoice invoice, boolean z) {
        Object next;
        String actionTitle;
        Intrinsics.checkNotNullParameter(invoice, "<this>");
        String invoiceId = invoice.getInvoiceId();
        String icon = invoice.getIcon();
        String title = invoice.getTitle();
        String visibleAmount = invoice.getVisibleAmount();
        boolean z2 = !invoice.getCards().isEmpty();
        List<PaymentWay> paymentWays = invoice.getPaymentWays();
        Iterator<T> it = invoice.getPaymentWays().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PaymentWay) next).getType() == PaymentWay.Type.CARD) {
                break;
            }
        }
        PaymentWay paymentWay = (PaymentWay) next;
        if (paymentWay == null || (actionTitle = paymentWay.getActionTitle()) == null) {
            actionTitle = "";
        }
        return new C8302e(invoiceId, icon, title, visibleAmount, z2, paymentWays, actionTitle, z ? invoice.getLoyaltyInfoState() : Invoice.LoyaltyInfoState.NONE);
    }

    /* renamed from: a */
    public static final AbstractC8337a m3451a(String str, String str2, Integer num) {
        if (!(true ^ (str == null || str.length() == 0))) {
            str = null;
        }
        if (str != null) {
            return new AbstractC8337a.b(str, str2, num != null ? num.toString() : null);
        }
        return new AbstractC8337a.a(C11403R.string.paylib_native_payment_unknown_error, str2, String.valueOf(num));
    }

    /* renamed from: a */
    public static final AbstractC8337a m3452a(Throwable th) {
        return new AbstractC8337a.a(C11403R.string.paylib_native_payment_unknown_error, th != null ? TraceIdContainerKt.fetchTraceId(th) : null, null);
    }

    /* renamed from: a */
    public static final AbstractC8337a m3453a(Throwable th, String str) {
        AbstractC8337a.a aVar;
        String userMessage;
        Integer code;
        AbstractC8337a.a aVar2;
        String strFetchTraceId = th != null ? TraceIdContainerKt.fetchTraceId(th) : null;
        if (strFetchTraceId != null && strFetchTraceId.length() != 0) {
            str = th != null ? TraceIdContainerKt.fetchTraceId(th) : null;
        }
        if (th instanceof PayLibBackendFailure.NoInternetError) {
            return new AbstractC8337a.a(C11403R.string.paylib_native_payment_no_internet_error, str, null);
        }
        if (!(th instanceof PayLibBackendFailure.ServerError)) {
            if (th instanceof PayLibServiceFailure.PaymentFailure.AlreadyPayedError) {
                int i = C11403R.string.paylib_native_payment_already_paid_error;
                Integer code2 = ((PayLibServiceFailure.PaymentFailure.AlreadyPayedError) th).getCode();
                aVar2 = new AbstractC8337a.a(i, str, code2 != null ? code2.toString() : null);
            } else if (th instanceof PayLibServiceFailure.PaymentFailure.PaymentCancelledError) {
                int i2 = C11403R.string.paylib_native_payment_cancelled_error;
                Integer code3 = ((PayLibServiceFailure.PaymentFailure.PaymentCancelledError) th).getCode();
                aVar2 = new AbstractC8337a.a(i2, str, code3 != null ? code3.toString() : null);
            } else if (th instanceof PayLibServiceFailure.PaymentFailure.InsufficientFundsError) {
                int i3 = C11403R.string.paylib_native_payment_insufficient_funds_error;
                Integer code4 = ((PayLibServiceFailure.PaymentFailure.InsufficientFundsError) th).getCode();
                aVar2 = new AbstractC8337a.a(i3, str, code4 != null ? code4.toString() : null);
            } else if (th instanceof PayLibServiceFailure.PaymentFailure.InvoiceIsInProgressError) {
                PayLibServiceFailure.PaymentFailure.InvoiceIsInProgressError invoiceIsInProgressError = (PayLibServiceFailure.PaymentFailure.InvoiceIsInProgressError) th;
                userMessage = invoiceIsInProgressError.getUserMessage();
                code = invoiceIsInProgressError.getCode();
            } else {
                if (!(th instanceof PayLibServiceFailure)) {
                    if (!(th instanceof PayLibBackendFailure.TimeoutError)) {
                        if (th instanceof DefaultPaymentException) {
                            aVar = new AbstractC8337a.a(C11403R.string.paylib_native_payment_purchase_error, TraceIdContainerKt.fetchTraceId(th), null);
                        } else if (th instanceof PayLibBackendFailure.ClientError) {
                            PayLibBackendFailure.ClientError clientError = (PayLibBackendFailure.ClientError) th;
                            userMessage = clientError.getUserMessage();
                            code = clientError.getCode();
                        } else if (th instanceof LoadingViewModel.UnknownPayment) {
                            aVar = new AbstractC8337a.a(C11403R.string.paylib_native_payment_no_payment_ways_error, TraceIdContainerKt.fetchTraceId(th), null);
                        } else if (th instanceof BankOpenUnavailableException) {
                            aVar = new AbstractC8337a.a(C11403R.string.paylib_native_payment_bank_is_not_supported, TraceIdContainerKt.fetchTraceId(th), null);
                        } else if (!(th instanceof PaylibIllegalStateException) && (th instanceof PaylibException) && th.getCause() != null) {
                            return m3454a(th.getCause(), (String) null, 1, (Object) null);
                        }
                        return aVar;
                    }
                    return m3452a(th);
                }
                PayLibServiceFailure payLibServiceFailure = (PayLibServiceFailure) th;
                userMessage = payLibServiceFailure.getUserMessage();
                code = payLibServiceFailure.getCode();
            }
            return aVar2;
        }
        PayLibBackendFailure.ServerError serverError = (PayLibBackendFailure.ServerError) th;
        userMessage = serverError.getUserMessage();
        code = serverError.getCode();
        return m3451a(userMessage, str, code);
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC8337a m3454a(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return m3453a(th, str);
    }

    /* renamed from: a */
    public static final C8395a m3455a(CardWithLoyalty cardWithLoyalty) {
        Intrinsics.checkNotNullParameter(cardWithLoyalty, "<this>");
        return new C8395a(cardWithLoyalty.getId(), cardWithLoyalty.getInfo(), cardWithLoyalty.getImage(), cardWithLoyalty.getBankName());
    }

    /* renamed from: a */
    public static final InterfaceC8419e.a m3456a(PaymentWay paymentWay) {
        Intrinsics.checkNotNullParameter(paymentWay, "<this>");
        PaymentWay.Type type = paymentWay.getType();
        switch (type == null ? -1 : a.f3676c[type.ordinal()]) {
            case 1:
                return InterfaceC8419e.a.CARD;
            case 2:
                return InterfaceC8419e.a.MOBILE;
            case 3:
                return InterfaceC8419e.a.WEBPAY;
            case 4:
                return InterfaceC8419e.a.TBANK;
            case 5:
                return InterfaceC8419e.a.SBOLPAY;
            case 6:
                return InterfaceC8419e.a.BISTRO;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static final Throwable m3457a(PaymentStatus paymentStatus) {
        Intrinsics.checkNotNullParameter(paymentStatus, "<this>");
        int i = a.f3674a[paymentStatus.ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? new Throwable() : new PayLibBackendFailure.TimeoutError(null, null, null) : new PayLibServiceFailure.PaymentFailure.PaymentCheckingError(null, null, null, null) : new PayLibServiceFailure.PaymentFailure.PaymentCancelledError(null, null, null, null);
    }

    /* renamed from: a */
    public static final Throwable m3458a(PurchaseState purchaseState) {
        Intrinsics.checkNotNullParameter(purchaseState, "<this>");
        int i = a.f3675b[purchaseState.ordinal()];
        if (i != 1 && i != 2) {
            return new Throwable();
        }
        return new PayLibServiceFailure.PaymentFailure.PurchaseCheckingError(null, null, null, null);
    }
}
