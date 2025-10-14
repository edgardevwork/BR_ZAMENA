package io.ktor.http;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.ContentType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpHeaderValueParser.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t\u001a>\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00100\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a6\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u000fj\b\u0012\u0004\u0012\u00020\u0013`\u00100\u000eH\u0002\u001a$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\u0014\u0010\u0018\u001a\u00020\t*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u001a\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00150\u001c\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u0001\"\u0004\b\u0000\u0010\u001e*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0\u00010\u000eH\u0002¨\u0006\u001f"}, m7105d2 = {"parseAndSortContentTypeHeader", "", "Lio/ktor/http/HeaderValue;", "header", "", "parseAndSortHeader", "parseHeaderValue", "text", "parametersOnly", "", "parseHeaderValueItem", "", TtmlNode.START, FirebaseAnalytics.Param.ITEMS, "Lkotlin/Lazy;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parseHeaderValueParameter", "parameters", "Lio/ktor/http/HeaderValueParam;", "parseHeaderValueParameterValue", "Lkotlin/Pair;", "value", "parseHeaderValueParameterValueQuoted", "nextIsSemicolonOrEnd", "subtrim", "end", "toHeaderParamsList", "", "valueOrEmpty", ExifInterface.GPS_DIRECTION_TRUE, "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpHeaderValueParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1054#2:225\n1549#2:226\n1620#2,3:227\n*S KotlinDebug\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n49#1:225\n96#1:226\n96#1:227,3\n*E\n"})
/* loaded from: classes5.dex */
public final class HttpHeaderValueParserKt {
    @NotNull
    public static final List<HeaderValue> parseAndSortHeader(@Nullable String str) {
        return CollectionsKt___CollectionsKt.sortedWith(parseHeaderValue(str), new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortHeader$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Double.valueOf(((HeaderValue) t2).getQuality()), Double.valueOf(((HeaderValue) t).getQuality()));
            }
        });
    }

    @NotNull
    public static final List<HeaderValue> parseAndSortContentTypeHeader(@Nullable String str) {
        List<HeaderValue> headerValue = parseHeaderValue(str);
        final Comparator comparator = new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Double.valueOf(((HeaderValue) t2).getQuality()), Double.valueOf(((HeaderValue) t).getQuality()));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) throws BadContentTypeFormatException {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                ContentType.Companion companion = ContentType.INSTANCE;
                ContentType contentType = companion.parse(((HeaderValue) t).getValue());
                int i = Intrinsics.areEqual(contentType.getContentType(), "*") ? 2 : 0;
                if (Intrinsics.areEqual(contentType.getContentSubtype(), "*")) {
                    i++;
                }
                Integer numValueOf = Integer.valueOf(i);
                ContentType contentType2 = companion.parse(((HeaderValue) t2).getValue());
                int i2 = Intrinsics.areEqual(contentType2.getContentType(), "*") ? 2 : 0;
                if (Intrinsics.areEqual(contentType2.getContentSubtype(), "*")) {
                    i2++;
                }
                return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, Integer.valueOf(i2));
            }
        };
        return CollectionsKt___CollectionsKt.sortedWith(headerValue, new Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((HeaderValue) t2).getParams().size()), Integer.valueOf(((HeaderValue) t).getParams().size()));
            }
        });
    }

    @NotNull
    public static final List<HeaderValue> parseHeaderValue(@Nullable String str) {
        return parseHeaderValue(str, false);
    }

    @NotNull
    public static final List<HeaderValue> parseHeaderValue(@Nullable String str, boolean z) {
        if (str == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ArrayList<HeaderValue>>() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseHeaderValue$items$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ArrayList<HeaderValue> invoke() {
                return new ArrayList<>();
            }
        });
        int headerValueItem = 0;
        while (headerValueItem <= StringsKt__StringsKt.getLastIndex(str)) {
            headerValueItem = parseHeaderValueItem(str, headerValueItem, lazy, z);
        }
        return valueOrEmpty(lazy);
    }

    public static final <T> List<T> valueOrEmpty(Lazy<? extends List<? extends T>> lazy) {
        return lazy.isInitialized() ? lazy.getValue() : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final String subtrim(String str, int i, int i2) {
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
    }

    public static final int parseHeaderValueItem(String str, int i, Lazy<? extends ArrayList<HeaderValue>> lazy, boolean z) {
        Lazy lazy2 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ArrayList<HeaderValueParam>>() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseHeaderValueItem$parameters$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ArrayList<HeaderValueParam> invoke() {
                return new ArrayList<>();
            }
        });
        Integer numValueOf = z ? Integer.valueOf(i) : null;
        int headerValueParameter = i;
        while (headerValueParameter <= StringsKt__StringsKt.getLastIndex(str)) {
            char cCharAt = str.charAt(headerValueParameter);
            if (cCharAt == ',') {
                lazy.getValue().add(new HeaderValue(subtrim(str, i, numValueOf != null ? numValueOf.intValue() : headerValueParameter), valueOrEmpty(lazy2)));
                return headerValueParameter + 1;
            }
            if (cCharAt == ';') {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(headerValueParameter);
                }
                headerValueParameter = parseHeaderValueParameter(str, headerValueParameter + 1, lazy2);
            } else {
                headerValueParameter = z ? parseHeaderValueParameter(str, headerValueParameter, lazy2) : headerValueParameter + 1;
            }
        }
        lazy.getValue().add(new HeaderValue(subtrim(str, i, numValueOf != null ? numValueOf.intValue() : headerValueParameter), valueOrEmpty(lazy2)));
        return headerValueParameter;
    }

    public static final void parseHeaderValueParameter$addParam(Lazy<? extends ArrayList<HeaderValueParam>> lazy, String str, int i, int i2, String str2) {
        String strSubtrim = subtrim(str, i, i2);
        if (strSubtrim.length() == 0) {
            return;
        }
        lazy.getValue().add(new HeaderValueParam(strSubtrim, str2));
    }

    public static final int parseHeaderValueParameter(String str, int i, Lazy<? extends ArrayList<HeaderValueParam>> lazy) {
        int i2 = i;
        while (i2 <= StringsKt__StringsKt.getLastIndex(str)) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '=') {
                Pair<Integer, String> headerValueParameterValue = parseHeaderValueParameterValue(str, i2 + 1);
                int iIntValue = headerValueParameterValue.component1().intValue();
                parseHeaderValueParameter$addParam(lazy, str, i, i2, headerValueParameterValue.component2());
                return iIntValue;
            }
            if (cCharAt == ';' || cCharAt == ',') {
                parseHeaderValueParameter$addParam(lazy, str, i, i2, "");
                return i2;
            }
            i2++;
        }
        parseHeaderValueParameter$addParam(lazy, str, i, i2, "");
        return i2;
    }

    public static final Pair<Integer, String> parseHeaderValueParameterValue(String str, int i) {
        if (str.length() == i) {
            return TuplesKt.m7112to(Integer.valueOf(i), "");
        }
        if (str.charAt(i) == '\"') {
            return parseHeaderValueParameterValueQuoted(str, i + 1);
        }
        int i2 = i;
        while (i2 <= StringsKt__StringsKt.getLastIndex(str)) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ';' || cCharAt == ',') {
                return TuplesKt.m7112to(Integer.valueOf(i2), subtrim(str, i, i2));
            }
            i2++;
        }
        return TuplesKt.m7112to(Integer.valueOf(i2), subtrim(str, i, i2));
    }

    public static final Pair<Integer, String> parseHeaderValueParameterValueQuoted(String str, int i) {
        StringBuilder sb = new StringBuilder();
        while (i <= StringsKt__StringsKt.getLastIndex(str)) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' && nextIsSemicolonOrEnd(str, i)) {
                Integer numValueOf = Integer.valueOf(i + 1);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
                return TuplesKt.m7112to(numValueOf, string);
            }
            if (cCharAt == '\\' && i < StringsKt__StringsKt.getLastIndex(str) - 2) {
                sb.append(str.charAt(i + 1));
                i += 2;
            } else {
                sb.append(cCharAt);
                i++;
            }
        }
        Integer numValueOf2 = Integer.valueOf(i);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "builder.toString()");
        return TuplesKt.m7112to(numValueOf2, '\"' + string2);
    }

    public static final boolean nextIsSemicolonOrEnd(String str, int i) {
        int i2 = i + 1;
        while (i2 < str.length() && str.charAt(i2) == ' ') {
            i2++;
        }
        return i2 == str.length() || str.charAt(i2) == ';';
    }

    @NotNull
    public static final List<HeaderValueParam> toHeaderParamsList(@NotNull Iterable<Pair<String, String>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Pair<String, String> pair : iterable) {
            arrayList.add(new HeaderValueParam(pair.getFirst(), pair.getSecond()));
        }
        return arrayList;
    }
}
