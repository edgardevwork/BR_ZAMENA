package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes6.dex */
public final class UserActionsJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final KSerializer[] f5512d = {new ArrayListSerializer(InputParamsJson$$a.f5267a), null, null};

    /* renamed from: a */
    public final List f5513a;

    /* renamed from: b */
    public final String f5514b;

    /* renamed from: c */
    public final ExtraParamsJson f5515c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/UserActionsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/UserActionsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<UserActionsJson> serializer() {
            return UserActionsJson$$a.f5516a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserActionsJson(int i, List list, String str, ExtraParamsJson extraParamsJson, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, UserActionsJson$$a.f5516a.getDescriptor());
        }
        this.f5513a = list;
        this.f5514b = str;
        this.f5515c = extraParamsJson;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4458a(UserActionsJson userActionsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, f5512d[0], userActionsJson.f5513a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, userActionsJson.f5514b);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, ExtraParamsJson$$a.f5238a, userActionsJson.f5515c);
    }

    /* renamed from: b */
    public final ExtraParamsJson m4460b() {
        return this.f5515c;
    }

    /* renamed from: c */
    public final List m4461c() {
        return this.f5513a;
    }

    /* renamed from: d */
    public final String m4462d() {
        return this.f5514b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserActionsJson)) {
            return false;
        }
        UserActionsJson userActionsJson = (UserActionsJson) obj;
        return Intrinsics.areEqual(this.f5513a, userActionsJson.f5513a) && Intrinsics.areEqual(this.f5514b, userActionsJson.f5514b) && Intrinsics.areEqual(this.f5515c, userActionsJson.f5515c);
    }

    public int hashCode() {
        return this.f5515c.hashCode() + C8031b.m1429a(this.f5514b, this.f5513a.hashCode() * 31, 31);
    }

    public String toString() {
        return "UserActionsJson(inputs=" + this.f5513a + ", updateKey=" + this.f5514b + ", extraParams=" + this.f5515c + ')';
    }
}
