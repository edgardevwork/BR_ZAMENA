package com.sdkit.paylib.paylibnative.api.analytics;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0011\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "()V", "Other", "PaySheetAddPhoneNumber", "PaySheetPaymentAgain", "PaySheetPaymentAvailableMethods", "PaySheetPaymentMethodSaveAndPay", "PaySheetPaymentMethodSelect", "PaySheetPaymentMethodShowFull", "PaySheetPaymentProceed", "PaySheetPaymentSBP", "PaySheetPhoneNumberCodeAgain", "PaySheetPhoneNumberConfirmed", "PaySheetSaveCardSelected", "PaylibInvoiceLoadingSuccess", "PaymentsLoading", "PaymentsPayFailed", "PaymentsPayLoading", "PaymentsPaySucceeded", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$Other;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetAddPhoneNumber;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentAgain;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentAvailableMethods;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentMethodSaveAndPay;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentMethodSelect;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentMethodShowFull;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentProceed;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentSBP;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPhoneNumberCodeAgain;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPhoneNumberConfirmed;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetSaveCardSelected;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaylibInvoiceLoadingSuccess;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaymentsLoading;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaymentsPayFailed;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaymentsPayLoading;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaymentsPaySucceeded;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public abstract class PaylibEvent {

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$Other;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "()V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Other extends PaylibEvent {
        public static final Other INSTANCE = new Other();

        public Other() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetAddPhoneNumber;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "()V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaySheetAddPhoneNumber extends PaylibEvent {
        public static final PaySheetAddPhoneNumber INSTANCE = new PaySheetAddPhoneNumber();

        public PaySheetAddPhoneNumber() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentAgain;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "()V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaySheetPaymentAgain extends PaylibEvent {
        public static final PaySheetPaymentAgain INSTANCE = new PaySheetPaymentAgain();

        public PaySheetPaymentAgain() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J#\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentAvailableMethods;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "", "component2", "purchaseId", "paymentMethods", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/util/List;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaySheetPaymentAvailableMethods extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final String purchaseId;

        /* renamed from: b, reason: from kotlin metadata */
        public final List paymentMethods;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaySheetPaymentAvailableMethods(String purchaseId, List<String> paymentMethods) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            this.purchaseId = purchaseId;
            this.paymentMethods = paymentMethods;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaySheetPaymentAvailableMethods copy$default(PaySheetPaymentAvailableMethods paySheetPaymentAvailableMethods, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paySheetPaymentAvailableMethods.purchaseId;
            }
            if ((i & 2) != 0) {
                list = paySheetPaymentAvailableMethods.paymentMethods;
            }
            return paySheetPaymentAvailableMethods.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public final List<String> component2() {
            return this.paymentMethods;
        }

        public final PaySheetPaymentAvailableMethods copy(String purchaseId, List<String> paymentMethods) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            return new PaySheetPaymentAvailableMethods(purchaseId, paymentMethods);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaySheetPaymentAvailableMethods)) {
                return false;
            }
            PaySheetPaymentAvailableMethods paySheetPaymentAvailableMethods = (PaySheetPaymentAvailableMethods) other;
            return Intrinsics.areEqual(this.purchaseId, paySheetPaymentAvailableMethods.purchaseId) && Intrinsics.areEqual(this.paymentMethods, paySheetPaymentAvailableMethods.paymentMethods);
        }

        public final List<String> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public int hashCode() {
            return this.paymentMethods.hashCode() + (this.purchaseId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaySheetPaymentAvailableMethods(purchaseId=");
            sb.append(this.purchaseId);
            sb.append(", paymentMethods=");
            return C8045g.m1489a(sb, this.paymentMethods, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentMethodSaveAndPay;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "()V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaySheetPaymentMethodSaveAndPay extends PaylibEvent {
        public static final PaySheetPaymentMethodSaveAndPay INSTANCE = new PaySheetPaymentMethodSaveAndPay();

        public PaySheetPaymentMethodSaveAndPay() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentMethodSelect;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "methodType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMethodType", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaySheetPaymentMethodSelect extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final String methodType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaySheetPaymentMethodSelect(String methodType) {
            super(null);
            Intrinsics.checkNotNullParameter(methodType, "methodType");
            this.methodType = methodType;
        }

        public static /* synthetic */ PaySheetPaymentMethodSelect copy$default(PaySheetPaymentMethodSelect paySheetPaymentMethodSelect, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paySheetPaymentMethodSelect.methodType;
            }
            return paySheetPaymentMethodSelect.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMethodType() {
            return this.methodType;
        }

        public final PaySheetPaymentMethodSelect copy(String methodType) {
            Intrinsics.checkNotNullParameter(methodType, "methodType");
            return new PaySheetPaymentMethodSelect(methodType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaySheetPaymentMethodSelect) && Intrinsics.areEqual(this.methodType, ((PaySheetPaymentMethodSelect) other).methodType);
        }

        public final String getMethodType() {
            return this.methodType;
        }

        public int hashCode() {
            return this.methodType.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PaySheetPaymentMethodSelect(methodType="), this.methodType, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentMethodShowFull;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "()V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaySheetPaymentMethodShowFull extends PaylibEvent {
        public static final PaySheetPaymentMethodShowFull INSTANCE = new PaySheetPaymentMethodShowFull();

        public PaySheetPaymentMethodShowFull() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentProceed;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "component2", "purchaseId", "methodType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getMethodType", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaySheetPaymentProceed extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final String purchaseId;

        /* renamed from: b, reason: from kotlin metadata */
        public final String methodType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaySheetPaymentProceed(String purchaseId, String methodType) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(methodType, "methodType");
            this.purchaseId = purchaseId;
            this.methodType = methodType;
        }

        public static /* synthetic */ PaySheetPaymentProceed copy$default(PaySheetPaymentProceed paySheetPaymentProceed, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paySheetPaymentProceed.purchaseId;
            }
            if ((i & 2) != 0) {
                str2 = paySheetPaymentProceed.methodType;
            }
            return paySheetPaymentProceed.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMethodType() {
            return this.methodType;
        }

        public final PaySheetPaymentProceed copy(String purchaseId, String methodType) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(methodType, "methodType");
            return new PaySheetPaymentProceed(purchaseId, methodType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaySheetPaymentProceed)) {
                return false;
            }
            PaySheetPaymentProceed paySheetPaymentProceed = (PaySheetPaymentProceed) other;
            return Intrinsics.areEqual(this.purchaseId, paySheetPaymentProceed.purchaseId) && Intrinsics.areEqual(this.methodType, paySheetPaymentProceed.methodType);
        }

        public final String getMethodType() {
            return this.methodType;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public int hashCode() {
            return this.methodType.hashCode() + (this.purchaseId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaySheetPaymentProceed(purchaseId=");
            sb.append(this.purchaseId);
            sb.append(", methodType=");
            return C8032c.m1430a(sb, this.methodType, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPaymentSBP;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "component2", "", "component3", "selectedAppBankName", "selectedAppPackageName", "installedApps", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getSelectedAppBankName", "()Ljava/lang/String;", "b", "getSelectedAppPackageName", "c", "Ljava/util/List;", "getInstalledApps", "()Ljava/util/List;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaySheetPaymentSBP extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final String selectedAppBankName;

        /* renamed from: b, reason: from kotlin metadata */
        public final String selectedAppPackageName;

        /* renamed from: c, reason: from kotlin metadata */
        public final List installedApps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaySheetPaymentSBP(String selectedAppBankName, String selectedAppPackageName, List<String> installedApps) {
            super(null);
            Intrinsics.checkNotNullParameter(selectedAppBankName, "selectedAppBankName");
            Intrinsics.checkNotNullParameter(selectedAppPackageName, "selectedAppPackageName");
            Intrinsics.checkNotNullParameter(installedApps, "installedApps");
            this.selectedAppBankName = selectedAppBankName;
            this.selectedAppPackageName = selectedAppPackageName;
            this.installedApps = installedApps;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaySheetPaymentSBP copy$default(PaySheetPaymentSBP paySheetPaymentSBP, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paySheetPaymentSBP.selectedAppBankName;
            }
            if ((i & 2) != 0) {
                str2 = paySheetPaymentSBP.selectedAppPackageName;
            }
            if ((i & 4) != 0) {
                list = paySheetPaymentSBP.installedApps;
            }
            return paySheetPaymentSBP.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSelectedAppBankName() {
            return this.selectedAppBankName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSelectedAppPackageName() {
            return this.selectedAppPackageName;
        }

        public final List<String> component3() {
            return this.installedApps;
        }

        public final PaySheetPaymentSBP copy(String selectedAppBankName, String selectedAppPackageName, List<String> installedApps) {
            Intrinsics.checkNotNullParameter(selectedAppBankName, "selectedAppBankName");
            Intrinsics.checkNotNullParameter(selectedAppPackageName, "selectedAppPackageName");
            Intrinsics.checkNotNullParameter(installedApps, "installedApps");
            return new PaySheetPaymentSBP(selectedAppBankName, selectedAppPackageName, installedApps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaySheetPaymentSBP)) {
                return false;
            }
            PaySheetPaymentSBP paySheetPaymentSBP = (PaySheetPaymentSBP) other;
            return Intrinsics.areEqual(this.selectedAppBankName, paySheetPaymentSBP.selectedAppBankName) && Intrinsics.areEqual(this.selectedAppPackageName, paySheetPaymentSBP.selectedAppPackageName) && Intrinsics.areEqual(this.installedApps, paySheetPaymentSBP.installedApps);
        }

        public final List<String> getInstalledApps() {
            return this.installedApps;
        }

        public final String getSelectedAppBankName() {
            return this.selectedAppBankName;
        }

        public final String getSelectedAppPackageName() {
            return this.selectedAppPackageName;
        }

        public int hashCode() {
            return this.installedApps.hashCode() + C8031b.m1429a(this.selectedAppPackageName, this.selectedAppBankName.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaySheetPaymentSBP(selectedAppBankName=");
            sb.append(this.selectedAppBankName);
            sb.append(", selectedAppPackageName=");
            sb.append(this.selectedAppPackageName);
            sb.append(", installedApps=");
            return C8045g.m1489a(sb, this.installedApps, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPhoneNumberCodeAgain;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "()V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaySheetPhoneNumberCodeAgain extends PaylibEvent {
        public static final PaySheetPhoneNumberCodeAgain INSTANCE = new PaySheetPhoneNumberCodeAgain();

        public PaySheetPhoneNumberCodeAgain() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetPhoneNumberConfirmed;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "()V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaySheetPhoneNumberConfirmed extends PaylibEvent {
        public static final PaySheetPhoneNumberConfirmed INSTANCE = new PaySheetPhoneNumberConfirmed();

        public PaySheetPhoneNumberConfirmed() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaySheetSaveCardSelected;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "isSaveCardSelected", "copy", "", "toString", "", "hashCode", "", "other", "equals", "a", "Z", "()Z", SegmentConstantPool.INITSTRING, "(Z)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaySheetSaveCardSelected extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final boolean isSaveCardSelected;

        public PaySheetSaveCardSelected(boolean z) {
            super(null);
            this.isSaveCardSelected = z;
        }

        public static /* synthetic */ PaySheetSaveCardSelected copy$default(PaySheetSaveCardSelected paySheetSaveCardSelected, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = paySheetSaveCardSelected.isSaveCardSelected;
            }
            return paySheetSaveCardSelected.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSaveCardSelected() {
            return this.isSaveCardSelected;
        }

        public final PaySheetSaveCardSelected copy(boolean isSaveCardSelected) {
            return new PaySheetSaveCardSelected(isSaveCardSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaySheetSaveCardSelected) && this.isSaveCardSelected == ((PaySheetSaveCardSelected) other).isSaveCardSelected;
        }

        public int hashCode() {
            boolean z = this.isSaveCardSelected;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isSaveCardSelected() {
            return this.isSaveCardSelected;
        }

        public String toString() {
            return C8030a.m1428a(new StringBuilder("PaySheetSaveCardSelected(isSaveCardSelected="), this.isSaveCardSelected, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaylibInvoiceLoadingSuccess;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "()V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaylibInvoiceLoadingSuccess extends PaylibEvent {
        public static final PaylibInvoiceLoadingSuccess INSTANCE = new PaylibInvoiceLoadingSuccess();

        public PaylibInvoiceLoadingSuccess() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaymentsLoading;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "purchaseId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaymentsLoading extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final String purchaseId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentsLoading(String purchaseId) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.purchaseId = purchaseId;
        }

        public static /* synthetic */ PaymentsLoading copy$default(PaymentsLoading paymentsLoading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentsLoading.purchaseId;
            }
            return paymentsLoading.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public final PaymentsLoading copy(String purchaseId) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            return new PaymentsLoading(purchaseId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentsLoading) && Intrinsics.areEqual(this.purchaseId, ((PaymentsLoading) other).purchaseId);
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public int hashCode() {
            return this.purchaseId.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PaymentsLoading(purchaseId="), this.purchaseId, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaymentsPayFailed;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "component2", "purchaseId", "paymentMethod", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getPaymentMethod", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaymentsPayFailed extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final String purchaseId;

        /* renamed from: b, reason: from kotlin metadata */
        public final String paymentMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentsPayFailed(String purchaseId, String paymentMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.purchaseId = purchaseId;
            this.paymentMethod = paymentMethod;
        }

        public static /* synthetic */ PaymentsPayFailed copy$default(PaymentsPayFailed paymentsPayFailed, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentsPayFailed.purchaseId;
            }
            if ((i & 2) != 0) {
                str2 = paymentsPayFailed.paymentMethod;
            }
            return paymentsPayFailed.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final PaymentsPayFailed copy(String purchaseId, String paymentMethod) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new PaymentsPayFailed(purchaseId, paymentMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentsPayFailed)) {
                return false;
            }
            PaymentsPayFailed paymentsPayFailed = (PaymentsPayFailed) other;
            return Intrinsics.areEqual(this.purchaseId, paymentsPayFailed.purchaseId) && Intrinsics.areEqual(this.paymentMethod, paymentsPayFailed.paymentMethod);
        }

        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public int hashCode() {
            return this.paymentMethod.hashCode() + (this.purchaseId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentsPayFailed(purchaseId=");
            sb.append(this.purchaseId);
            sb.append(", paymentMethod=");
            return C8032c.m1430a(sb, this.paymentMethod, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaymentsPayLoading;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "purchaseId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaymentsPayLoading extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final String purchaseId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentsPayLoading(String purchaseId) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.purchaseId = purchaseId;
        }

        public static /* synthetic */ PaymentsPayLoading copy$default(PaymentsPayLoading paymentsPayLoading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentsPayLoading.purchaseId;
            }
            return paymentsPayLoading.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public final PaymentsPayLoading copy(String purchaseId) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            return new PaymentsPayLoading(purchaseId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentsPayLoading) && Intrinsics.areEqual(this.purchaseId, ((PaymentsPayLoading) other).purchaseId);
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public int hashCode() {
            return this.purchaseId.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PaymentsPayLoading(purchaseId="), this.purchaseId, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent$PaymentsPaySucceeded;", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "", "component1", "component2", "purchaseId", "paymentMethod", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getPaymentMethod", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class PaymentsPaySucceeded extends PaylibEvent {

        /* renamed from: a, reason: from kotlin metadata */
        public final String purchaseId;

        /* renamed from: b, reason: from kotlin metadata */
        public final String paymentMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentsPaySucceeded(String purchaseId, String paymentMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.purchaseId = purchaseId;
            this.paymentMethod = paymentMethod;
        }

        public static /* synthetic */ PaymentsPaySucceeded copy$default(PaymentsPaySucceeded paymentsPaySucceeded, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentsPaySucceeded.purchaseId;
            }
            if ((i & 2) != 0) {
                str2 = paymentsPaySucceeded.paymentMethod;
            }
            return paymentsPaySucceeded.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPurchaseId() {
            return this.purchaseId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final PaymentsPaySucceeded copy(String purchaseId, String paymentMethod) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new PaymentsPaySucceeded(purchaseId, paymentMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentsPaySucceeded)) {
                return false;
            }
            PaymentsPaySucceeded paymentsPaySucceeded = (PaymentsPaySucceeded) other;
            return Intrinsics.areEqual(this.purchaseId, paymentsPaySucceeded.purchaseId) && Intrinsics.areEqual(this.paymentMethod, paymentsPaySucceeded.paymentMethod);
        }

        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final String getPurchaseId() {
            return this.purchaseId;
        }

        public int hashCode() {
            return this.paymentMethod.hashCode() + (this.purchaseId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentsPaySucceeded(purchaseId=");
            sb.append(this.purchaseId);
            sb.append(", paymentMethod=");
            return C8032c.m1430a(sb, this.paymentMethod, ')');
        }
    }

    public PaylibEvent() {
    }

    public /* synthetic */ PaylibEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
