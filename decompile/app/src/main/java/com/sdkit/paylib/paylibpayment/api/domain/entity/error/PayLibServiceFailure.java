package com.sdkit.paylib.paylibpayment.api.domain.entity.error;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B1\b\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PaylibException;", "", "b", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "userMessage", "", "c", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "code", "d", "getDescription", "description", "e", "getTraceId", "traceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "InvoiceError", "PaymentFailure", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$InvoiceError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class PayLibServiceFailure extends PaylibException {

    /* renamed from: b, reason: from kotlin metadata */
    public final String userMessage;

    /* renamed from: c, reason: from kotlin metadata */
    public final Integer code;

    /* renamed from: d, reason: from kotlin metadata */
    public final String description;

    /* renamed from: e, reason: from kotlin metadata */
    public final String traceId;

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$InvoiceError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$InvoiceError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class InvoiceError extends PayLibServiceFailure {

        /* renamed from: f, reason: from kotlin metadata */
        public final String userMessage;

        /* renamed from: g, reason: from kotlin metadata */
        public final Integer code;

        /* renamed from: h, reason: from kotlin metadata */
        public final String description;

        /* renamed from: i, reason: from kotlin metadata */
        public final String traceId;

        public InvoiceError(String str, Integer num, String str2, String str3) {
            super(str, num, str2, str3, null);
            this.userMessage = str;
            this.code = num;
            this.description = str2;
            this.traceId = str3;
        }

        public static /* synthetic */ InvoiceError copy$default(InvoiceError invoiceError, String str, Integer num, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invoiceError.userMessage;
            }
            if ((i & 2) != 0) {
                num = invoiceError.code;
            }
            if ((i & 4) != 0) {
                str2 = invoiceError.description;
            }
            if ((i & 8) != 0) {
                str3 = invoiceError.traceId;
            }
            return invoiceError.copy(str, num, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserMessage() {
            return this.userMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTraceId() {
            return this.traceId;
        }

        public final InvoiceError copy(String userMessage, Integer code, String description, String traceId) {
            return new InvoiceError(userMessage, code, description, traceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvoiceError)) {
                return false;
            }
            InvoiceError invoiceError = (InvoiceError) other;
            return Intrinsics.areEqual(this.userMessage, invoiceError.userMessage) && Intrinsics.areEqual(this.code, invoiceError.code) && Intrinsics.areEqual(this.description, invoiceError.description) && Intrinsics.areEqual(this.traceId, invoiceError.traceId);
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
        public Integer getCode() {
            return this.code;
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
        public String getDescription() {
            return this.description;
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
        public String getUserMessage() {
            return this.userMessage;
        }

        public int hashCode() {
            String str = this.userMessage;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.code;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.traceId;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        public String toString() {
            StringBuilder sb = new StringBuilder("InvoiceError(userMessage=");
            sb.append(this.userMessage);
            sb.append(", code=");
            sb.append(this.code);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", traceId=");
            return C8032c.m1430a(sb, this.traceId, ')');
        }
    }

    @Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\u0010B/\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\b\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure;", "userMessage", "", "code", "", "description", "traceId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "AlreadyPayedError", "InsufficientFundsError", "InvoiceIsInProgressError", "PaymentCancelledError", "PaymentCheckingError", "PaymentError", "PhoneValidationError", "PurchaseCheckingError", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$AlreadyPayedError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$InsufficientFundsError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$InvoiceIsInProgressError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentCancelledError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentCheckingError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PhoneValidationError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PurchaseCheckingError;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static abstract class PaymentFailure extends PayLibServiceFailure {

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$AlreadyPayedError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$AlreadyPayedError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final /* data */ class AlreadyPayedError extends PaymentFailure {

            /* renamed from: f, reason: from kotlin metadata */
            public final String userMessage;

            /* renamed from: g, reason: from kotlin metadata */
            public final Integer code;

            /* renamed from: h, reason: from kotlin metadata */
            public final String description;

            /* renamed from: i, reason: from kotlin metadata */
            public final String traceId;

            public AlreadyPayedError(String str, Integer num, String str2, String str3) {
                super(str, num, str2, str3, null);
                this.userMessage = str;
                this.code = num;
                this.description = str2;
                this.traceId = str3;
            }

            public static /* synthetic */ AlreadyPayedError copy$default(AlreadyPayedError alreadyPayedError, String str, Integer num, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = alreadyPayedError.userMessage;
                }
                if ((i & 2) != 0) {
                    num = alreadyPayedError.code;
                }
                if ((i & 4) != 0) {
                    str2 = alreadyPayedError.description;
                }
                if ((i & 8) != 0) {
                    str3 = alreadyPayedError.traceId;
                }
                return alreadyPayedError.copy(str, num, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserMessage() {
                return this.userMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCode() {
                return this.code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            public final AlreadyPayedError copy(String userMessage, Integer code, String description, String traceId) {
                return new AlreadyPayedError(userMessage, code, description, traceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AlreadyPayedError)) {
                    return false;
                }
                AlreadyPayedError alreadyPayedError = (AlreadyPayedError) other;
                return Intrinsics.areEqual(this.userMessage, alreadyPayedError.userMessage) && Intrinsics.areEqual(this.code, alreadyPayedError.code) && Intrinsics.areEqual(this.description, alreadyPayedError.description) && Intrinsics.areEqual(this.traceId, alreadyPayedError.traceId);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public Integer getCode() {
                return this.code;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getDescription() {
                return this.description;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getUserMessage() {
                return this.userMessage;
            }

            public int hashCode() {
                String str = this.userMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.code;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.traceId;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                StringBuilder sb = new StringBuilder("AlreadyPayedError(userMessage=");
                sb.append(this.userMessage);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", traceId=");
                return C8032c.m1430a(sb, this.traceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$InsufficientFundsError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$InsufficientFundsError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final /* data */ class InsufficientFundsError extends PaymentFailure {

            /* renamed from: f, reason: from kotlin metadata */
            public final String userMessage;

            /* renamed from: g, reason: from kotlin metadata */
            public final Integer code;

            /* renamed from: h, reason: from kotlin metadata */
            public final String description;

            /* renamed from: i, reason: from kotlin metadata */
            public final String traceId;

            public InsufficientFundsError(String str, Integer num, String str2, String str3) {
                super(str, num, str2, str3, null);
                this.userMessage = str;
                this.code = num;
                this.description = str2;
                this.traceId = str3;
            }

            public static /* synthetic */ InsufficientFundsError copy$default(InsufficientFundsError insufficientFundsError, String str, Integer num, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = insufficientFundsError.userMessage;
                }
                if ((i & 2) != 0) {
                    num = insufficientFundsError.code;
                }
                if ((i & 4) != 0) {
                    str2 = insufficientFundsError.description;
                }
                if ((i & 8) != 0) {
                    str3 = insufficientFundsError.traceId;
                }
                return insufficientFundsError.copy(str, num, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserMessage() {
                return this.userMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCode() {
                return this.code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            public final InsufficientFundsError copy(String userMessage, Integer code, String description, String traceId) {
                return new InsufficientFundsError(userMessage, code, description, traceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InsufficientFundsError)) {
                    return false;
                }
                InsufficientFundsError insufficientFundsError = (InsufficientFundsError) other;
                return Intrinsics.areEqual(this.userMessage, insufficientFundsError.userMessage) && Intrinsics.areEqual(this.code, insufficientFundsError.code) && Intrinsics.areEqual(this.description, insufficientFundsError.description) && Intrinsics.areEqual(this.traceId, insufficientFundsError.traceId);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public Integer getCode() {
                return this.code;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getDescription() {
                return this.description;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getUserMessage() {
                return this.userMessage;
            }

            public int hashCode() {
                String str = this.userMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.code;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.traceId;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                StringBuilder sb = new StringBuilder("InsufficientFundsError(userMessage=");
                sb.append(this.userMessage);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", traceId=");
                return C8032c.m1430a(sb, this.traceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$InvoiceIsInProgressError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$InvoiceIsInProgressError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final /* data */ class InvoiceIsInProgressError extends PaymentFailure {

            /* renamed from: f, reason: from kotlin metadata */
            public final String userMessage;

            /* renamed from: g, reason: from kotlin metadata */
            public final Integer code;

            /* renamed from: h, reason: from kotlin metadata */
            public final String description;

            /* renamed from: i, reason: from kotlin metadata */
            public final String traceId;

            public InvoiceIsInProgressError(String str, Integer num, String str2, String str3) {
                super(str, num, str2, str3, null);
                this.userMessage = str;
                this.code = num;
                this.description = str2;
                this.traceId = str3;
            }

            public static /* synthetic */ InvoiceIsInProgressError copy$default(InvoiceIsInProgressError invoiceIsInProgressError, String str, Integer num, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = invoiceIsInProgressError.userMessage;
                }
                if ((i & 2) != 0) {
                    num = invoiceIsInProgressError.code;
                }
                if ((i & 4) != 0) {
                    str2 = invoiceIsInProgressError.description;
                }
                if ((i & 8) != 0) {
                    str3 = invoiceIsInProgressError.traceId;
                }
                return invoiceIsInProgressError.copy(str, num, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserMessage() {
                return this.userMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCode() {
                return this.code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            public final InvoiceIsInProgressError copy(String userMessage, Integer code, String description, String traceId) {
                return new InvoiceIsInProgressError(userMessage, code, description, traceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvoiceIsInProgressError)) {
                    return false;
                }
                InvoiceIsInProgressError invoiceIsInProgressError = (InvoiceIsInProgressError) other;
                return Intrinsics.areEqual(this.userMessage, invoiceIsInProgressError.userMessage) && Intrinsics.areEqual(this.code, invoiceIsInProgressError.code) && Intrinsics.areEqual(this.description, invoiceIsInProgressError.description) && Intrinsics.areEqual(this.traceId, invoiceIsInProgressError.traceId);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public Integer getCode() {
                return this.code;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getDescription() {
                return this.description;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getUserMessage() {
                return this.userMessage;
            }

            public int hashCode() {
                String str = this.userMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.code;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.traceId;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                StringBuilder sb = new StringBuilder("InvoiceIsInProgressError(userMessage=");
                sb.append(this.userMessage);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", traceId=");
                return C8032c.m1430a(sb, this.traceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentCancelledError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentCancelledError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final /* data */ class PaymentCancelledError extends PaymentFailure {

            /* renamed from: f, reason: from kotlin metadata */
            public final String userMessage;

            /* renamed from: g, reason: from kotlin metadata */
            public final Integer code;

            /* renamed from: h, reason: from kotlin metadata */
            public final String description;

            /* renamed from: i, reason: from kotlin metadata */
            public final String traceId;

            public PaymentCancelledError(String str, Integer num, String str2, String str3) {
                super(str, num, str2, str3, null);
                this.userMessage = str;
                this.code = num;
                this.description = str2;
                this.traceId = str3;
            }

            public static /* synthetic */ PaymentCancelledError copy$default(PaymentCancelledError paymentCancelledError, String str, Integer num, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = paymentCancelledError.userMessage;
                }
                if ((i & 2) != 0) {
                    num = paymentCancelledError.code;
                }
                if ((i & 4) != 0) {
                    str2 = paymentCancelledError.description;
                }
                if ((i & 8) != 0) {
                    str3 = paymentCancelledError.traceId;
                }
                return paymentCancelledError.copy(str, num, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserMessage() {
                return this.userMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCode() {
                return this.code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            public final PaymentCancelledError copy(String userMessage, Integer code, String description, String traceId) {
                return new PaymentCancelledError(userMessage, code, description, traceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentCancelledError)) {
                    return false;
                }
                PaymentCancelledError paymentCancelledError = (PaymentCancelledError) other;
                return Intrinsics.areEqual(this.userMessage, paymentCancelledError.userMessage) && Intrinsics.areEqual(this.code, paymentCancelledError.code) && Intrinsics.areEqual(this.description, paymentCancelledError.description) && Intrinsics.areEqual(this.traceId, paymentCancelledError.traceId);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public Integer getCode() {
                return this.code;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getDescription() {
                return this.description;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getUserMessage() {
                return this.userMessage;
            }

            public int hashCode() {
                String str = this.userMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.code;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.traceId;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                StringBuilder sb = new StringBuilder("PaymentCancelledError(userMessage=");
                sb.append(this.userMessage);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", traceId=");
                return C8032c.m1430a(sb, this.traceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentCheckingError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentCheckingError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final /* data */ class PaymentCheckingError extends PaymentFailure {

            /* renamed from: f, reason: from kotlin metadata */
            public final String userMessage;

            /* renamed from: g, reason: from kotlin metadata */
            public final Integer code;

            /* renamed from: h, reason: from kotlin metadata */
            public final String description;

            /* renamed from: i, reason: from kotlin metadata */
            public final String traceId;

            public PaymentCheckingError(String str, Integer num, String str2, String str3) {
                super(str, num, str2, str3, null);
                this.userMessage = str;
                this.code = num;
                this.description = str2;
                this.traceId = str3;
            }

            public static /* synthetic */ PaymentCheckingError copy$default(PaymentCheckingError paymentCheckingError, String str, Integer num, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = paymentCheckingError.userMessage;
                }
                if ((i & 2) != 0) {
                    num = paymentCheckingError.code;
                }
                if ((i & 4) != 0) {
                    str2 = paymentCheckingError.description;
                }
                if ((i & 8) != 0) {
                    str3 = paymentCheckingError.traceId;
                }
                return paymentCheckingError.copy(str, num, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserMessage() {
                return this.userMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCode() {
                return this.code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            public final PaymentCheckingError copy(String userMessage, Integer code, String description, String traceId) {
                return new PaymentCheckingError(userMessage, code, description, traceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentCheckingError)) {
                    return false;
                }
                PaymentCheckingError paymentCheckingError = (PaymentCheckingError) other;
                return Intrinsics.areEqual(this.userMessage, paymentCheckingError.userMessage) && Intrinsics.areEqual(this.code, paymentCheckingError.code) && Intrinsics.areEqual(this.description, paymentCheckingError.description) && Intrinsics.areEqual(this.traceId, paymentCheckingError.traceId);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public Integer getCode() {
                return this.code;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getDescription() {
                return this.description;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getUserMessage() {
                return this.userMessage;
            }

            public int hashCode() {
                String str = this.userMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.code;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.traceId;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                StringBuilder sb = new StringBuilder("PaymentCheckingError(userMessage=");
                sb.append(this.userMessage);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", traceId=");
                return C8032c.m1430a(sb, this.traceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PaymentError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final /* data */ class PaymentError extends PaymentFailure {

            /* renamed from: f, reason: from kotlin metadata */
            public final String userMessage;

            /* renamed from: g, reason: from kotlin metadata */
            public final Integer code;

            /* renamed from: h, reason: from kotlin metadata */
            public final String description;

            /* renamed from: i, reason: from kotlin metadata */
            public final String traceId;

            public PaymentError(String str, Integer num, String str2, String str3) {
                super(str, num, str2, str3, null);
                this.userMessage = str;
                this.code = num;
                this.description = str2;
                this.traceId = str3;
            }

            public static /* synthetic */ PaymentError copy$default(PaymentError paymentError, String str, Integer num, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = paymentError.userMessage;
                }
                if ((i & 2) != 0) {
                    num = paymentError.code;
                }
                if ((i & 4) != 0) {
                    str2 = paymentError.description;
                }
                if ((i & 8) != 0) {
                    str3 = paymentError.traceId;
                }
                return paymentError.copy(str, num, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserMessage() {
                return this.userMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCode() {
                return this.code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            public final PaymentError copy(String userMessage, Integer code, String description, String traceId) {
                return new PaymentError(userMessage, code, description, traceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentError)) {
                    return false;
                }
                PaymentError paymentError = (PaymentError) other;
                return Intrinsics.areEqual(this.userMessage, paymentError.userMessage) && Intrinsics.areEqual(this.code, paymentError.code) && Intrinsics.areEqual(this.description, paymentError.description) && Intrinsics.areEqual(this.traceId, paymentError.traceId);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public Integer getCode() {
                return this.code;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getDescription() {
                return this.description;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getUserMessage() {
                return this.userMessage;
            }

            public int hashCode() {
                String str = this.userMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.code;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.traceId;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                StringBuilder sb = new StringBuilder("PaymentError(userMessage=");
                sb.append(this.userMessage);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", traceId=");
                return C8032c.m1430a(sb, this.traceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PhoneValidationError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PhoneValidationError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final /* data */ class PhoneValidationError extends PaymentFailure {

            /* renamed from: f, reason: from kotlin metadata */
            public final String userMessage;

            /* renamed from: g, reason: from kotlin metadata */
            public final Integer code;

            /* renamed from: h, reason: from kotlin metadata */
            public final String description;

            /* renamed from: i, reason: from kotlin metadata */
            public final String traceId;

            public PhoneValidationError(String str, Integer num, String str2, String str3) {
                super(str, num, str2, str3, null);
                this.userMessage = str;
                this.code = num;
                this.description = str2;
                this.traceId = str3;
            }

            public static /* synthetic */ PhoneValidationError copy$default(PhoneValidationError phoneValidationError, String str, Integer num, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = phoneValidationError.userMessage;
                }
                if ((i & 2) != 0) {
                    num = phoneValidationError.code;
                }
                if ((i & 4) != 0) {
                    str2 = phoneValidationError.description;
                }
                if ((i & 8) != 0) {
                    str3 = phoneValidationError.traceId;
                }
                return phoneValidationError.copy(str, num, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserMessage() {
                return this.userMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCode() {
                return this.code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            public final PhoneValidationError copy(String userMessage, Integer code, String description, String traceId) {
                return new PhoneValidationError(userMessage, code, description, traceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PhoneValidationError)) {
                    return false;
                }
                PhoneValidationError phoneValidationError = (PhoneValidationError) other;
                return Intrinsics.areEqual(this.userMessage, phoneValidationError.userMessage) && Intrinsics.areEqual(this.code, phoneValidationError.code) && Intrinsics.areEqual(this.description, phoneValidationError.description) && Intrinsics.areEqual(this.traceId, phoneValidationError.traceId);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public Integer getCode() {
                return this.code;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getDescription() {
                return this.description;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getUserMessage() {
                return this.userMessage;
            }

            public int hashCode() {
                String str = this.userMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.code;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.traceId;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                StringBuilder sb = new StringBuilder("PhoneValidationError(userMessage=");
                sb.append(this.userMessage);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", traceId=");
                return C8032c.m1430a(sb, this.traceId, ')');
            }
        }

        @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PurchaseCheckingError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "userMessage", "code", "description", "traceId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibServiceFailure$PaymentFailure$PurchaseCheckingError;", "toString", "hashCode", "", "other", "", "equals", "f", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getCode", "h", "getDescription", "i", "getTraceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final /* data */ class PurchaseCheckingError extends PaymentFailure {

            /* renamed from: f, reason: from kotlin metadata */
            public final String userMessage;

            /* renamed from: g, reason: from kotlin metadata */
            public final Integer code;

            /* renamed from: h, reason: from kotlin metadata */
            public final String description;

            /* renamed from: i, reason: from kotlin metadata */
            public final String traceId;

            public PurchaseCheckingError(String str, Integer num, String str2, String str3) {
                super(str, num, str2, str3, null);
                this.userMessage = str;
                this.code = num;
                this.description = str2;
                this.traceId = str3;
            }

            public static /* synthetic */ PurchaseCheckingError copy$default(PurchaseCheckingError purchaseCheckingError, String str, Integer num, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = purchaseCheckingError.userMessage;
                }
                if ((i & 2) != 0) {
                    num = purchaseCheckingError.code;
                }
                if ((i & 4) != 0) {
                    str2 = purchaseCheckingError.description;
                }
                if ((i & 8) != 0) {
                    str3 = purchaseCheckingError.traceId;
                }
                return purchaseCheckingError.copy(str, num, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUserMessage() {
                return this.userMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCode() {
                return this.code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            public final PurchaseCheckingError copy(String userMessage, Integer code, String description, String traceId) {
                return new PurchaseCheckingError(userMessage, code, description, traceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PurchaseCheckingError)) {
                    return false;
                }
                PurchaseCheckingError purchaseCheckingError = (PurchaseCheckingError) other;
                return Intrinsics.areEqual(this.userMessage, purchaseCheckingError.userMessage) && Intrinsics.areEqual(this.code, purchaseCheckingError.code) && Intrinsics.areEqual(this.description, purchaseCheckingError.description) && Intrinsics.areEqual(this.traceId, purchaseCheckingError.traceId);
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public Integer getCode() {
                return this.code;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getDescription() {
                return this.description;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure, com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibServiceFailure
            public String getUserMessage() {
                return this.userMessage;
            }

            public int hashCode() {
                String str = this.userMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.code;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.traceId;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // java.lang.Throwable
            public String toString() {
                StringBuilder sb = new StringBuilder("PurchaseCheckingError(userMessage=");
                sb.append(this.userMessage);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", traceId=");
                return C8032c.m1430a(sb, this.traceId, ')');
            }
        }

        public PaymentFailure(String str, Integer num, String str2, String str3) {
            super(str, num, str2, str3, null);
        }

        public /* synthetic */ PaymentFailure(String str, Integer num, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, num, str2, str3);
        }
    }

    public PayLibServiceFailure(String str, Integer num, String str2, String str3) {
        super(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull(str, num, str2), " ", null, null, 0, null, null, 62, null), str3, null);
        this.userMessage = str;
        this.code = num;
        this.description = str2;
        this.traceId = str3;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
    public String getTraceId() {
        return this.traceId;
    }

    public String getUserMessage() {
        return this.userMessage;
    }

    public /* synthetic */ PayLibServiceFailure(String str, Integer num, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, str2, str3);
    }
}
