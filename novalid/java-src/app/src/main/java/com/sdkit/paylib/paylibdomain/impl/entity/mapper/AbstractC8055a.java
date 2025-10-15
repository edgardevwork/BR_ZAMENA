package com.sdkit.paylib.paylibdomain.impl.entity.mapper;

import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatus;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Loyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentInstrument;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.AvailablePaymentMethod;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.AvailablePaymentMethodType;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceBankInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceCard;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceCardPaymentWay;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceLoyalty;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrder;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoicePaymentInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoicePaymentParams;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceStatus;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoiceResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.a */
/* loaded from: classes6.dex */
public abstract class AbstractC8055a {

    /* renamed from: a */
    public static final Regex f1222a = new Regex("[*X}]");

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.a$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1223a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1224b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f1225c;

        static {
            int[] iArr = new int[InvoiceStatus.values().length];
            try {
                iArr[InvoiceStatus.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvoiceStatus.REFUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvoiceStatus.PAID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InvoiceStatus.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InvoiceStatus.CREATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InvoiceStatus.REVERSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InvoiceStatus.EXECUTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InvoiceStatus.WAIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f1223a = iArr;
            int[] iArr2 = new int[InvoiceCardPaymentWay.values().length];
            try {
                iArr2[InvoiceCardPaymentWay.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InvoiceCardPaymentWay.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InvoiceCardPaymentWay.SBOLPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InvoiceCardPaymentWay.SBP.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InvoiceCardPaymentWay.TBANK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[InvoiceCardPaymentWay.WEB.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[InvoiceCardPaymentWay.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            f1224b = iArr2;
            int[] iArr3 = new int[AvailablePaymentMethodType.values().length];
            try {
                iArr3[AvailablePaymentMethodType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[AvailablePaymentMethodType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[AvailablePaymentMethodType.NEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[AvailablePaymentMethodType.TPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[AvailablePaymentMethodType.SBOLPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[AvailablePaymentMethodType.SBP.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[AvailablePaymentMethodType.SBOLPAY_DEEPLINK.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            f1225c = iArr3;
        }
    }

    /* renamed from: a */
    public static final PaymentStatusPayload m1526a(GetInvoiceResponse getInvoiceResponse) {
        PaymentStatus paymentStatus;
        String maskedPan;
        Intrinsics.checkNotNullParameter(getInvoiceResponse, "<this>");
        switch (a.f1223a[getInvoiceResponse.getInvoiceStatus().ordinal()]) {
            case 1:
            case 2:
            case 3:
                paymentStatus = PaymentStatus.SUCCESS;
                break;
            case 4:
                paymentStatus = PaymentStatus.CANCELLED;
                break;
            case 5:
            case 6:
                paymentStatus = PaymentStatus.ERROR;
                break;
            case 7:
            case 8:
                paymentStatus = PaymentStatus.TIMEOUT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        PaymentStatus paymentStatus2 = paymentStatus;
        ErrorModel error = getInvoiceResponse.getError();
        boolean z = error != null && error.getCode() == 10;
        ErrorModel error2 = getInvoiceResponse.getError();
        String userMessage = error2 != null ? error2.getUserMessage() : null;
        RequestMeta meta = getInvoiceResponse.getMeta();
        String traceId = meta != null ? meta.getTraceId() : null;
        InvoiceModel invoice = getInvoiceResponse.getInvoice();
        Boolean boolValueOf = invoice != null ? Boolean.valueOf(invoice.isSubscription()) : null;
        InvoicePaymentInfo paymentInfo = getInvoiceResponse.getPaymentInfo();
        return new PaymentStatusPayload(paymentStatus2, z, userMessage, traceId, boolValueOf, (paymentInfo == null || (maskedPan = paymentInfo.getMaskedPan()) == null) ? null : f1222a.replace(maskedPan, "•"));
    }

    /* renamed from: b */
    public static final PayLibServiceFailure.PaymentFailure.InsufficientFundsError m1538b(ErrorModel errorModel, RequestMeta requestMeta) {
        return new PayLibServiceFailure.PaymentFailure.InsufficientFundsError(errorModel != null ? errorModel.getUserMessage() : null, errorModel != null ? Integer.valueOf(errorModel.getCode()) : null, errorModel != null ? errorModel.getDescription() : null, requestMeta != null ? requestMeta.getTraceId() : null);
    }

    /* renamed from: c */
    public static final PayLibServiceFailure.InvoiceError m1541c(ErrorModel errorModel, RequestMeta requestMeta) {
        return new PayLibServiceFailure.InvoiceError(errorModel != null ? errorModel.getUserMessage() : null, errorModel != null ? Integer.valueOf(errorModel.getCode()) : null, errorModel != null ? errorModel.getDescription() : null, requestMeta != null ? requestMeta.getTraceId() : null);
    }

    /* renamed from: d */
    public static final PayLibServiceFailure.PaymentFailure.InvoiceIsInProgressError m1544d(ErrorModel errorModel, RequestMeta requestMeta) {
        return new PayLibServiceFailure.PaymentFailure.InvoiceIsInProgressError(errorModel != null ? errorModel.getUserMessage() : null, errorModel != null ? Integer.valueOf(errorModel.getCode()) : null, errorModel != null ? errorModel.getDescription() : null, requestMeta != null ? requestMeta.getTraceId() : null);
    }

    /* renamed from: e */
    public static final PayLibServiceFailure.PaymentFailure.PaymentCancelledError m1546e(ErrorModel errorModel, RequestMeta requestMeta) {
        return new PayLibServiceFailure.PaymentFailure.PaymentCancelledError(errorModel != null ? errorModel.getUserMessage() : null, errorModel != null ? Integer.valueOf(errorModel.getCode()) : null, errorModel != null ? errorModel.getDescription() : null, requestMeta != null ? requestMeta.getTraceId() : null);
    }

    /* renamed from: f */
    public static final PayLibServiceFailure.PaymentFailure.PaymentError m1547f(ErrorModel errorModel, RequestMeta requestMeta) {
        return new PayLibServiceFailure.PaymentFailure.PaymentError(errorModel != null ? errorModel.getUserMessage() : null, errorModel != null ? Integer.valueOf(errorModel.getCode()) : null, errorModel != null ? errorModel.getDescription() : null, requestMeta != null ? requestMeta.getTraceId() : null);
    }

    /* renamed from: a */
    public static final CardWithLoyalty m1527a(Invoice invoice) throws NumberFormatException {
        Object obj;
        Intrinsics.checkNotNullParameter(invoice, "<this>");
        Iterator<T> it = invoice.getCards().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i = Integer.parseInt(((CardWithLoyalty) next).getId());
                do {
                    Object next2 = it.next();
                    int i2 = Integer.parseInt(((CardWithLoyalty) next2).getId());
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (CardWithLoyalty) obj;
    }

    /* renamed from: b */
    public static final List m1539b(List list) {
        PaymentWay.Type type;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AvailablePaymentMethod availablePaymentMethod = (AvailablePaymentMethod) it.next();
            AvailablePaymentMethodType method = availablePaymentMethod.getMethod();
            switch (method == null ? -1 : a.f1225c[method.ordinal()]) {
                case -1:
                case 7:
                    type = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    type = PaymentWay.Type.CARD;
                    break;
                case 2:
                    type = PaymentWay.Type.MOBILE;
                    break;
                case 3:
                    type = PaymentWay.Type.NEW;
                    break;
                case 4:
                    type = PaymentWay.Type.TPAY;
                    break;
                case 5:
                    type = PaymentWay.Type.SBOLPAY;
                    break;
                case 6:
                    type = PaymentWay.Type.SBP;
                    break;
            }
            PaymentWay paymentWay = type != null ? new PaymentWay(type, availablePaymentMethod.getAction(), availablePaymentMethod.getDisclaimer()) : null;
            if (paymentWay != null) {
                arrayList.add(paymentWay);
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    /* renamed from: c */
    public static final List m1542c(List list) {
        CardWithLoyalty.PaymentWay paymentWay;
        CardWithLoyalty.PaymentWay paymentWay2;
        String name;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InvoiceCard invoiceCard = (InvoiceCard) it.next();
            String strValueOf = String.valueOf(invoiceCard.getId());
            String strM1534a = m1534a(invoiceCard);
            String image = invoiceCard.getImage();
            String str = image == null ? "" : image;
            InvoiceBankInfo bankInfo = invoiceCard.getBankInfo();
            String str2 = (bankInfo == null || (name = bankInfo.getName()) == null) ? "" : name;
            boolean loyaltyAvailability = invoiceCard.getLoyaltyAvailability();
            InvoiceLoyalty loyalty = invoiceCard.getLoyalty();
            Loyalty loyalty2 = loyalty != null ? new Loyalty(loyalty.getServiceCode(), loyalty.getMinAmount(), loyalty.getMaxAmount(), loyalty.getVisualAmount(), loyalty.getLabel(), loyalty.getVisualLabel()) : null;
            InvoiceCardPaymentWay paymentWay3 = invoiceCard.getPaymentWay();
            switch (paymentWay3 == null ? -1 : a.f1224b[paymentWay3.ordinal()]) {
                case -1:
                    paymentWay = null;
                    continue;
                    arrayList.add(new CardWithLoyalty(strValueOf, strM1534a, str, str2, loyaltyAvailability, loyalty2, paymentWay));
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    paymentWay2 = CardWithLoyalty.PaymentWay.CARD;
                    break;
                case 2:
                    paymentWay2 = CardWithLoyalty.PaymentWay.MOBILE;
                    break;
                case 3:
                    paymentWay2 = CardWithLoyalty.PaymentWay.SBOLPAY;
                    break;
                case 4:
                    paymentWay2 = CardWithLoyalty.PaymentWay.SBP;
                    break;
                case 5:
                    paymentWay2 = CardWithLoyalty.PaymentWay.TBANK;
                    break;
                case 6:
                    paymentWay2 = CardWithLoyalty.PaymentWay.WEB;
                    break;
                case 7:
                    paymentWay2 = CardWithLoyalty.PaymentWay.UNDEFINED;
                    break;
            }
            paymentWay = paymentWay2;
            arrayList.add(new CardWithLoyalty(strValueOf, strM1534a, str, str2, loyaltyAvailability, loyalty2, paymentWay));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final boolean m1545d(InvoiceStatus invoiceStatus) {
        return invoiceStatus == InvoiceStatus.PAID || invoiceStatus == InvoiceStatus.CONFIRMED;
    }

    /* renamed from: a */
    public static final Invoice.LoyaltyInfoState m1528a(List list) {
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InvoiceCard) it.next()).getLoyalty() != null) {
                    return Invoice.LoyaltyInfoState.LOADED;
                }
            }
        }
        if (!z || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((InvoiceCard) it2.next()).getLoyaltyAvailability()) {
                    return Invoice.LoyaltyInfoState.READY_TO_LOAD;
                }
            }
        }
        return Invoice.LoyaltyInfoState.NONE;
    }

    /* renamed from: b */
    public static final boolean m1540b(InvoiceStatus invoiceStatus) {
        return invoiceStatus == InvoiceStatus.CREATED;
    }

    /* renamed from: c */
    public static final boolean m1543c(InvoiceStatus invoiceStatus) {
        return invoiceStatus == InvoiceStatus.EXECUTED;
    }

    /* renamed from: a */
    public static final Invoice m1529a(GetInvoiceResponse getInvoiceResponse, String invoiceId) {
        String orderId;
        String visualAmount;
        InvoicePaymentParams paymentParams;
        InvoiceOrder order;
        InvoiceOrder order2;
        InvoiceOrder order3;
        InvoiceOrder order4;
        Intrinsics.checkNotNullParameter(getInvoiceResponse, "<this>");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        InvoiceModel invoice = getInvoiceResponse.getInvoice();
        if (invoice == null || (order4 = invoice.getOrder()) == null || (orderId = order4.getOrderId()) == null) {
            orderId = "";
        }
        String image = getInvoiceResponse.getImage();
        if (image == null) {
            image = "";
        }
        InvoiceModel invoice2 = getInvoiceResponse.getInvoice();
        String strM1535a = m1535a(invoice2 != null ? invoice2.getOrder() : null);
        InvoiceModel invoice3 = getInvoiceResponse.getInvoice();
        Long lValueOf = (invoice3 == null || (order3 = invoice3.getOrder()) == null) ? null : Long.valueOf(order3.getAmount());
        if (lValueOf == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        long jLongValue = lValueOf.longValue();
        InvoiceModel invoice4 = getInvoiceResponse.getInvoice();
        if (invoice4 == null || (order2 = invoice4.getOrder()) == null || (visualAmount = order2.getVisualAmount()) == null) {
            visualAmount = "";
        }
        InvoiceModel invoice5 = getInvoiceResponse.getInvoice();
        String currency = (invoice5 == null || (order = invoice5.getOrder()) == null) ? null : order.getCurrency();
        List listM1542c = m1542c(getInvoiceResponse.getCards());
        List listM1539b = m1539b(getInvoiceResponse.getMethods());
        InvoicePaymentInfo paymentInfo = getInvoiceResponse.getPaymentInfo();
        PaymentInstrument paymentInstrumentM1532a = (paymentInfo == null || (paymentParams = paymentInfo.getPaymentParams()) == null) ? null : m1532a(paymentParams);
        Invoice.LoyaltyInfoState loyaltyInfoStateM1528a = m1528a(getInvoiceResponse.getCards());
        InvoiceModel invoice6 = getInvoiceResponse.getInvoice();
        boolean zIsSubscription = invoice6 != null ? invoice6.isSubscription() : false;
        InvoiceModel invoice7 = getInvoiceResponse.getInvoice();
        return new Invoice(invoiceId, orderId, image, strM1535a, jLongValue, visualAmount, currency, listM1542c, listM1539b, paymentInstrumentM1532a, loyaltyInfoStateM1528a, zIsSubscription, Boolean.valueOf(invoice7 != null ? invoice7.getCanSaveBindings() : true));
    }

    /* renamed from: a */
    public static final Invoice m1530a(GetInvoiceResponse getInvoiceResponse, String str, boolean z) throws PayLibServiceFailure.PaymentFailure.AlreadyPayedError {
        if (z) {
            return m1529a(getInvoiceResponse, str);
        }
        throw m1533a(getInvoiceResponse.getError(), getInvoiceResponse.getMeta());
    }

    /* renamed from: a */
    public static final Invoice m1531a(GetInvoiceResponse getInvoiceResponse, String invoiceId, boolean z, boolean z2) throws PayLibServiceFailure.PaymentFailure.AlreadyPayedError, PayLibServiceFailure.PaymentFailure.PaymentCancelledError, PayLibServiceFailure.InvoiceError, PayLibServiceFailure.PaymentFailure.InvoiceIsInProgressError {
        Invoice invoiceM1529a;
        Intrinsics.checkNotNullParameter(getInvoiceResponse, "<this>");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        if (getInvoiceResponse.getInvoice() != null) {
            if (m1543c(getInvoiceResponse.getInvoiceStatus()) && !z) {
                throw m1541c(getInvoiceResponse.getError(), getInvoiceResponse.getMeta());
            }
            if (m1545d(getInvoiceResponse.getInvoiceStatus())) {
                invoiceM1529a = m1530a(getInvoiceResponse, invoiceId, z2);
            } else {
                if (m1537a(getInvoiceResponse.getInvoiceStatus())) {
                    throw m1546e(getInvoiceResponse.getError(), getInvoiceResponse.getMeta());
                }
                if ((!m1543c(getInvoiceResponse.getInvoiceStatus()) || !z) && (!m1540b(getInvoiceResponse.getInvoiceStatus()) || !m1536a(getInvoiceResponse.getError()))) {
                    ErrorModel error = getInvoiceResponse.getError();
                    if (error == null || error.getCode() != 2) {
                        throw m1541c(getInvoiceResponse.getError(), getInvoiceResponse.getMeta());
                    }
                    throw m1544d(getInvoiceResponse.getError(), getInvoiceResponse.getMeta());
                }
                invoiceM1529a = m1529a(getInvoiceResponse, invoiceId);
            }
            if (invoiceM1529a != null) {
                return invoiceM1529a;
            }
        }
        throw m1541c(getInvoiceResponse.getError(), getInvoiceResponse.getMeta());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final PaymentInstrument m1532a(InvoicePaymentParams invoicePaymentParams) {
        AvailablePaymentMethodType paymentType = invoicePaymentParams.getPaymentType();
        switch (paymentType == null ? -1 : a.f1225c[paymentType.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 3:
                String paymentUrl = invoicePaymentParams.getPaymentUrl();
                if (paymentUrl != null) {
                    return new PaymentInstrument.Web(paymentUrl);
                }
                return null;
            case 7:
                String deeplink = invoicePaymentParams.getDeeplink();
                if (deeplink != null) {
                    return new PaymentInstrument.SbolPay(deeplink);
                }
                return null;
        }
    }

    /* renamed from: a */
    public static final PayLibServiceFailure.PaymentFailure.AlreadyPayedError m1533a(ErrorModel errorModel, RequestMeta requestMeta) {
        return new PayLibServiceFailure.PaymentFailure.AlreadyPayedError(errorModel != null ? errorModel.getUserMessage() : null, errorModel != null ? Integer.valueOf(errorModel.getCode()) : null, errorModel != null ? errorModel.getDescription() : null, requestMeta != null ? requestMeta.getTraceId() : null);
    }

    /* renamed from: a */
    public static final String m1534a(InvoiceCard invoiceCard) {
        String paymentSystem = invoiceCard.getPaymentSystem();
        String maskedNumber = invoiceCard.getMaskedNumber();
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{paymentSystem, maskedNumber != null ? f1222a.replace(maskedNumber, "•") : null}), " ", null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static final String m1535a(InvoiceOrder invoiceOrder) {
        String purpose;
        if (invoiceOrder != null && (purpose = invoiceOrder.getPurpose()) != null) {
            return purpose;
        }
        String description = invoiceOrder != null ? invoiceOrder.getDescription() : null;
        return description == null ? "" : description;
    }

    /* renamed from: a */
    public static final boolean m1536a(ErrorModel errorModel) {
        return errorModel != null && errorModel.getCode() == 0;
    }

    /* renamed from: a */
    public static final boolean m1537a(InvoiceStatus invoiceStatus) {
        int i = a.f1223a[invoiceStatus.ordinal()];
        return i == 2 || i == 4 || i == 6 || i == 8;
    }
}
