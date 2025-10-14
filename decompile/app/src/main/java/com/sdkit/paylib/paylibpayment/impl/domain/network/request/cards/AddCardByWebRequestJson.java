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
public final class AddCardByWebRequestJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5080f;

    /* renamed from: a */
    public final Map f5081a;

    /* renamed from: b */
    public final String f5082b;

    /* renamed from: c */
    public final String f5083c;

    /* renamed from: d */
    public final String f5084d;

    /* renamed from: e */
    public final String f5085e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/cards/AddCardByWebRequestJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/cards/AddCardByWebRequestJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<AddCardByWebRequestJson> serializer() {
            return AddCardByWebRequestJson$$a.f5086a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        f5080f = new KSerializer[]{new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, null};
    }

    public /* synthetic */ AddCardByWebRequestJson(int i, Map map, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (27 != (i & 27)) {
            PluginExceptionsKt.throwMissingFieldException(i, 27, AddCardByWebRequestJson$$a.f5086a.getDescriptor());
        }
        this.f5081a = map;
        this.f5082b = str;
        if ((i & 4) == 0) {
            this.f5083c = "new";
        } else {
            this.f5083c = str2;
        }
        this.f5084d = str3;
        this.f5085e = str4;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4202a(AddCardByWebRequestJson addCardByWebRequestJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, f5080f[0], addCardByWebRequestJson.f5081a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, addCardByWebRequestJson.f5082b);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.areEqual(addCardByWebRequestJson.f5083c, "new")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, addCardByWebRequestJson.f5083c);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, addCardByWebRequestJson.f5084d);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, addCardByWebRequestJson.f5085e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardByWebRequestJson)) {
            return false;
        }
        AddCardByWebRequestJson addCardByWebRequestJson = (AddCardByWebRequestJson) obj;
        return Intrinsics.areEqual(this.f5081a, addCardByWebRequestJson.f5081a) && Intrinsics.areEqual(this.f5082b, addCardByWebRequestJson.f5082b) && Intrinsics.areEqual(this.f5083c, addCardByWebRequestJson.f5083c) && Intrinsics.areEqual(this.f5084d, addCardByWebRequestJson.f5084d) && Intrinsics.areEqual(this.f5085e, addCardByWebRequestJson.f5085e);
    }

    public int hashCode() {
        return this.f5085e.hashCode() + C8031b.m1429a(this.f5084d, C8031b.m1429a(this.f5083c, C8031b.m1429a(this.f5082b, this.f5081a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddCardByWebRequestJson(deviceInfo=");
        sb.append(this.f5081a);
        sb.append(", orderId=");
        sb.append(this.f5082b);
        sb.append(", code=");
        sb.append(this.f5083c);
        sb.append(", returnUrl=");
        sb.append(this.f5084d);
        sb.append(", failUrl=");
        return C8032c.m1430a(sb, this.f5085e, ')');
    }

    public AddCardByWebRequestJson(Map deviceInfo, String orderId, String code, String returnUrl, String failUrl) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
        Intrinsics.checkNotNullParameter(failUrl, "failUrl");
        this.f5081a = deviceInfo;
        this.f5082b = orderId;
        this.f5083c = code;
        this.f5084d = returnUrl;
        this.f5085e = failUrl;
    }

    public /* synthetic */ AddCardByWebRequestJson(Map map, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, str, (i & 4) != 0 ? "new" : str2, str3, str4);
    }
}
