package com.sdkit.paylib.paylibdomain.api.invoice.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType;", "", "SbolPay", "Sbp", "TPay", "Web", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType$SbolPay;", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType$Sbp;", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType$TPay;", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType$Web;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface ExternalPayType {

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType$SbolPay;", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType;", "", "component1", "returnDeepLink", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReturnDeepLink", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class SbolPay implements ExternalPayType {

        /* renamed from: a, reason: from kotlin metadata */
        public final String returnDeepLink;

        public SbolPay(String returnDeepLink) {
            Intrinsics.checkNotNullParameter(returnDeepLink, "returnDeepLink");
            this.returnDeepLink = returnDeepLink;
        }

        public static /* synthetic */ SbolPay copy$default(SbolPay sbolPay, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sbolPay.returnDeepLink;
            }
            return sbolPay.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReturnDeepLink() {
            return this.returnDeepLink;
        }

        public final SbolPay copy(String returnDeepLink) {
            Intrinsics.checkNotNullParameter(returnDeepLink, "returnDeepLink");
            return new SbolPay(returnDeepLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SbolPay) && Intrinsics.areEqual(this.returnDeepLink, ((SbolPay) other).returnDeepLink);
        }

        public final String getReturnDeepLink() {
            return this.returnDeepLink;
        }

        public int hashCode() {
            return this.returnDeepLink.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("SbolPay(returnDeepLink="), this.returnDeepLink, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType$Sbp;", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType;", "", "component1", "returnDeeplink", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReturnDeeplink", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Sbp implements ExternalPayType {

        /* renamed from: a, reason: from kotlin metadata */
        public final String returnDeeplink;

        public Sbp(String returnDeeplink) {
            Intrinsics.checkNotNullParameter(returnDeeplink, "returnDeeplink");
            this.returnDeeplink = returnDeeplink;
        }

        public static /* synthetic */ Sbp copy$default(Sbp sbp, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sbp.returnDeeplink;
            }
            return sbp.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReturnDeeplink() {
            return this.returnDeeplink;
        }

        public final Sbp copy(String returnDeeplink) {
            Intrinsics.checkNotNullParameter(returnDeeplink, "returnDeeplink");
            return new Sbp(returnDeeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sbp) && Intrinsics.areEqual(this.returnDeeplink, ((Sbp) other).returnDeeplink);
        }

        public final String getReturnDeeplink() {
            return this.returnDeeplink;
        }

        public int hashCode() {
            return this.returnDeeplink.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Sbp(returnDeeplink="), this.returnDeeplink, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType$TPay;", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType;", "", "component1", "component2", "successUrl", "failUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getSuccessUrl", "()Ljava/lang/String;", "b", "getFailUrl", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class TPay implements ExternalPayType {

        /* renamed from: a, reason: from kotlin metadata */
        public final String successUrl;

        /* renamed from: b, reason: from kotlin metadata */
        public final String failUrl;

        public TPay(String successUrl, String failUrl) {
            Intrinsics.checkNotNullParameter(successUrl, "successUrl");
            Intrinsics.checkNotNullParameter(failUrl, "failUrl");
            this.successUrl = successUrl;
            this.failUrl = failUrl;
        }

        public static /* synthetic */ TPay copy$default(TPay tPay, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tPay.successUrl;
            }
            if ((i & 2) != 0) {
                str2 = tPay.failUrl;
            }
            return tPay.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSuccessUrl() {
            return this.successUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFailUrl() {
            return this.failUrl;
        }

        public final TPay copy(String successUrl, String failUrl) {
            Intrinsics.checkNotNullParameter(successUrl, "successUrl");
            Intrinsics.checkNotNullParameter(failUrl, "failUrl");
            return new TPay(successUrl, failUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TPay)) {
                return false;
            }
            TPay tPay = (TPay) other;
            return Intrinsics.areEqual(this.successUrl, tPay.successUrl) && Intrinsics.areEqual(this.failUrl, tPay.failUrl);
        }

        public final String getFailUrl() {
            return this.failUrl;
        }

        public final String getSuccessUrl() {
            return this.successUrl;
        }

        public int hashCode() {
            return this.failUrl.hashCode() + (this.successUrl.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TPay(successUrl=");
            sb.append(this.successUrl);
            sb.append(", failUrl=");
            return C8032c.m1430a(sb, this.failUrl, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType$Web;", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType;", "", "component1", "saveCard", "copy", "", "toString", "", "hashCode", "", "other", "equals", "a", "Z", "getSaveCard", "()Z", SegmentConstantPool.INITSTRING, "(Z)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Web implements ExternalPayType {

        /* renamed from: a, reason: from kotlin metadata */
        public final boolean saveCard;

        public Web(boolean z) {
            this.saveCard = z;
        }

        public static /* synthetic */ Web copy$default(Web web, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = web.saveCard;
            }
            return web.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSaveCard() {
            return this.saveCard;
        }

        public final Web copy(boolean saveCard) {
            return new Web(saveCard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Web) && this.saveCard == ((Web) other).saveCard;
        }

        public final boolean getSaveCard() {
            return this.saveCard;
        }

        public int hashCode() {
            boolean z = this.saveCard;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return C8030a.m1428a(new StringBuilder("Web(saveCard="), this.saveCard, ')');
        }
    }
}
