package com.sdkit.paylib.paylibpayment.api.domain.entity;

import androidx.autofill.HintConstants;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "", "()V", "ByCard", "Mobile", "Sbp", "TPay", "ViaSbolPayLink", "Web", "WithLoyalty", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$ByCard;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$Mobile;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$Sbp;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$TPay;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$ViaSbolPayLink;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$Web;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$WithLoyalty;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentMethod {

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$ByCard;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "", "component1", "cardId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getCardId", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class ByCard extends PaymentMethod {

        /* renamed from: a, reason: from kotlin metadata */
        public final String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByCard(String cardId) {
            super(null);
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.cardId = cardId;
        }

        public static /* synthetic */ ByCard copy$default(ByCard byCard, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = byCard.cardId;
            }
            return byCard.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        public final ByCard copy(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return new ByCard(cardId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ByCard) && Intrinsics.areEqual(this.cardId, ((ByCard) other).cardId);
        }

        public final String getCardId() {
            return this.cardId;
        }

        public int hashCode() {
            return this.cardId.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("ByCard(cardId="), this.cardId, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$Mobile;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "", "component1", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class Mobile extends PaymentMethod {

        /* renamed from: a, reason: from kotlin metadata */
        public final String androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Mobile(String phoneNumber) {
            super(null);
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String = phoneNumber;
        }

        public static /* synthetic */ Mobile copy$default(Mobile mobile, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mobile.androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String;
            }
            return mobile.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAndroidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String() {
            return this.androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String;
        }

        public final Mobile copy(String str) {
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            return new Mobile(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Mobile) && Intrinsics.areEqual(this.androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String, ((Mobile) other).androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String);
        }

        public final String getPhoneNumber() {
            return this.androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String;
        }

        public int hashCode() {
            return this.androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Mobile(phoneNumber="), this.androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$Sbp;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "", "component1", "deeplink", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class Sbp extends PaymentMethod {

        /* renamed from: a, reason: from kotlin metadata */
        public final String deeplink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sbp(String deeplink) {
            super(null);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public static /* synthetic */ Sbp copy$default(Sbp sbp, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sbp.deeplink;
            }
            return sbp.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Sbp copy(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new Sbp(deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sbp) && Intrinsics.areEqual(this.deeplink, ((Sbp) other).deeplink);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Sbp(deeplink="), this.deeplink, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$TPay;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "", "component1", "component2", "successUrl", "failUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getSuccessUrl", "()Ljava/lang/String;", "b", "getFailUrl", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class TPay extends PaymentMethod {

        /* renamed from: a, reason: from kotlin metadata */
        public final String successUrl;

        /* renamed from: b, reason: from kotlin metadata */
        public final String failUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TPay(String successUrl, String failUrl) {
            super(null);
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

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$ViaSbolPayLink;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "", "component1", "returnDeepLink", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getReturnDeepLink", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class ViaSbolPayLink extends PaymentMethod {

        /* renamed from: a, reason: from kotlin metadata */
        public final String returnDeepLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViaSbolPayLink(String returnDeepLink) {
            super(null);
            Intrinsics.checkNotNullParameter(returnDeepLink, "returnDeepLink");
            this.returnDeepLink = returnDeepLink;
        }

        public static /* synthetic */ ViaSbolPayLink copy$default(ViaSbolPayLink viaSbolPayLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viaSbolPayLink.returnDeepLink;
            }
            return viaSbolPayLink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReturnDeepLink() {
            return this.returnDeepLink;
        }

        public final ViaSbolPayLink copy(String returnDeepLink) {
            Intrinsics.checkNotNullParameter(returnDeepLink, "returnDeepLink");
            return new ViaSbolPayLink(returnDeepLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViaSbolPayLink) && Intrinsics.areEqual(this.returnDeepLink, ((ViaSbolPayLink) other).returnDeepLink);
        }

        public final String getReturnDeepLink() {
            return this.returnDeepLink;
        }

        public int hashCode() {
            return this.returnDeepLink.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("ViaSbolPayLink(returnDeepLink="), this.returnDeepLink, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$Web;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "", "component1", "isCardShouldBeSaved", "copy", "", "toString", "", "hashCode", "", "other", "equals", "a", "Z", "()Z", SegmentConstantPool.INITSTRING, "(Z)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class Web extends PaymentMethod {

        /* renamed from: a, reason: from kotlin metadata */
        public final boolean isCardShouldBeSaved;

        public Web(boolean z) {
            super(null);
            this.isCardShouldBeSaved = z;
        }

        public static /* synthetic */ Web copy$default(Web web, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = web.isCardShouldBeSaved;
            }
            return web.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCardShouldBeSaved() {
            return this.isCardShouldBeSaved;
        }

        public final Web copy(boolean isCardShouldBeSaved) {
            return new Web(isCardShouldBeSaved);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Web) && this.isCardShouldBeSaved == ((Web) other).isCardShouldBeSaved;
        }

        public int hashCode() {
            boolean z = this.isCardShouldBeSaved;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isCardShouldBeSaved() {
            return this.isCardShouldBeSaved;
        }

        public String toString() {
            return C8030a.m1428a(new StringBuilder("Web(isCardShouldBeSaved="), this.isCardShouldBeSaved, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod$WithLoyalty;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentOperation;", "component1", "operations", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/util/List;", "getOperations", "()Ljava/util/List;", SegmentConstantPool.INITSTRING, "(Ljava/util/List;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final /* data */ class WithLoyalty extends PaymentMethod {

        /* renamed from: a, reason: from kotlin metadata */
        public final List operations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithLoyalty(List<PaymentOperation> operations) {
            super(null);
            Intrinsics.checkNotNullParameter(operations, "operations");
            this.operations = operations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WithLoyalty copy$default(WithLoyalty withLoyalty, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = withLoyalty.operations;
            }
            return withLoyalty.copy(list);
        }

        public final List<PaymentOperation> component1() {
            return this.operations;
        }

        public final WithLoyalty copy(List<PaymentOperation> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            return new WithLoyalty(operations);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithLoyalty) && Intrinsics.areEqual(this.operations, ((WithLoyalty) other).operations);
        }

        public final List<PaymentOperation> getOperations() {
            return this.operations;
        }

        public int hashCode() {
            return this.operations.hashCode();
        }

        public String toString() {
            return C8045g.m1489a(new StringBuilder("WithLoyalty(operations="), this.operations, ')');
        }
    }

    public PaymentMethod() {
    }

    public /* synthetic */ PaymentMethod(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
