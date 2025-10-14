package com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards;

import android.net.Uri;
import com.sdkit.paylib.paylibpayment.api.network.entity.cards.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class CardJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5197a;

    /* renamed from: b */
    public final String f5198b;

    /* renamed from: c */
    public final String f5199c;

    /* renamed from: d */
    public final String f5200d;

    /* renamed from: e */
    public final String f5201e;

    /* renamed from: f */
    public final String f5202f;

    /* renamed from: g */
    public final String f5203g;

    /* renamed from: h */
    public final String f5204h;

    /* renamed from: i */
    public final String f5205i;

    /* renamed from: j */
    public final String f5206j;

    /* renamed from: k */
    public final String f5207k;

    /* renamed from: l */
    public final String f5208l;

    /* renamed from: m */
    public final String f5209m;

    /* renamed from: n */
    public final String f5210n;

    /* renamed from: o */
    public final CardBankInfoJson f5211o;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/CardJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/cards/CardJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<CardJson> serializer() {
            return CardJson$$a.f5212a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, CardBankInfoJson cardBankInfoJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5197a = null;
        } else {
            this.f5197a = str;
        }
        if ((i & 2) == 0) {
            this.f5198b = null;
        } else {
            this.f5198b = str2;
        }
        if ((i & 4) == 0) {
            this.f5199c = null;
        } else {
            this.f5199c = str3;
        }
        if ((i & 8) == 0) {
            this.f5200d = null;
        } else {
            this.f5200d = str4;
        }
        if ((i & 16) == 0) {
            this.f5201e = null;
        } else {
            this.f5201e = str5;
        }
        if ((i & 32) == 0) {
            this.f5202f = null;
        } else {
            this.f5202f = str6;
        }
        if ((i & 64) == 0) {
            this.f5203g = null;
        } else {
            this.f5203g = str7;
        }
        if ((i & 128) == 0) {
            this.f5204h = null;
        } else {
            this.f5204h = str8;
        }
        if ((i & 256) == 0) {
            this.f5205i = null;
        } else {
            this.f5205i = str9;
        }
        if ((i & 512) == 0) {
            this.f5206j = null;
        } else {
            this.f5206j = str10;
        }
        if ((i & 1024) == 0) {
            this.f5207k = null;
        } else {
            this.f5207k = str11;
        }
        if ((i & 2048) == 0) {
            this.f5208l = null;
        } else {
            this.f5208l = str12;
        }
        if ((i & 4096) == 0) {
            this.f5209m = null;
        } else {
            this.f5209m = str13;
        }
        if ((i & 8192) == 0) {
            this.f5210n = null;
        } else {
            this.f5210n = str14;
        }
        if ((i & 16384) == 0) {
            this.f5211o = null;
        } else {
            this.f5211o = cardBankInfoJson;
        }
    }

    /* renamed from: a */
    public Card m4287a() {
        String str = this.f5197a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = this.f5198b;
        String str4 = this.f5199c;
        String str5 = this.f5200d;
        String str6 = this.f5201e;
        String str7 = this.f5202f;
        Uri uri = str7 != null ? Uri.parse(str7) : null;
        String str8 = this.f5203g;
        String str9 = this.f5204h;
        Uri uri2 = str9 != null ? Uri.parse(str9) : null;
        String str10 = this.f5205i;
        String str11 = this.f5206j;
        String str12 = this.f5207k;
        String str13 = this.f5208l;
        String str14 = this.f5209m;
        String str15 = this.f5210n;
        Uri uri3 = str15 != null ? Uri.parse(str15) : null;
        CardBankInfoJson cardBankInfoJson = this.f5211o;
        return new Card(str2, str3, str4, str5, str6, uri, str8, uri2, str10, str11, str12, str13, str14, uri3, cardBankInfoJson != null ? cardBankInfoJson.m4283a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardJson)) {
            return false;
        }
        CardJson cardJson = (CardJson) obj;
        return Intrinsics.areEqual(this.f5197a, cardJson.f5197a) && Intrinsics.areEqual(this.f5198b, cardJson.f5198b) && Intrinsics.areEqual(this.f5199c, cardJson.f5199c) && Intrinsics.areEqual(this.f5200d, cardJson.f5200d) && Intrinsics.areEqual(this.f5201e, cardJson.f5201e) && Intrinsics.areEqual(this.f5202f, cardJson.f5202f) && Intrinsics.areEqual(this.f5203g, cardJson.f5203g) && Intrinsics.areEqual(this.f5204h, cardJson.f5204h) && Intrinsics.areEqual(this.f5205i, cardJson.f5205i) && Intrinsics.areEqual(this.f5206j, cardJson.f5206j) && Intrinsics.areEqual(this.f5207k, cardJson.f5207k) && Intrinsics.areEqual(this.f5208l, cardJson.f5208l) && Intrinsics.areEqual(this.f5209m, cardJson.f5209m) && Intrinsics.areEqual(this.f5210n, cardJson.f5210n) && Intrinsics.areEqual(this.f5211o, cardJson.f5211o);
    }

    public int hashCode() {
        String str = this.f5197a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5198b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5199c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5200d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5201e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5202f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5203g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5204h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f5205i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f5206j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f5207k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f5208l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f5209m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f5210n;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        CardBankInfoJson cardBankInfoJson = this.f5211o;
        return iHashCode14 + (cardBankInfoJson != null ? cardBankInfoJson.hashCode() : 0);
    }

    public String toString() {
        return "CardJson(cardId=" + this.f5197a + ", name=" + this.f5198b + ", maskedNumber=" + this.f5199c + ", expirationDate=" + this.f5200d + ", cardholder=" + this.f5201e + ", imageUrl=" + this.f5202f + ", paymentSystem=" + this.f5203g + ", paymentSystemImageUrl=" + this.f5204h + ", paymentOperator=" + this.f5205i + ", paymentOperatorCode=" + this.f5206j + ", paymentOperatorImageUrl=" + this.f5207k + ", paymentWay=" + this.f5208l + ", paymentWayCode=" + this.f5209m + ", paymentWayImageUrl=" + this.f5210n + ", bankInfo=" + this.f5211o + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4286a(CardJson cardJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardJson.f5197a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cardJson.f5197a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cardJson.f5198b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cardJson.f5198b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cardJson.f5199c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardJson.f5199c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cardJson.f5200d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cardJson.f5200d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || cardJson.f5201e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cardJson.f5201e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || cardJson.f5202f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, cardJson.f5202f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cardJson.f5203g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, cardJson.f5203g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || cardJson.f5204h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, cardJson.f5204h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || cardJson.f5205i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, cardJson.f5205i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || cardJson.f5206j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, cardJson.f5206j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || cardJson.f5207k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, cardJson.f5207k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || cardJson.f5208l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, cardJson.f5208l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || cardJson.f5209m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, cardJson.f5209m);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || cardJson.f5210n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, cardJson.f5210n);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && cardJson.f5211o == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, CardBankInfoJson$$a.f5195a, cardJson.f5211o);
    }
}
