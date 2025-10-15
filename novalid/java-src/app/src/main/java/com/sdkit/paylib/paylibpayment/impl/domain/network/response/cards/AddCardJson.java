package com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.AddCardResponse;
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
public final class AddCardJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ErrorJson f5186a;

    /* renamed from: b */
    public final String f5187b;

    /* renamed from: c */
    public final String f5188c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/AddCardJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/AddCardJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<AddCardJson> serializer() {
            return AddCardJson$$a.f5189a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddCardJson(int i, ErrorJson errorJson, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5186a = null;
        } else {
            this.f5186a = errorJson;
        }
        if ((i & 2) == 0) {
            this.f5187b = null;
        } else {
            this.f5187b = str;
        }
        if ((i & 4) == 0) {
            this.f5188c = null;
        } else {
            this.f5188c = str2;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AddCardResponse mo4249a(RequestMeta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        ErrorJson errorJson = this.f5186a;
        return new AddCardResponse(meta, errorJson != null ? errorJson.m4242a() : null, this.f5187b, this.f5188c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardJson)) {
            return false;
        }
        AddCardJson addCardJson = (AddCardJson) obj;
        return Intrinsics.areEqual(this.f5186a, addCardJson.f5186a) && Intrinsics.areEqual(this.f5187b, addCardJson.f5187b) && Intrinsics.areEqual(this.f5188c, addCardJson.f5188c);
    }

    public int hashCode() {
        ErrorJson errorJson = this.f5186a;
        int iHashCode = (errorJson == null ? 0 : errorJson.hashCode()) * 31;
        String str = this.f5187b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5188c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddCardJson(error=");
        sb.append(this.f5186a);
        sb.append(", formUrl=");
        sb.append(this.f5187b);
        sb.append(", deeplink=");
        return C8032c.m1430a(sb, this.f5188c, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4278a(AddCardJson addCardJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addCardJson.f5186a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ErrorJson$$a.f5143a, addCardJson.f5186a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addCardJson.f5187b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, addCardJson.f5187b);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && addCardJson.f5188c == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, addCardJson.f5188c);
    }
}
