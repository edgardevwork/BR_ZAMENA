package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard;", "", "()V", "Sbolpay", "Web", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard$Sbolpay;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard$Web;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public abstract class WayToAddCard {

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard$Sbolpay;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard;", "", "component1", "returnDeeplink", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReturnDeeplink", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class Sbolpay extends WayToAddCard {

        /* renamed from: a, reason: from kotlin metadata */
        public final String returnDeeplink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sbolpay(String returnDeeplink) {
            super(null);
            Intrinsics.checkNotNullParameter(returnDeeplink, "returnDeeplink");
            this.returnDeeplink = returnDeeplink;
        }

        public static /* synthetic */ Sbolpay copy$default(Sbolpay sbolpay, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sbolpay.returnDeeplink;
            }
            return sbolpay.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReturnDeeplink() {
            return this.returnDeeplink;
        }

        public final Sbolpay copy(String returnDeeplink) {
            Intrinsics.checkNotNullParameter(returnDeeplink, "returnDeeplink");
            return new Sbolpay(returnDeeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sbolpay) && Intrinsics.areEqual(this.returnDeeplink, ((Sbolpay) other).returnDeeplink);
        }

        public final String getReturnDeeplink() {
            return this.returnDeeplink;
        }

        public int hashCode() {
            return this.returnDeeplink.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Sbolpay(returnDeeplink="), this.returnDeeplink, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard$Web;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard;", "", "component1", "component2", "returnUrl", "failUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReturnUrl", "()Ljava/lang/String;", "b", "getFailUrl", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class Web extends WayToAddCard {

        /* renamed from: a, reason: from kotlin metadata */
        public final String returnUrl;

        /* renamed from: b, reason: from kotlin metadata */
        public final String failUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Web(String returnUrl, String failUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(failUrl, "failUrl");
            this.returnUrl = returnUrl;
            this.failUrl = failUrl;
        }

        public static /* synthetic */ Web copy$default(Web web, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = web.returnUrl;
            }
            if ((i & 2) != 0) {
                str2 = web.failUrl;
            }
            return web.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFailUrl() {
            return this.failUrl;
        }

        public final Web copy(String returnUrl, String failUrl) {
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(failUrl, "failUrl");
            return new Web(returnUrl, failUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Web)) {
                return false;
            }
            Web web = (Web) other;
            return Intrinsics.areEqual(this.returnUrl, web.returnUrl) && Intrinsics.areEqual(this.failUrl, web.failUrl);
        }

        public final String getFailUrl() {
            return this.failUrl;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public int hashCode() {
            return this.failUrl.hashCode() + (this.returnUrl.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Web(returnUrl=");
            sb.append(this.returnUrl);
            sb.append(", failUrl=");
            return C8032c.m1430a(sb, this.failUrl, ')');
        }
    }

    public WayToAddCard() {
    }

    public /* synthetic */ WayToAddCard(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
