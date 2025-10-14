package com.sdkit.paylib.paylibpayment.api.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/RequestSmsResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "component2", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "component3", "meta", "error", "smsConfirmConstraints", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "getError", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "c", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "getSmsConfirmConstraints", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class RequestSmsResponse implements ResponseWithError {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final ErrorModel error;

    /* renamed from: c, reason: from kotlin metadata */
    public final SmsConfirmConstraints smsConfirmConstraints;

    public RequestSmsResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RequestSmsResponse copy$default(RequestSmsResponse requestSmsResponse, RequestMeta requestMeta, ErrorModel errorModel, SmsConfirmConstraints smsConfirmConstraints, int i, Object obj) {
        if ((i & 1) != 0) {
            requestMeta = requestSmsResponse.meta;
        }
        if ((i & 2) != 0) {
            errorModel = requestSmsResponse.error;
        }
        if ((i & 4) != 0) {
            smsConfirmConstraints = requestSmsResponse.smsConfirmConstraints;
        }
        return requestSmsResponse.copy(requestMeta, errorModel, smsConfirmConstraints);
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

    public final RequestSmsResponse copy(RequestMeta meta, ErrorModel error, SmsConfirmConstraints smsConfirmConstraints) {
        return new RequestSmsResponse(meta, error, smsConfirmConstraints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestSmsResponse)) {
            return false;
        }
        RequestSmsResponse requestSmsResponse = (RequestSmsResponse) other;
        return Intrinsics.areEqual(this.meta, requestSmsResponse.meta) && Intrinsics.areEqual(this.error, requestSmsResponse.error) && Intrinsics.areEqual(this.smsConfirmConstraints, requestSmsResponse.smsConfirmConstraints);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError
    public ErrorModel getError() {
        return this.error;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse
    public RequestMeta getMeta() {
        return this.meta;
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
        return iHashCode2 + (smsConfirmConstraints != null ? smsConfirmConstraints.hashCode() : 0);
    }

    public String toString() {
        return "RequestSmsResponse(meta=" + this.meta + ", error=" + this.error + ", smsConfirmConstraints=" + this.smsConfirmConstraints + ')';
    }

    public RequestSmsResponse(RequestMeta requestMeta, ErrorModel errorModel, SmsConfirmConstraints smsConfirmConstraints) {
        this.meta = requestMeta;
        this.error = errorModel;
        this.smsConfirmConstraints = smsConfirmConstraints;
    }

    public /* synthetic */ RequestSmsResponse(RequestMeta requestMeta, ErrorModel errorModel, SmsConfirmConstraints smsConfirmConstraints, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestMeta, (i & 2) != 0 ? null : errorModel, (i & 4) != 0 ? null : smsConfirmConstraints);
    }
}
