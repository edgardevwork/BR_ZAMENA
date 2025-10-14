package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.Purchase;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.products.ProductTypeJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.products.ProductTypeJson$$a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class PurchaseJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5624a;

    /* renamed from: b */
    public final String f5625b;

    /* renamed from: c */
    public final ProductTypeJson f5626c;

    /* renamed from: d */
    public final String f5627d;

    /* renamed from: e */
    public final String f5628e;

    /* renamed from: f */
    public final String f5629f;

    /* renamed from: g */
    public final String f5630g;

    /* renamed from: h */
    public final String f5631h;

    /* renamed from: i */
    public final Integer f5632i;

    /* renamed from: j */
    public final String f5633j;

    /* renamed from: k */
    public final Integer f5634k;

    /* renamed from: l */
    public final PurchaseStateJson f5635l;

    /* renamed from: m */
    public final String f5636m;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/PurchaseJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/PurchaseJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<PurchaseJson> serializer() {
            return PurchaseJson$$a.f5637a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PurchaseJson(int i, String str, String str2, ProductTypeJson productTypeJson, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Integer num2, PurchaseStateJson purchaseStateJson, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5624a = null;
        } else {
            this.f5624a = str;
        }
        if ((i & 2) == 0) {
            this.f5625b = null;
        } else {
            this.f5625b = str2;
        }
        if ((i & 4) == 0) {
            this.f5626c = null;
        } else {
            this.f5626c = productTypeJson;
        }
        if ((i & 8) == 0) {
            this.f5627d = null;
        } else {
            this.f5627d = str3;
        }
        if ((i & 16) == 0) {
            this.f5628e = null;
        } else {
            this.f5628e = str4;
        }
        if ((i & 32) == 0) {
            this.f5629f = null;
        } else {
            this.f5629f = str5;
        }
        if ((i & 64) == 0) {
            this.f5630g = null;
        } else {
            this.f5630g = str6;
        }
        if ((i & 128) == 0) {
            this.f5631h = null;
        } else {
            this.f5631h = str7;
        }
        if ((i & 256) == 0) {
            this.f5632i = null;
        } else {
            this.f5632i = num;
        }
        if ((i & 512) == 0) {
            this.f5633j = null;
        } else {
            this.f5633j = str8;
        }
        if ((i & 1024) == 0) {
            this.f5634k = null;
        } else {
            this.f5634k = num2;
        }
        if ((i & 2048) == 0) {
            this.f5635l = null;
        } else {
            this.f5635l = purchaseStateJson;
        }
        if ((i & 4096) == 0) {
            this.f5636m = null;
        } else {
            this.f5636m = str9;
        }
    }

    /* renamed from: a */
    public Purchase m4536a() {
        String str = this.f5624a;
        String str2 = this.f5625b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ProductTypeJson productTypeJson = this.f5626c;
        ProductType productTypeM4501c = productTypeJson != null ? productTypeJson.m4501c() : null;
        String str4 = this.f5627d;
        String str5 = this.f5628e;
        String str6 = this.f5629f;
        Date date = str6 != null ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).parse(str6) : null;
        String str7 = this.f5630g;
        String str8 = this.f5631h;
        Integer num = this.f5632i;
        String str9 = this.f5633j;
        Integer num2 = this.f5634k;
        PurchaseStateJson purchaseStateJson = this.f5635l;
        return new Purchase(str, str3, productTypeM4501c, str4, str5, date, str7, str8, num, str9, num2, purchaseStateJson != null ? purchaseStateJson.m4541c() : null, this.f5636m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseJson)) {
            return false;
        }
        PurchaseJson purchaseJson = (PurchaseJson) obj;
        return Intrinsics.areEqual(this.f5624a, purchaseJson.f5624a) && Intrinsics.areEqual(this.f5625b, purchaseJson.f5625b) && this.f5626c == purchaseJson.f5626c && Intrinsics.areEqual(this.f5627d, purchaseJson.f5627d) && Intrinsics.areEqual(this.f5628e, purchaseJson.f5628e) && Intrinsics.areEqual(this.f5629f, purchaseJson.f5629f) && Intrinsics.areEqual(this.f5630g, purchaseJson.f5630g) && Intrinsics.areEqual(this.f5631h, purchaseJson.f5631h) && Intrinsics.areEqual(this.f5632i, purchaseJson.f5632i) && Intrinsics.areEqual(this.f5633j, purchaseJson.f5633j) && Intrinsics.areEqual(this.f5634k, purchaseJson.f5634k) && this.f5635l == purchaseJson.f5635l && Intrinsics.areEqual(this.f5636m, purchaseJson.f5636m);
    }

    public int hashCode() {
        String str = this.f5624a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5625b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProductTypeJson productTypeJson = this.f5626c;
        int iHashCode3 = (iHashCode2 + (productTypeJson == null ? 0 : productTypeJson.hashCode())) * 31;
        String str3 = this.f5627d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5628e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5629f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5630g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5631h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.f5632i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.f5633j;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.f5634k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PurchaseStateJson purchaseStateJson = this.f5635l;
        int iHashCode12 = (iHashCode11 + (purchaseStateJson == null ? 0 : purchaseStateJson.hashCode())) * 31;
        String str9 = this.f5636m;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseJson(purchaseId=" + this.f5624a + ", productId=" + this.f5625b + ", productType=" + this.f5626c + ", invoiceId=" + this.f5627d + ", language=" + this.f5628e + ", purchaseTime=" + this.f5629f + ", orderId=" + this.f5630g + ", amountLabel=" + this.f5631h + ", amount=" + this.f5632i + ", currency=" + this.f5633j + ", quantity=" + this.f5634k + ", purchaseState=" + this.f5635l + ", developerPayload=" + this.f5636m + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4535a(PurchaseJson purchaseJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || purchaseJson.f5624a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, purchaseJson.f5624a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || purchaseJson.f5625b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, purchaseJson.f5625b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || purchaseJson.f5626c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ProductTypeJson$$a.f5578a, purchaseJson.f5626c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || purchaseJson.f5627d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, purchaseJson.f5627d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || purchaseJson.f5628e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, purchaseJson.f5628e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || purchaseJson.f5629f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, purchaseJson.f5629f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || purchaseJson.f5630g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, purchaseJson.f5630g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || purchaseJson.f5631h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, purchaseJson.f5631h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || purchaseJson.f5632i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, purchaseJson.f5632i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || purchaseJson.f5633j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, purchaseJson.f5633j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || purchaseJson.f5634k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, purchaseJson.f5634k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || purchaseJson.f5635l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, PurchaseStateJson$$a.f5650a, purchaseJson.f5635l);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && purchaseJson.f5636m == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, purchaseJson.f5636m);
    }
}
