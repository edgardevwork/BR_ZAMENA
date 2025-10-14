package com.sdkit.paylib.paylibpayment.impl.domain.network.response.applications;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.applications.ApplicationInfo;
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
public final class ApplicationInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5149a;

    /* renamed from: b */
    public final String f5150b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/applications/ApplicationInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/applications/ApplicationInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ApplicationInfoJson> serializer() {
            return ApplicationInfoJson$$a.f5151a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ApplicationInfoJson(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ApplicationInfoJson$$a.f5151a.getDescriptor());
        }
        this.f5149a = str;
        this.f5150b = str2;
    }

    /* renamed from: a */
    public ApplicationInfo m4251a() {
        return new ApplicationInfo(this.f5149a, this.f5150b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfoJson)) {
            return false;
        }
        ApplicationInfoJson applicationInfoJson = (ApplicationInfoJson) obj;
        return Intrinsics.areEqual(this.f5149a, applicationInfoJson.f5149a) && Intrinsics.areEqual(this.f5150b, applicationInfoJson.f5150b);
    }

    public int hashCode() {
        String str = this.f5149a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5150b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ApplicationInfoJson(purchaseId=");
        sb.append(this.f5149a);
        sb.append(", invoiceId=");
        return C8032c.m1430a(sb, this.f5150b, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4250a(ApplicationInfoJson applicationInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, applicationInfoJson.f5149a);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, applicationInfoJson.f5150b);
    }
}
