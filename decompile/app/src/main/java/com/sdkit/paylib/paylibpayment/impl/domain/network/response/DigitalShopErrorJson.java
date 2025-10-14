package com.sdkit.paylib.paylibpayment.impl.domain.network.response;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.response.DigitalShopGeneralError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class DigitalShopErrorJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5135a;

    /* renamed from: b */
    public final Integer f5136b;

    /* renamed from: c */
    public final String f5137c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/DigitalShopErrorJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/DigitalShopErrorJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<DigitalShopErrorJson> serializer() {
            return DigitalShopErrorJson$$a.f5138a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DigitalShopErrorJson(int i, String str, Integer num, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5135a = null;
        } else {
            this.f5135a = str;
        }
        if ((i & 2) == 0) {
            this.f5136b = null;
        } else {
            this.f5136b = num;
        }
        if ((i & 4) == 0) {
            this.f5137c = null;
        } else {
            this.f5137c = str2;
        }
    }

    /* renamed from: a */
    public DigitalShopGeneralError m4238a() {
        return new DigitalShopGeneralError(this.f5135a, this.f5136b, this.f5137c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DigitalShopErrorJson)) {
            return false;
        }
        DigitalShopErrorJson digitalShopErrorJson = (DigitalShopErrorJson) obj;
        return Intrinsics.areEqual(this.f5135a, digitalShopErrorJson.f5135a) && Intrinsics.areEqual(this.f5136b, digitalShopErrorJson.f5136b) && Intrinsics.areEqual(this.f5137c, digitalShopErrorJson.f5137c);
    }

    public int hashCode() {
        String str = this.f5135a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5136b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f5137c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DigitalShopErrorJson(name=");
        sb.append(this.f5135a);
        sb.append(", code=");
        sb.append(this.f5136b);
        sb.append(", description=");
        return C8032c.m1430a(sb, this.f5137c, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4237a(DigitalShopErrorJson digitalShopErrorJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || digitalShopErrorJson.f5135a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, digitalShopErrorJson.f5135a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || digitalShopErrorJson.f5136b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, digitalShopErrorJson.f5136b);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && digitalShopErrorJson.f5137c == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, digitalShopErrorJson.f5137c);
    }
}
