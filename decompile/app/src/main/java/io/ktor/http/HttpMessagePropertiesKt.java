package io.ktor.http;

import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpMessageProperties.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0012\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006*\u00020\u0003\u001a\u0012\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006*\u00020\u0007\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\b*\u00020\u00072\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0007¢\u0006\u0002\u0010\t\u001a\u0011\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0003¢\u0006\u0002\u0010\f\u001a\u0011\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0007¢\u0006\u0002\u0010\r\u001a\u0014\u0010\n\u001a\u00020\b*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0003\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0007\u001a\u0012\u0010\u0010\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001*\u00020\u0007\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u0003\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u0007\u001a\u0012\u0010\u0017\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0016\u001a\u0012\u0010\u0019\u001a\u00020\b*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000f\u001a\u0010\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001*\u00020\u0003\u001a\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001*\u00020\u0016H\u0000\u001a\u0012\u0010\u001d\u001a\u00020\b*\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0016\u001a\u0012\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0001*\u00020\u0003\u001a\u0012\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0001*\u00020\u0007¨\u0006 "}, m7105d2 = {"cacheControl", "", "Lio/ktor/http/HeaderValue;", "Lio/ktor/http/HttpMessage;", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "Lio/ktor/http/HttpMessageBuilder;", "", "(Lio/ktor/http/HttpMessageBuilder;Ljava/nio/charset/Charset;)Lkotlin/Unit;", "contentLength", "", "(Lio/ktor/http/HttpMessage;)Ljava/lang/Long;", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/lang/Long;", CacheFileMetadataIndex.COLUMN_LENGTH, "", "contentType", "Lio/ktor/http/ContentType;", "type", "cookies", "Lio/ktor/http/Cookie;", "etag", "", "ifNoneMatch", "value", "maxAge", "seconds", "setCookie", "splitSetCookieHeader", "userAgent", "content", "vary", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpMessageProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpMessageProperties.kt\nio/ktor/http/HttpMessagePropertiesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1#2:173\n1360#3:174\n1446#3,2:175\n1549#3:177\n1620#3,3:178\n1448#3,3:181\n1360#3:184\n1446#3,2:185\n1549#3:187\n1620#3,3:188\n1448#3,3:191\n1360#3:194\n1446#3,5:195\n1549#3:200\n1620#3,3:201\n1549#3:204\n1620#3,3:205\n*S KotlinDebug\n*F\n+ 1 HttpMessageProperties.kt\nio/ktor/http/HttpMessagePropertiesKt\n*L\n64#1:174\n64#1:175,2\n65#1:177\n65#1:178,3\n64#1:181,3\n91#1:184\n91#1:185,2\n92#1:187\n92#1:188,3\n91#1:191,3\n104#1:194\n104#1:195,5\n105#1:200\n105#1:201,3\n112#1:204\n112#1:205,3\n*E\n"})
/* loaded from: classes5.dex */
public final class HttpMessagePropertiesKt {
    public static final void contentType(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull ContentType type) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getContentType(), type.toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Content-Length is controlled by underlying engine. Don't specify it explicitly.")
    public static final void contentLength(@NotNull HttpMessageBuilder httpMessageBuilder, int i) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getContentLength(), String.valueOf(i));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use content with particular content type and charset instead")
    @Nullable
    public static final Unit charset(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        ContentType contentType = contentType(httpMessageBuilder);
        if (contentType == null) {
            return null;
        }
        contentType(httpMessageBuilder, ContentTypesKt.withCharset(contentType, charset));
        return Unit.INSTANCE;
    }

    public static final void maxAge(@NotNull HttpMessageBuilder httpMessageBuilder, int i) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        httpMessageBuilder.getHeaders().append(HttpHeaders.INSTANCE.getCacheControl(), "max-age=" + i);
    }

    public static final void ifNoneMatch(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull String value) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getIfNoneMatch(), value);
    }

    public static final void userAgent(@NotNull HttpMessageBuilder httpMessageBuilder, @NotNull String content) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        httpMessageBuilder.getHeaders().set(HttpHeaders.INSTANCE.getUserAgent(), content);
    }

    @Nullable
    public static final ContentType contentType(@NotNull HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    @Nullable
    public static final Charset charset(@NotNull HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        ContentType contentType = contentType(httpMessageBuilder);
        if (contentType != null) {
            return ContentTypesKt.charset(contentType);
        }
        return null;
    }

    @Nullable
    public static final String etag(@NotNull HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        return httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getETag());
    }

    @Nullable
    public static final List<String> vary(@NotNull HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        List<String> all = httpMessageBuilder.getHeaders().getAll(HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString());
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    @Nullable
    public static final Long contentLength(@NotNull HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        String str = httpMessageBuilder.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    @Nullable
    public static final ContentType contentType(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    @Nullable
    public static final Charset charset(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        ContentType contentType = contentType(httpMessage);
        if (contentType != null) {
            return ContentTypesKt.charset(contentType);
        }
        return null;
    }

    @Nullable
    public static final String etag(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        return httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getETag());
    }

    @Nullable
    public static final List<String> vary(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        List<String> all = httpMessage.getHeaders().getAll(HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString());
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    @Nullable
    public static final Long contentLength(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    @NotNull
    public static final List<Cookie> setCookie(@NotNull HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        List<String> all = httpMessage.getHeaders().getAll(HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, splitSetCookieHeader((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(CookieKt.parseServerSetCookieHeader((String) it2.next()));
        }
        return arrayList2;
    }

    @NotNull
    public static final List<Cookie> cookies(@NotNull HttpMessageBuilder httpMessageBuilder) {
        Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        List<String> all = httpMessageBuilder.getHeaders().getAll(HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> list = all;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CookieKt.parseServerSetCookieHeader((String) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<HeaderValue> cacheControl(@NotNull HttpMessage httpMessage) {
        List<HeaderValue> headerValue;
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getCacheControl());
        return (str == null || (headerValue = HttpHeaderValueParserKt.parseHeaderValue(str)) == null) ? CollectionsKt__CollectionsKt.emptyList() : headerValue;
    }

    @NotNull
    public static final List<String> splitSetCookieHeader(@NotNull String str) {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ',', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return CollectionsKt__CollectionsJVMKt.listOf(str);
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', iIndexOf$default, false, 4, (Object) null);
        int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ';', iIndexOf$default, false, 4, (Object) null);
        int i2 = 0;
        while (i2 < str.length() && iIndexOf$default > 0) {
            if (iIndexOf$default2 < iIndexOf$default) {
                iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', iIndexOf$default, false, 4, (Object) null);
            }
            int iIndexOf$default4 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ',', iIndexOf$default + 1, false, 4, (Object) null);
            while (true) {
                i = iIndexOf$default;
                iIndexOf$default = iIndexOf$default4;
                if (iIndexOf$default < 0 || iIndexOf$default >= iIndexOf$default2) {
                    break;
                }
                iIndexOf$default4 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ',', iIndexOf$default + 1, false, 4, (Object) null);
            }
            if (iIndexOf$default3 < i) {
                iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ';', i, false, 4, (Object) null);
            }
            if (iIndexOf$default2 < 0) {
                String strSubstring = str.substring(i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                arrayList.add(strSubstring);
                return arrayList;
            }
            if (iIndexOf$default3 == -1 || iIndexOf$default3 > iIndexOf$default2) {
                String strSubstring2 = str.substring(i2, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                i2 = i + 1;
            }
        }
        if (i2 < str.length()) {
            String strSubstring3 = str.substring(i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(strSubstring3);
        }
        return arrayList;
    }
}
