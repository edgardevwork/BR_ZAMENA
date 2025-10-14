package com.sdkit.paylib.paylibpayment.api.network.response.subscriptions;

import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.SubscriptionsPayload;
import com.sdkit.paylib.paylibpayment.api.network.response.DigitalShopGeneralError;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;

@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b1\u00102J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/subscriptions/SubscriptionsResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithCode;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "", "component2", "", "component3", "component4", "", "Lcom/sdkit/paylib/paylibpayment/api/network/response/DigitalShopGeneralError;", "component5", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionsPayload;", "component6", "meta", "code", "errorMessage", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "errors", "payload", "copy", "toString", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "I", "getCode", "()I", "c", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "d", "getErrorDescription", "e", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "f", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionsPayload;", "getPayload", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionsPayload;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionsPayload;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class SubscriptionsResponse implements ResponseWithCode {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final int code;

    /* renamed from: c, reason: from kotlin metadata */
    public final String errorMessage;

    /* renamed from: d, reason: from kotlin metadata */
    public final String errorDescription;

    /* renamed from: e, reason: from kotlin metadata */
    public final List errors;

    /* renamed from: f, reason: from kotlin metadata */
    public final SubscriptionsPayload payload;

    public SubscriptionsResponse(RequestMeta requestMeta, int i, String str, String str2, List<DigitalShopGeneralError> list, SubscriptionsPayload subscriptionsPayload) {
        this.meta = requestMeta;
        this.code = i;
        this.errorMessage = str;
        this.errorDescription = str2;
        this.errors = list;
        this.payload = subscriptionsPayload;
    }

    public static /* synthetic */ SubscriptionsResponse copy$default(SubscriptionsResponse subscriptionsResponse, RequestMeta requestMeta, int i, String str, String str2, List list, SubscriptionsPayload subscriptionsPayload, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            requestMeta = subscriptionsResponse.meta;
        }
        if ((i2 & 2) != 0) {
            i = subscriptionsResponse.code;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = subscriptionsResponse.errorMessage;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = subscriptionsResponse.errorDescription;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            list = subscriptionsResponse.errors;
        }
        List list2 = list;
        if ((i2 & 32) != 0) {
            subscriptionsPayload = subscriptionsResponse.payload;
        }
        return subscriptionsResponse.copy(requestMeta, i3, str3, str4, list2, subscriptionsPayload);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestMeta getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final List<DigitalShopGeneralError> component5() {
        return this.errors;
    }

    /* renamed from: component6, reason: from getter */
    public final SubscriptionsPayload getPayload() {
        return this.payload;
    }

    public final SubscriptionsResponse copy(RequestMeta meta, int code, String errorMessage, String errorDescription, List<DigitalShopGeneralError> errors, SubscriptionsPayload payload) {
        return new SubscriptionsResponse(meta, code, errorMessage, errorDescription, errors, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionsResponse)) {
            return false;
        }
        SubscriptionsResponse subscriptionsResponse = (SubscriptionsResponse) other;
        return Intrinsics.areEqual(this.meta, subscriptionsResponse.meta) && this.code == subscriptionsResponse.code && Intrinsics.areEqual(this.errorMessage, subscriptionsResponse.errorMessage) && Intrinsics.areEqual(this.errorDescription, subscriptionsResponse.errorDescription) && Intrinsics.areEqual(this.errors, subscriptionsResponse.errors) && Intrinsics.areEqual(this.payload, subscriptionsResponse.payload);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public int getCode() {
        return this.code;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public String getErrorDescription() {
        return this.errorDescription;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public List<DigitalShopGeneralError> getErrors() {
        return this.errors;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse
    public RequestMeta getMeta() {
        return this.meta;
    }

    public final SubscriptionsPayload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iM1525a = C8054b.m1525a(this.code, (requestMeta == null ? 0 : requestMeta.hashCode()) * 31, 31);
        String str = this.errorMessage;
        int iHashCode = (iM1525a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.errors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SubscriptionsPayload subscriptionsPayload = this.payload;
        return iHashCode3 + (subscriptionsPayload != null ? subscriptionsPayload.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionsResponse(meta=" + this.meta + ", code=" + this.code + ", errorMessage=" + this.errorMessage + ", errorDescription=" + this.errorDescription + ", errors=" + this.errors + ", payload=" + this.payload + ')';
    }

    public /* synthetic */ SubscriptionsResponse(RequestMeta requestMeta, int i, String str, String str2, List list, SubscriptionsPayload subscriptionsPayload, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : requestMeta, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : subscriptionsPayload);
    }
}
