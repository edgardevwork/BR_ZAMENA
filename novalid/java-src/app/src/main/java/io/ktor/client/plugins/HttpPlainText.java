package io.ktor.client.plugins;

import androidx.core.app.NotificationCompat;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.TextContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.Charsets;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpPlainText.kt */
@Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0002\u001f BM\b\u0000\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\"\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u0004j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m7105d2 = {"Lio/ktor/client/plugins/HttpPlainText;", "", "charsets", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charsetQuality", "", "", "sendCharset", "responseCharsetFallback", "(Ljava/util/Set;Ljava/util/Map;Ljava/nio/charset/Charset;Ljava/nio/charset/Charset;)V", "acceptCharsetHeader", "", "requestCharset", "addCharsetHeaders", "", "context", "Lio/ktor/client/request/HttpRequestBuilder;", "addCharsetHeaders$ktor_client_core", "read", NotificationCompat.CATEGORY_CALL, "Lio/ktor/client/call/HttpClientCall;", "body", "Lio/ktor/utils/io/core/Input;", "read$ktor_client_core", "wrapContent", "request", "content", "requestContentType", "Lio/ktor/http/ContentType;", "Config", "Plugin", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpPlainText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1054#2:182\n766#2:183\n857#2,2:184\n1045#2:186\n1855#2,2:187\n1855#2,2:189\n*S KotlinDebug\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainText\n*L\n38#1:182\n39#1:183\n39#1:184,2\n39#1:186\n42#1:187,2\n47#1:189,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HttpPlainText {

    /* renamed from: Plugin, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<HttpPlainText> key = new AttributeKey<>("HttpPlainText");

    @NotNull
    public final String acceptCharsetHeader;

    @NotNull
    public final Charset requestCharset;

    @NotNull
    public final Charset responseCharsetFallback;

    public HttpPlainText(@NotNull Set<? extends Charset> charsets, @NotNull Map<Charset, Float> charsetQuality, @Nullable Charset charset, @NotNull Charset responseCharsetFallback) {
        Intrinsics.checkNotNullParameter(charsets, "charsets");
        Intrinsics.checkNotNullParameter(charsetQuality, "charsetQuality");
        Intrinsics.checkNotNullParameter(responseCharsetFallback, "responseCharsetFallback");
        this.responseCharsetFallback = responseCharsetFallback;
        List<Pair> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(MapsKt___MapsKt.toList(charsetQuality), new Comparator() { // from class: io.ktor.client.plugins.HttpPlainText$special$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues((Float) ((Pair) t2).getSecond(), (Float) ((Pair) t).getSecond());
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: io.ktor.client.plugins.HttpPlainText$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(CharsetJVMKt.getName((Charset) t), CharsetJVMKt.getName((Charset) t2));
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Charset charset2 : listSortedWith2) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(CharsetJVMKt.getName(charset2));
        }
        for (Pair pair : listSortedWith) {
            Charset charset3 = (Charset) pair.component1();
            float fFloatValue = ((Number) pair.component2()).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d = fFloatValue;
            if (0.0d > d || d > 1.0d) {
                throw new IllegalStateException("Check failed.".toString());
            }
            sb.append(CharsetJVMKt.getName(charset3) + ";q=" + (MathKt__MathJVMKt.roundToInt(100 * fFloatValue) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(CharsetJVMKt.getName(this.responseCharsetFallback));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.acceptCharsetHeader = string;
        if (charset == null && (charset = (Charset) CollectionsKt___CollectionsKt.firstOrNull(listSortedWith2)) == null) {
            Pair pair2 = (Pair) CollectionsKt___CollectionsKt.firstOrNull(listSortedWith);
            charset = pair2 != null ? (Charset) pair2.getFirst() : null;
            if (charset == null) {
                charset = Charsets.UTF_8;
            }
        }
        this.requestCharset = charset;
    }

    /* compiled from: HttpPlainText.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0005j\u0002`\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001aR$\u0010\u0003\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, m7105d2 = {"Lio/ktor/client/plugins/HttpPlainText$Config;", "", "()V", "charsetQuality", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "", "getCharsetQuality$ktor_client_core", "()Ljava/util/Map;", "charsets", "", "getCharsets$ktor_client_core", "()Ljava/util/Set;", "responseCharsetFallback", "getResponseCharsetFallback", "()Ljava/nio/charset/Charset;", "setResponseCharsetFallback", "(Ljava/nio/charset/Charset;)V", "sendCharset", "getSendCharset", "setSendCharset", "register", "", "charset", "quality", "(Ljava/nio/charset/Charset;Ljava/lang/Float;)V", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nHttpPlainText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainText$Config\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class Config {

        @Nullable
        public Charset sendCharset;

        @NotNull
        public final Set<Charset> charsets = new LinkedHashSet();

        @NotNull
        public final Map<Charset, Float> charsetQuality = new LinkedHashMap();

        @NotNull
        public Charset responseCharsetFallback = Charsets.UTF_8;

        @NotNull
        public final Set<Charset> getCharsets$ktor_client_core() {
            return this.charsets;
        }

        @NotNull
        public final Map<Charset, Float> getCharsetQuality$ktor_client_core() {
            return this.charsetQuality;
        }

        public static /* synthetic */ void register$default(Config config, Charset charset, Float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = null;
            }
            config.register(charset, f);
        }

        public final void register(@NotNull Charset charset, @Nullable Float quality) {
            Intrinsics.checkNotNullParameter(charset, "charset");
            if (quality != null) {
                double dFloatValue = quality.floatValue();
                if (0.0d > dFloatValue || dFloatValue > 1.0d) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            this.charsets.add(charset);
            if (quality == null) {
                this.charsetQuality.remove(charset);
            } else {
                this.charsetQuality.put(charset, quality);
            }
        }

        @Nullable
        public final Charset getSendCharset() {
            return this.sendCharset;
        }

        public final void setSendCharset(@Nullable Charset charset) {
            this.sendCharset = charset;
        }

        @NotNull
        public final Charset getResponseCharsetFallback() {
            return this.responseCharsetFallback;
        }

        public final void setResponseCharsetFallback(@NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(charset, "<set-?>");
            this.responseCharsetFallback = charset;
        }
    }

    /* compiled from: HttpPlainText.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/client/plugins/HttpPlainText$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpPlainText$Config;", "Lio/ktor/client/plugins/HttpPlainText;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.plugins.HttpPlainText$Plugin, reason: from kotlin metadata */
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, HttpPlainText> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<HttpPlainText> getKey() {
            return HttpPlainText.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public HttpPlainText prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpPlainText(config.getCharsets$ktor_client_core(), config.getCharsetQuality$ktor_client_core(), config.getSendCharset(), config.getResponseCharsetFallback());
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull HttpPlainText plugin, @NotNull HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getRender(), new HttpPlainText$Plugin$install$1(plugin, null));
            scope.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getTransform(), new HttpPlainText$Plugin$install$2(plugin, null));
        }
    }

    public final Object wrapContent(HttpRequestBuilder request, String content, ContentType requestContentType) {
        Charset charset;
        ContentType plain = requestContentType == null ? ContentType.Text.INSTANCE.getPlain() : requestContentType;
        if (requestContentType == null || (charset = ContentTypesKt.charset(requestContentType)) == null) {
            charset = this.requestCharset;
        }
        HttpPlainTextKt.LOGGER.trace("Sending request body to " + request.getUrl() + " as text/plain with charset " + charset);
        return new TextContent(content, ContentTypesKt.withCharset(plain, charset), null, 4, null);
    }

    @NotNull
    public final String read$ktor_client_core(@NotNull HttpClientCall call, @NotNull Input body) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(body, "body");
        Charset charset = HttpMessagePropertiesKt.charset(call.getResponse());
        if (charset == null) {
            charset = this.responseCharsetFallback;
        }
        HttpPlainTextKt.LOGGER.trace("Reading response body for " + call.getRequest().getUrl() + " as String with charset " + charset);
        return StringsKt.readText$default(body, charset, 0, 2, (Object) null);
    }

    public final void addCharsetHeaders$ktor_client_core(@NotNull HttpRequestBuilder context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HeadersBuilder headers = context.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (headers.get(httpHeaders.getAcceptCharset()) != null) {
            return;
        }
        HttpPlainTextKt.LOGGER.trace("Adding Accept-Charset=" + this.acceptCharsetHeader + " to " + context.getUrl());
        context.getHeaders().set(httpHeaders.getAcceptCharset(), this.acceptCharsetHeader);
    }
}
