package com.sdkit.paylib.paylibnative.api.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u001a\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResult;", "case", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "getCase", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "Application", "Invoice", "PaymentMethodChange", "Product", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface PaylibResultPayment extends PaylibResult {

    @Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$Failure;", "component1", "case", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "getCase", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;)V", "CasePayload", "Completion", "Failure", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Application implements PaylibResultPayment {

        /* renamed from: a, reason: from kotlin metadata */
        public final PaylibResultCase case;

        @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$CasePayload;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$Failure;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
        public interface CasePayload extends PaylibResultCasePayload {
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$CasePayload;", "", "component1", "component2", "component3", "applicationId", "purchaseId", "invoiceId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "b", "getPurchaseId", "c", "getInvoiceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        public static final /* data */ class Completion implements CasePayload {

            /* renamed from: a, reason: from kotlin metadata */
            public final String applicationId;

            /* renamed from: b, reason: from kotlin metadata */
            public final String purchaseId;

            /* renamed from: c, reason: from kotlin metadata */
            public final String invoiceId;

            public Completion(String applicationId, String purchaseId, String invoiceId) {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                this.applicationId = applicationId;
                this.purchaseId = purchaseId;
                this.invoiceId = invoiceId;
            }

            public static /* synthetic */ Completion copy$default(Completion completion, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = completion.applicationId;
                }
                if ((i & 2) != 0) {
                    str2 = completion.purchaseId;
                }
                if ((i & 4) != 0) {
                    str3 = completion.invoiceId;
                }
                return completion.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getApplicationId() {
                return this.applicationId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPurchaseId() {
                return this.purchaseId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final Completion copy(String applicationId, String purchaseId, String invoiceId) {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                return new Completion(applicationId, purchaseId, invoiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Completion)) {
                    return false;
                }
                Completion completion = (Completion) other;
                return Intrinsics.areEqual(this.applicationId, completion.applicationId) && Intrinsics.areEqual(this.purchaseId, completion.purchaseId) && Intrinsics.areEqual(this.invoiceId, completion.invoiceId);
            }

            public final String getApplicationId() {
                return this.applicationId;
            }

            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final String getPurchaseId() {
                return this.purchaseId;
            }

            public int hashCode() {
                return this.invoiceId.hashCode() + C8031b.m1429a(this.purchaseId, this.applicationId.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Completion(applicationId=");
                sb.append(this.applicationId);
                sb.append(", purchaseId=");
                sb.append(this.purchaseId);
                sb.append(", invoiceId=");
                return C8032c.m1430a(sb, this.invoiceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\b¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$Failure;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$CasePayload;", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "applicationId", "purchaseId", "invoiceId", "errorCode", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Application$Failure;", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "b", "getPurchaseId", "c", "getInvoiceId", "d", "Ljava/lang/Integer;", "getErrorCode", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        public static final /* data */ class Failure implements CasePayload {

            /* renamed from: a, reason: from kotlin metadata */
            public final String applicationId;

            /* renamed from: b, reason: from kotlin metadata */
            public final String purchaseId;

            /* renamed from: c, reason: from kotlin metadata */
            public final String invoiceId;

            /* renamed from: d, reason: from kotlin metadata */
            public final Integer errorCode;

            public Failure(String applicationId, String str, String str2, Integer num) {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                this.applicationId = applicationId;
                this.purchaseId = str;
                this.invoiceId = str2;
                this.errorCode = num;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, String str3, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failure.applicationId;
                }
                if ((i & 2) != 0) {
                    str2 = failure.purchaseId;
                }
                if ((i & 4) != 0) {
                    str3 = failure.invoiceId;
                }
                if ((i & 8) != 0) {
                    num = failure.errorCode;
                }
                return failure.copy(str, str2, str3, num);
            }

            /* renamed from: component1, reason: from getter */
            public final String getApplicationId() {
                return this.applicationId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPurchaseId() {
                return this.purchaseId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getInvoiceId() {
                return this.invoiceId;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public final Failure copy(String applicationId, String purchaseId, String invoiceId, Integer errorCode) {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                return new Failure(applicationId, purchaseId, invoiceId, errorCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.applicationId, failure.applicationId) && Intrinsics.areEqual(this.purchaseId, failure.purchaseId) && Intrinsics.areEqual(this.invoiceId, failure.invoiceId) && Intrinsics.areEqual(this.errorCode, failure.errorCode);
            }

            public final String getApplicationId() {
                return this.applicationId;
            }

            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final String getPurchaseId() {
                return this.purchaseId;
            }

            public int hashCode() {
                int iHashCode = this.applicationId.hashCode() * 31;
                String str = this.purchaseId;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.invoiceId;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.errorCode;
                return iHashCode3 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "Failure(applicationId=" + this.applicationId + ", purchaseId=" + this.purchaseId + ", invoiceId=" + this.invoiceId + ", errorCode=" + this.errorCode + ')';
            }
        }

        public Application(PaylibResultCase<Completion, Failure> paylibResultCase) {
            Intrinsics.checkNotNullParameter(paylibResultCase, "case");
            this.case = paylibResultCase;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, PaylibResultCase paylibResultCase, int i, Object obj) {
            if ((i & 1) != 0) {
                paylibResultCase = application.case;
            }
            return application.copy(paylibResultCase);
        }

        public final PaylibResultCase<Completion, Failure> component1() {
            return this.case;
        }

        public final Application copy(PaylibResultCase<Completion, Failure> paylibResultCase) {
            Intrinsics.checkNotNullParameter(paylibResultCase, "case");
            return new Application(paylibResultCase);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Application) && Intrinsics.areEqual(this.case, ((Application) other).case);
        }

        @Override // com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment
        public PaylibResultCase<Completion, Failure> getCase() {
            return this.case;
        }

        public int hashCode() {
            return this.case.hashCode();
        }

        public String toString() {
            return "Application(case=" + this.case + ')';
        }
    }

    @Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$Failure;", "component1", "case", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "getCase", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;)V", "CasePayload", "Completion", "Failure", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Invoice implements PaylibResultPayment {

        /* renamed from: a, reason: from kotlin metadata */
        public final PaylibResultCase case;

        @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$CasePayload;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$Failure;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
        public interface CasePayload extends PaylibResultCasePayload {
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$CasePayload;", "", "component1", "invoiceId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getInvoiceId", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        public static final /* data */ class Completion implements CasePayload {

            /* renamed from: a, reason: from kotlin metadata */
            public final String invoiceId;

            public Completion(String invoiceId) {
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                this.invoiceId = invoiceId;
            }

            public static /* synthetic */ Completion copy$default(Completion completion, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = completion.invoiceId;
                }
                return completion.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final Completion copy(String invoiceId) {
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                return new Completion(invoiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Completion) && Intrinsics.areEqual(this.invoiceId, ((Completion) other).invoiceId);
            }

            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public int hashCode() {
                return this.invoiceId.hashCode();
            }

            public String toString() {
                return C8032c.m1430a(new StringBuilder("Completion(invoiceId="), this.invoiceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$Failure;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Invoice$CasePayload;", "", "component1", "invoiceId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getInvoiceId", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        public static final /* data */ class Failure implements CasePayload {

            /* renamed from: a, reason: from kotlin metadata */
            public final String invoiceId;

            public Failure(String str) {
                this.invoiceId = str;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failure.invoiceId;
                }
                return failure.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final Failure copy(String invoiceId) {
                return new Failure(invoiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.invoiceId, ((Failure) other).invoiceId);
            }

            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public int hashCode() {
                String str = this.invoiceId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return C8032c.m1430a(new StringBuilder("Failure(invoiceId="), this.invoiceId, ')');
            }
        }

        public Invoice(PaylibResultCase<Completion, Failure> paylibResultCase) {
            Intrinsics.checkNotNullParameter(paylibResultCase, "case");
            this.case = paylibResultCase;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Invoice copy$default(Invoice invoice, PaylibResultCase paylibResultCase, int i, Object obj) {
            if ((i & 1) != 0) {
                paylibResultCase = invoice.case;
            }
            return invoice.copy(paylibResultCase);
        }

        public final PaylibResultCase<Completion, Failure> component1() {
            return this.case;
        }

        public final Invoice copy(PaylibResultCase<Completion, Failure> paylibResultCase) {
            Intrinsics.checkNotNullParameter(paylibResultCase, "case");
            return new Invoice(paylibResultCase);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Invoice) && Intrinsics.areEqual(this.case, ((Invoice) other).case);
        }

        @Override // com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment
        public PaylibResultCase<Completion, Failure> getCase() {
            return this.case;
        }

        public int hashCode() {
            return this.case.hashCode();
        }

        public String toString() {
            return "Invoice(case=" + this.case + ')';
        }
    }

    @Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$Failure;", "component1", "case", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "getCase", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;)V", "CasePayload", "Completion", "Failure", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class PaymentMethodChange implements PaylibResultPayment {

        /* renamed from: a, reason: from kotlin metadata */
        public final PaylibResultCase case;

        @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$CasePayload;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$Failure;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
        public interface CasePayload extends PaylibResultCasePayload {
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$CasePayload;", "", "component1", "component2", "purchaseId", "invoiceId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getInvoiceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        public static final /* data */ class Completion implements CasePayload {

            /* renamed from: a, reason: from kotlin metadata */
            public final String purchaseId;

            /* renamed from: b, reason: from kotlin metadata */
            public final String invoiceId;

            public Completion(String purchaseId, String invoiceId) {
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                this.purchaseId = purchaseId;
                this.invoiceId = invoiceId;
            }

            public static /* synthetic */ Completion copy$default(Completion completion, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = completion.purchaseId;
                }
                if ((i & 2) != 0) {
                    str2 = completion.invoiceId;
                }
                return completion.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPurchaseId() {
                return this.purchaseId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final Completion copy(String purchaseId, String invoiceId) {
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                return new Completion(purchaseId, invoiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Completion)) {
                    return false;
                }
                Completion completion = (Completion) other;
                return Intrinsics.areEqual(this.purchaseId, completion.purchaseId) && Intrinsics.areEqual(this.invoiceId, completion.invoiceId);
            }

            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final String getPurchaseId() {
                return this.purchaseId;
            }

            public int hashCode() {
                return this.invoiceId.hashCode() + (this.purchaseId.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Completion(purchaseId=");
                sb.append(this.purchaseId);
                sb.append(", invoiceId=");
                return C8032c.m1430a(sb, this.invoiceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$Failure;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$CasePayload;", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "purchaseId", "invoiceId", "errorCode", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$PaymentMethodChange$Failure;", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getInvoiceId", "c", "Ljava/lang/Integer;", "getErrorCode", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        public static final /* data */ class Failure implements CasePayload {

            /* renamed from: a, reason: from kotlin metadata */
            public final String purchaseId;

            /* renamed from: b, reason: from kotlin metadata */
            public final String invoiceId;

            /* renamed from: c, reason: from kotlin metadata */
            public final Integer errorCode;

            public Failure(String str, String str2, Integer num) {
                this.purchaseId = str;
                this.invoiceId = str2;
                this.errorCode = num;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failure.purchaseId;
                }
                if ((i & 2) != 0) {
                    str2 = failure.invoiceId;
                }
                if ((i & 4) != 0) {
                    num = failure.errorCode;
                }
                return failure.copy(str, str2, num);
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
            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public final Failure copy(String purchaseId, String invoiceId, Integer errorCode) {
                return new Failure(purchaseId, invoiceId, errorCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.purchaseId, failure.purchaseId) && Intrinsics.areEqual(this.invoiceId, failure.invoiceId) && Intrinsics.areEqual(this.errorCode, failure.errorCode);
            }

            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final String getPurchaseId() {
                return this.purchaseId;
            }

            public int hashCode() {
                String str = this.purchaseId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.invoiceId;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.errorCode;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "Failure(purchaseId=" + this.purchaseId + ", invoiceId=" + this.invoiceId + ", errorCode=" + this.errorCode + ')';
            }
        }

        public PaymentMethodChange(PaylibResultCase<Completion, Failure> paylibResultCase) {
            Intrinsics.checkNotNullParameter(paylibResultCase, "case");
            this.case = paylibResultCase;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodChange copy$default(PaymentMethodChange paymentMethodChange, PaylibResultCase paylibResultCase, int i, Object obj) {
            if ((i & 1) != 0) {
                paylibResultCase = paymentMethodChange.case;
            }
            return paymentMethodChange.copy(paylibResultCase);
        }

        public final PaylibResultCase<Completion, Failure> component1() {
            return this.case;
        }

        public final PaymentMethodChange copy(PaylibResultCase<Completion, Failure> paylibResultCase) {
            Intrinsics.checkNotNullParameter(paylibResultCase, "case");
            return new PaymentMethodChange(paylibResultCase);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentMethodChange) && Intrinsics.areEqual(this.case, ((PaymentMethodChange) other).case);
        }

        @Override // com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment
        public PaylibResultCase<Completion, Failure> getCase() {
            return this.case;
        }

        public int hashCode() {
            return this.case.hashCode();
        }

        public String toString() {
            return "PaymentMethodChange(case=" + this.case + ')';
        }
    }

    @Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$Failure;", "component1", "case", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "getCase", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;)V", "CasePayload", "Completion", "Failure", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Product implements PaylibResultPayment {

        /* renamed from: a, reason: from kotlin metadata */
        public final PaylibResultCase case;

        @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$CasePayload;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$Failure;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
        public interface CasePayload extends PaylibResultCasePayload {
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J3\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$Completion;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$CasePayload;", "", "component1", "component2", "component3", "component4", "orderId", "purchaseId", "productId", "invoiceId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "b", "getPurchaseId", "c", "getProductId", "d", "getInvoiceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        public static final /* data */ class Completion implements CasePayload {

            /* renamed from: a, reason: from kotlin metadata */
            public final String orderId;

            /* renamed from: b, reason: from kotlin metadata */
            public final String purchaseId;

            /* renamed from: c, reason: from kotlin metadata */
            public final String productId;

            /* renamed from: d, reason: from kotlin metadata */
            public final String invoiceId;

            public Completion(String str, String purchaseId, String productId, String invoiceId) {
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                this.orderId = str;
                this.purchaseId = purchaseId;
                this.productId = productId;
                this.invoiceId = invoiceId;
            }

            public static /* synthetic */ Completion copy$default(Completion completion, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = completion.orderId;
                }
                if ((i & 2) != 0) {
                    str2 = completion.purchaseId;
                }
                if ((i & 4) != 0) {
                    str3 = completion.productId;
                }
                if ((i & 8) != 0) {
                    str4 = completion.invoiceId;
                }
                return completion.copy(str, str2, str3, str4);
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

            public final Completion copy(String orderId, String purchaseId, String productId, String invoiceId) {
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                return new Completion(orderId, purchaseId, productId, invoiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Completion)) {
                    return false;
                }
                Completion completion = (Completion) other;
                return Intrinsics.areEqual(this.orderId, completion.orderId) && Intrinsics.areEqual(this.purchaseId, completion.purchaseId) && Intrinsics.areEqual(this.productId, completion.productId) && Intrinsics.areEqual(this.invoiceId, completion.invoiceId);
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

            public int hashCode() {
                String str = this.orderId;
                return this.invoiceId.hashCode() + C8031b.m1429a(this.productId, C8031b.m1429a(this.purchaseId, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Completion(orderId=");
                sb.append(this.orderId);
                sb.append(", purchaseId=");
                sb.append(this.purchaseId);
                sb.append(", productId=");
                sb.append(this.productId);
                sb.append(", invoiceId=");
                return C8032c.m1430a(sb, this.invoiceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010)J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJX\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\b¨\u0006*"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$Failure;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$CasePayload;", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "purchaseId", "invoiceId", "orderId", FirebaseAnalytics.Param.QUANTITY, "productId", "errorCode", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultPayment$Product$Failure;", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getInvoiceId", "c", "getOrderId", "d", "Ljava/lang/Integer;", "getQuantity", "e", "getProductId", "f", "getErrorCode", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        public static final /* data */ class Failure implements CasePayload {

            /* renamed from: a, reason: from kotlin metadata */
            public final String purchaseId;

            /* renamed from: b, reason: from kotlin metadata */
            public final String invoiceId;

            /* renamed from: c, reason: from kotlin metadata */
            public final String orderId;

            /* renamed from: d, reason: from kotlin metadata */
            public final Integer com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;

            /* renamed from: e, reason: from kotlin metadata */
            public final String productId;

            /* renamed from: f, reason: from kotlin metadata */
            public final Integer errorCode;

            public Failure(String str, String str2, String str3, Integer num, String str4, Integer num2) {
                this.purchaseId = str;
                this.invoiceId = str2;
                this.orderId = str3;
                this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String = num;
                this.productId = str4;
                this.errorCode = num2;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, String str3, Integer num, String str4, Integer num2, int i, Object obj) {
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
                    num = failure.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;
                }
                Integer num3 = num;
                if ((i & 16) != 0) {
                    str4 = failure.productId;
                }
                String str7 = str4;
                if ((i & 32) != 0) {
                    num2 = failure.errorCode;
                }
                return failure.copy(str, str5, str6, num3, str7, num2);
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
            public final Integer getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String() {
                return this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;
            }

            /* renamed from: component5, reason: from getter */
            public final String getProductId() {
                return this.productId;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public final Failure copy(String purchaseId, String invoiceId, String orderId, Integer num, String productId, Integer errorCode) {
                return new Failure(purchaseId, invoiceId, orderId, num, productId, errorCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.purchaseId, failure.purchaseId) && Intrinsics.areEqual(this.invoiceId, failure.invoiceId) && Intrinsics.areEqual(this.orderId, failure.orderId) && Intrinsics.areEqual(this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String, failure.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String) && Intrinsics.areEqual(this.productId, failure.productId) && Intrinsics.areEqual(this.errorCode, failure.errorCode);
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
                return this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;
            }

            public int hashCode() {
                String str = this.purchaseId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.invoiceId;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.orderId;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str4 = this.productId;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num2 = this.errorCode;
                return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
            }

            public String toString() {
                return "Failure(purchaseId=" + this.purchaseId + ", invoiceId=" + this.invoiceId + ", orderId=" + this.orderId + ", quantity=" + this.com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String + ", productId=" + this.productId + ", errorCode=" + this.errorCode + ')';
            }
        }

        public Product(PaylibResultCase<Completion, Failure> paylibResultCase) {
            Intrinsics.checkNotNullParameter(paylibResultCase, "case");
            this.case = paylibResultCase;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Product copy$default(Product product, PaylibResultCase paylibResultCase, int i, Object obj) {
            if ((i & 1) != 0) {
                paylibResultCase = product.case;
            }
            return product.copy(paylibResultCase);
        }

        public final PaylibResultCase<Completion, Failure> component1() {
            return this.case;
        }

        public final Product copy(PaylibResultCase<Completion, Failure> paylibResultCase) {
            Intrinsics.checkNotNullParameter(paylibResultCase, "case");
            return new Product(paylibResultCase);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Product) && Intrinsics.areEqual(this.case, ((Product) other).case);
        }

        @Override // com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment
        public PaylibResultCase<Completion, Failure> getCase() {
            return this.case;
        }

        public int hashCode() {
            return this.case.hashCode();
        }

        public String toString() {
            return "Product(case=" + this.case + ')';
        }
    }

    PaylibResultCase<?, ?> getCase();
}
