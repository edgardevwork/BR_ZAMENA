package io.ktor.http;

import androidx.media3.extractor.p007ts.PsExtractor;
import com.blackhub.bronline.launcher.LauncherConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.NotNull;

/* compiled from: URLUtilsJvm.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0001¨\u0006\t"}, m7105d2 = {"Url", "Lio/ktor/http/Url;", "uri", "Ljava/net/URI;", "takeFrom", "Lio/ktor/http/URLBuilder;", "url", "Ljava/net/URL;", "toURI", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nURLUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLUtilsJvm.kt\nio/ktor/http/URLUtilsJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* loaded from: classes6.dex */
public final class URLUtilsJvmKt {
    @NotNull
    public static final URLBuilder takeFrom(@NotNull URLBuilder uRLBuilder, @NotNull URI uri) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String scheme = uri.getScheme();
        if (scheme != null) {
            uRLBuilder.setProtocol(URLProtocol.INSTANCE.createOrDefault(scheme));
            uRLBuilder.setPort(uRLBuilder.getProtocol().getDefaultPort());
        }
        if (uri.getPort() > 0) {
            uRLBuilder.setPort(uri.getPort());
        } else {
            String scheme2 = uri.getScheme();
            if (Intrinsics.areEqual(scheme2, HttpHost.DEFAULT_SCHEME_NAME)) {
                uRLBuilder.setPort(80);
            } else if (Intrinsics.areEqual(scheme2, "https")) {
                uRLBuilder.setPort(PsExtractor.SYSTEM_HEADER_START_CODE);
            }
        }
        if (uri.getRawUserInfo() != null) {
            String rawUserInfo = uri.getRawUserInfo();
            Intrinsics.checkNotNullExpressionValue(rawUserInfo, "uri.rawUserInfo");
            if (rawUserInfo.length() > 0) {
                String rawUserInfo2 = uri.getRawUserInfo();
                Intrinsics.checkNotNullExpressionValue(rawUserInfo2, "uri.rawUserInfo");
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) rawUserInfo2, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, (Object) null);
                uRLBuilder.setEncodedUser((String) CollectionsKt___CollectionsKt.first(listSplit$default));
                uRLBuilder.setEncodedPassword((String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1));
            }
        }
        String host = uri.getHost();
        if (host != null) {
            uRLBuilder.setHost(host);
        }
        String rawPath = uri.getRawPath();
        Intrinsics.checkNotNullExpressionValue(rawPath, "uri.rawPath");
        URLBuilderKt.setEncodedPath(uRLBuilder, rawPath);
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null) {
            ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
            parametersBuilderParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(rawQuery, 0, 0, false, 6, null));
            uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        }
        String query = uri.getQuery();
        if (query != null && query.length() == 0) {
            uRLBuilder.setTrailingQuery(true);
        }
        String rawFragment = uri.getRawFragment();
        if (rawFragment != null) {
            uRLBuilder.setEncodedFragment(rawFragment);
        }
        return uRLBuilder;
    }

    @NotNull
    public static final URLBuilder takeFrom(@NotNull URLBuilder uRLBuilder, @NotNull URL url) throws URISyntaxException {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        String host = url.getHost();
        Intrinsics.checkNotNullExpressionValue(host, "url.host");
        if (StringsKt__StringsKt.contains$default((CharSequence) host, LauncherConstants.UNDERSCORE_CHAR, false, 2, (Object) null)) {
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
            return URLParserKt.takeFrom(uRLBuilder, string);
        }
        URI uri = url.toURI();
        Intrinsics.checkNotNullExpressionValue(uri, "url.toURI()");
        return takeFrom(uRLBuilder, uri);
    }

    @NotNull
    public static final URI toURI(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return new URI(url.getUrlString());
    }

    @NotNull
    public static final Url Url(@NotNull URI uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), uri).build();
    }
}
