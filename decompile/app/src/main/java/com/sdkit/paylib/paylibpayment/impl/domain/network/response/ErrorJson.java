package com.sdkit.paylib.paylibpayment.impl.domain.network.response;

import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class ErrorJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5140a;

    /* renamed from: b */
    public final String f5141b;

    /* renamed from: c */
    public final int f5142c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/ErrorJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/ErrorJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ErrorJson> serializer() {
            return ErrorJson$$a.f5143a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ErrorJson(int i, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ErrorJson$$a.f5143a.getDescriptor());
        }
        this.f5140a = str;
        this.f5141b = str2;
        this.f5142c = i2;
    }

    /* renamed from: a */
    public ErrorModel m4242a() {
        return new ErrorModel(this.f5140a, this.f5141b, this.f5142c);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4241a(ErrorJson errorJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, errorJson.f5140a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, errorJson.f5141b);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, errorJson.f5142c);
    }
}
