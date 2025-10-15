package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.VerifyPhoneNumberResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.ErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.ErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class VerifyPhoneNumberJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ErrorJson f5518a;

    /* renamed from: b */
    public final ActionParamsJson f5519b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/VerifyPhoneNumberJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/VerifyPhoneNumberJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<VerifyPhoneNumberJson> serializer() {
            return VerifyPhoneNumberJson$$a.f5520a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ VerifyPhoneNumberJson(int i, ErrorJson errorJson, ActionParamsJson actionParamsJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5518a = null;
        } else {
            this.f5518a = errorJson;
        }
        if ((i & 2) == 0) {
            this.f5519b = null;
        } else {
            this.f5519b = actionParamsJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public VerifyPhoneNumberResponse mo4249a(RequestMeta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        ErrorJson errorJson = this.f5518a;
        ErrorModel errorModelM4242a = errorJson != null ? errorJson.m4242a() : null;
        ActionParamsJson actionParamsJson = this.f5519b;
        return new VerifyPhoneNumberResponse(meta, errorModelM4242a, actionParamsJson != null ? actionParamsJson.m4301b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPhoneNumberJson)) {
            return false;
        }
        VerifyPhoneNumberJson verifyPhoneNumberJson = (VerifyPhoneNumberJson) obj;
        return Intrinsics.areEqual(this.f5518a, verifyPhoneNumberJson.f5518a) && Intrinsics.areEqual(this.f5519b, verifyPhoneNumberJson.f5519b);
    }

    public int hashCode() {
        ErrorJson errorJson = this.f5518a;
        int iHashCode = (errorJson == null ? 0 : errorJson.hashCode()) * 31;
        ActionParamsJson actionParamsJson = this.f5519b;
        return iHashCode + (actionParamsJson != null ? actionParamsJson.hashCode() : 0);
    }

    public String toString() {
        return "VerifyPhoneNumberJson(error=" + this.f5518a + ", userActions=" + this.f5519b + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4465a(VerifyPhoneNumberJson verifyPhoneNumberJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || verifyPhoneNumberJson.f5518a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ErrorJson$$a.f5143a, verifyPhoneNumberJson.f5518a);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && verifyPhoneNumberJson.f5519b == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ActionParamsJson$$a.f5225a, verifyPhoneNumberJson.f5519b);
    }
}
