package com.sdkit.paylib.paylibpayment.impl.domain.network.request.applications;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class BuyApplicationRequestJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5069a;

    /* renamed from: b */
    public final String f5070b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/applications/BuyApplicationRequestJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/applications/BuyApplicationRequestJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<BuyApplicationRequestJson> serializer() {
            return BuyApplicationRequestJson$$a.f5071a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BuyApplicationRequestJson(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BuyApplicationRequestJson$$a.f5071a.getDescriptor());
        }
        this.f5069a = str;
        this.f5070b = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4195a(BuyApplicationRequestJson buyApplicationRequestJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, buyApplicationRequestJson.f5069a);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, buyApplicationRequestJson.f5070b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyApplicationRequestJson)) {
            return false;
        }
        BuyApplicationRequestJson buyApplicationRequestJson = (BuyApplicationRequestJson) obj;
        return Intrinsics.areEqual(this.f5069a, buyApplicationRequestJson.f5069a) && Intrinsics.areEqual(this.f5070b, buyApplicationRequestJson.f5070b);
    }

    public int hashCode() {
        int iHashCode = this.f5069a.hashCode() * 31;
        String str = this.f5070b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BuyApplicationRequestJson(appsCode=");
        sb.append(this.f5069a);
        sb.append(", developerPayload=");
        return C8032c.m1430a(sb, this.f5070b, ')');
    }

    public BuyApplicationRequestJson(String appsCode, String str) {
        Intrinsics.checkNotNullParameter(appsCode, "appsCode");
        this.f5069a = appsCode;
        this.f5070b = str;
    }
}
