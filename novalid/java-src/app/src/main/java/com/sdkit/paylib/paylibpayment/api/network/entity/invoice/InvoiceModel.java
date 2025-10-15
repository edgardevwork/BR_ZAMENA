package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b6\u00107J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0014\u0010/R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010/R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00068"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceModel;", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePurchaser;", "component1", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryInfo;", "component2", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceParam;", "component3", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrder;", "component4", "", "component5", "component6", "", "component7", "purchaser", "deliveryInfo", "invoiceParams", "order", "isSubscription", "canSaveBindings", "partnerClientId", "copy", "toString", "", "hashCode", "other", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePurchaser;", "getPurchaser", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePurchaser;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryInfo;", "getDeliveryInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryInfo;", "c", "Ljava/util/List;", "getInvoiceParams", "()Ljava/util/List;", "d", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrder;", "getOrder", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrder;", "e", "Z", "()Z", "f", "getCanSaveBindings", "g", "Ljava/lang/String;", "getPartnerClientId", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePurchaser;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryInfo;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrder;ZZLjava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoiceModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final InvoicePurchaser purchaser;

    /* renamed from: b, reason: from kotlin metadata */
    public final InvoiceDeliveryInfo deliveryInfo;

    /* renamed from: c, reason: from kotlin metadata */
    public final List invoiceParams;

    /* renamed from: d, reason: from kotlin metadata */
    public final InvoiceOrder order;

    /* renamed from: e, reason: from kotlin metadata */
    public final boolean isSubscription;

    /* renamed from: f, reason: from kotlin metadata */
    public final boolean canSaveBindings;

    /* renamed from: g, reason: from kotlin metadata */
    public final String partnerClientId;

    public InvoiceModel(InvoicePurchaser invoicePurchaser, InvoiceDeliveryInfo invoiceDeliveryInfo, List<InvoiceParam> invoiceParams, InvoiceOrder order, boolean z, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(invoiceParams, "invoiceParams");
        Intrinsics.checkNotNullParameter(order, "order");
        this.purchaser = invoicePurchaser;
        this.deliveryInfo = invoiceDeliveryInfo;
        this.invoiceParams = invoiceParams;
        this.order = order;
        this.isSubscription = z;
        this.canSaveBindings = z2;
        this.partnerClientId = str;
    }

    public static /* synthetic */ InvoiceModel copy$default(InvoiceModel invoiceModel, InvoicePurchaser invoicePurchaser, InvoiceDeliveryInfo invoiceDeliveryInfo, List list, InvoiceOrder invoiceOrder, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            invoicePurchaser = invoiceModel.purchaser;
        }
        if ((i & 2) != 0) {
            invoiceDeliveryInfo = invoiceModel.deliveryInfo;
        }
        InvoiceDeliveryInfo invoiceDeliveryInfo2 = invoiceDeliveryInfo;
        if ((i & 4) != 0) {
            list = invoiceModel.invoiceParams;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            invoiceOrder = invoiceModel.order;
        }
        InvoiceOrder invoiceOrder2 = invoiceOrder;
        if ((i & 16) != 0) {
            z = invoiceModel.isSubscription;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = invoiceModel.canSaveBindings;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            str = invoiceModel.partnerClientId;
        }
        return invoiceModel.copy(invoicePurchaser, invoiceDeliveryInfo2, list2, invoiceOrder2, z3, z4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final InvoicePurchaser getPurchaser() {
        return this.purchaser;
    }

    /* renamed from: component2, reason: from getter */
    public final InvoiceDeliveryInfo getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public final List<InvoiceParam> component3() {
        return this.invoiceParams;
    }

    /* renamed from: component4, reason: from getter */
    public final InvoiceOrder getOrder() {
        return this.order;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSubscription() {
        return this.isSubscription;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCanSaveBindings() {
        return this.canSaveBindings;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPartnerClientId() {
        return this.partnerClientId;
    }

    public final InvoiceModel copy(InvoicePurchaser purchaser, InvoiceDeliveryInfo deliveryInfo, List<InvoiceParam> invoiceParams, InvoiceOrder order, boolean isSubscription, boolean canSaveBindings, String partnerClientId) {
        Intrinsics.checkNotNullParameter(invoiceParams, "invoiceParams");
        Intrinsics.checkNotNullParameter(order, "order");
        return new InvoiceModel(purchaser, deliveryInfo, invoiceParams, order, isSubscription, canSaveBindings, partnerClientId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceModel)) {
            return false;
        }
        InvoiceModel invoiceModel = (InvoiceModel) other;
        return Intrinsics.areEqual(this.purchaser, invoiceModel.purchaser) && Intrinsics.areEqual(this.deliveryInfo, invoiceModel.deliveryInfo) && Intrinsics.areEqual(this.invoiceParams, invoiceModel.invoiceParams) && Intrinsics.areEqual(this.order, invoiceModel.order) && this.isSubscription == invoiceModel.isSubscription && this.canSaveBindings == invoiceModel.canSaveBindings && Intrinsics.areEqual(this.partnerClientId, invoiceModel.partnerClientId);
    }

    public final boolean getCanSaveBindings() {
        return this.canSaveBindings;
    }

    public final InvoiceDeliveryInfo getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public final List<InvoiceParam> getInvoiceParams() {
        return this.invoiceParams;
    }

    public final InvoiceOrder getOrder() {
        return this.order;
    }

    public final String getPartnerClientId() {
        return this.partnerClientId;
    }

    public final InvoicePurchaser getPurchaser() {
        return this.purchaser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        InvoicePurchaser invoicePurchaser = this.purchaser;
        int iHashCode = (invoicePurchaser == null ? 0 : invoicePurchaser.hashCode()) * 31;
        InvoiceDeliveryInfo invoiceDeliveryInfo = this.deliveryInfo;
        int iHashCode2 = (this.order.hashCode() + ((this.invoiceParams.hashCode() + ((iHashCode + (invoiceDeliveryInfo == null ? 0 : invoiceDeliveryInfo.hashCode())) * 31)) * 31)) * 31;
        boolean z = this.isSubscription;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        boolean z2 = this.canSaveBindings;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.partnerClientId;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isSubscription() {
        return this.isSubscription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceModel(purchaser=");
        sb.append(this.purchaser);
        sb.append(", deliveryInfo=");
        sb.append(this.deliveryInfo);
        sb.append(", invoiceParams=");
        sb.append(this.invoiceParams);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", isSubscription=");
        sb.append(this.isSubscription);
        sb.append(", canSaveBindings=");
        sb.append(this.canSaveBindings);
        sb.append(", partnerClientId=");
        return C8032c.m1430a(sb, this.partnerClientId, ')');
    }
}
