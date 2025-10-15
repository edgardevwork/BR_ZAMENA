package com.sdkit.paylib.paylibpayment.api.network.response.cards;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.cards.Card;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b!\u0010\"J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/cards/CardsResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "component1", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "component2", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/Card;", "component3", "meta", "error", "cards", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "getError", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "c", "Ljava/util/List;", "getCards", "()Ljava/util/List;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;Ljava/util/List;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class CardsResponse implements ResponseWithError {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final ErrorModel error;

    /* renamed from: c, reason: from kotlin metadata */
    public final List cards;

    public CardsResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardsResponse copy$default(CardsResponse cardsResponse, RequestMeta requestMeta, ErrorModel errorModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            requestMeta = cardsResponse.meta;
        }
        if ((i & 2) != 0) {
            errorModel = cardsResponse.error;
        }
        if ((i & 4) != 0) {
            list = cardsResponse.cards;
        }
        return cardsResponse.copy(requestMeta, errorModel, list);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestMeta getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorModel getError() {
        return this.error;
    }

    public final List<Card> component3() {
        return this.cards;
    }

    public final CardsResponse copy(RequestMeta meta, ErrorModel error, List<Card> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        return new CardsResponse(meta, error, cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardsResponse)) {
            return false;
        }
        CardsResponse cardsResponse = (CardsResponse) other;
        return Intrinsics.areEqual(this.meta, cardsResponse.meta) && Intrinsics.areEqual(this.error, cardsResponse.error) && Intrinsics.areEqual(this.cards, cardsResponse.cards);
    }

    public final List<Card> getCards() {
        return this.cards;
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
        return this.cards.hashCode() + ((iHashCode + (errorModel != null ? errorModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardsResponse(meta=");
        sb.append(this.meta);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", cards=");
        return C8045g.m1489a(sb, this.cards, ')');
    }

    public CardsResponse(RequestMeta requestMeta, ErrorModel errorModel, List<Card> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.meta = requestMeta;
        this.error = errorModel;
        this.cards = cards;
    }

    public /* synthetic */ CardsResponse(RequestMeta requestMeta, ErrorModel errorModel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestMeta, (i & 2) != 0 ? null : errorModel, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
