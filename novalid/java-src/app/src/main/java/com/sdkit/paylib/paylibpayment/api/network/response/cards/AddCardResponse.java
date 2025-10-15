package com.sdkit.paylib.paylibpayment.api.network.response.cards;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b#\u0010$J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/cards/AddCardResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "component2", "", "component3", "component4", "meta", "error", "formUrl", "deeplink", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "getError", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "c", "Ljava/lang/String;", "getFormUrl", "()Ljava/lang/String;", "d", "getDeeplink", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class AddCardResponse implements ResponseWithError {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final ErrorModel error;

    /* renamed from: c, reason: from kotlin metadata */
    public final String formUrl;

    /* renamed from: d, reason: from kotlin metadata */
    public final String deeplink;

    public AddCardResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AddCardResponse copy$default(AddCardResponse addCardResponse, RequestMeta requestMeta, ErrorModel errorModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            requestMeta = addCardResponse.meta;
        }
        if ((i & 2) != 0) {
            errorModel = addCardResponse.error;
        }
        if ((i & 4) != 0) {
            str = addCardResponse.formUrl;
        }
        if ((i & 8) != 0) {
            str2 = addCardResponse.deeplink;
        }
        return addCardResponse.copy(requestMeta, errorModel, str, str2);
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
    public final String getFormUrl() {
        return this.formUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final AddCardResponse copy(RequestMeta meta, ErrorModel error, String formUrl, String deeplink) {
        return new AddCardResponse(meta, error, formUrl, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddCardResponse)) {
            return false;
        }
        AddCardResponse addCardResponse = (AddCardResponse) other;
        return Intrinsics.areEqual(this.meta, addCardResponse.meta) && Intrinsics.areEqual(this.error, addCardResponse.error) && Intrinsics.areEqual(this.formUrl, addCardResponse.formUrl) && Intrinsics.areEqual(this.deeplink, addCardResponse.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
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

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iHashCode = (requestMeta == null ? 0 : requestMeta.hashCode()) * 31;
        ErrorModel errorModel = this.error;
        int iHashCode2 = (iHashCode + (errorModel == null ? 0 : errorModel.hashCode())) * 31;
        String str = this.formUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deeplink;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddCardResponse(meta=");
        sb.append(this.meta);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", formUrl=");
        sb.append(this.formUrl);
        sb.append(", deeplink=");
        return C8032c.m1430a(sb, this.deeplink, ')');
    }

    public AddCardResponse(RequestMeta requestMeta, ErrorModel errorModel, String str, String str2) {
        this.meta = requestMeta;
        this.error = errorModel;
        this.formUrl = str;
        this.deeplink = str2;
    }

    public /* synthetic */ AddCardResponse(RequestMeta requestMeta, ErrorModel errorModel, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestMeta, (i & 2) != 0 ? null : errorModel, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
