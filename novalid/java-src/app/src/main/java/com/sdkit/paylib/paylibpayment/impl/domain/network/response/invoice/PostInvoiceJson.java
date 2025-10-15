package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.PostInvoiceResponse;
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
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class PostInvoiceJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ErrorJson f5502a;

    /* renamed from: b */
    public final ActionParamsJson f5503b;

    /* renamed from: c */
    public final String f5504c;

    /* renamed from: d */
    public final String f5505d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/PostInvoiceJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/PostInvoiceJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<PostInvoiceJson> serializer() {
            return PostInvoiceJson$$a.f5506a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PostInvoiceJson(int i, ErrorJson errorJson, ActionParamsJson actionParamsJson, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5502a = null;
        } else {
            this.f5502a = errorJson;
        }
        if ((i & 2) == 0) {
            this.f5503b = null;
        } else {
            this.f5503b = actionParamsJson;
        }
        if ((i & 4) == 0) {
            this.f5504c = null;
        } else {
            this.f5504c = str;
        }
        if ((i & 8) == 0) {
            this.f5505d = null;
        } else {
            this.f5505d = str2;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PostInvoiceResponse mo4249a(RequestMeta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        ErrorJson errorJson = this.f5502a;
        ErrorModel errorModelM4242a = errorJson != null ? errorJson.m4242a() : null;
        ActionParamsJson actionParamsJson = this.f5503b;
        return new PostInvoiceResponse(meta, errorModelM4242a, actionParamsJson != null ? actionParamsJson.m4301b() : null, this.f5504c, this.f5505d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostInvoiceJson)) {
            return false;
        }
        PostInvoiceJson postInvoiceJson = (PostInvoiceJson) obj;
        return Intrinsics.areEqual(this.f5502a, postInvoiceJson.f5502a) && Intrinsics.areEqual(this.f5503b, postInvoiceJson.f5503b) && Intrinsics.areEqual(this.f5504c, postInvoiceJson.f5504c) && Intrinsics.areEqual(this.f5505d, postInvoiceJson.f5505d);
    }

    public int hashCode() {
        ErrorJson errorJson = this.f5502a;
        int iHashCode = (errorJson == null ? 0 : errorJson.hashCode()) * 31;
        ActionParamsJson actionParamsJson = this.f5503b;
        int iHashCode2 = (iHashCode + (actionParamsJson == null ? 0 : actionParamsJson.hashCode())) * 31;
        String str = this.f5504c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5505d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostInvoiceJson(error=");
        sb.append(this.f5502a);
        sb.append(", userActions=");
        sb.append(this.f5503b);
        sb.append(", sbolPayDeepLink=");
        sb.append(this.f5504c);
        sb.append(", formUrl=");
        return C8032c.m1430a(sb, this.f5505d, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4450a(PostInvoiceJson postInvoiceJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || postInvoiceJson.f5502a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ErrorJson$$a.f5143a, postInvoiceJson.f5502a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || postInvoiceJson.f5503b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ActionParamsJson$$a.f5225a, postInvoiceJson.f5503b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || postInvoiceJson.f5504c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, postInvoiceJson.f5504c);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && postInvoiceJson.f5505d == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, postInvoiceJson.f5505d);
    }
}
