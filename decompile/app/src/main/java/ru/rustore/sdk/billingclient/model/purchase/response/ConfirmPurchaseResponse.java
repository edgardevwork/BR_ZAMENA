package ru.rustore.sdk.billingclient.model.purchase.response;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;
import ru.rustore.sdk.billingclient.model.common.DigitalShopGeneralError;
import ru.rustore.sdk.billingclient.model.common.RequestMeta;
import ru.rustore.sdk.billingclient.model.common.ResponseWithCode;

@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/response/ConfirmPurchaseResponse;", "Lru/rustore/sdk/billingclient/model/common/ResponseWithCode;", "meta", "Lru/rustore/sdk/billingclient/model/common/RequestMeta;", "code", "", "errorMessage", "", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "errors", "", "Lru/rustore/sdk/billingclient/model/common/DigitalShopGeneralError;", "(Lru/rustore/sdk/billingclient/model/common/RequestMeta;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "getErrorMessage", "getErrors", "()Ljava/util/List;", "getMeta", "()Lru/rustore/sdk/billingclient/model/common/RequestMeta;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ConfirmPurchaseResponse implements ResponseWithCode {
    private final int code;
    private final String errorDescription;
    private final String errorMessage;
    private final List<DigitalShopGeneralError> errors;
    private final RequestMeta meta;

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

    @Override // ru.rustore.sdk.billingclient.model.common.ResponseWithCode
    public int getCode() {
        return this.code;
    }

    @Override // ru.rustore.sdk.billingclient.model.common.ResponseWithCode
    public String getErrorDescription() {
        return this.errorDescription;
    }

    @Override // ru.rustore.sdk.billingclient.model.common.ResponseWithCode
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // ru.rustore.sdk.billingclient.model.common.ResponseWithCode
    public List<DigitalShopGeneralError> getErrors() {
        return this.errors;
    }

    @Override // ru.rustore.sdk.billingclient.model.common.BaseResponse
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
        List<DigitalShopGeneralError> list = this.errors;
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
}
