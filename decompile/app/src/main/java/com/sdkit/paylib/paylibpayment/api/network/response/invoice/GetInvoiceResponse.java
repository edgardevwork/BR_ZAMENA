package com.sdkit.paylib.paylibpayment.api.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.AvailablePaymentMethod;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceCard;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoicePaymentInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceReceipt;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceStatus;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b3\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010$\u001a\u00020\f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0016\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bd\u0010eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003JÎ\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010$\u001a\u00020\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b-\u0010.J\t\u0010/\u001a\u00020\u0002HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001J\u0013\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\tR\u0019\u0010#\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010$\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bK\u00108R\u0019\u0010&\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0006¢\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010SR\u0019\u0010)\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u00118\u0006¢\u0006\f\n\u0004\bZ\u0010Q\u001a\u0004\b[\u0010SR\u001c\u0010+\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001c\u0010,\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c¨\u0006f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/GetInvoiceResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "Ljava/util/Date;", "component6", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;", "component7", "component8", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceModel;", "component9", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceCard;", "component10", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethod;", "component11", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;", "component12", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceReceipt;", "component13", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component14", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "component15", "applicationCode", "applicationName", "ownerCode", "ownerName", "invoiceId", "invoiceDate", "invoiceStatus", "image", "invoice", "cards", "methods", "paymentInfo", "receipts", "meta", "error", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceModel;Ljava/util/List;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;)Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/GetInvoiceResponse;", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getApplicationCode", "()Ljava/lang/String;", "b", "getApplicationName", "c", "getOwnerCode", "d", "getOwnerName", "e", "Ljava/lang/Integer;", "getInvoiceId", "f", "Ljava/util/Date;", "getInvoiceDate", "()Ljava/util/Date;", "g", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;", "getInvoiceStatus", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;", "h", "getImage", "i", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceModel;", "getInvoice", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceModel;", "j", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "k", "getMethods", "l", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;", "getPaymentInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;", "m", "getReceipts", "n", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "o", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "getError", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceModel;Ljava/util/List;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class GetInvoiceResponse implements ResponseWithError {

    /* renamed from: a, reason: from kotlin metadata */
    public final String applicationCode;

    /* renamed from: b, reason: from kotlin metadata */
    public final String applicationName;

    /* renamed from: c, reason: from kotlin metadata */
    public final String ownerCode;

    /* renamed from: d, reason: from kotlin metadata */
    public final String ownerName;

    /* renamed from: e, reason: from kotlin metadata */
    public final Integer invoiceId;

    /* renamed from: f, reason: from kotlin metadata */
    public final Date invoiceDate;

    /* renamed from: g, reason: from kotlin metadata */
    public final InvoiceStatus invoiceStatus;

    /* renamed from: h, reason: from kotlin metadata */
    public final String image;

    /* renamed from: i, reason: from kotlin metadata */
    public final InvoiceModel invoice;

    /* renamed from: j, reason: from kotlin metadata */
    public final List cards;

    /* renamed from: k, reason: from kotlin metadata */
    public final List methods;

    /* renamed from: l, reason: from kotlin metadata */
    public final InvoicePaymentInfo paymentInfo;

    /* renamed from: m, reason: from kotlin metadata */
    public final List receipts;

    /* renamed from: n, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: o, reason: from kotlin metadata */
    public final ErrorModel error;

    public GetInvoiceResponse(String str, String str2, String str3, String str4, Integer num, Date date, InvoiceStatus invoiceStatus, String str5, InvoiceModel invoiceModel, List<InvoiceCard> cards, List<AvailablePaymentMethod> methods, InvoicePaymentInfo invoicePaymentInfo, List<InvoiceReceipt> receipts, RequestMeta requestMeta, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(invoiceStatus, "invoiceStatus");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(methods, "methods");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        this.applicationCode = str;
        this.applicationName = str2;
        this.ownerCode = str3;
        this.ownerName = str4;
        this.invoiceId = num;
        this.invoiceDate = date;
        this.invoiceStatus = invoiceStatus;
        this.image = str5;
        this.invoice = invoiceModel;
        this.cards = cards;
        this.methods = methods;
        this.paymentInfo = invoicePaymentInfo;
        this.receipts = receipts;
        this.meta = requestMeta;
        this.error = errorModel;
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationCode() {
        return this.applicationCode;
    }

    public final List<InvoiceCard> component10() {
        return this.cards;
    }

    public final List<AvailablePaymentMethod> component11() {
        return this.methods;
    }

    /* renamed from: component12, reason: from getter */
    public final InvoicePaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final List<InvoiceReceipt> component13() {
        return this.receipts;
    }

    /* renamed from: component14, reason: from getter */
    public final RequestMeta getMeta() {
        return this.meta;
    }

    /* renamed from: component15, reason: from getter */
    public final ErrorModel getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOwnerCode() {
        return this.ownerCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getInvoiceId() {
        return this.invoiceId;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getInvoiceDate() {
        return this.invoiceDate;
    }

    /* renamed from: component7, reason: from getter */
    public final InvoiceStatus getInvoiceStatus() {
        return this.invoiceStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component9, reason: from getter */
    public final InvoiceModel getInvoice() {
        return this.invoice;
    }

    public final GetInvoiceResponse copy(String applicationCode, String applicationName, String ownerCode, String ownerName, Integer invoiceId, Date invoiceDate, InvoiceStatus invoiceStatus, String image, InvoiceModel invoice, List<InvoiceCard> cards, List<AvailablePaymentMethod> methods, InvoicePaymentInfo paymentInfo, List<InvoiceReceipt> receipts, RequestMeta meta, ErrorModel error) {
        Intrinsics.checkNotNullParameter(invoiceStatus, "invoiceStatus");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(methods, "methods");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        return new GetInvoiceResponse(applicationCode, applicationName, ownerCode, ownerName, invoiceId, invoiceDate, invoiceStatus, image, invoice, cards, methods, paymentInfo, receipts, meta, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetInvoiceResponse)) {
            return false;
        }
        GetInvoiceResponse getInvoiceResponse = (GetInvoiceResponse) other;
        return Intrinsics.areEqual(this.applicationCode, getInvoiceResponse.applicationCode) && Intrinsics.areEqual(this.applicationName, getInvoiceResponse.applicationName) && Intrinsics.areEqual(this.ownerCode, getInvoiceResponse.ownerCode) && Intrinsics.areEqual(this.ownerName, getInvoiceResponse.ownerName) && Intrinsics.areEqual(this.invoiceId, getInvoiceResponse.invoiceId) && Intrinsics.areEqual(this.invoiceDate, getInvoiceResponse.invoiceDate) && this.invoiceStatus == getInvoiceResponse.invoiceStatus && Intrinsics.areEqual(this.image, getInvoiceResponse.image) && Intrinsics.areEqual(this.invoice, getInvoiceResponse.invoice) && Intrinsics.areEqual(this.cards, getInvoiceResponse.cards) && Intrinsics.areEqual(this.methods, getInvoiceResponse.methods) && Intrinsics.areEqual(this.paymentInfo, getInvoiceResponse.paymentInfo) && Intrinsics.areEqual(this.receipts, getInvoiceResponse.receipts) && Intrinsics.areEqual(this.meta, getInvoiceResponse.meta) && Intrinsics.areEqual(this.error, getInvoiceResponse.error);
    }

    public final String getApplicationCode() {
        return this.applicationCode;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final List<InvoiceCard> getCards() {
        return this.cards;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError
    public ErrorModel getError() {
        return this.error;
    }

    public final String getImage() {
        return this.image;
    }

    public final InvoiceModel getInvoice() {
        return this.invoice;
    }

    public final Date getInvoiceDate() {
        return this.invoiceDate;
    }

    public final Integer getInvoiceId() {
        return this.invoiceId;
    }

    public final InvoiceStatus getInvoiceStatus() {
        return this.invoiceStatus;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse
    public RequestMeta getMeta() {
        return this.meta;
    }

    public final List<AvailablePaymentMethod> getMethods() {
        return this.methods;
    }

    public final String getOwnerCode() {
        return this.ownerCode;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final InvoicePaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final List<InvoiceReceipt> getReceipts() {
        return this.receipts;
    }

    public int hashCode() {
        String str = this.applicationCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applicationName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ownerName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.invoiceId;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Date date = this.invoiceDate;
        int iHashCode6 = (this.invoiceStatus.hashCode() + ((iHashCode5 + (date == null ? 0 : date.hashCode())) * 31)) * 31;
        String str5 = this.image;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        InvoiceModel invoiceModel = this.invoice;
        int iHashCode8 = (this.methods.hashCode() + ((this.cards.hashCode() + ((iHashCode7 + (invoiceModel == null ? 0 : invoiceModel.hashCode())) * 31)) * 31)) * 31;
        InvoicePaymentInfo invoicePaymentInfo = this.paymentInfo;
        int iHashCode9 = (this.receipts.hashCode() + ((iHashCode8 + (invoicePaymentInfo == null ? 0 : invoicePaymentInfo.hashCode())) * 31)) * 31;
        RequestMeta requestMeta = this.meta;
        int iHashCode10 = (iHashCode9 + (requestMeta == null ? 0 : requestMeta.hashCode())) * 31;
        ErrorModel errorModel = this.error;
        return iHashCode10 + (errorModel != null ? errorModel.hashCode() : 0);
    }

    public String toString() {
        return "GetInvoiceResponse(applicationCode=" + this.applicationCode + ", applicationName=" + this.applicationName + ", ownerCode=" + this.ownerCode + ", ownerName=" + this.ownerName + ", invoiceId=" + this.invoiceId + ", invoiceDate=" + this.invoiceDate + ", invoiceStatus=" + this.invoiceStatus + ", image=" + this.image + ", invoice=" + this.invoice + ", cards=" + this.cards + ", methods=" + this.methods + ", paymentInfo=" + this.paymentInfo + ", receipts=" + this.receipts + ", meta=" + this.meta + ", error=" + this.error + ')';
    }

    public /* synthetic */ GetInvoiceResponse(String str, String str2, String str3, String str4, Integer num, Date date, InvoiceStatus invoiceStatus, String str5, InvoiceModel invoiceModel, List list, List list2, InvoicePaymentInfo invoicePaymentInfo, List list3, RequestMeta requestMeta, ErrorModel errorModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, date, (i & 64) != 0 ? InvoiceStatus.CANCELLED : invoiceStatus, str5, invoiceModel, (i & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 2048) != 0 ? null : invoicePaymentInfo, (i & 4096) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8192) != 0 ? null : requestMeta, (i & 16384) != 0 ? null : errorModel);
    }
}
