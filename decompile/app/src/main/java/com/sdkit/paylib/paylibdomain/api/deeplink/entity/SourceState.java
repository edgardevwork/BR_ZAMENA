package com.sdkit.paylib.paylibdomain.api.deeplink.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "", "()V", "Application", "Invoice", "PaymentMethodChangeState", "Product", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$Application;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$Invoice;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$PaymentMethodChangeState;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$Product;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public abstract class SourceState {

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J3\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$Application;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "", "component1", "component2", "component3", "component4", "applicationId", "invoiceId", "purchaseId", "developerPayload", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "b", "getInvoiceId", "c", "getPurchaseId", "d", "getDeveloperPayload", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Application extends SourceState {

        /* renamed from: a, reason: from kotlin metadata */
        public final String applicationId;

        /* renamed from: b, reason: from kotlin metadata */
        public final String invoiceId;

        /* renamed from: c, reason: from kotlin metadata */
        public final String purchaseId;

        /* renamed from: d, reason: from kotlin metadata */
        public final String developerPayload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(String applicationId, String invoiceId, String purchaseId, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.applicationId = applicationId;
            this.invoiceId = invoiceId;
            this.purchaseId = purchaseId;
            this.developerPayload = str;
        }

        public static /* synthetic */ Application copy$default(Application application, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.applicationId;
            }
            if ((i & 2) != 0) {
                str2 = application.invoiceId;
            }
            if ((i & 4) != 0) {
                str3 = application.purchaseId;
            }
            if ((i & 8) != 0) {
                str4 = application.developerPayload;
            }
            return application.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeveloperPayload() {
            return this.developerPayload;
        }

        public final Application copy(String applicationId, String invoiceId, String purchaseId, String developerPayload) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            return new Application(applicationId, invoiceId, purchaseId, developerPayload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Application)) {
                return false;
            }
            Application application = (Application) other;
            return Intrinsics.areEqual(this.applicationId, application.applicationId) && Intrinsics.areEqual(this.invoiceId, application.invoiceId) && Intrinsics.areEqual(this.purchaseId, application.purchaseId) && Intrinsics.areEqual(this.developerPayload, application.developerPayload);
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final String getDeveloperPayload() {
            return this.developerPayload;
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public int hashCode() {
            int iM1429a = C8031b.m1429a(this.purchaseId, C8031b.m1429a(this.invoiceId, this.applicationId.hashCode() * 31, 31), 31);
            String str = this.developerPayload;
            return iM1429a + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Application(applicationId=");
            sb.append(this.applicationId);
            sb.append(", invoiceId=");
            sb.append(this.invoiceId);
            sb.append(", purchaseId=");
            sb.append(this.purchaseId);
            sb.append(", developerPayload=");
            return C8032c.m1430a(sb, this.developerPayload, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$Invoice;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "", "component1", "invoiceId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getInvoiceId", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Invoice extends SourceState {

        /* renamed from: a, reason: from kotlin metadata */
        public final String invoiceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Invoice(String invoiceId) {
            super(null);
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.invoiceId = invoiceId;
        }

        public static /* synthetic */ Invoice copy$default(Invoice invoice, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invoice.invoiceId;
            }
            return invoice.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public final Invoice copy(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            return new Invoice(invoiceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Invoice) && Intrinsics.areEqual(this.invoiceId, ((Invoice) other).invoiceId);
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public int hashCode() {
            return this.invoiceId.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Invoice(invoiceId="), this.invoiceId, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$PaymentMethodChangeState;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "", "component1", "component2", "component3", "invoiceId", "oldPurchaseId", "purchaseId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getInvoiceId", "()Ljava/lang/String;", "b", "getOldPurchaseId", "c", "getPurchaseId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class PaymentMethodChangeState extends SourceState {

        /* renamed from: a, reason: from kotlin metadata */
        public final String invoiceId;

        /* renamed from: b, reason: from kotlin metadata */
        public final String oldPurchaseId;

        /* renamed from: c, reason: from kotlin metadata */
        public final String purchaseId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethodChangeState(String invoiceId, String oldPurchaseId, String purchaseId) {
            super(null);
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(oldPurchaseId, "oldPurchaseId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.invoiceId = invoiceId;
            this.oldPurchaseId = oldPurchaseId;
            this.purchaseId = purchaseId;
        }

        public static /* synthetic */ PaymentMethodChangeState copy$default(PaymentMethodChangeState paymentMethodChangeState, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentMethodChangeState.invoiceId;
            }
            if ((i & 2) != 0) {
                str2 = paymentMethodChangeState.oldPurchaseId;
            }
            if ((i & 4) != 0) {
                str3 = paymentMethodChangeState.purchaseId;
            }
            return paymentMethodChangeState.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOldPurchaseId() {
            return this.oldPurchaseId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public final PaymentMethodChangeState copy(String invoiceId, String oldPurchaseId, String purchaseId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(oldPurchaseId, "oldPurchaseId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            return new PaymentMethodChangeState(invoiceId, oldPurchaseId, purchaseId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethodChangeState)) {
                return false;
            }
            PaymentMethodChangeState paymentMethodChangeState = (PaymentMethodChangeState) other;
            return Intrinsics.areEqual(this.invoiceId, paymentMethodChangeState.invoiceId) && Intrinsics.areEqual(this.oldPurchaseId, paymentMethodChangeState.oldPurchaseId) && Intrinsics.areEqual(this.purchaseId, paymentMethodChangeState.purchaseId);
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public final String getOldPurchaseId() {
            return this.oldPurchaseId;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public int hashCode() {
            return this.purchaseId.hashCode() + C8031b.m1429a(this.oldPurchaseId, this.invoiceId.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentMethodChangeState(invoiceId=");
            sb.append(this.invoiceId);
            sb.append(", oldPurchaseId=");
            sb.append(this.oldPurchaseId);
            sb.append(", purchaseId=");
            return C8032c.m1430a(sb, this.purchaseId, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003JR\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\tR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c¨\u0006*"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$Product;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "component6", "invoiceId", "purchaseId", "productId", "orderId", FirebaseAnalytics.Param.QUANTITY, "developerPayload", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState$Product;", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getInvoiceId", "()Ljava/lang/String;", "b", "getPurchaseId", "c", "getProductId", "d", "getOrderId", "e", "Ljava/lang/Integer;", "getQuantity", "f", "getDeveloperPayload", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Product extends SourceState {

        /* renamed from: a, reason: from kotlin metadata */
        public final String invoiceId;

        /* renamed from: b, reason: from kotlin metadata */
        public final String purchaseId;

        /* renamed from: c, reason: from kotlin metadata */
        public final String productId;

        /* renamed from: d, reason: from kotlin metadata */
        public final String orderId;

        /* renamed from: e, reason: from kotlin metadata */
        public final Integer com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;

        /* renamed from: f, reason: from kotlin metadata */
        public final String developerPayload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(String invoiceId, String purchaseId, String productId, String str, Integer num, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.invoiceId = invoiceId;
            this.purchaseId = purchaseId;
            this.productId = productId;
            this.orderId = str;
            this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String = num;
            this.developerPayload = str2;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, String str2, String str3, String str4, Integer num, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = product.invoiceId;
            }
            if ((i & 2) != 0) {
                str2 = product.purchaseId;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = product.productId;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = product.orderId;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                num = product.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;
            }
            Integer num2 = num;
            if ((i & 32) != 0) {
                str5 = product.developerPayload;
            }
            return product.copy(str, str6, str7, str8, num2, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
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
        public final String getOrderId() {
            return this.orderId;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String() {
            return this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDeveloperPayload() {
            return this.developerPayload;
        }

        public final Product copy(String invoiceId, String purchaseId, String productId, String orderId, Integer num, String developerPayload) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(productId, "productId");
            return new Product(invoiceId, purchaseId, productId, orderId, num, developerPayload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return Intrinsics.areEqual(this.invoiceId, product.invoiceId) && Intrinsics.areEqual(this.purchaseId, product.purchaseId) && Intrinsics.areEqual(this.productId, product.productId) && Intrinsics.areEqual(this.orderId, product.orderId) && Intrinsics.areEqual(this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String, product.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String) && Intrinsics.areEqual(this.developerPayload, product.developerPayload);
        }

        public final String getDeveloperPayload() {
            return this.developerPayload;
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
            return this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;
        }

        public int hashCode() {
            int iM1429a = C8031b.m1429a(this.productId, C8031b.m1429a(this.purchaseId, this.invoiceId.hashCode() * 31, 31), 31);
            String str = this.orderId;
            int iHashCode = (iM1429a + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.developerPayload;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Product(invoiceId=");
            sb.append(this.invoiceId);
            sb.append(", purchaseId=");
            sb.append(this.purchaseId);
            sb.append(", productId=");
            sb.append(this.productId);
            sb.append(", orderId=");
            sb.append(this.orderId);
            sb.append(", quantity=");
            sb.append(this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String);
            sb.append(", developerPayload=");
            return C8032c.m1430a(sb, this.developerPayload, ')');
        }
    }

    public SourceState() {
    }

    public /* synthetic */ SourceState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
