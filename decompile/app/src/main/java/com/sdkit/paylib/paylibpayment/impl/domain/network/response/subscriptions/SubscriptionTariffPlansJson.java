package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.PurchaseSubscriptionTariffPlan;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.C8586c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class SubscriptionTariffPlansJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5710a;

    /* renamed from: b */
    public final String f5711b;

    /* renamed from: c */
    public final Integer f5712c;

    /* renamed from: d */
    public final String f5713d;

    /* renamed from: e */
    public final SubscriptionsPeriodTypeJson f5714e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionTariffPlansJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionTariffPlansJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<SubscriptionTariffPlansJson> serializer() {
            return SubscriptionTariffPlansJson$$a.f5715a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscriptionTariffPlansJson(int i, String str, String str2, Integer num, String str3, SubscriptionsPeriodTypeJson subscriptionsPeriodTypeJson, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, SubscriptionTariffPlansJson$$a.f5715a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f5710a = null;
        } else {
            this.f5710a = str;
        }
        if ((i & 2) == 0) {
            this.f5711b = null;
        } else {
            this.f5711b = str2;
        }
        if ((i & 4) == 0) {
            this.f5712c = null;
        } else {
            this.f5712c = num;
        }
        if ((i & 8) == 0) {
            this.f5713d = null;
        } else {
            this.f5713d = str3;
        }
        this.f5714e = subscriptionsPeriodTypeJson;
    }

    /* renamed from: a */
    public PurchaseSubscriptionTariffPlan m4583a() {
        String str = this.f5711b;
        String str2 = this.f5710a;
        SubscriptionPeriod subscriptionPeriodM4653b = str2 != null ? C8586c.f5787a.m4653b(str2) : null;
        Integer num = this.f5712c;
        String str3 = this.f5713d;
        SubscriptionsPeriodTypeJson subscriptionsPeriodTypeJson = this.f5714e;
        return new PurchaseSubscriptionTariffPlan(str, subscriptionPeriodM4653b, num, str3, subscriptionsPeriodTypeJson != null ? subscriptionsPeriodTypeJson.m4593c() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionTariffPlansJson)) {
            return false;
        }
        SubscriptionTariffPlansJson subscriptionTariffPlansJson = (SubscriptionTariffPlansJson) obj;
        return Intrinsics.areEqual(this.f5710a, subscriptionTariffPlansJson.f5710a) && Intrinsics.areEqual(this.f5711b, subscriptionTariffPlansJson.f5711b) && Intrinsics.areEqual(this.f5712c, subscriptionTariffPlansJson.f5712c) && Intrinsics.areEqual(this.f5713d, subscriptionTariffPlansJson.f5713d) && this.f5714e == subscriptionTariffPlansJson.f5714e;
    }

    public int hashCode() {
        String str = this.f5710a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5711b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f5712c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f5713d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SubscriptionsPeriodTypeJson subscriptionsPeriodTypeJson = this.f5714e;
        return iHashCode4 + (subscriptionsPeriodTypeJson != null ? subscriptionsPeriodTypeJson.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionTariffPlansJson(periodDuration=" + this.f5710a + ", name=" + this.f5711b + ", price=" + this.f5712c + ", currency=" + this.f5713d + ", nextPeriod=" + this.f5714e + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4582a(SubscriptionTariffPlansJson subscriptionTariffPlansJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subscriptionTariffPlansJson.f5710a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subscriptionTariffPlansJson.f5710a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subscriptionTariffPlansJson.f5711b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subscriptionTariffPlansJson.f5711b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subscriptionTariffPlansJson.f5712c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, subscriptionTariffPlansJson.f5712c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subscriptionTariffPlansJson.f5713d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, subscriptionTariffPlansJson.f5713d);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, SubscriptionsPeriodTypeJson$$a.f5730a, subscriptionTariffPlansJson.f5714e);
    }
}
