package com.sdkit.paylib.paylibpayment.api.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/CancelInvoiceResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "component2", "meta", "error", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "getError", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class CancelInvoiceResponse implements ResponseWithError {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final ErrorModel error;

    public CancelInvoiceResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CancelInvoiceResponse copy$default(CancelInvoiceResponse cancelInvoiceResponse, RequestMeta requestMeta, ErrorModel errorModel, int i, Object obj) {
        if ((i & 1) != 0) {
            requestMeta = cancelInvoiceResponse.meta;
        }
        if ((i & 2) != 0) {
            errorModel = cancelInvoiceResponse.error;
        }
        return cancelInvoiceResponse.copy(requestMeta, errorModel);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestMeta getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorModel getError() {
        return this.error;
    }

    public final CancelInvoiceResponse copy(RequestMeta meta, ErrorModel error) {
        return new CancelInvoiceResponse(meta, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelInvoiceResponse)) {
            return false;
        }
        CancelInvoiceResponse cancelInvoiceResponse = (CancelInvoiceResponse) other;
        return Intrinsics.areEqual(this.meta, cancelInvoiceResponse.meta) && Intrinsics.areEqual(this.error, cancelInvoiceResponse.error);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError
    public ErrorModel getError() {
        return this.error;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse
    public RequestMeta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iHashCode = (requestMeta == null ? 0 : requestMeta.hashCode()) * 31;
        ErrorModel errorModel = this.error;
        return iHashCode + (errorModel != null ? errorModel.hashCode() : 0);
    }

    public String toString() {
        return "CancelInvoiceResponse(meta=" + this.meta + ", error=" + this.error + ')';
    }

    public CancelInvoiceResponse(RequestMeta requestMeta, ErrorModel errorModel) {
        this.meta = requestMeta;
        this.error = errorModel;
    }

    public /* synthetic */ CancelInvoiceResponse(RequestMeta requestMeta, ErrorModel errorModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestMeta, (i & 2) != 0 ? null : errorModel);
    }
}
