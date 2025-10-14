package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

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
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class VerificationOperationJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5116a;

    /* renamed from: b */
    public final String f5117b;

    /* renamed from: c */
    public final String f5118c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/VerificationOperationJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/VerificationOperationJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<VerificationOperationJson> serializer() {
            return VerificationOperationJson$$a.f5119a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ VerificationOperationJson(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, VerificationOperationJson$$a.f5119a.getDescriptor());
        }
        this.f5116a = str;
        this.f5117b = str2;
        this.f5118c = str3;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4222a(VerificationOperationJson verificationOperationJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, verificationOperationJson.f5116a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, verificationOperationJson.f5117b);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, verificationOperationJson.f5118c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationOperationJson)) {
            return false;
        }
        VerificationOperationJson verificationOperationJson = (VerificationOperationJson) obj;
        return Intrinsics.areEqual(this.f5116a, verificationOperationJson.f5116a) && Intrinsics.areEqual(this.f5117b, verificationOperationJson.f5117b) && Intrinsics.areEqual(this.f5118c, verificationOperationJson.f5118c);
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.f5117b, this.f5116a.hashCode() * 31, 31);
        String str = this.f5118c;
        return iM1429a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VerificationOperationJson(operation=");
        sb.append(this.f5116a);
        sb.append(", code=");
        sb.append(this.f5117b);
        sb.append(", value=");
        return C8032c.m1430a(sb, this.f5118c, ')');
    }

    public VerificationOperationJson(String operation, String code, String str) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f5116a = operation;
        this.f5117b = code;
        this.f5118c = str;
    }
}
