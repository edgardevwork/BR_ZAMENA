package com.sdkit.paylib.paylibpayment.api.network.response.bistro;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.entity.bistro.BankInfo;
import com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J%\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/bistro/BanksListResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/BaseResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/bistro/BankInfo;", "component2", "meta", "banksList", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "Ljava/util/List;", "getBanksList", "()Ljava/util/List;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Ljava/util/List;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class BanksListResponse implements BaseResponse {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final List banksList;

    public BanksListResponse(RequestMeta requestMeta, List<BankInfo> banksList) {
        Intrinsics.checkNotNullParameter(banksList, "banksList");
        this.meta = requestMeta;
        this.banksList = banksList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BanksListResponse copy$default(BanksListResponse banksListResponse, RequestMeta requestMeta, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            requestMeta = banksListResponse.meta;
        }
        if ((i & 2) != 0) {
            list = banksListResponse.banksList;
        }
        return banksListResponse.copy(requestMeta, list);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestMeta getMeta() {
        return this.meta;
    }

    public final List<BankInfo> component2() {
        return this.banksList;
    }

    public final BanksListResponse copy(RequestMeta meta, List<BankInfo> banksList) {
        Intrinsics.checkNotNullParameter(banksList, "banksList");
        return new BanksListResponse(meta, banksList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BanksListResponse)) {
            return false;
        }
        BanksListResponse banksListResponse = (BanksListResponse) other;
        return Intrinsics.areEqual(this.meta, banksListResponse.meta) && Intrinsics.areEqual(this.banksList, banksListResponse.banksList);
    }

    public final List<BankInfo> getBanksList() {
        return this.banksList;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse
    public RequestMeta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        return this.banksList.hashCode() + ((requestMeta == null ? 0 : requestMeta.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BanksListResponse(meta=");
        sb.append(this.meta);
        sb.append(", banksList=");
        return C8045g.m1489a(sb, this.banksList, ')');
    }

    public /* synthetic */ BanksListResponse(RequestMeta requestMeta, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestMeta, list);
    }
}
