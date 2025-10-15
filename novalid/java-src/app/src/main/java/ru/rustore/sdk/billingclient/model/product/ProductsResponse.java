package ru.rustore.sdk.billingclient.model.product;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;
import ru.rustore.sdk.billingclient.model.common.DigitalShopGeneralError;
import ru.rustore.sdk.billingclient.model.common.RequestMeta;
import ru.rustore.sdk.billingclient.model.common.ResponseWithCode;

@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006&"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/product/ProductsResponse;", "Lru/rustore/sdk/billingclient/model/common/ResponseWithCode;", "meta", "Lru/rustore/sdk/billingclient/model/common/RequestMeta;", "code", "", "errorMessage", "", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "errors", "", "Lru/rustore/sdk/billingclient/model/common/DigitalShopGeneralError;", "products", "Lru/rustore/sdk/billingclient/model/product/Product;", "(Lru/rustore/sdk/billingclient/model/common/RequestMeta;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "getErrorMessage", "getErrors", "()Ljava/util/List;", "getMeta", "()Lru/rustore/sdk/billingclient/model/common/RequestMeta;", "getProducts", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductsResponse implements ResponseWithCode {
    private final int code;
    private final String errorDescription;
    private final String errorMessage;
    private final List<DigitalShopGeneralError> errors;
    private final RequestMeta meta;
    private final List<Product> products;

    public ProductsResponse(RequestMeta requestMeta, int i, String str, String str2, List<DigitalShopGeneralError> list, List<Product> list2) {
        this.meta = requestMeta;
        this.code = i;
        this.errorMessage = str;
        this.errorDescription = str2;
        this.errors = list;
        this.products = list2;
    }

    public static /* synthetic */ ProductsResponse copy$default(ProductsResponse productsResponse, RequestMeta requestMeta, int i, String str, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            requestMeta = productsResponse.meta;
        }
        if ((i2 & 2) != 0) {
            i = productsResponse.code;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = productsResponse.errorMessage;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = productsResponse.errorDescription;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            list = productsResponse.errors;
        }
        List list3 = list;
        if ((i2 & 32) != 0) {
            list2 = productsResponse.products;
        }
        return productsResponse.copy(requestMeta, i3, str3, str4, list3, list2);
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

    public final List<Product> component6() {
        return this.products;
    }

    public final ProductsResponse copy(RequestMeta meta, int code, String errorMessage, String errorDescription, List<DigitalShopGeneralError> errors, List<Product> products) {
        return new ProductsResponse(meta, code, errorMessage, errorDescription, errors, products);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsResponse)) {
            return false;
        }
        ProductsResponse productsResponse = (ProductsResponse) other;
        return Intrinsics.areEqual(this.meta, productsResponse.meta) && this.code == productsResponse.code && Intrinsics.areEqual(this.errorMessage, productsResponse.errorMessage) && Intrinsics.areEqual(this.errorDescription, productsResponse.errorDescription) && Intrinsics.areEqual(this.errors, productsResponse.errors) && Intrinsics.areEqual(this.products, productsResponse.products);
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

    public final List<Product> getProducts() {
        return this.products;
    }

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iM1525a = C8054b.m1525a(this.code, (requestMeta == null ? 0 : requestMeta.hashCode()) * 31, 31);
        String str = this.errorMessage;
        int iHashCode = (iM1525a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DigitalShopGeneralError> list = this.errors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Product> list2 = this.products;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProductsResponse(meta=");
        sb.append(this.meta);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", errorDescription=");
        sb.append(this.errorDescription);
        sb.append(", errors=");
        sb.append(this.errors);
        sb.append(", products=");
        return C8045g.m1489a(sb, this.products, ')');
    }
}
