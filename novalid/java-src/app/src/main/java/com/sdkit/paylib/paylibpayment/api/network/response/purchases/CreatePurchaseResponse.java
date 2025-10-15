package com.sdkit.paylib.paylibpayment.api.network.response.purchases;

import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayload;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayloadHolder;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.CreatedPurchaseInfo;
import com.sdkit.paylib.paylibpayment.api.network.response.DigitalShopGeneralError;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;

@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b9\u0010:J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006;"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/purchases/CreatePurchaseResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithCode;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayloadHolder;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "", "component2", "", "component3", "component4", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "component5", "", "Lcom/sdkit/paylib/paylibpayment/api/network/response/DigitalShopGeneralError;", "component6", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/CreatedPurchaseInfo;", "component7", "meta", "code", "errorMessage", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "purchasePayload", "errors", "purchaseInfo", "copy", "toString", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "I", "getCode", "()I", "c", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "d", "getErrorDescription", "e", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "getPurchasePayload", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "f", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "g", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/CreatedPurchaseInfo;", "getPurchaseInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/CreatedPurchaseInfo;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;ILjava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/CreatedPurchaseInfo;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class CreatePurchaseResponse implements ResponseWithCode, PurchasePayloadHolder {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final int code;

    /* renamed from: c, reason: from kotlin metadata */
    public final String errorMessage;

    /* renamed from: d, reason: from kotlin metadata */
    public final String errorDescription;

    /* renamed from: e, reason: from kotlin metadata */
    public final PurchasePayload purchasePayload;

    /* renamed from: f, reason: from kotlin metadata */
    public final List errors;

    /* renamed from: g, reason: from kotlin metadata */
    public final CreatedPurchaseInfo purchaseInfo;

    public CreatePurchaseResponse(RequestMeta requestMeta, int i, String str, String str2, PurchasePayload purchasePayload, List<DigitalShopGeneralError> list, CreatedPurchaseInfo createdPurchaseInfo) {
        this.meta = requestMeta;
        this.code = i;
        this.errorMessage = str;
        this.errorDescription = str2;
        this.purchasePayload = purchasePayload;
        this.errors = list;
        this.purchaseInfo = createdPurchaseInfo;
    }

    public static /* synthetic */ CreatePurchaseResponse copy$default(CreatePurchaseResponse createPurchaseResponse, RequestMeta requestMeta, int i, String str, String str2, PurchasePayload purchasePayload, List list, CreatedPurchaseInfo createdPurchaseInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            requestMeta = createPurchaseResponse.meta;
        }
        if ((i2 & 2) != 0) {
            i = createPurchaseResponse.code;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = createPurchaseResponse.errorMessage;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = createPurchaseResponse.errorDescription;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            purchasePayload = createPurchaseResponse.purchasePayload;
        }
        PurchasePayload purchasePayload2 = purchasePayload;
        if ((i2 & 32) != 0) {
            list = createPurchaseResponse.errors;
        }
        List list2 = list;
        if ((i2 & 64) != 0) {
            createdPurchaseInfo = createPurchaseResponse.purchaseInfo;
        }
        return createPurchaseResponse.copy(requestMeta, i3, str3, str4, purchasePayload2, list2, createdPurchaseInfo);
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

    /* renamed from: component5, reason: from getter */
    public final PurchasePayload getPurchasePayload() {
        return this.purchasePayload;
    }

    public final List<DigitalShopGeneralError> component6() {
        return this.errors;
    }

    /* renamed from: component7, reason: from getter */
    public final CreatedPurchaseInfo getPurchaseInfo() {
        return this.purchaseInfo;
    }

    public final CreatePurchaseResponse copy(RequestMeta meta, int code, String errorMessage, String errorDescription, PurchasePayload purchasePayload, List<DigitalShopGeneralError> errors, CreatedPurchaseInfo purchaseInfo) {
        return new CreatePurchaseResponse(meta, code, errorMessage, errorDescription, purchasePayload, errors, purchaseInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePurchaseResponse)) {
            return false;
        }
        CreatePurchaseResponse createPurchaseResponse = (CreatePurchaseResponse) other;
        return Intrinsics.areEqual(this.meta, createPurchaseResponse.meta) && this.code == createPurchaseResponse.code && Intrinsics.areEqual(this.errorMessage, createPurchaseResponse.errorMessage) && Intrinsics.areEqual(this.errorDescription, createPurchaseResponse.errorDescription) && Intrinsics.areEqual(this.purchasePayload, createPurchaseResponse.purchasePayload) && Intrinsics.areEqual(this.errors, createPurchaseResponse.errors) && Intrinsics.areEqual(this.purchaseInfo, createPurchaseResponse.purchaseInfo);
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

    public final CreatedPurchaseInfo getPurchaseInfo() {
        return this.purchaseInfo;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayloadHolder
    public PurchasePayload getPurchasePayload() {
        return this.purchasePayload;
    }

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iM1525a = C8054b.m1525a(this.code, (requestMeta == null ? 0 : requestMeta.hashCode()) * 31, 31);
        String str = this.errorMessage;
        int iHashCode = (iM1525a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PurchasePayload purchasePayload = this.purchasePayload;
        int iHashCode3 = (iHashCode2 + (purchasePayload == null ? 0 : purchasePayload.hashCode())) * 31;
        List list = this.errors;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CreatedPurchaseInfo createdPurchaseInfo = this.purchaseInfo;
        return iHashCode4 + (createdPurchaseInfo != null ? createdPurchaseInfo.hashCode() : 0);
    }

    public String toString() {
        return "CreatePurchaseResponse(meta=" + this.meta + ", code=" + this.code + ", errorMessage=" + this.errorMessage + ", errorDescription=" + this.errorDescription + ", purchasePayload=" + this.purchasePayload + ", errors=" + this.errors + ", purchaseInfo=" + this.purchaseInfo + ')';
    }

    public /* synthetic */ CreatePurchaseResponse(RequestMeta requestMeta, int i, String str, String str2, PurchasePayload purchasePayload, List list, CreatedPurchaseInfo createdPurchaseInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : requestMeta, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : purchasePayload, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : createdPurchaseInfo);
    }
}
