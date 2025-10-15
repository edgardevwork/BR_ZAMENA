package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.RequestSmsResponse;
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
public final class RequestSmsJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ErrorJson f5508a;

    /* renamed from: b */
    public final ActionParamsJson f5509b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/RequestSmsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/RequestSmsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<RequestSmsJson> serializer() {
            return RequestSmsJson$$a.f5510a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RequestSmsJson(int i, ErrorJson errorJson, ActionParamsJson actionParamsJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5508a = null;
        } else {
            this.f5508a = errorJson;
        }
        if ((i & 2) == 0) {
            this.f5509b = null;
        } else {
            this.f5509b = actionParamsJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestSmsResponse mo4249a(RequestMeta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        ErrorJson errorJson = this.f5508a;
        ErrorModel errorModelM4242a = errorJson != null ? errorJson.m4242a() : null;
        ActionParamsJson actionParamsJson = this.f5509b;
        return new RequestSmsResponse(meta, errorModelM4242a, actionParamsJson != null ? actionParamsJson.m4301b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestSmsJson)) {
            return false;
        }
        RequestSmsJson requestSmsJson = (RequestSmsJson) obj;
        return Intrinsics.areEqual(this.f5508a, requestSmsJson.f5508a) && Intrinsics.areEqual(this.f5509b, requestSmsJson.f5509b);
    }

    public int hashCode() {
        ErrorJson errorJson = this.f5508a;
        int iHashCode = (errorJson == null ? 0 : errorJson.hashCode()) * 31;
        ActionParamsJson actionParamsJson = this.f5509b;
        return iHashCode + (actionParamsJson != null ? actionParamsJson.hashCode() : 0);
    }

    public String toString() {
        return "RequestSmsJson(error=" + this.f5508a + ", userActions=" + this.f5509b + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4454a(RequestSmsJson requestSmsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || requestSmsJson.f5508a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ErrorJson$$a.f5143a, requestSmsJson.f5508a);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && requestSmsJson.f5509b == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ActionParamsJson$$a.f5225a, requestSmsJson.f5509b);
    }
}
