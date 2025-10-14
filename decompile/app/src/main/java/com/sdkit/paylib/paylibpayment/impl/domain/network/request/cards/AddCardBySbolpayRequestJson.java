package com.sdkit.paylib.paylibpayment.impl.domain.network.request.cards;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class AddCardBySbolpayRequestJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final KSerializer[] f5073e;

    /* renamed from: a */
    public final Map f5074a;

    /* renamed from: b */
    public final String f5075b;

    /* renamed from: c */
    public final String f5076c;

    /* renamed from: d */
    public final String f5077d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/cards/AddCardBySbolpayRequestJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/cards/AddCardBySbolpayRequestJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<AddCardBySbolpayRequestJson> serializer() {
            return AddCardBySbolpayRequestJson$$a.f5078a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        f5073e = new KSerializer[]{new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null};
    }

    public /* synthetic */ AddCardBySbolpayRequestJson(int i, Map map, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, AddCardBySbolpayRequestJson$$a.f5078a.getDescriptor());
        }
        this.f5074a = map;
        this.f5075b = str;
        if ((i & 4) == 0) {
            this.f5076c = "app2sbol";
        } else {
            this.f5076c = str2;
        }
        this.f5077d = str3;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4198a(AddCardBySbolpayRequestJson addCardBySbolpayRequestJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, f5073e[0], addCardBySbolpayRequestJson.f5074a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, addCardBySbolpayRequestJson.f5075b);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.areEqual(addCardBySbolpayRequestJson.f5076c, "app2sbol")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, addCardBySbolpayRequestJson.f5076c);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, addCardBySbolpayRequestJson.f5077d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardBySbolpayRequestJson)) {
            return false;
        }
        AddCardBySbolpayRequestJson addCardBySbolpayRequestJson = (AddCardBySbolpayRequestJson) obj;
        return Intrinsics.areEqual(this.f5074a, addCardBySbolpayRequestJson.f5074a) && Intrinsics.areEqual(this.f5075b, addCardBySbolpayRequestJson.f5075b) && Intrinsics.areEqual(this.f5076c, addCardBySbolpayRequestJson.f5076c) && Intrinsics.areEqual(this.f5077d, addCardBySbolpayRequestJson.f5077d);
    }

    public int hashCode() {
        return this.f5077d.hashCode() + C8031b.m1429a(this.f5076c, C8031b.m1429a(this.f5075b, this.f5074a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddCardBySbolpayRequestJson(deviceInfo=");
        sb.append(this.f5074a);
        sb.append(", orderId=");
        sb.append(this.f5075b);
        sb.append(", code=");
        sb.append(this.f5076c);
        sb.append(", returnDeeplink=");
        return C8032c.m1430a(sb, this.f5077d, ')');
    }

    public AddCardBySbolpayRequestJson(Map deviceInfo, String orderId, String code, String returnDeeplink) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(returnDeeplink, "returnDeeplink");
        this.f5074a = deviceInfo;
        this.f5075b = orderId;
        this.f5076c = code;
        this.f5077d = returnDeeplink;
    }

    public /* synthetic */ AddCardBySbolpayRequestJson(Map map, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, str, (i & 4) != 0 ? "app2sbol" : str2, str3);
    }
}
