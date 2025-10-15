package ru.rustore.sdk.billingclient.model.purchase;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;", "", "Cancelled", "Failure", "InvalidPaymentState", "Success", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$Cancelled;", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$Failure;", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$InvalidPaymentState;", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$Success;", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface PaymentResult {

    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$Cancelled;", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;", "purchaseId", "", "sandbox", "", "(Ljava/lang/String;Z)V", "getPurchaseId", "()Ljava/lang/String;", "getSandbox", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class Cancelled implements PaymentResult {
        private final String purchaseId;
        private final boolean sandbox;

        public Cancelled(String purchaseId, boolean z) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.purchaseId = purchaseId;
            this.sandbox = z;
        }

        public static /* synthetic */ Cancelled copy$default(Cancelled cancelled, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cancelled.purchaseId;
            }
            if ((i & 2) != 0) {
                z = cancelled.sandbox;
            }
            return cancelled.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSandbox() {
            return this.sandbox;
        }

        public final Cancelled copy(String purchaseId, boolean sandbox) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            return new Cancelled(purchaseId, sandbox);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cancelled)) {
                return false;
            }
            Cancelled cancelled = (Cancelled) other;
            return Intrinsics.areEqual(this.purchaseId, cancelled.purchaseId) && this.sandbox == cancelled.sandbox;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public final boolean getSandbox() {
            return this.sandbox;
        }

        public int hashCode() {
            return Boolean.hashCode(this.sandbox) + (this.purchaseId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Cancelled(purchaseId=");
            sb.append(this.purchaseId);
            sb.append(", sandbox=");
            return C8030a.m1428a(sb, this.sandbox, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ`\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$Failure;", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;", "purchaseId", "", "invoiceId", "orderId", FirebaseAnalytics.Param.QUANTITY, "", "productId", "sandbox", "", "errorCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInvoiceId", "()Ljava/lang/String;", "getOrderId", "getProductId", "getPurchaseId", "getQuantity", "getSandbox", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;)Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$Failure;", "equals", "other", "", "hashCode", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class Failure implements PaymentResult {
        private final Integer errorCode;
        private final String invoiceId;
        private final String orderId;
        private final String productId;
        private final String purchaseId;
        private final Integer quantity;
        private final boolean sandbox;

        public Failure(String str, String str2, String str3, Integer num, String str4, boolean z, Integer num2) {
            this.purchaseId = str;
            this.invoiceId = str2;
            this.orderId = str3;
            this.quantity = num;
            this.productId = str4;
            this.sandbox = z;
            this.errorCode = num2;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, String str3, Integer num, String str4, boolean z, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.purchaseId;
            }
            if ((i & 2) != 0) {
                str2 = failure.invoiceId;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = failure.orderId;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                num = failure.quantity;
            }
            Integer num3 = num;
            if ((i & 16) != 0) {
                str4 = failure.productId;
            }
            String str7 = str4;
            if ((i & 32) != 0) {
                z = failure.sandbox;
            }
            boolean z2 = z;
            if ((i & 64) != 0) {
                num2 = failure.errorCode;
            }
            return failure.copy(str, str5, str6, num3, str7, z2, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getQuantity() {
            return this.quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSandbox() {
            return this.sandbox;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Failure copy(String purchaseId, String invoiceId, String orderId, Integer quantity, String productId, boolean sandbox, Integer errorCode) {
            return new Failure(purchaseId, invoiceId, orderId, quantity, productId, sandbox, errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.purchaseId, failure.purchaseId) && Intrinsics.areEqual(this.invoiceId, failure.invoiceId) && Intrinsics.areEqual(this.orderId, failure.orderId) && Intrinsics.areEqual(this.quantity, failure.quantity) && Intrinsics.areEqual(this.productId, failure.productId) && this.sandbox == failure.sandbox && Intrinsics.areEqual(this.errorCode, failure.errorCode);
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final boolean getSandbox() {
            return this.sandbox;
        }

        public int hashCode() {
            String str = this.purchaseId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.invoiceId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.orderId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.quantity;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.productId;
            int iHashCode5 = (Boolean.hashCode(this.sandbox) + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
            Integer num2 = this.errorCode;
            return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "Failure(purchaseId=" + this.purchaseId + ", invoiceId=" + this.invoiceId + ", orderId=" + this.orderId + ", quantity=" + this.quantity + ", productId=" + this.productId + ", sandbox=" + this.sandbox + ", errorCode=" + this.errorCode + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$InvalidPaymentState;", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;", "()V", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class InvalidPaymentState implements PaymentResult {
        public static final InvalidPaymentState INSTANCE = new InvalidPaymentState();

        private InvalidPaymentState() {
        }
    }

    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PaymentResult$Success;", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;", "orderId", "", "purchaseId", "productId", "invoiceId", "sandbox", "", "subscriptionToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getInvoiceId", "()Ljava/lang/String;", "getOrderId", "getProductId", "getPurchaseId", "getSandbox", "()Z", "getSubscriptionToken", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class Success implements PaymentResult {
        private final String invoiceId;
        private final String orderId;
        private final String productId;
        private final String purchaseId;
        private final boolean sandbox;
        private final String subscriptionToken;

        public Success(String str, String purchaseId, String productId, String invoiceId, boolean z, String str2) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.orderId = str;
            this.purchaseId = purchaseId;
            this.productId = productId;
            this.invoiceId = invoiceId;
            this.sandbox = z;
            this.subscriptionToken = str2;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.orderId;
            }
            if ((i & 2) != 0) {
                str2 = success.purchaseId;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = success.productId;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = success.invoiceId;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                z = success.sandbox;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                str5 = success.subscriptionToken;
            }
            return success.copy(str, str6, str7, str8, z2, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSandbox() {
            return this.sandbox;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSubscriptionToken() {
            return this.subscriptionToken;
        }

        public final Success copy(String orderId, String purchaseId, String productId, String invoiceId, boolean sandbox, String subscriptionToken) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            return new Success(orderId, purchaseId, productId, invoiceId, sandbox, subscriptionToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.orderId, success.orderId) && Intrinsics.areEqual(this.purchaseId, success.purchaseId) && Intrinsics.areEqual(this.productId, success.productId) && Intrinsics.areEqual(this.invoiceId, success.invoiceId) && this.sandbox == success.sandbox && Intrinsics.areEqual(this.subscriptionToken, success.subscriptionToken);
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public final boolean getSandbox() {
            return this.sandbox;
        }

        public final String getSubscriptionToken() {
            return this.subscriptionToken;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (Boolean.hashCode(this.sandbox) + C8031b.m1429a(this.invoiceId, C8031b.m1429a(this.productId, C8031b.m1429a(this.purchaseId, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31)) * 31;
            String str2 = this.subscriptionToken;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Success(orderId=");
            sb.append(this.orderId);
            sb.append(", purchaseId=");
            sb.append(this.purchaseId);
            sb.append(", productId=");
            sb.append(this.productId);
            sb.append(", invoiceId=");
            sb.append(this.invoiceId);
            sb.append(", sandbox=");
            sb.append(this.sandbox);
            sb.append(", subscriptionToken=");
            return C8032c.m1430a(sb, this.subscriptionToken, ')');
        }

        public /* synthetic */ Success(String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, z, (i & 32) != 0 ? null : str5);
        }
    }
}
