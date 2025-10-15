package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderQuantity;", "", "", "component1", "", "component2", "value", P2MetadataParser.UnitHandler.UNIT, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "D", "getValue", "()D", "b", "Ljava/lang/String;", "getUnit", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(DLjava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoiceOrderQuantity {

    /* renamed from: a, reason: from kotlin metadata */
    public final double value;

    /* renamed from: b, reason: from kotlin metadata */
    public final String unit;

    public InvoiceOrderQuantity(double d, String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.value = d;
        this.unit = unit;
    }

    public static /* synthetic */ InvoiceOrderQuantity copy$default(InvoiceOrderQuantity invoiceOrderQuantity, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = invoiceOrderQuantity.value;
        }
        if ((i & 2) != 0) {
            str = invoiceOrderQuantity.unit;
        }
        return invoiceOrderQuantity.copy(d, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final InvoiceOrderQuantity copy(double value, String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new InvoiceOrderQuantity(value, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceOrderQuantity)) {
            return false;
        }
        InvoiceOrderQuantity invoiceOrderQuantity = (InvoiceOrderQuantity) other;
        return Double.compare(this.value, invoiceOrderQuantity.value) == 0 && Intrinsics.areEqual(this.unit, invoiceOrderQuantity.unit);
    }

    public final String getUnit() {
        return this.unit;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.unit.hashCode() + (Double.hashCode(this.value) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceOrderQuantity(value=");
        sb.append(this.value);
        sb.append(", unit=");
        return C8032c.m1430a(sb, this.unit, ')');
    }
}
