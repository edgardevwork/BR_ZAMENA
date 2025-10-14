package com.sdkit.paylib.paylibpayment.api.domain.entity.error;

import com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayload;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayloadHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B'\b\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PaylibException;", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "c", "getTraceId", "traceId", "", "cause", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "AuthError", "ClientError", "NoInternetError", "ParseError", "ServerError", "TimeoutError", "UnspecifiedError", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$AuthError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$ClientError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$NoInternetError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$ParseError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$ServerError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$TimeoutError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$UnspecifiedError;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class PayLibBackendFailure extends PaylibException {

    /* renamed from: b, reason: from kotlin metadata */
    public final String description;

    /* renamed from: c, reason: from kotlin metadata */
    public final String traceId;

    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0015"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$AuthError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure;", "", "d", "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "httpCode", "", "e", "Ljava/lang/String;", "getHttpMessage", "()Ljava/lang/String;", "httpMessage", "f", "getUrl", "url", "traceId", "description", SegmentConstantPool.INITSTRING, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final class AuthError extends PayLibBackendFailure {

        /* renamed from: d, reason: from kotlin metadata */
        public final Integer httpCode;

        /* renamed from: e, reason: from kotlin metadata */
        public final String httpMessage;

        /* renamed from: f, reason: from kotlin metadata */
        public final String url;

        /* JADX WARN: Illegal instructions before constructor call */
        public AuthError(Integer num, String str, String url, String str2, String str3) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (str3 == null) {
                str3 = url + ' ' + num + ' ' + str;
            }
            super(str3, str2, null, 0 == true ? 1 : 0);
            this.httpCode = num;
            this.httpMessage = str;
            this.url = url;
        }

        public final Integer getHttpCode() {
            return this.httpCode;
        }

        public final String getHttpMessage() {
            return this.httpMessage;
        }

        public final String getUrl() {
            return this.url;
        }

        public /* synthetic */ AuthError(Integer num, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, str2, str3, (i & 16) != 0 ? null : str4);
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$ClientError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayloadHolder;", "", "d", "I", "getHttpCode", "()I", "httpCode", "", "e", "Ljava/lang/String;", "getHttpMessage", "()Ljava/lang/String;", "httpMessage", "f", "getUrl", "url", "g", "getUserMessage", "userMessage", "h", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "code", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "i", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "getPurchasePayload", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "purchasePayload", "traceId", SegmentConstantPool.INITSTRING, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final class ClientError extends PayLibBackendFailure implements PurchasePayloadHolder {

        /* renamed from: d, reason: from kotlin metadata */
        public final int httpCode;

        /* renamed from: e, reason: from kotlin metadata */
        public final String httpMessage;

        /* renamed from: f, reason: from kotlin metadata */
        public final String url;

        /* renamed from: g, reason: from kotlin metadata */
        public final String userMessage;

        /* renamed from: h, reason: from kotlin metadata */
        public final Integer code;

        /* renamed from: i, reason: from kotlin metadata */
        public final PurchasePayload purchasePayload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientError(int i, String httpMessage, String url, String str, Integer num, String str2, PurchasePayload purchasePayload) {
            super(i + ' ' + httpMessage + " url(" + url + ") traceId(" + str2 + ')', str2, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(httpMessage, "httpMessage");
            Intrinsics.checkNotNullParameter(url, "url");
            this.httpCode = i;
            this.httpMessage = httpMessage;
            this.url = url;
            this.userMessage = str;
            this.code = num;
            this.purchasePayload = purchasePayload;
        }

        public final Integer getCode() {
            return this.code;
        }

        public final int getHttpCode() {
            return this.httpCode;
        }

        public final String getHttpMessage() {
            return this.httpMessage;
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayloadHolder
        public PurchasePayload getPurchasePayload() {
            return this.purchasePayload;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getUserMessage() {
            return this.userMessage;
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$NoInternetError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure;", "traceId", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class NoInternetError extends PayLibBackendFailure {
        public NoInternetError(String str, Throwable th) {
            super("No internet connection", str, th, null);
        }
    }

    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$ParseError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure;", "description", "", "traceId", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class ParseError extends PayLibBackendFailure {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParseError(String description, String str, Throwable th) {
            super(description, str, th, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }

        public /* synthetic */ ParseError(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$ServerError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayloadHolder;", "", "d", "I", "getHttpCode", "()I", "httpCode", "", "e", "Ljava/lang/String;", "getHttpMessage", "()Ljava/lang/String;", "httpMessage", "f", "getUrl", "url", "g", "getUserMessage", "userMessage", "h", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "code", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "i", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "getPurchasePayload", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;", "purchasePayload", "traceId", SegmentConstantPool.INITSTRING, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PurchasePayload;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final class ServerError extends PayLibBackendFailure implements PurchasePayloadHolder {

        /* renamed from: d, reason: from kotlin metadata */
        public final int httpCode;

        /* renamed from: e, reason: from kotlin metadata */
        public final String httpMessage;

        /* renamed from: f, reason: from kotlin metadata */
        public final String url;

        /* renamed from: g, reason: from kotlin metadata */
        public final String userMessage;

        /* renamed from: h, reason: from kotlin metadata */
        public final Integer code;

        /* renamed from: i, reason: from kotlin metadata */
        public final PurchasePayload purchasePayload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerError(int i, String httpMessage, String url, String str, Integer num, String str2, PurchasePayload purchasePayload) {
            super(i + ' ' + httpMessage + ' ' + url, str2, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(httpMessage, "httpMessage");
            Intrinsics.checkNotNullParameter(url, "url");
            this.httpCode = i;
            this.httpMessage = httpMessage;
            this.url = url;
            this.userMessage = str;
            this.code = num;
            this.purchasePayload = purchasePayload;
        }

        public final Integer getCode() {
            return this.code;
        }

        public final int getHttpCode() {
            return this.httpCode;
        }

        public final String getHttpMessage() {
            return this.httpMessage;
        }

        @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayloadHolder
        public PurchasePayload getPurchasePayload() {
            return this.purchasePayload;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getUserMessage() {
            return this.userMessage;
        }
    }

    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$TimeoutError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure;", "description", "", "traceId", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class TimeoutError extends PayLibBackendFailure {
        public TimeoutError(String str, String str2, Throwable th) {
            super(str, str2, th, null);
        }
    }

    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0016"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure$UnspecifiedError;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PayLibBackendFailure;", "", "d", "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "httpCode", "", "e", "Ljava/lang/String;", "getHttpMessage", "()Ljava/lang/String;", "httpMessage", "f", "getUrl", "url", "traceId", "", "cause", SegmentConstantPool.INITSTRING, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final class UnspecifiedError extends PayLibBackendFailure {

        /* renamed from: d, reason: from kotlin metadata */
        public final Integer httpCode;

        /* renamed from: e, reason: from kotlin metadata */
        public final String httpMessage;

        /* renamed from: f, reason: from kotlin metadata */
        public final String url;

        /* JADX WARN: Illegal instructions before constructor call */
        public UnspecifiedError(Integer num, String str, String url, String str2, Throwable th) {
            String message;
            Intrinsics.checkNotNullParameter(url, "url");
            if (th == null || (message = th.getMessage()) == null) {
                message = num + ' ' + str + ' ' + url;
            }
            super(message, str2, th, null);
            this.httpCode = num;
            this.httpMessage = str;
            this.url = url;
        }

        public final Integer getHttpCode() {
            return this.httpCode;
        }

        public final String getHttpMessage() {
            return this.httpMessage;
        }

        public final String getUrl() {
            return this.url;
        }

        public /* synthetic */ UnspecifiedError(Integer num, String str, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, str2, str3, (i & 16) != 0 ? null : th);
        }
    }

    public PayLibBackendFailure(String str, String str2, Throwable th) {
        super(str, str2, th);
        this.description = str;
        this.traceId = str2;
    }

    public final String getDescription() {
        return this.description;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException, com.sdkit.paylib.paylibpayment.api.domain.entity.error.TraceIdContainer
    public String getTraceId() {
        return this.traceId;
    }

    public /* synthetic */ PayLibBackendFailure(String str, String str2, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, th);
    }
}
