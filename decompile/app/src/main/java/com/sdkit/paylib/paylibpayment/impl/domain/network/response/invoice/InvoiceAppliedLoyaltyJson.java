package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceAppliedLoyalty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceAppliedLoyaltyJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5269a;

    /* renamed from: b */
    public final String f5270b;

    /* renamed from: c */
    public final double f5271c;

    /* renamed from: d */
    public final Integer f5272d;

    /* renamed from: e */
    public final Integer f5273e;

    /* renamed from: f */
    public final String f5274f;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceAppliedLoyaltyJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceAppliedLoyaltyJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceAppliedLoyaltyJson> serializer() {
            return InvoiceAppliedLoyaltyJson$$a.f5275a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceAppliedLoyaltyJson(int i, String str, String str2, double d, Integer num, Integer num2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InvoiceAppliedLoyaltyJson$$a.f5275a.getDescriptor());
        }
        this.f5269a = str;
        this.f5270b = str2;
        this.f5271c = d;
        if ((i & 8) == 0) {
            this.f5272d = null;
        } else {
            this.f5272d = num;
        }
        if ((i & 16) == 0) {
            this.f5273e = null;
        } else {
            this.f5273e = num2;
        }
        if ((i & 32) == 0) {
            this.f5274f = null;
        } else {
            this.f5274f = str3;
        }
    }

    /* renamed from: a */
    public InvoiceAppliedLoyalty m4334a() {
        return new InvoiceAppliedLoyalty(this.f5269a, this.f5270b, this.f5271c, this.f5272d, this.f5273e, this.f5274f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceAppliedLoyaltyJson)) {
            return false;
        }
        InvoiceAppliedLoyaltyJson invoiceAppliedLoyaltyJson = (InvoiceAppliedLoyaltyJson) obj;
        return Intrinsics.areEqual(this.f5269a, invoiceAppliedLoyaltyJson.f5269a) && Intrinsics.areEqual(this.f5270b, invoiceAppliedLoyaltyJson.f5270b) && Double.compare(this.f5271c, invoiceAppliedLoyaltyJson.f5271c) == 0 && Intrinsics.areEqual(this.f5272d, invoiceAppliedLoyaltyJson.f5272d) && Intrinsics.areEqual(this.f5273e, invoiceAppliedLoyaltyJson.f5273e) && Intrinsics.areEqual(this.f5274f, invoiceAppliedLoyaltyJson.f5274f);
    }

    public int hashCode() {
        int iHashCode = (Double.hashCode(this.f5271c) + C8031b.m1429a(this.f5270b, this.f5269a.hashCode() * 31, 31)) * 31;
        Integer num = this.f5272d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5273e;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f5274f;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceAppliedLoyaltyJson(serviceCode=");
        sb.append(this.f5269a);
        sb.append(", serviceName=");
        sb.append(this.f5270b);
        sb.append(", changeRate=");
        sb.append(this.f5271c);
        sb.append(", paymentBonus=");
        sb.append(this.f5272d);
        sb.append(", awardBonus=");
        sb.append(this.f5273e);
        sb.append(", image=");
        return C8032c.m1430a(sb, this.f5274f, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4333a(InvoiceAppliedLoyaltyJson invoiceAppliedLoyaltyJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, invoiceAppliedLoyaltyJson.f5269a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, invoiceAppliedLoyaltyJson.f5270b);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 2, invoiceAppliedLoyaltyJson.f5271c);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoiceAppliedLoyaltyJson.f5272d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, invoiceAppliedLoyaltyJson.f5272d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoiceAppliedLoyaltyJson.f5273e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, invoiceAppliedLoyaltyJson.f5273e);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && invoiceAppliedLoyaltyJson.f5274f == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, invoiceAppliedLoyaltyJson.f5274f);
    }
}
