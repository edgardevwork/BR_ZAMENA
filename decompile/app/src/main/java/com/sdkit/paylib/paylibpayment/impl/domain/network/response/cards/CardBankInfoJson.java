package com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards;

import android.net.Uri;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.cards.BankInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class CardBankInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5191a;

    /* renamed from: b */
    public final String f5192b;

    /* renamed from: c */
    public final String f5193c;

    /* renamed from: d */
    public final String f5194d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/CardBankInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/CardBankInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<CardBankInfoJson> serializer() {
            return CardBankInfoJson$$a.f5195a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardBankInfoJson(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5191a = null;
        } else {
            this.f5191a = str;
        }
        if ((i & 2) == 0) {
            this.f5192b = null;
        } else {
            this.f5192b = str2;
        }
        if ((i & 4) == 0) {
            this.f5193c = null;
        } else {
            this.f5193c = str3;
        }
        if ((i & 8) == 0) {
            this.f5194d = null;
        } else {
            this.f5194d = str4;
        }
    }

    /* renamed from: a */
    public BankInfo m4283a() {
        String str = this.f5191a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f5192b;
        String str3 = this.f5193c;
        String str4 = this.f5194d;
        return new BankInfo(str, str4 != null ? Uri.parse(str4) : null, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBankInfoJson)) {
            return false;
        }
        CardBankInfoJson cardBankInfoJson = (CardBankInfoJson) obj;
        return Intrinsics.areEqual(this.f5191a, cardBankInfoJson.f5191a) && Intrinsics.areEqual(this.f5192b, cardBankInfoJson.f5192b) && Intrinsics.areEqual(this.f5193c, cardBankInfoJson.f5193c) && Intrinsics.areEqual(this.f5194d, cardBankInfoJson.f5194d);
    }

    public int hashCode() {
        String str = this.f5191a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5192b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5193c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5194d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardBankInfoJson(name=");
        sb.append(this.f5191a);
        sb.append(", countryCode=");
        sb.append(this.f5192b);
        sb.append(", countryName=");
        sb.append(this.f5193c);
        sb.append(", image=");
        return C8032c.m1430a(sb, this.f5194d, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4282a(CardBankInfoJson cardBankInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardBankInfoJson.f5191a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cardBankInfoJson.f5191a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cardBankInfoJson.f5192b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cardBankInfoJson.f5192b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cardBankInfoJson.f5193c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardBankInfoJson.f5193c);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && cardBankInfoJson.f5194d == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cardBankInfoJson.f5194d);
    }
}
