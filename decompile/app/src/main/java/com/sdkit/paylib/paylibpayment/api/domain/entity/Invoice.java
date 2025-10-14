package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.ant.IvyCleanCache;

@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001:\u0001TB\u0081\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bR\u0010SJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J¤\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0002HÖ\u0001J\t\u0010)\u001a\u00020(HÖ\u0001J\u0013\u0010+\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010!\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\"\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010#\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b#\u0010NR\u0019\u0010$\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u0017¨\u0006U"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice;", "", "", "component1", "component2", "component3", "component4", "", "component5", "component6", "component7", "", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/CardWithLoyalty;", "component8", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentWay;", "component9", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument;", "component10", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice$LoyaltyInfoState;", "component11", "", "component12", "component13", "()Ljava/lang/Boolean;", "invoiceId", "orderId", "icon", "title", "amountValue", "visibleAmount", FirebaseAnalytics.Param.CURRENCY, "cards", "paymentWays", "paymentInstrument", "loyaltyInfoState", "isSubscription", "canSaveBindings", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice$LoyaltyInfoState;ZLjava/lang/Boolean;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice;", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getInvoiceId", "()Ljava/lang/String;", "b", "getOrderId", "c", "getIcon", "d", "getTitle", "e", "J", "getAmountValue", "()J", "f", "getVisibleAmount", "g", "getCurrency", "h", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "i", "getPaymentWays", "j", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument;", "getPaymentInstrument", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument;", "k", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice$LoyaltyInfoState;", "getLoyaltyInfoState", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice$LoyaltyInfoState;", "l", "Z", "()Z", "m", "Ljava/lang/Boolean;", "getCanSaveBindings", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentInstrument;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice$LoyaltyInfoState;ZLjava/lang/Boolean;)V", "LoyaltyInfoState", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class Invoice {

    /* renamed from: a, reason: from kotlin metadata */
    public final String invoiceId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String orderId;

    /* renamed from: c, reason: from kotlin metadata */
    public final String icon;

    /* renamed from: d, reason: from kotlin metadata */
    public final String title;

    /* renamed from: e, reason: from kotlin metadata */
    public final long amountValue;

    /* renamed from: f, reason: from kotlin metadata */
    public final String visibleAmount;

    /* renamed from: g, reason: from kotlin metadata */
    public final String com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String;

    /* renamed from: h, reason: from kotlin metadata */
    public final List cards;

    /* renamed from: i, reason: from kotlin metadata */
    public final List paymentWays;

    /* renamed from: j, reason: from kotlin metadata */
    public final PaymentInstrument paymentInstrument;

    /* renamed from: k, reason: from kotlin metadata */
    public final LoyaltyInfoState loyaltyInfoState;

    /* renamed from: l, reason: from kotlin metadata */
    public final boolean isSubscription;

    /* renamed from: m, reason: from kotlin metadata */
    public final Boolean canSaveBindings;

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice$LoyaltyInfoState;", "", "(Ljava/lang/String;I)V", IvyCleanCache.NONE, "READY_TO_LOAD", "LOADED", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public enum LoyaltyInfoState {
        NONE,
        READY_TO_LOAD,
        LOADED
    }

    public Invoice(String invoiceId, String orderId, String icon, String title, long j, String visibleAmount, String str, List<CardWithLoyalty> cards, List<PaymentWay> paymentWays, PaymentInstrument paymentInstrument, LoyaltyInfoState loyaltyInfoState, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(visibleAmount, "visibleAmount");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(paymentWays, "paymentWays");
        Intrinsics.checkNotNullParameter(loyaltyInfoState, "loyaltyInfoState");
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.icon = icon;
        this.title = title;
        this.amountValue = j;
        this.visibleAmount = visibleAmount;
        this.com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String = str;
        this.cards = cards;
        this.paymentWays = paymentWays;
        this.paymentInstrument = paymentInstrument;
        this.loyaltyInfoState = loyaltyInfoState;
        this.isSubscription = z;
        this.canSaveBindings = bool;
    }

    /* renamed from: component1, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    /* renamed from: component10, reason: from getter */
    public final PaymentInstrument getPaymentInstrument() {
        return this.paymentInstrument;
    }

    /* renamed from: component11, reason: from getter */
    public final LoyaltyInfoState getLoyaltyInfoState() {
        return this.loyaltyInfoState;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSubscription() {
        return this.isSubscription;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getCanSaveBindings() {
        return this.canSaveBindings;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final long getAmountValue() {
        return this.amountValue;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVisibleAmount() {
        return this.visibleAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCom.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String() {
        return this.com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String;
    }

    public final List<CardWithLoyalty> component8() {
        return this.cards;
    }

    public final List<PaymentWay> component9() {
        return this.paymentWays;
    }

    public final Invoice copy(String invoiceId, String orderId, String icon, String title, long amountValue, String visibleAmount, String str, List<CardWithLoyalty> cards, List<PaymentWay> paymentWays, PaymentInstrument paymentInstrument, LoyaltyInfoState loyaltyInfoState, boolean isSubscription, Boolean canSaveBindings) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(visibleAmount, "visibleAmount");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(paymentWays, "paymentWays");
        Intrinsics.checkNotNullParameter(loyaltyInfoState, "loyaltyInfoState");
        return new Invoice(invoiceId, orderId, icon, title, amountValue, visibleAmount, str, cards, paymentWays, paymentInstrument, loyaltyInfoState, isSubscription, canSaveBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Invoice)) {
            return false;
        }
        Invoice invoice = (Invoice) other;
        return Intrinsics.areEqual(this.invoiceId, invoice.invoiceId) && Intrinsics.areEqual(this.orderId, invoice.orderId) && Intrinsics.areEqual(this.icon, invoice.icon) && Intrinsics.areEqual(this.title, invoice.title) && this.amountValue == invoice.amountValue && Intrinsics.areEqual(this.visibleAmount, invoice.visibleAmount) && Intrinsics.areEqual(this.com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String, invoice.com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String) && Intrinsics.areEqual(this.cards, invoice.cards) && Intrinsics.areEqual(this.paymentWays, invoice.paymentWays) && Intrinsics.areEqual(this.paymentInstrument, invoice.paymentInstrument) && this.loyaltyInfoState == invoice.loyaltyInfoState && this.isSubscription == invoice.isSubscription && Intrinsics.areEqual(this.canSaveBindings, invoice.canSaveBindings);
    }

    public final long getAmountValue() {
        return this.amountValue;
    }

    public final Boolean getCanSaveBindings() {
        return this.canSaveBindings;
    }

    public final List<CardWithLoyalty> getCards() {
        return this.cards;
    }

    public final String getCurrency() {
        return this.com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final LoyaltyInfoState getLoyaltyInfoState() {
        return this.loyaltyInfoState;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final PaymentInstrument getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public final List<PaymentWay> getPaymentWays() {
        return this.paymentWays;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVisibleAmount() {
        return this.visibleAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.visibleAmount, (Long.hashCode(this.amountValue) + C8031b.m1429a(this.title, C8031b.m1429a(this.icon, C8031b.m1429a(this.orderId, this.invoiceId.hashCode() * 31, 31), 31), 31)) * 31, 31);
        String str = this.com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String;
        int iHashCode = (this.paymentWays.hashCode() + ((this.cards.hashCode() + ((iM1429a + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        PaymentInstrument paymentInstrument = this.paymentInstrument;
        int iHashCode2 = (this.loyaltyInfoState.hashCode() + ((iHashCode + (paymentInstrument == null ? 0 : paymentInstrument.hashCode())) * 31)) * 31;
        boolean z = this.isSubscription;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        Boolean bool = this.canSaveBindings;
        return i2 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isSubscription() {
        return this.isSubscription;
    }

    public String toString() {
        return "Invoice(invoiceId=" + this.invoiceId + ", orderId=" + this.orderId + ", icon=" + this.icon + ", title=" + this.title + ", amountValue=" + this.amountValue + ", visibleAmount=" + this.visibleAmount + ", currency=" + this.com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String + ", cards=" + this.cards + ", paymentWays=" + this.paymentWays + ", paymentInstrument=" + this.paymentInstrument + ", loyaltyInfoState=" + this.loyaltyInfoState + ", isSubscription=" + this.isSubscription + ", canSaveBindings=" + this.canSaveBindings + ')';
    }
}
