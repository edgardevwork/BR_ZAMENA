package com.sdkit.paylib.paylibpayment.api.network.response.purchases;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.Purchase;
import com.sdkit.paylib.paylibpayment.api.network.response.DigitalShopGeneralError;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;

@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b/\u00100J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J[\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,¨\u00061"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/purchases/PurchasesResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithCode;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "", "component2", "", "component3", "component4", "", "Lcom/sdkit/paylib/paylibpayment/api/network/response/DigitalShopGeneralError;", "component5", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/Purchase;", "component6", "meta", "code", "errorMessage", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "errors", "purchases", "copy", "toString", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "I", "getCode", "()I", "c", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "d", "getErrorDescription", "e", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "f", "getPurchases", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class PurchasesResponse implements ResponseWithCode {

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
    public final List purchases;

    public PurchasesResponse(RequestMeta requestMeta, int i, String str, String str2, List<DigitalShopGeneralError> list, List<Purchase> list2) {
        this.meta = requestMeta;
        this.code = i;
        this.errorMessage = str;
        this.errorDescription = str2;
        this.errors = list;
        this.purchases = list2;
    }

    public static /* synthetic */ PurchasesResponse copy$default(PurchasesResponse purchasesResponse, RequestMeta requestMeta, int i, String str, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            requestMeta = purchasesResponse.meta;
        }
        if ((i2 & 2) != 0) {
            i = purchasesResponse.code;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = purchasesResponse.errorMessage;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = purchasesResponse.errorDescription;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            list = purchasesResponse.errors;
        }
        List list3 = list;
        if ((i2 & 32) != 0) {
            list2 = purchasesResponse.purchases;
        }
        return purchasesResponse.copy(requestMeta, i3, str3, str4, list3, list2);
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

    public final List<Purchase> component6() {
        return this.purchases;
    }

    public final PurchasesResponse copy(RequestMeta meta, int code, String errorMessage, String errorDescription, List<DigitalShopGeneralError> errors, List<Purchase> purchases) {
        return new PurchasesResponse(meta, code, errorMessage, errorDescription, errors, purchases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchasesResponse)) {
            return false;
        }
        PurchasesResponse purchasesResponse = (PurchasesResponse) other;
        return Intrinsics.areEqual(this.meta, purchasesResponse.meta) && this.code == purchasesResponse.code && Intrinsics.areEqual(this.errorMessage, purchasesResponse.errorMessage) && Intrinsics.areEqual(this.errorDescription, purchasesResponse.errorDescription) && Intrinsics.areEqual(this.errors, purchasesResponse.errors) && Intrinsics.areEqual(this.purchases, purchasesResponse.purchases);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public int getCode() {
        return this.code;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    /* renamed from: getErrorDescription */
    public String getRu.rustore.sdk.activitylauncher.ActivityLauncherAnalytics.ERROR_DESCRIPTION java.lang.String() {
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

    public final List<Purchase> getPurchases() {
        return this.purchases;
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
        List list2 = this.purchases;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchasesResponse(meta=");
        sb.append(this.meta);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", errorDescription=");
        sb.append(this.errorDescription);
        sb.append(", errors=");
        sb.append(this.errors);
        sb.append(", purchases=");
        return C8045g.m1489a(sb, this.purchases, ')');
    }

    public /* synthetic */ PurchasesResponse(RequestMeta requestMeta, int i, String str, String str2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : requestMeta, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2);
    }
}
