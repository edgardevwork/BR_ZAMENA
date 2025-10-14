package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

/* loaded from: classes6.dex */
public abstract class InvoicePaymentParamJson {
    public static final Companion Companion = new Companion(null);

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoicePaymentParamJson> serializer() {
            return new C8577e();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes8.dex */
    public static final class Deeplink extends InvoicePaymentParamJson {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        public final String f5466a;

        @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$Deeplink$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$Deeplink;", "a", SegmentConstantPool.INITSTRING, "()V", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final KSerializer m4419a() {
                return InvoicePaymentParamJson$Deeplink$$a.f5454a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Deeplink(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i & 1) == 0) {
                this.f5466a = null;
            } else {
                this.f5466a = str;
            }
        }

        /* renamed from: a */
        public String m4418a() {
            return this.f5466a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Deeplink) && Intrinsics.areEqual(this.f5466a, ((Deeplink) obj).f5466a);
        }

        public int hashCode() {
            String str = this.f5466a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Deeplink(value="), this.f5466a, ')');
        }

        /* renamed from: a */
        public static final /* synthetic */ void m4417a(Deeplink deeplink, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && deeplink.m4418a() == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, deeplink.m4418a());
        }
    }

    /* loaded from: classes8.dex */
    public static final class PaymentInstrumentValue extends InvoicePaymentParamJson {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        public final String f5467a;

        @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$PaymentInstrumentValue$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$PaymentInstrumentValue;", "a", SegmentConstantPool.INITSTRING, "()V", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final KSerializer m4422a() {
                return InvoicePaymentParamJson$PaymentInstrumentValue$$a.f5456a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PaymentInstrumentValue(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i & 1) == 0) {
                this.f5467a = null;
            } else {
                this.f5467a = str;
            }
        }

        /* renamed from: a */
        public String m4421a() {
            return this.f5467a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentInstrumentValue) && Intrinsics.areEqual(this.f5467a, ((PaymentInstrumentValue) obj).f5467a);
        }

        public int hashCode() {
            String str = this.f5467a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PaymentInstrumentValue(value="), this.f5467a, ')');
        }

        /* renamed from: a */
        public static final /* synthetic */ void m4420a(PaymentInstrumentValue paymentInstrumentValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && paymentInstrumentValue.m4421a() == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, paymentInstrumentValue.m4421a());
        }
    }

    /* loaded from: classes8.dex */
    public static final class PaymentSystemOrderId extends InvoicePaymentParamJson {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        public final String f5468a;

        @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$PaymentSystemOrderId$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$PaymentSystemOrderId;", "a", SegmentConstantPool.INITSTRING, "()V", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final KSerializer m4425a() {
                return InvoicePaymentParamJson$PaymentSystemOrderId$$a.f5458a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PaymentSystemOrderId(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i & 1) == 0) {
                this.f5468a = null;
            } else {
                this.f5468a = str;
            }
        }

        /* renamed from: a */
        public String m4424a() {
            return this.f5468a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentSystemOrderId) && Intrinsics.areEqual(this.f5468a, ((PaymentSystemOrderId) obj).f5468a);
        }

        public int hashCode() {
            String str = this.f5468a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PaymentSystemOrderId(value="), this.f5468a, ')');
        }

        /* renamed from: a */
        public static final /* synthetic */ void m4423a(PaymentSystemOrderId paymentSystemOrderId, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && paymentSystemOrderId.m4424a() == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, paymentSystemOrderId.m4424a());
        }
    }

    /* loaded from: classes8.dex */
    public static final class PaymentType extends InvoicePaymentParamJson {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        public final InvoicePaymentInstrumentTypeJson f5469a;

        @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$PaymentType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$PaymentType;", "a", SegmentConstantPool.INITSTRING, "()V", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final KSerializer m4428a() {
                return InvoicePaymentParamJson$PaymentType$$a.f5460a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PaymentType(int i, InvoicePaymentInstrumentTypeJson invoicePaymentInstrumentTypeJson, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i & 1) == 0) {
                this.f5469a = null;
            } else {
                this.f5469a = invoicePaymentInstrumentTypeJson;
            }
        }

        /* renamed from: a */
        public InvoicePaymentInstrumentTypeJson m4427a() {
            return this.f5469a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentType) && this.f5469a == ((PaymentType) obj).f5469a;
        }

        public int hashCode() {
            InvoicePaymentInstrumentTypeJson invoicePaymentInstrumentTypeJson = this.f5469a;
            if (invoicePaymentInstrumentTypeJson == null) {
                return 0;
            }
            return invoicePaymentInstrumentTypeJson.hashCode();
        }

        public String toString() {
            return "PaymentType(value=" + this.f5469a + ')';
        }

        /* renamed from: a */
        public static final /* synthetic */ void m4426a(PaymentType paymentType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && paymentType.m4427a() == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvoicePaymentInstrumentTypeJson$$a.f5441a, paymentType.m4427a());
        }
    }

    /* loaded from: classes8.dex */
    public static final class PaymentUrl extends InvoicePaymentParamJson {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        public final String f5470a;

        @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$PaymentUrl$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$PaymentUrl;", "a", SegmentConstantPool.INITSTRING, "()V", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final KSerializer m4431a() {
                return InvoicePaymentParamJson$PaymentUrl$$a.f5462a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PaymentUrl(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i & 1) == 0) {
                this.f5470a = null;
            } else {
                this.f5470a = str;
            }
        }

        /* renamed from: a */
        public String m4430a() {
            return this.f5470a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentUrl) && Intrinsics.areEqual(this.f5470a, ((PaymentUrl) obj).f5470a);
        }

        public int hashCode() {
            String str = this.f5470a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PaymentUrl(value="), this.f5470a, ')');
        }

        /* renamed from: a */
        public static final /* synthetic */ void m4429a(PaymentUrl paymentUrl, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && paymentUrl.m4430a() == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, paymentUrl.m4430a());
        }
    }

    /* loaded from: classes8.dex */
    public static final class Unknown extends InvoicePaymentParamJson {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        public final String f5471a;

        @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$Unknown$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentParamJson$Unknown;", "a", SegmentConstantPool.INITSTRING, "()V", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final KSerializer m4434a() {
                return InvoicePaymentParamJson$Unknown$$a.f5464a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Unknown(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if ((i & 1) == 0) {
                this.f5471a = null;
            } else {
                this.f5471a = str;
            }
        }

        /* renamed from: a */
        public String m4433a() {
            return this.f5471a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.areEqual(this.f5471a, ((Unknown) obj).f5471a);
        }

        public int hashCode() {
            String str = this.f5471a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Unknown(value="), this.f5471a, ')');
        }

        /* renamed from: a */
        public static final /* synthetic */ void m4432a(Unknown unknown, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && unknown.m4433a() == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, unknown.m4433a());
        }
    }

    public InvoicePaymentParamJson() {
    }

    public /* synthetic */ InvoicePaymentParamJson(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
