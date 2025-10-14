package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.PurchaseSubscriptionDetails;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.SubscriptionPeriodType;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.C8586c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class SubscriptionsPurchaseDetailsJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: g */
    public static final KSerializer[] f5738g = {null, null, null, null, null, new ArrayListSerializer(SubscriptionTariffPlansJson$$a.f5715a)};

    /* renamed from: a */
    public final Boolean f5739a;

    /* renamed from: b */
    public final String f5740b;

    /* renamed from: c */
    public final String f5741c;

    /* renamed from: d */
    public final SubscriptionsPeriodTypeJson f5742d;

    /* renamed from: e */
    public final String f5743e;

    /* renamed from: f */
    public final List f5744f;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsPurchaseDetailsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsPurchaseDetailsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<SubscriptionsPurchaseDetailsJson> serializer() {
            return SubscriptionsPurchaseDetailsJson$$a.f5745a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscriptionsPurchaseDetailsJson(int i, Boolean bool, String str, String str2, SubscriptionsPeriodTypeJson subscriptionsPeriodTypeJson, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (40 != (i & 40)) {
            PluginExceptionsKt.throwMissingFieldException(i, 40, SubscriptionsPurchaseDetailsJson$$a.f5745a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f5739a = null;
        } else {
            this.f5739a = bool;
        }
        if ((i & 2) == 0) {
            this.f5740b = null;
        } else {
            this.f5740b = str;
        }
        if ((i & 4) == 0) {
            this.f5741c = null;
        } else {
            this.f5741c = str2;
        }
        this.f5742d = subscriptionsPeriodTypeJson;
        if ((i & 16) == 0) {
            this.f5743e = null;
        } else {
            this.f5743e = str3;
        }
        this.f5744f = list;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4603a(SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5738g;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subscriptionsPurchaseDetailsJson.f5739a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, subscriptionsPurchaseDetailsJson.f5739a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subscriptionsPurchaseDetailsJson.f5740b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subscriptionsPurchaseDetailsJson.f5740b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subscriptionsPurchaseDetailsJson.f5741c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, subscriptionsPurchaseDetailsJson.f5741c);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, SubscriptionsPeriodTypeJson$$a.f5730a, subscriptionsPurchaseDetailsJson.f5742d);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subscriptionsPurchaseDetailsJson.f5743e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, subscriptionsPurchaseDetailsJson.f5743e);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], subscriptionsPurchaseDetailsJson.f5744f);
    }

    /* renamed from: b */
    public PurchaseSubscriptionDetails m4605b() {
        Boolean bool = this.f5739a;
        String str = this.f5740b;
        SubscriptionPeriod subscriptionPeriodM4653b = str != null ? C8586c.f5787a.m4653b(str) : null;
        String str2 = this.f5741c;
        Date date = str2 != null ? new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str2) : null;
        SubscriptionsPeriodTypeJson subscriptionsPeriodTypeJson = this.f5742d;
        SubscriptionPeriodType subscriptionPeriodTypeM4593c = subscriptionsPeriodTypeJson != null ? subscriptionsPeriodTypeJson.m4593c() : null;
        String str3 = this.f5743e;
        return new PurchaseSubscriptionDetails(bool, subscriptionPeriodM4653b, date, subscriptionPeriodTypeM4593c, str3 != null ? new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str3) : null);
    }

    /* renamed from: c */
    public final List m4606c() {
        return this.f5744f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionsPurchaseDetailsJson)) {
            return false;
        }
        SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson = (SubscriptionsPurchaseDetailsJson) obj;
        return Intrinsics.areEqual(this.f5739a, subscriptionsPurchaseDetailsJson.f5739a) && Intrinsics.areEqual(this.f5740b, subscriptionsPurchaseDetailsJson.f5740b) && Intrinsics.areEqual(this.f5741c, subscriptionsPurchaseDetailsJson.f5741c) && this.f5742d == subscriptionsPurchaseDetailsJson.f5742d && Intrinsics.areEqual(this.f5743e, subscriptionsPurchaseDetailsJson.f5743e) && Intrinsics.areEqual(this.f5744f, subscriptionsPurchaseDetailsJson.f5744f);
    }

    public int hashCode() {
        Boolean bool = this.f5739a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f5740b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5741c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SubscriptionsPeriodTypeJson subscriptionsPeriodTypeJson = this.f5742d;
        int iHashCode4 = (iHashCode3 + (subscriptionsPeriodTypeJson == null ? 0 : subscriptionsPeriodTypeJson.hashCode())) * 31;
        String str3 = this.f5743e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f5744f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionsPurchaseDetailsJson(recurrent=");
        sb.append(this.f5739a);
        sb.append(", periodDuration=");
        sb.append(this.f5740b);
        sb.append(", periodEnd=");
        sb.append(this.f5741c);
        sb.append(", currentPeriod=");
        sb.append(this.f5742d);
        sb.append(", dateEndOfActivePeriod=");
        sb.append(this.f5743e);
        sb.append(", tariffPlans=");
        return C8045g.m1489a(sb, this.f5744f, ')');
    }
}
