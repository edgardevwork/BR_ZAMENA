package com.sdkit.paylib.paylibpayment.api.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006,"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/PostInvoiceResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "component2", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "component3", "", "component4", "component5", "meta", "error", "smsConfirmConstraints", "sbolPayDeepLink", "formUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "getError", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "c", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "getSmsConfirmConstraints", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "d", "Ljava/lang/String;", "getSbolPayDeepLink", "()Ljava/lang/String;", "e", "getFormUrl", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class PostInvoiceResponse implements ResponseWithError {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final ErrorModel error;

    /* renamed from: c, reason: from kotlin metadata */
    public final SmsConfirmConstraints smsConfirmConstraints;

    /* renamed from: d, reason: from kotlin metadata */
    public final String sbolPayDeepLink;

    /* renamed from: e, reason: from kotlin metadata */
    public final String formUrl;

    public PostInvoiceResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PostInvoiceResponse copy$default(PostInvoiceResponse postInvoiceResponse, RequestMeta requestMeta, ErrorModel errorModel, SmsConfirmConstraints smsConfirmConstraints, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            requestMeta = postInvoiceResponse.meta;
        }
        if ((i & 2) != 0) {
            errorModel = postInvoiceResponse.error;
        }
        ErrorModel errorModel2 = errorModel;
        if ((i & 4) != 0) {
            smsConfirmConstraints = postInvoiceResponse.smsConfirmConstraints;
        }
        SmsConfirmConstraints smsConfirmConstraints2 = smsConfirmConstraints;
        if ((i & 8) != 0) {
            str = postInvoiceResponse.sbolPayDeepLink;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = postInvoiceResponse.formUrl;
        }
        return postInvoiceResponse.copy(requestMeta, errorModel2, smsConfirmConstraints2, str3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestMeta getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorModel getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final SmsConfirmConstraints getSmsConfirmConstraints() {
        return this.smsConfirmConstraints;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSbolPayDeepLink() {
        return this.sbolPayDeepLink;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFormUrl() {
        return this.formUrl;
    }

    public final PostInvoiceResponse copy(RequestMeta meta, ErrorModel error, SmsConfirmConstraints smsConfirmConstraints, String sbolPayDeepLink, String formUrl) {
        return new PostInvoiceResponse(meta, error, smsConfirmConstraints, sbolPayDeepLink, formUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostInvoiceResponse)) {
            return false;
        }
        PostInvoiceResponse postInvoiceResponse = (PostInvoiceResponse) other;
        return Intrinsics.areEqual(this.meta, postInvoiceResponse.meta) && Intrinsics.areEqual(this.error, postInvoiceResponse.error) && Intrinsics.areEqual(this.smsConfirmConstraints, postInvoiceResponse.smsConfirmConstraints) && Intrinsics.areEqual(this.sbolPayDeepLink, postInvoiceResponse.sbolPayDeepLink) && Intrinsics.areEqual(this.formUrl, postInvoiceResponse.formUrl);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError
    public ErrorModel getError() {
        return this.error;
    }

    public final String getFormUrl() {
        return this.formUrl;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse
    public RequestMeta getMeta() {
        return this.meta;
    }

    public final String getSbolPayDeepLink() {
        return this.sbolPayDeepLink;
    }

    public final SmsConfirmConstraints getSmsConfirmConstraints() {
        return this.smsConfirmConstraints;
    }

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iHashCode = (requestMeta == null ? 0 : requestMeta.hashCode()) * 31;
        ErrorModel errorModel = this.error;
        int iHashCode2 = (iHashCode + (errorModel == null ? 0 : errorModel.hashCode())) * 31;
        SmsConfirmConstraints smsConfirmConstraints = this.smsConfirmConstraints;
        int iHashCode3 = (iHashCode2 + (smsConfirmConstraints == null ? 0 : smsConfirmConstraints.hashCode())) * 31;
        String str = this.sbolPayDeepLink;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.formUrl;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostInvoiceResponse(meta=");
        sb.append(this.meta);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", smsConfirmConstraints=");
        sb.append(this.smsConfirmConstraints);
        sb.append(", sbolPayDeepLink=");
        sb.append(this.sbolPayDeepLink);
        sb.append(", formUrl=");
        return C8032c.m1430a(sb, this.formUrl, ')');
    }

    public PostInvoiceResponse(RequestMeta requestMeta, ErrorModel errorModel, SmsConfirmConstraints smsConfirmConstraints, String str, String str2) {
        this.meta = requestMeta;
        this.error = errorModel;
        this.smsConfirmConstraints = smsConfirmConstraints;
        this.sbolPayDeepLink = str;
        this.formUrl = str2;
    }

    public /* synthetic */ PostInvoiceResponse(RequestMeta requestMeta, ErrorModel errorModel, SmsConfirmConstraints smsConfirmConstraints, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestMeta, (i & 2) != 0 ? null : errorModel, (i & 4) != 0 ? null : smsConfirmConstraints, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
