package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes6.dex */
public final class InputParamsJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5264a;

    /* renamed from: b */
    public final String f5265b;

    /* renamed from: c */
    public final String f5266c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InputParamsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InputParamsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InputParamsJson> serializer() {
            return InputParamsJson$$a.f5267a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InputParamsJson(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InputParamsJson$$a.f5267a.getDescriptor());
        }
        this.f5264a = str;
        this.f5265b = str2;
        this.f5266c = str3;
    }

    /* renamed from: a */
    public final String m4330a() {
        return this.f5266c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputParamsJson)) {
            return false;
        }
        InputParamsJson inputParamsJson = (InputParamsJson) obj;
        return Intrinsics.areEqual(this.f5264a, inputParamsJson.f5264a) && Intrinsics.areEqual(this.f5265b, inputParamsJson.f5265b) && Intrinsics.areEqual(this.f5266c, inputParamsJson.f5266c);
    }

    public int hashCode() {
        return this.f5266c.hashCode() + C8031b.m1429a(this.f5265b, this.f5264a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InputParamsJson(hint=");
        sb.append(this.f5264a);
        sb.append(", code=");
        sb.append(this.f5265b);
        sb.append(", validator=");
        return C8032c.m1430a(sb, this.f5266c, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4329a(InputParamsJson inputParamsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inputParamsJson.f5264a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, inputParamsJson.f5265b);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, inputParamsJson.f5266c);
    }
}
