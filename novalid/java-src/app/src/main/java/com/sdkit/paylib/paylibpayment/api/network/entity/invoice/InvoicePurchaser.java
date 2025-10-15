package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePurchaser;", "", "", "component1", "component2", "component3", "email", "phone", "contact", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "b", "getPhone", "c", "getContact", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoicePurchaser {

    /* renamed from: a, reason: from kotlin metadata */
    public final String email;

    /* renamed from: b, reason: from kotlin metadata */
    public final String phone;

    /* renamed from: c, reason: from kotlin metadata */
    public final String contact;

    public InvoicePurchaser(String str, String str2, String str3) {
        this.email = str;
        this.phone = str2;
        this.contact = str3;
    }

    public static /* synthetic */ InvoicePurchaser copy$default(InvoicePurchaser invoicePurchaser, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invoicePurchaser.email;
        }
        if ((i & 2) != 0) {
            str2 = invoicePurchaser.phone;
        }
        if ((i & 4) != 0) {
            str3 = invoicePurchaser.contact;
        }
        return invoicePurchaser.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContact() {
        return this.contact;
    }

    public final InvoicePurchaser copy(String email, String phone, String contact) {
        return new InvoicePurchaser(email, phone, contact);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoicePurchaser)) {
            return false;
        }
        InvoicePurchaser invoicePurchaser = (InvoicePurchaser) other;
        return Intrinsics.areEqual(this.email, invoicePurchaser.email) && Intrinsics.areEqual(this.phone, invoicePurchaser.phone) && Intrinsics.areEqual(this.contact, invoicePurchaser.contact);
    }

    public final String getContact() {
        return this.contact;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contact;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoicePurchaser(email=");
        sb.append(this.email);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", contact=");
        return C8032c.m1430a(sb, this.contact, ')');
    }
}
