package com.sdkit.paylib.paylibpayment.api.network.response.purchases;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import com.sdkit.paylib.paylibpayment.api.network.response.DigitalShopGeneralError;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;

@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b*\u0010+J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JI\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/purchases/ConfirmPurchaseResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithCode;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "", "component2", "", "component3", "component4", "", "Lcom/sdkit/paylib/paylibpayment/api/network/response/DigitalShopGeneralError;", "component5", "meta", "code", "errorMessage", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "errors", "copy", "toString", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "I", "getCode", "()I", "c", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "d", "getErrorDescription", "e", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class ConfirmPurchaseResponse implements ResponseWithCode {

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

    public ConfirmPurchaseResponse(RequestMeta requestMeta, int i, String str, String str2, List<DigitalShopGeneralError> list) {
        this.meta = requestMeta;
        this.code = i;
        this.errorMessage = str;
        this.errorDescription = str2;
        this.errors = list;
    }

    public static /* synthetic */ ConfirmPurchaseResponse copy$default(ConfirmPurchaseResponse confirmPurchaseResponse, RequestMeta requestMeta, int i, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            requestMeta = confirmPurchaseResponse.meta;
        }
        if ((i2 & 2) != 0) {
            i = confirmPurchaseResponse.code;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = confirmPurchaseResponse.errorMessage;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = confirmPurchaseResponse.errorDescription;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            list = confirmPurchaseResponse.errors;
        }
        return confirmPurchaseResponse.copy(requestMeta, i3, str3, str4, list);
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

    public final ConfirmPurchaseResponse copy(RequestMeta meta, int code, String errorMessage, String errorDescription, List<DigitalShopGeneralError> errors) {
        return new ConfirmPurchaseResponse(meta, code, errorMessage, errorDescription, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmPurchaseResponse)) {
            return false;
        }
        ConfirmPurchaseResponse confirmPurchaseResponse = (ConfirmPurchaseResponse) other;
        return Intrinsics.areEqual(this.meta, confirmPurchaseResponse.meta) && this.code == confirmPurchaseResponse.code && Intrinsics.areEqual(this.errorMessage, confirmPurchaseResponse.errorMessage) && Intrinsics.areEqual(this.errorDescription, confirmPurchaseResponse.errorDescription) && Intrinsics.areEqual(this.errors, confirmPurchaseResponse.errors);
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

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iM1525a = C8054b.m1525a(this.code, (requestMeta == null ? 0 : requestMeta.hashCode()) * 31, 31);
        String str = this.errorMessage;
        int iHashCode = (iM1525a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.errors;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfirmPurchaseResponse(meta=");
        sb.append(this.meta);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", errorDescription=");
        sb.append(this.errorDescription);
        sb.append(", errors=");
        return C8045g.m1489a(sb, this.errors, ')');
    }

    public /* synthetic */ ConfirmPurchaseResponse(RequestMeta requestMeta, int i, String str, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : requestMeta, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : list);
    }
}
