package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryInfo;", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryAddress;", "component1", "", "component2", "component3", "address", "type", "description", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryAddress;", "getAddress", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryAddress;", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "c", "getDescription", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeliveryAddress;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoiceDeliveryInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final InvoiceDeliveryAddress address;

    /* renamed from: b, reason: from kotlin metadata */
    public final String type;

    /* renamed from: c, reason: from kotlin metadata */
    public final String description;

    public InvoiceDeliveryInfo(InvoiceDeliveryAddress invoiceDeliveryAddress, String str, String str2) {
        this.address = invoiceDeliveryAddress;
        this.type = str;
        this.description = str2;
    }

    public static /* synthetic */ InvoiceDeliveryInfo copy$default(InvoiceDeliveryInfo invoiceDeliveryInfo, InvoiceDeliveryAddress invoiceDeliveryAddress, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            invoiceDeliveryAddress = invoiceDeliveryInfo.address;
        }
        if ((i & 2) != 0) {
            str = invoiceDeliveryInfo.type;
        }
        if ((i & 4) != 0) {
            str2 = invoiceDeliveryInfo.description;
        }
        return invoiceDeliveryInfo.copy(invoiceDeliveryAddress, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvoiceDeliveryAddress getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final InvoiceDeliveryInfo copy(InvoiceDeliveryAddress address, String type, String description) {
        return new InvoiceDeliveryInfo(address, type, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceDeliveryInfo)) {
            return false;
        }
        InvoiceDeliveryInfo invoiceDeliveryInfo = (InvoiceDeliveryInfo) other;
        return Intrinsics.areEqual(this.address, invoiceDeliveryInfo.address) && Intrinsics.areEqual(this.type, invoiceDeliveryInfo.type) && Intrinsics.areEqual(this.description, invoiceDeliveryInfo.description);
    }

    public final InvoiceDeliveryAddress getAddress() {
        return this.address;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        InvoiceDeliveryAddress invoiceDeliveryAddress = this.address;
        int iHashCode = (invoiceDeliveryAddress == null ? 0 : invoiceDeliveryAddress.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceDeliveryInfo(address=");
        sb.append(this.address);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", description=");
        return C8032c.m1430a(sb, this.description, ')');
    }
}
