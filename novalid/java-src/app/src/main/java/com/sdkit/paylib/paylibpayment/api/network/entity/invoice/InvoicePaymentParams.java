package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003JE\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006%"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentParams;", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethodType;", "component1", "", "component2", "component3", "component4", "component5", "paymentType", "paymentInstrumentValue", "paymentUrl", "deeplink", "paysysOrderId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethodType;", "getPaymentType", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethodType;", "b", "Ljava/lang/String;", "getPaymentInstrumentValue", "()Ljava/lang/String;", "c", "getPaymentUrl", "d", "getDeeplink", "e", "getPaysysOrderId", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethodType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoicePaymentParams {

    /* renamed from: a, reason: from kotlin metadata */
    public final AvailablePaymentMethodType paymentType;

    /* renamed from: b, reason: from kotlin metadata */
    public final String paymentInstrumentValue;

    /* renamed from: c, reason: from kotlin metadata */
    public final String paymentUrl;

    /* renamed from: d, reason: from kotlin metadata */
    public final String deeplink;

    /* renamed from: e, reason: from kotlin metadata */
    public final String paysysOrderId;

    public InvoicePaymentParams(AvailablePaymentMethodType availablePaymentMethodType, String str, String str2, String str3, String str4) {
        this.paymentType = availablePaymentMethodType;
        this.paymentInstrumentValue = str;
        this.paymentUrl = str2;
        this.deeplink = str3;
        this.paysysOrderId = str4;
    }

    public static /* synthetic */ InvoicePaymentParams copy$default(InvoicePaymentParams invoicePaymentParams, AvailablePaymentMethodType availablePaymentMethodType, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            availablePaymentMethodType = invoicePaymentParams.paymentType;
        }
        if ((i & 2) != 0) {
            str = invoicePaymentParams.paymentInstrumentValue;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = invoicePaymentParams.paymentUrl;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = invoicePaymentParams.deeplink;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = invoicePaymentParams.paysysOrderId;
        }
        return invoicePaymentParams.copy(availablePaymentMethodType, str5, str6, str7, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final AvailablePaymentMethodType getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentInstrumentValue() {
        return this.paymentInstrumentValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPaysysOrderId() {
        return this.paysysOrderId;
    }

    public final InvoicePaymentParams copy(AvailablePaymentMethodType paymentType, String paymentInstrumentValue, String paymentUrl, String deeplink, String paysysOrderId) {
        return new InvoicePaymentParams(paymentType, paymentInstrumentValue, paymentUrl, deeplink, paysysOrderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoicePaymentParams)) {
            return false;
        }
        InvoicePaymentParams invoicePaymentParams = (InvoicePaymentParams) other;
        return this.paymentType == invoicePaymentParams.paymentType && Intrinsics.areEqual(this.paymentInstrumentValue, invoicePaymentParams.paymentInstrumentValue) && Intrinsics.areEqual(this.paymentUrl, invoicePaymentParams.paymentUrl) && Intrinsics.areEqual(this.deeplink, invoicePaymentParams.deeplink) && Intrinsics.areEqual(this.paysysOrderId, invoicePaymentParams.paysysOrderId);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getPaymentInstrumentValue() {
        return this.paymentInstrumentValue;
    }

    public final AvailablePaymentMethodType getPaymentType() {
        return this.paymentType;
    }

    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    public final String getPaysysOrderId() {
        return this.paysysOrderId;
    }

    public int hashCode() {
        AvailablePaymentMethodType availablePaymentMethodType = this.paymentType;
        int iHashCode = (availablePaymentMethodType == null ? 0 : availablePaymentMethodType.hashCode()) * 31;
        String str = this.paymentInstrumentValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deeplink;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paysysOrderId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoicePaymentParams(paymentType=");
        sb.append(this.paymentType);
        sb.append(", paymentInstrumentValue=");
        sb.append(this.paymentInstrumentValue);
        sb.append(", paymentUrl=");
        sb.append(this.paymentUrl);
        sb.append(", deeplink=");
        sb.append(this.deeplink);
        sb.append(", paysysOrderId=");
        return C8032c.m1430a(sb, this.paysysOrderId, ')');
    }
}
