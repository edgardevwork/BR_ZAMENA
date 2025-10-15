package io.ktor.http;

import io.ktor.util.StringValuesKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: URLUtils.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002\u001a\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t\u001a\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001\u001a&\u0010\u0012\u001a\u00020\u0013*\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b\u001a(\u0010\u0012\u001a\u00020\u0013*\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a$\u0010\u001b\u001a\u00020\u0013*\u00060\u001cj\u0002`\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010 \u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\t\u001a\u0012\u0010 \u001a\u00020\t*\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\n\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000b\"\u0015\u0010\f\u001a\u00020\b*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u0015\u0010\f\u001a\u00020\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b¨\u0006!"}, m7105d2 = {"fullPath", "", "Lio/ktor/http/Url;", "getFullPath", "(Lio/ktor/http/Url;)Ljava/lang/String;", "hostWithPort", "getHostWithPort", "isAbsolutePath", "", "Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;)Z", "(Lio/ktor/http/Url;)Z", "isRelativePath", "URLBuilder", "builder", "url", "urlString", "Url", "appendUrlFullPath", "", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "encodedPath", "encodedQueryParameters", "Lio/ktor/http/ParametersBuilder;", "trailingQuery", "encodedQuery", "appendUserAndPassword", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "encodedUser", "encodedPassword", "takeFrom", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nURLUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLUtils.kt\nio/ktor/http/URLUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1#2:166\n1360#3:167\n1446#3,2:168\n1549#3:170\n1620#3,3:171\n1448#3,3:174\n*S KotlinDebug\n*F\n+ 1 URLUtils.kt\nio/ktor/http/URLUtilsKt\n*L\n118#1:167\n118#1:168,2\n119#1:170\n119#1:171,3\n118#1:174,3\n*E\n"})
/* loaded from: classes6.dex */
public final class URLUtilsKt {
    @NotNull
    public static final Url Url(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return URLBuilder(urlString).build();
    }

    @NotNull
    public static final Url Url(@NotNull URLBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), builder).build();
    }

    @NotNull
    public static final URLBuilder URLBuilder(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return URLParserKt.takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    @NotNull
    public static final URLBuilder URLBuilder(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    @NotNull
    public static final URLBuilder URLBuilder(@NotNull URLBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), builder);
    }

    @NotNull
    public static final URLBuilder takeFrom(@NotNull URLBuilder uRLBuilder, @NotNull URLBuilder url) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        uRLBuilder.setProtocol(url.getProtocol());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        uRLBuilder.setEncodedPathSegments(url.getEncodedPathSegments());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        StringValuesKt.appendAll(parametersBuilderParametersBuilder$default, url.getEncodedParameters());
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    @NotNull
    public static final URLBuilder takeFrom(@NotNull URLBuilder uRLBuilder, @NotNull Url url) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        uRLBuilder.setProtocol(url.getProtocol());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        URLBuilderKt.setEncodedPath(uRLBuilder, url.getEncodedPath());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        parametersBuilderParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(url.getEncodedQuery(), 0, 0, false, 6, null));
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    @NotNull
    public static final String getFullPath(@NotNull Url url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "<this>");
        StringBuilder sb = new StringBuilder();
        appendUrlFullPath(sb, url.getEncodedPath(), url.getEncodedQuery(), url.getTrailingQuery());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public static final String getHostWithPort(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return url.getHost() + ':' + url.getPort();
    }

    public static final void appendUrlFullPath(@NotNull Appendable appendable, @NotNull String encodedPath, @NotNull String encodedQuery, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQuery, "encodedQuery");
        if ((!StringsKt__StringsJVMKt.isBlank(encodedPath)) && !StringsKt__StringsJVMKt.startsWith$default(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (encodedQuery.length() > 0 || z) {
            appendable.append("?");
        }
        appendable.append(encodedQuery);
    }

    public static final void appendUrlFullPath(@NotNull Appendable appendable, @NotNull String encodedPath, @NotNull ParametersBuilder encodedQueryParameters, boolean z) {
        List listListOf;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if ((!StringsKt__StringsJVMKt.isBlank(encodedPath)) && !StringsKt__StringsJVMKt.startsWith$default(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z) {
            appendable.append("?");
        }
        Set<Map.Entry<String, List<String>>> setEntries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m7112to(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(TuplesKt.m7112to(str, (String) it2.next()));
                }
                listListOf = arrayList2;
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listListOf);
        }
        CollectionsKt___CollectionsKt.joinTo$default(arrayList, appendable, "&", null, null, 0, null, new Function1<Pair<? extends String, ? extends String>, CharSequence>() { // from class: io.ktor.http.URLUtilsKt.appendUrlFullPath.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends String, ? extends String> pair) {
                return invoke2((Pair<String, String>) pair);
            }

            @NotNull
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Pair<String, String> it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                String first = it3.getFirst();
                if (it3.getSecond() == null) {
                    return first;
                }
                return first + '=' + String.valueOf(it3.getSecond());
            }
        }, 60, null);
    }

    public static final boolean isAbsolutePath(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return Intrinsics.areEqual(CollectionsKt___CollectionsKt.firstOrNull((List) url.getPathSegments()), "");
    }

    public static final boolean isRelativePath(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return !isAbsolutePath(url);
    }

    public static final boolean isAbsolutePath(@NotNull URLBuilder uRLBuilder) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return Intrinsics.areEqual(CollectionsKt___CollectionsKt.firstOrNull((List) uRLBuilder.getPathSegments()), "");
    }

    public static final boolean isRelativePath(@NotNull URLBuilder uRLBuilder) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return !isAbsolutePath(uRLBuilder);
    }

    public static final void appendUserAndPassword(@NotNull StringBuilder sb, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(':');
            sb.append(str2);
        }
        sb.append("@");
    }
}
