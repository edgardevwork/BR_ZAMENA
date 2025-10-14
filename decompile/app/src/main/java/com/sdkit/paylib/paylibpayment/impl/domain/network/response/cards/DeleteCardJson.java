package com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.DeleteCardResponse;
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
public final class DeleteCardJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ErrorJson f5214a;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/DeleteCardJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/DeleteCardJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<DeleteCardJson> serializer() {
            return DeleteCardJson$$a.f5215a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DeleteCardJson(int i, ErrorJson errorJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5214a = null;
        } else {
            this.f5214a = errorJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DeleteCardResponse mo4249a(RequestMeta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        ErrorJson errorJson = this.f5214a;
        return new DeleteCardResponse(meta, errorJson != null ? errorJson.m4242a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteCardJson) && Intrinsics.areEqual(this.f5214a, ((DeleteCardJson) obj).f5214a);
    }

    public int hashCode() {
        ErrorJson errorJson = this.f5214a;
        if (errorJson == null) {
            return 0;
        }
        return errorJson.hashCode();
    }

    public String toString() {
        return "DeleteCardJson(error=" + this.f5214a + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4290a(DeleteCardJson deleteCardJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && deleteCardJson.f5214a == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ErrorJson$$a.f5143a, deleteCardJson.f5214a);
    }
}
