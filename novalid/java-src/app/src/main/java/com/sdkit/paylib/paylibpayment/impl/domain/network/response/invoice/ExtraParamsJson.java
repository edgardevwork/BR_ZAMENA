package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class ExtraParamsJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final int f5230a;

    /* renamed from: b */
    public final int f5231b;

    /* renamed from: c */
    public final int f5232c;

    /* renamed from: d */
    public final int f5233d;

    /* renamed from: e */
    public final long f5234e;

    /* renamed from: f */
    public final int f5235f;

    /* renamed from: g */
    public final int f5236g;

    /* renamed from: h */
    public final int f5237h;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/ExtraParamsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/ExtraParamsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ExtraParamsJson> serializer() {
            return ExtraParamsJson$$a.f5238a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ExtraParamsJson(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, ExtraParamsJson$$a.f5238a.getDescriptor());
        }
        this.f5230a = i2;
        this.f5231b = i3;
        this.f5232c = i4;
        this.f5233d = i5;
        this.f5234e = j;
        this.f5235f = i6;
        this.f5236g = i7;
        this.f5237h = i8;
    }

    /* renamed from: a */
    public final int m4309a() {
        return this.f5236g;
    }

    /* renamed from: b */
    public final int m4310b() {
        return this.f5237h;
    }

    /* renamed from: c */
    public final int m4311c() {
        return this.f5231b;
    }

    /* renamed from: d */
    public final int m4312d() {
        return this.f5235f;
    }

    /* renamed from: e */
    public final int m4313e() {
        return this.f5233d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraParamsJson)) {
            return false;
        }
        ExtraParamsJson extraParamsJson = (ExtraParamsJson) obj;
        return this.f5230a == extraParamsJson.f5230a && this.f5231b == extraParamsJson.f5231b && this.f5232c == extraParamsJson.f5232c && this.f5233d == extraParamsJson.f5233d && this.f5234e == extraParamsJson.f5234e && this.f5235f == extraParamsJson.f5235f && this.f5236g == extraParamsJson.f5236g && this.f5237h == extraParamsJson.f5237h;
    }

    /* renamed from: f */
    public final int m4314f() {
        return this.f5230a;
    }

    /* renamed from: g */
    public final int m4315g() {
        return this.f5232c;
    }

    /* renamed from: h */
    public final long m4316h() {
        return this.f5234e;
    }

    public int hashCode() {
        return Integer.hashCode(this.f5237h) + C8054b.m1525a(this.f5236g, C8054b.m1525a(this.f5235f, (Long.hashCode(this.f5234e) + C8054b.m1525a(this.f5233d, C8054b.m1525a(this.f5232c, C8054b.m1525a(this.f5231b, Integer.hashCode(this.f5230a) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public String toString() {
        return "ExtraParamsJson(smsRequestAttemptsMaxNumber=" + this.f5230a + ", smsCodeEnterAttemptsNumber=" + this.f5231b + ", smsRequestInterval=" + this.f5232c + ", smsCodeLength=" + this.f5233d + ", smsSentTime=" + this.f5234e + ", smsCodeExpiredTime=" + this.f5235f + ", codeEnterAttemptsMaxNumber=" + this.f5236g + ", sentSmsNumber=" + this.f5237h + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4308a(ExtraParamsJson extraParamsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, extraParamsJson.f5230a);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, extraParamsJson.f5231b);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, extraParamsJson.f5232c);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, extraParamsJson.f5233d);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, extraParamsJson.f5234e);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, extraParamsJson.f5235f);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, extraParamsJson.f5236g);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, extraParamsJson.f5237h);
    }
}
