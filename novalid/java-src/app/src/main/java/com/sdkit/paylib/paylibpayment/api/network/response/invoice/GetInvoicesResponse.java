package com.sdkit.paylib.paylibpayment.api.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.Invoice;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b,\u0010-J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\tR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/GetInvoicesResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/Invoice;", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "component5", "meta", "invoices", "totalElements", "totalPages", "error", "copy", "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;)Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/GetInvoicesResponse;", "", "toString", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "Ljava/util/List;", "getInvoices", "()Ljava/util/List;", "c", "Ljava/lang/Integer;", "getTotalElements", "d", "getTotalPages", "e", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "getError", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class GetInvoicesResponse implements ResponseWithError {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final List invoices;

    /* renamed from: c, reason: from kotlin metadata */
    public final Integer totalElements;

    /* renamed from: d, reason: from kotlin metadata */
    public final Integer totalPages;

    /* renamed from: e, reason: from kotlin metadata */
    public final ErrorModel error;

    public GetInvoicesResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ GetInvoicesResponse copy$default(GetInvoicesResponse getInvoicesResponse, RequestMeta requestMeta, List list, Integer num, Integer num2, ErrorModel errorModel, int i, Object obj) {
        if ((i & 1) != 0) {
            requestMeta = getInvoicesResponse.meta;
        }
        if ((i & 2) != 0) {
            list = getInvoicesResponse.invoices;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            num = getInvoicesResponse.totalElements;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = getInvoicesResponse.totalPages;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            errorModel = getInvoicesResponse.error;
        }
        return getInvoicesResponse.copy(requestMeta, list2, num3, num4, errorModel);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestMeta getMeta() {
        return this.meta;
    }

    public final List<Invoice> component2() {
        return this.invoices;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTotalElements() {
        return this.totalElements;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTotalPages() {
        return this.totalPages;
    }

    /* renamed from: component5, reason: from getter */
    public final ErrorModel getError() {
        return this.error;
    }

    public final GetInvoicesResponse copy(RequestMeta meta, List<Invoice> invoices, Integer totalElements, Integer totalPages, ErrorModel error) {
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        return new GetInvoicesResponse(meta, invoices, totalElements, totalPages, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetInvoicesResponse)) {
            return false;
        }
        GetInvoicesResponse getInvoicesResponse = (GetInvoicesResponse) other;
        return Intrinsics.areEqual(this.meta, getInvoicesResponse.meta) && Intrinsics.areEqual(this.invoices, getInvoicesResponse.invoices) && Intrinsics.areEqual(this.totalElements, getInvoicesResponse.totalElements) && Intrinsics.areEqual(this.totalPages, getInvoicesResponse.totalPages) && Intrinsics.areEqual(this.error, getInvoicesResponse.error);
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError
    public ErrorModel getError() {
        return this.error;
    }

    public final List<Invoice> getInvoices() {
        return this.invoices;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse
    public RequestMeta getMeta() {
        return this.meta;
    }

    public final Integer getTotalElements() {
        return this.totalElements;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iHashCode = (this.invoices.hashCode() + ((requestMeta == null ? 0 : requestMeta.hashCode()) * 31)) * 31;
        Integer num = this.totalElements;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalPages;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ErrorModel errorModel = this.error;
        return iHashCode3 + (errorModel != null ? errorModel.hashCode() : 0);
    }

    public String toString() {
        return "GetInvoicesResponse(meta=" + this.meta + ", invoices=" + this.invoices + ", totalElements=" + this.totalElements + ", totalPages=" + this.totalPages + ", error=" + this.error + ')';
    }

    public GetInvoicesResponse(RequestMeta requestMeta, List<Invoice> invoices, Integer num, Integer num2, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(invoices, "invoices");
        this.meta = requestMeta;
        this.invoices = invoices;
        this.totalElements = num;
        this.totalPages = num2;
        this.error = errorModel;
    }

    public /* synthetic */ GetInvoicesResponse(RequestMeta requestMeta, List list, Integer num, Integer num2, ErrorModel errorModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestMeta, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : errorModel);
    }
}
