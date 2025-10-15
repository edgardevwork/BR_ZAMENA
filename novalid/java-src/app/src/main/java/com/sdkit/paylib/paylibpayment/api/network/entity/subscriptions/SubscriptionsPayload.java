package com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J:\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionsPayload;", "", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscription;", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "purchaseSubscriptions", "totalPages", "totalElements", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionsPayload;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getPurchaseSubscriptions", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "getTotalPages", "c", "getTotalElements", SegmentConstantPool.INITSTRING, "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class SubscriptionsPayload {

    /* renamed from: a, reason: from kotlin metadata */
    public final List purchaseSubscriptions;

    /* renamed from: b, reason: from kotlin metadata */
    public final Integer totalPages;

    /* renamed from: c, reason: from kotlin metadata */
    public final Integer totalElements;

    public SubscriptionsPayload(List<PurchaseSubscription> list, Integer num, Integer num2) {
        this.purchaseSubscriptions = list;
        this.totalPages = num;
        this.totalElements = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionsPayload copy$default(SubscriptionsPayload subscriptionsPayload, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = subscriptionsPayload.purchaseSubscriptions;
        }
        if ((i & 2) != 0) {
            num = subscriptionsPayload.totalPages;
        }
        if ((i & 4) != 0) {
            num2 = subscriptionsPayload.totalElements;
        }
        return subscriptionsPayload.copy(list, num, num2);
    }

    public final List<PurchaseSubscription> component1() {
        return this.purchaseSubscriptions;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getTotalPages() {
        return this.totalPages;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTotalElements() {
        return this.totalElements;
    }

    public final SubscriptionsPayload copy(List<PurchaseSubscription> purchaseSubscriptions, Integer totalPages, Integer totalElements) {
        return new SubscriptionsPayload(purchaseSubscriptions, totalPages, totalElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionsPayload)) {
            return false;
        }
        SubscriptionsPayload subscriptionsPayload = (SubscriptionsPayload) other;
        return Intrinsics.areEqual(this.purchaseSubscriptions, subscriptionsPayload.purchaseSubscriptions) && Intrinsics.areEqual(this.totalPages, subscriptionsPayload.totalPages) && Intrinsics.areEqual(this.totalElements, subscriptionsPayload.totalElements);
    }

    public final List<PurchaseSubscription> getPurchaseSubscriptions() {
        return this.purchaseSubscriptions;
    }

    public final Integer getTotalElements() {
        return this.totalElements;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        List list = this.purchaseSubscriptions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.totalPages;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalElements;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionsPayload(purchaseSubscriptions=" + this.purchaseSubscriptions + ", totalPages=" + this.totalPages + ", totalElements=" + this.totalElements + ')';
    }
}
