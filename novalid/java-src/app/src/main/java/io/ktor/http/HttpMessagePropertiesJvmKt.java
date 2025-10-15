package io.ktor.http;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.time.TimeZones;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpMessagePropertiesJvm.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\t\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\t\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\t\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\u000b\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000f"}, m7105d2 = {"HTTP_DATE_FORMAT", "Ljava/text/SimpleDateFormat;", "getHTTP_DATE_FORMAT", "()Ljava/text/SimpleDateFormat;", "formatHttpDate", "", "date", "Ljava/util/Date;", "parseHttpDate", "Lio/ktor/http/HttpMessage;", ClientCookie.EXPIRES_ATTR, "Lio/ktor/http/HttpMessageBuilder;", "ifModifiedSince", "", "lastModified", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpMessagePropertiesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpMessagePropertiesJvm.kt\nio/ktor/http/HttpMessagePropertiesJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* loaded from: classes5.dex */
public final class HttpMessagePropertiesJvmKt {
    public static final SimpleDateFormat getHTTP_DATE_FORMAT() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TimeZones.GMT_ID));
        return simpleDateFormat;
    }

    public static final Date parseHttpDate(String str) throws ParseException {
        Date date = getHTTP_DATE_FORMAT().parse(str);
        Intrinsics.checkNotNullExpressionValue(date, "HTTP_DATE_FORMAT.parse(date)");
        return date;
    }

    public static final String formatHttpDate(Date date) {
        String str = getHTTP_DATE_FORMAT().format(date);
        Intrinsics.checkNotNullExpressionValue(str, "HTTP_DATE_FORMAT.format(date)");
        return str;
    }

    public static final void ifModifiedSince(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull Date date) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getIfModifiedSince(), formatHttpDate(date));
    }

    @Nullable
    public static final Date lastModified(@NotNull HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getLastModified());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    @Nullable
    public static final Date expires(@NotNull HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getExpires());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    @Nullable
    public static final Date lastModified(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getLastModified());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    @Nullable
    public static final Date expires(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getExpires());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    @Nullable
    public static final Date date(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getDate());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }
}
