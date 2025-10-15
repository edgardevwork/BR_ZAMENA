package com.sdkit.paylib.paylibpayment.impl.domain.network.response.bistro;

import android.net.Uri;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.bistro.BankInfo;
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
public final class BankJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5176a;

    /* renamed from: b */
    public final String f5177b;

    /* renamed from: c */
    public final String f5178c;

    /* renamed from: d */
    public final String f5179d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/bistro/BankJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/bistro/BankJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<BankJson> serializer() {
            return BankJson$$a.f5180a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BankJson(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BankJson$$a.f5180a.getDescriptor());
        }
        this.f5176a = str;
        this.f5177b = str2;
        this.f5178c = str3;
        this.f5179d = str4;
    }

    /* renamed from: a */
    public final BankInfo m4270a() {
        String str;
        String str2 = this.f5176a;
        if (str2 == null || (str = this.f5177b) == null || this.f5178c == null || this.f5179d == null) {
            return null;
        }
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "this.bankLogoUrl.run(Uri::parse)");
        return new BankInfo(str2, uri, this.f5178c, this.f5179d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankJson)) {
            return false;
        }
        BankJson bankJson = (BankJson) obj;
        return Intrinsics.areEqual(this.f5176a, bankJson.f5176a) && Intrinsics.areEqual(this.f5177b, bankJson.f5177b) && Intrinsics.areEqual(this.f5178c, bankJson.f5178c) && Intrinsics.areEqual(this.f5179d, bankJson.f5179d);
    }

    public int hashCode() {
        String str = this.f5176a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5177b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5178c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5179d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BankJson(bankName=");
        sb.append(this.f5176a);
        sb.append(", bankLogoUrl=");
        sb.append(this.f5177b);
        sb.append(", bankSchema=");
        sb.append(this.f5178c);
        sb.append(", bankPackageName=");
        return C8032c.m1430a(sb, this.f5179d, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4269a(BankJson bankJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, bankJson.f5176a);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, bankJson.f5177b);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, bankJson.f5178c);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, bankJson.f5179d);
    }
}
