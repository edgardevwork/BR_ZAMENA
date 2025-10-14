package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class ActionParamsJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final KSerializer[] f5222c = {new ArrayListSerializer(UserActionsJson$$a.f5516a), null};

    /* renamed from: a */
    public final List f5223a;

    /* renamed from: b */
    public final String f5224b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/ActionParamsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/ActionParamsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ActionParamsJson> serializer() {
            return ActionParamsJson$$a.f5225a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActionParamsJson(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ActionParamsJson$$a.f5225a.getDescriptor());
        }
        this.f5223a = list;
        this.f5224b = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4299a(ActionParamsJson actionParamsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, f5222c[0], actionParamsJson.f5223a);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, actionParamsJson.f5224b);
    }

    /* renamed from: b */
    public SmsConfirmConstraints m4301b() {
        Object next;
        List list = this.f5223a;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((UserActionsJson) next).m4462d(), "got_sms_code")) {
                break;
            }
        }
        UserActionsJson userActionsJson = (UserActionsJson) next;
        if (userActionsJson == null) {
            return null;
        }
        ExtraParamsJson extraParamsJsonM4460b = userActionsJson.m4460b();
        return new SmsConfirmConstraints(extraParamsJsonM4460b.m4314f() - extraParamsJsonM4460b.m4310b() > 0, userActionsJson.m4460b().m4311c(), userActionsJson.m4460b().m4315g(), userActionsJson.m4460b().m4313e(), userActionsJson.m4460b().m4316h(), userActionsJson.m4460b().m4312d(), ((InputParamsJson) CollectionsKt___CollectionsKt.first(userActionsJson.m4461c())).m4330a(), userActionsJson.m4460b().m4309a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionParamsJson)) {
            return false;
        }
        ActionParamsJson actionParamsJson = (ActionParamsJson) obj;
        return Intrinsics.areEqual(this.f5223a, actionParamsJson.f5223a) && Intrinsics.areEqual(this.f5224b, actionParamsJson.f5224b);
    }

    public int hashCode() {
        List list = this.f5223a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f5224b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActionParamsJson(userChoices=");
        sb.append(this.f5223a);
        sb.append(", status=");
        return C8032c.m1430a(sb, this.f5224b, ')');
    }
}
