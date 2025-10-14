package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument;", "", "()V", "SbolPay", "Web", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument$SbolPay;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument$Web;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentInstrument {

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument$SbolPay;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument;", "", "component1", "url", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class SbolPay extends PaymentInstrument {

        /* renamed from: a, reason: from kotlin metadata */
        public final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SbolPay(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ SbolPay copy$default(SbolPay sbolPay, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sbolPay.url;
            }
            return sbolPay.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final SbolPay copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new SbolPay(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SbolPay) && Intrinsics.areEqual(this.url, ((SbolPay) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("SbolPay(url="), this.url, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument$Web;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument;", "", "component1", "url", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class Web extends PaymentInstrument {

        /* renamed from: a, reason: from kotlin metadata */
        public final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Web(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ Web copy$default(Web web, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = web.url;
            }
            return web.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Web copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Web(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Web) && Intrinsics.areEqual(this.url, ((Web) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Web(url="), this.url, ')');
        }
    }

    public PaymentInstrument() {
    }

    public /* synthetic */ PaymentInstrument(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
