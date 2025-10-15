package com.sdkit.paylib.paylibdomain.api.deeplink.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType;", "", "()V", "Sbolpay", "Sbp", "TBank", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType$Sbolpay;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType$Sbp;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType$TBank;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public abstract class DeeplinkPaymentType {

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType$Sbolpay;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType;", "()V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Sbolpay extends DeeplinkPaymentType {
        public static final Sbolpay INSTANCE = new Sbolpay();

        public Sbolpay() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType$Sbp;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType;", "()V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Sbp extends DeeplinkPaymentType {
        public static final Sbp INSTANCE = new Sbp();

        public Sbp() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType$TBank;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType;", "", "component1", "isSuccessful", "copy", "", "toString", "", "hashCode", "", "other", "equals", "a", "Z", "()Z", SegmentConstantPool.INITSTRING, "(Z)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class TBank extends DeeplinkPaymentType {

        /* renamed from: a, reason: from kotlin metadata */
        public final boolean isSuccessful;

        public TBank(boolean z) {
            super(null);
            this.isSuccessful = z;
        }

        public static /* synthetic */ TBank copy$default(TBank tBank, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tBank.isSuccessful;
            }
            return tBank.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSuccessful() {
            return this.isSuccessful;
        }

        public final TBank copy(boolean isSuccessful) {
            return new TBank(isSuccessful);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TBank) && this.isSuccessful == ((TBank) other).isSuccessful;
        }

        public int hashCode() {
            boolean z = this.isSuccessful;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isSuccessful() {
            return this.isSuccessful;
        }

        public String toString() {
            return C8030a.m1428a(new StringBuilder("TBank(isSuccessful="), this.isSuccessful, ')');
        }
    }

    public DeeplinkPaymentType() {
    }

    public /* synthetic */ DeeplinkPaymentType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
