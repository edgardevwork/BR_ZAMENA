package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class PaymentRequestJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: h */
    public static final KSerializer[] f5103h;

    /* renamed from: a */
    public final PaymentUserId f5104a;

    /* renamed from: b */
    public final Map f5105b;

    /* renamed from: c */
    public final List f5106c;

    /* renamed from: d */
    public final String f5107d;

    /* renamed from: e */
    public final String f5108e;

    /* renamed from: f */
    public final String f5109f;

    /* renamed from: g */
    public final String f5110g;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/PaymentRequestJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/PaymentRequestJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<PaymentRequestJson> serializer() {
            return PaymentRequestJson$$a.f5111a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        f5103h = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), new ArrayListSerializer(PaymentOperationJson$$a.f5091a), null, null, null, null};
    }

    public /* synthetic */ PaymentRequestJson(int i, PaymentUserId paymentUserId, Map map, List list, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, PaymentRequestJson$$a.f5111a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f5104a = null;
        } else {
            this.f5104a = paymentUserId;
        }
        this.f5105b = map;
        this.f5106c = list;
        if ((i & 8) == 0) {
            this.f5107d = null;
        } else {
            this.f5107d = str;
        }
        if ((i & 16) == 0) {
            this.f5108e = null;
        } else {
            this.f5108e = str2;
        }
        if ((i & 32) == 0) {
            this.f5109f = null;
        } else {
            this.f5109f = str3;
        }
        if ((i & 64) == 0) {
            this.f5110g = null;
        } else {
            this.f5110g = str4;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4215a(PaymentRequestJson paymentRequestJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5103h;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || paymentRequestJson.f5104a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, PaymentUserId$$a.f5114a, paymentRequestJson.f5104a);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], paymentRequestJson.f5105b);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], paymentRequestJson.f5106c);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || paymentRequestJson.f5107d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, paymentRequestJson.f5107d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || paymentRequestJson.f5108e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, paymentRequestJson.f5108e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || paymentRequestJson.f5109f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, paymentRequestJson.f5109f);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && paymentRequestJson.f5110g == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, paymentRequestJson.f5110g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentRequestJson)) {
            return false;
        }
        PaymentRequestJson paymentRequestJson = (PaymentRequestJson) obj;
        return Intrinsics.areEqual(this.f5104a, paymentRequestJson.f5104a) && Intrinsics.areEqual(this.f5105b, paymentRequestJson.f5105b) && Intrinsics.areEqual(this.f5106c, paymentRequestJson.f5106c) && Intrinsics.areEqual(this.f5107d, paymentRequestJson.f5107d) && Intrinsics.areEqual(this.f5108e, paymentRequestJson.f5108e) && Intrinsics.areEqual(this.f5109f, paymentRequestJson.f5109f) && Intrinsics.areEqual(this.f5110g, paymentRequestJson.f5110g);
    }

    public int hashCode() {
        PaymentUserId paymentUserId = this.f5104a;
        int iHashCode = (this.f5106c.hashCode() + ((this.f5105b.hashCode() + ((paymentUserId == null ? 0 : paymentUserId.hashCode()) * 31)) * 31)) * 31;
        String str = this.f5107d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5108e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5109f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5110g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentRequestJson(userId=");
        sb.append(this.f5104a);
        sb.append(", deviceInfo=");
        sb.append(this.f5105b);
        sb.append(", operations=");
        sb.append(this.f5106c);
        sb.append(", returnDeeplink=");
        sb.append(this.f5107d);
        sb.append(", returnUrl=");
        sb.append(this.f5108e);
        sb.append(", successUrl=");
        sb.append(this.f5109f);
        sb.append(", failUrl=");
        return C8032c.m1430a(sb, this.f5110g, ')');
    }

    public PaymentRequestJson(PaymentUserId paymentUserId, Map deviceInfo, List operations, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(operations, "operations");
        this.f5104a = paymentUserId;
        this.f5105b = deviceInfo;
        this.f5106c = operations;
        this.f5107d = str;
        this.f5108e = str2;
        this.f5109f = str3;
        this.f5110g = str4;
    }
}
