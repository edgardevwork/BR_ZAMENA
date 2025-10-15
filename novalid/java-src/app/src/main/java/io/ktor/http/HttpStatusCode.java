package io.ktor.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpStatusCode.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m7105d2 = {"Lio/ktor/http/HttpStatusCode;", "", "value", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getValue", "()I", "compareTo", "other", "component1", "component2", "copy", "equals", "", "", "hashCode", "toString", "Companion", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpStatusCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpStatusCode.kt\nio/ktor/http/HttpStatusCode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n1194#2,2:195\n1222#2,4:197\n*S KotlinDebug\n*F\n+ 1 HttpStatusCode.kt\nio/ktor/http/HttpStatusCode\n*L\n112#1:195,2\n112#1:197,4\n*E\n"})
/* loaded from: classes5.dex */
public final /* data */ class HttpStatusCode implements Comparable<HttpStatusCode> {

    @NotNull
    public static final List<HttpStatusCode> allStatusCodes;

    @NotNull
    public static final Map<Integer, HttpStatusCode> statusCodesMap;

    @NotNull
    public final String description;
    public final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final HttpStatusCode Continue = new HttpStatusCode(100, "Continue");

    @NotNull
    public static final HttpStatusCode SwitchingProtocols = new HttpStatusCode(101, "Switching Protocols");

    @NotNull
    public static final HttpStatusCode Processing = new HttpStatusCode(102, "Processing");

    /* renamed from: OK */
    @NotNull
    public static final HttpStatusCode f9676OK = new HttpStatusCode(200, "OK");

    @NotNull
    public static final HttpStatusCode Created = new HttpStatusCode(201, "Created");

    @NotNull
    public static final HttpStatusCode Accepted = new HttpStatusCode(202, "Accepted");

    @NotNull
    public static final HttpStatusCode NonAuthoritativeInformation = new HttpStatusCode(203, "Non-Authoritative Information");

    @NotNull
    public static final HttpStatusCode NoContent = new HttpStatusCode(204, "No Content");

    @NotNull
    public static final HttpStatusCode ResetContent = new HttpStatusCode(HttpStatus.SC_RESET_CONTENT, "Reset Content");

    @NotNull
    public static final HttpStatusCode PartialContent = new HttpStatusCode(206, "Partial Content");

    @NotNull
    public static final HttpStatusCode MultiStatus = new HttpStatusCode(207, "Multi-Status");

    @NotNull
    public static final HttpStatusCode MultipleChoices = new HttpStatusCode(300, "Multiple Choices");

    @NotNull
    public static final HttpStatusCode MovedPermanently = new HttpStatusCode(301, "Moved Permanently");

    @NotNull
    public static final HttpStatusCode Found = new HttpStatusCode(302, "Found");

    @NotNull
    public static final HttpStatusCode SeeOther = new HttpStatusCode(303, "See Other");

    @NotNull
    public static final HttpStatusCode NotModified = new HttpStatusCode(304, "Not Modified");

    @NotNull
    public static final HttpStatusCode UseProxy = new HttpStatusCode(305, "Use Proxy");

    @NotNull
    public static final HttpStatusCode SwitchProxy = new HttpStatusCode(306, "Switch Proxy");

    @NotNull
    public static final HttpStatusCode TemporaryRedirect = new HttpStatusCode(307, "Temporary Redirect");

    @NotNull
    public static final HttpStatusCode PermanentRedirect = new HttpStatusCode(308, "Permanent Redirect");

    @NotNull
    public static final HttpStatusCode BadRequest = new HttpStatusCode(400, "Bad Request");

    @NotNull
    public static final HttpStatusCode Unauthorized = new HttpStatusCode(401, "Unauthorized");

    @NotNull
    public static final HttpStatusCode PaymentRequired = new HttpStatusCode(402, "Payment Required");

    @NotNull
    public static final HttpStatusCode Forbidden = new HttpStatusCode(403, "Forbidden");

    @NotNull
    public static final HttpStatusCode NotFound = new HttpStatusCode(404, "Not Found");

    @NotNull
    public static final HttpStatusCode MethodNotAllowed = new HttpStatusCode(405, "Method Not Allowed");

    @NotNull
    public static final HttpStatusCode NotAcceptable = new HttpStatusCode(HttpStatus.SC_NOT_ACCEPTABLE, "Not Acceptable");

    @NotNull
    public static final HttpStatusCode ProxyAuthenticationRequired = new HttpStatusCode(407, "Proxy Authentication Required");

    @NotNull
    public static final HttpStatusCode RequestTimeout = new HttpStatusCode(HttpStatus.SC_REQUEST_TIMEOUT, "Request Timeout");

    @NotNull
    public static final HttpStatusCode Conflict = new HttpStatusCode(HttpStatus.SC_CONFLICT, "Conflict");

    @NotNull
    public static final HttpStatusCode Gone = new HttpStatusCode(HttpStatus.SC_GONE, "Gone");

    @NotNull
    public static final HttpStatusCode LengthRequired = new HttpStatusCode(HttpStatus.SC_LENGTH_REQUIRED, "Length Required");

    @NotNull
    public static final HttpStatusCode PreconditionFailed = new HttpStatusCode(HttpStatus.SC_PRECONDITION_FAILED, "Precondition Failed");

    @NotNull
    public static final HttpStatusCode PayloadTooLarge = new HttpStatusCode(HttpStatus.SC_REQUEST_TOO_LONG, "Payload Too Large");

    @NotNull
    public static final HttpStatusCode RequestURITooLong = new HttpStatusCode(HttpStatus.SC_REQUEST_URI_TOO_LONG, "Request-URI Too Long");

    @NotNull
    public static final HttpStatusCode UnsupportedMediaType = new HttpStatusCode(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "Unsupported Media Type");

    @NotNull
    public static final HttpStatusCode RequestedRangeNotSatisfiable = new HttpStatusCode(416, "Requested Range Not Satisfiable");

    @NotNull
    public static final HttpStatusCode ExpectationFailed = new HttpStatusCode(HttpStatus.SC_EXPECTATION_FAILED, "Expectation Failed");

    @NotNull
    public static final HttpStatusCode UnprocessableEntity = new HttpStatusCode(422, "Unprocessable Entity");

    @NotNull
    public static final HttpStatusCode Locked = new HttpStatusCode(423, "Locked");

    @NotNull
    public static final HttpStatusCode FailedDependency = new HttpStatusCode(424, "Failed Dependency");

    @NotNull
    public static final HttpStatusCode TooEarly = new HttpStatusCode(TypedValues.CycleType.TYPE_WAVE_PHASE, "Too Early");

    @NotNull
    public static final HttpStatusCode UpgradeRequired = new HttpStatusCode(426, "Upgrade Required");

    @NotNull
    public static final HttpStatusCode TooManyRequests = new HttpStatusCode(HttpStatus.SC_TOO_MANY_REQUESTS, "Too Many Requests");

    @NotNull
    public static final HttpStatusCode RequestHeaderFieldTooLarge = new HttpStatusCode(431, "Request Header Fields Too Large");

    @NotNull
    public static final HttpStatusCode InternalServerError = new HttpStatusCode(500, "Internal Server Error");

    @NotNull
    public static final HttpStatusCode NotImplemented = new HttpStatusCode(501, "Not Implemented");

    @NotNull
    public static final HttpStatusCode BadGateway = new HttpStatusCode(502, "Bad Gateway");

    @NotNull
    public static final HttpStatusCode ServiceUnavailable = new HttpStatusCode(503, "Service Unavailable");

    @NotNull
    public static final HttpStatusCode GatewayTimeout = new HttpStatusCode(504, "Gateway Timeout");

    @NotNull
    public static final HttpStatusCode VersionNotSupported = new HttpStatusCode(505, "HTTP Version Not Supported");

    @NotNull
    public static final HttpStatusCode VariantAlsoNegotiates = new HttpStatusCode(TypedValues.PositionType.TYPE_PERCENT_X, "Variant Also Negotiates");

    @NotNull
    public static final HttpStatusCode InsufficientStorage = new HttpStatusCode(507, "Insufficient Storage");

    public static /* synthetic */ HttpStatusCode copy$default(HttpStatusCode httpStatusCode, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = httpStatusCode.value;
        }
        if ((i2 & 2) != 0) {
            str = httpStatusCode.description;
        }
        return httpStatusCode.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final HttpStatusCode copy(int value, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new HttpStatusCode(value, description);
    }

    public HttpStatusCode(int i, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.value = i;
        this.description = description;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return this.value + ' ' + this.description;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof HttpStatusCode) && ((HttpStatusCode) other).value == this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @NotNull
    public final HttpStatusCode description(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return copy$default(this, 0, value, 1, null);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull HttpStatusCode other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value - other.value;
    }

    /* compiled from: HttpStatusCode.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bk\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010v\u001a\u00020\u00042\u0006\u0010w\u001a\u00020uR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0011\u0010'\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0011\u0010)\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0011\u0010+\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0011\u0010/\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0006R\u0011\u00101\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u0011\u00103\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u0011\u00105\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0006R\u0011\u00107\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0006R\u0011\u00109\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0011\u0010;\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u0011\u0010=\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006R\u0011\u0010?\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0006R\u0011\u0010A\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0006R\u0011\u0010C\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0006R\u0011\u0010E\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0006R\u0011\u0010G\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0006R\u0011\u0010I\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0006R\u0011\u0010K\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0006R\u0011\u0010M\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0006R\u0011\u0010O\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0006R\u0011\u0010Q\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0006R\u0011\u0010S\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0006R\u0011\u0010U\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0006R\u0011\u0010W\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0006R\u0011\u0010Y\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0006R\u0011\u0010[\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0006R\u0011\u0010]\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\u0006R\u0011\u0010_\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\u0006R\u0011\u0010a\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0006R\u0011\u0010c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010\u0006R\u0011\u0010e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\u0006R\u0011\u0010g\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010\u0006R\u0011\u0010i\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\u0006R\u0011\u0010k\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\u0006R\u0011\u0010m\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010\u0006R\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00040p¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u001a\u0010s\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u00040tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006x"}, m7105d2 = {"Lio/ktor/http/HttpStatusCode$Companion;", "", "()V", "Accepted", "Lio/ktor/http/HttpStatusCode;", "getAccepted", "()Lio/ktor/http/HttpStatusCode;", "BadGateway", "getBadGateway", "BadRequest", "getBadRequest", "Conflict", "getConflict", "Continue", "getContinue", "Created", "getCreated", "ExpectationFailed", "getExpectationFailed", "FailedDependency", "getFailedDependency", "Forbidden", "getForbidden", "Found", "getFound", "GatewayTimeout", "getGatewayTimeout", "Gone", "getGone", "InsufficientStorage", "getInsufficientStorage", "InternalServerError", "getInternalServerError", "LengthRequired", "getLengthRequired", "Locked", "getLocked", "MethodNotAllowed", "getMethodNotAllowed", "MovedPermanently", "getMovedPermanently", "MultiStatus", "getMultiStatus", "MultipleChoices", "getMultipleChoices", "NoContent", "getNoContent", "NonAuthoritativeInformation", "getNonAuthoritativeInformation", "NotAcceptable", "getNotAcceptable", "NotFound", "getNotFound", "NotImplemented", "getNotImplemented", "NotModified", "getNotModified", "OK", "getOK", "PartialContent", "getPartialContent", "PayloadTooLarge", "getPayloadTooLarge", "PaymentRequired", "getPaymentRequired", "PermanentRedirect", "getPermanentRedirect", "PreconditionFailed", "getPreconditionFailed", "Processing", "getProcessing", "ProxyAuthenticationRequired", "getProxyAuthenticationRequired", "RequestHeaderFieldTooLarge", "getRequestHeaderFieldTooLarge", "RequestTimeout", "getRequestTimeout", "RequestURITooLong", "getRequestURITooLong", "RequestedRangeNotSatisfiable", "getRequestedRangeNotSatisfiable", "ResetContent", "getResetContent", "SeeOther", "getSeeOther", "ServiceUnavailable", "getServiceUnavailable", "SwitchProxy", "getSwitchProxy", "SwitchingProtocols", "getSwitchingProtocols", "TemporaryRedirect", "getTemporaryRedirect", "TooEarly", "getTooEarly", "TooManyRequests", "getTooManyRequests", "Unauthorized", "getUnauthorized", "UnprocessableEntity", "getUnprocessableEntity", "UnsupportedMediaType", "getUnsupportedMediaType", "UpgradeRequired", "getUpgradeRequired", "UseProxy", "getUseProxy", "VariantAlsoNegotiates", "getVariantAlsoNegotiates", "VersionNotSupported", "getVersionNotSupported", "allStatusCodes", "", "getAllStatusCodes", "()Ljava/util/List;", "statusCodesMap", "", "", "fromValue", "value", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HttpStatusCode getContinue() {
            return HttpStatusCode.Continue;
        }

        @NotNull
        public final HttpStatusCode getSwitchingProtocols() {
            return HttpStatusCode.SwitchingProtocols;
        }

        @NotNull
        public final HttpStatusCode getProcessing() {
            return HttpStatusCode.Processing;
        }

        @NotNull
        public final HttpStatusCode getOK() {
            return HttpStatusCode.f9676OK;
        }

        @NotNull
        public final HttpStatusCode getCreated() {
            return HttpStatusCode.Created;
        }

        @NotNull
        public final HttpStatusCode getAccepted() {
            return HttpStatusCode.Accepted;
        }

        @NotNull
        public final HttpStatusCode getNonAuthoritativeInformation() {
            return HttpStatusCode.NonAuthoritativeInformation;
        }

        @NotNull
        public final HttpStatusCode getNoContent() {
            return HttpStatusCode.NoContent;
        }

        @NotNull
        public final HttpStatusCode getResetContent() {
            return HttpStatusCode.ResetContent;
        }

        @NotNull
        public final HttpStatusCode getPartialContent() {
            return HttpStatusCode.PartialContent;
        }

        @NotNull
        public final HttpStatusCode getMultiStatus() {
            return HttpStatusCode.MultiStatus;
        }

        @NotNull
        public final HttpStatusCode getMultipleChoices() {
            return HttpStatusCode.MultipleChoices;
        }

        @NotNull
        public final HttpStatusCode getMovedPermanently() {
            return HttpStatusCode.MovedPermanently;
        }

        @NotNull
        public final HttpStatusCode getFound() {
            return HttpStatusCode.Found;
        }

        @NotNull
        public final HttpStatusCode getSeeOther() {
            return HttpStatusCode.SeeOther;
        }

        @NotNull
        public final HttpStatusCode getNotModified() {
            return HttpStatusCode.NotModified;
        }

        @NotNull
        public final HttpStatusCode getUseProxy() {
            return HttpStatusCode.UseProxy;
        }

        @NotNull
        public final HttpStatusCode getSwitchProxy() {
            return HttpStatusCode.SwitchProxy;
        }

        @NotNull
        public final HttpStatusCode getTemporaryRedirect() {
            return HttpStatusCode.TemporaryRedirect;
        }

        @NotNull
        public final HttpStatusCode getPermanentRedirect() {
            return HttpStatusCode.PermanentRedirect;
        }

        @NotNull
        public final HttpStatusCode getBadRequest() {
            return HttpStatusCode.BadRequest;
        }

        @NotNull
        public final HttpStatusCode getUnauthorized() {
            return HttpStatusCode.Unauthorized;
        }

        @NotNull
        public final HttpStatusCode getPaymentRequired() {
            return HttpStatusCode.PaymentRequired;
        }

        @NotNull
        public final HttpStatusCode getForbidden() {
            return HttpStatusCode.Forbidden;
        }

        @NotNull
        public final HttpStatusCode getNotFound() {
            return HttpStatusCode.NotFound;
        }

        @NotNull
        public final HttpStatusCode getMethodNotAllowed() {
            return HttpStatusCode.MethodNotAllowed;
        }

        @NotNull
        public final HttpStatusCode getNotAcceptable() {
            return HttpStatusCode.NotAcceptable;
        }

        @NotNull
        public final HttpStatusCode getProxyAuthenticationRequired() {
            return HttpStatusCode.ProxyAuthenticationRequired;
        }

        @NotNull
        public final HttpStatusCode getRequestTimeout() {
            return HttpStatusCode.RequestTimeout;
        }

        @NotNull
        public final HttpStatusCode getConflict() {
            return HttpStatusCode.Conflict;
        }

        @NotNull
        public final HttpStatusCode getGone() {
            return HttpStatusCode.Gone;
        }

        @NotNull
        public final HttpStatusCode getLengthRequired() {
            return HttpStatusCode.LengthRequired;
        }

        @NotNull
        public final HttpStatusCode getPreconditionFailed() {
            return HttpStatusCode.PreconditionFailed;
        }

        @NotNull
        public final HttpStatusCode getPayloadTooLarge() {
            return HttpStatusCode.PayloadTooLarge;
        }

        @NotNull
        public final HttpStatusCode getRequestURITooLong() {
            return HttpStatusCode.RequestURITooLong;
        }

        @NotNull
        public final HttpStatusCode getUnsupportedMediaType() {
            return HttpStatusCode.UnsupportedMediaType;
        }

        @NotNull
        public final HttpStatusCode getRequestedRangeNotSatisfiable() {
            return HttpStatusCode.RequestedRangeNotSatisfiable;
        }

        @NotNull
        public final HttpStatusCode getExpectationFailed() {
            return HttpStatusCode.ExpectationFailed;
        }

        @NotNull
        public final HttpStatusCode getUnprocessableEntity() {
            return HttpStatusCode.UnprocessableEntity;
        }

        @NotNull
        public final HttpStatusCode getLocked() {
            return HttpStatusCode.Locked;
        }

        @NotNull
        public final HttpStatusCode getFailedDependency() {
            return HttpStatusCode.FailedDependency;
        }

        @NotNull
        public final HttpStatusCode getTooEarly() {
            return HttpStatusCode.TooEarly;
        }

        @NotNull
        public final HttpStatusCode getUpgradeRequired() {
            return HttpStatusCode.UpgradeRequired;
        }

        @NotNull
        public final HttpStatusCode getTooManyRequests() {
            return HttpStatusCode.TooManyRequests;
        }

        @NotNull
        public final HttpStatusCode getRequestHeaderFieldTooLarge() {
            return HttpStatusCode.RequestHeaderFieldTooLarge;
        }

        @NotNull
        public final HttpStatusCode getInternalServerError() {
            return HttpStatusCode.InternalServerError;
        }

        @NotNull
        public final HttpStatusCode getNotImplemented() {
            return HttpStatusCode.NotImplemented;
        }

        @NotNull
        public final HttpStatusCode getBadGateway() {
            return HttpStatusCode.BadGateway;
        }

        @NotNull
        public final HttpStatusCode getServiceUnavailable() {
            return HttpStatusCode.ServiceUnavailable;
        }

        @NotNull
        public final HttpStatusCode getGatewayTimeout() {
            return HttpStatusCode.GatewayTimeout;
        }

        @NotNull
        public final HttpStatusCode getVersionNotSupported() {
            return HttpStatusCode.VersionNotSupported;
        }

        @NotNull
        public final HttpStatusCode getVariantAlsoNegotiates() {
            return HttpStatusCode.VariantAlsoNegotiates;
        }

        @NotNull
        public final HttpStatusCode getInsufficientStorage() {
            return HttpStatusCode.InsufficientStorage;
        }

        @NotNull
        public final List<HttpStatusCode> getAllStatusCodes() {
            return HttpStatusCode.allStatusCodes;
        }

        @NotNull
        public final HttpStatusCode fromValue(int value) {
            HttpStatusCode httpStatusCode = (HttpStatusCode) HttpStatusCode.statusCodesMap.get(Integer.valueOf(value));
            return httpStatusCode == null ? new HttpStatusCode(value, "Unknown Status Code") : httpStatusCode;
        }
    }

    static {
        List<HttpStatusCode> listAllStatusCodes = HttpStatusCodeKt.allStatusCodes();
        allStatusCodes = listAllStatusCodes;
        List<HttpStatusCode> list = listAllStatusCodes;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((HttpStatusCode) obj).value), obj);
        }
        statusCodesMap = linkedHashMap;
    }
}
