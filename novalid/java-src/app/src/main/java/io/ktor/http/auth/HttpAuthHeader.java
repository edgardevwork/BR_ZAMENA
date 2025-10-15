package io.ktor.http.auth;

import io.ktor.http.CodecsKt;
import io.ktor.http.HeaderValueParam;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.parsing.ParseException;
import io.ktor.util.CryptoKt;
import io.ktor.util.Hash;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpAuthHeader.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0004\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m7105d2 = {"Lio/ktor/http/auth/HttpAuthHeader;", "", "authScheme", "", "(Ljava/lang/String;)V", "getAuthScheme", "()Ljava/lang/String;", "render", "encoding", "Lio/ktor/http/auth/HeaderValueEncoding;", "toString", "Companion", "Parameterized", "Parameters", "Single", "Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader$Single;", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public abstract class HttpAuthHeader {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final String authScheme;

    /* compiled from: HttpAuthHeader.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameters;", "", "()V", "Charset", "", "OAuthCallback", "OAuthCallbackConfirmed", "OAuthConsumerKey", "OAuthNonce", "OAuthSignature", "OAuthSignatureMethod", "OAuthTimestamp", "OAuthToken", "OAuthTokenSecret", "OAuthVerifier", "OAuthVersion", "Realm", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Parameters {

        @NotNull
        public static final String Charset = "charset";

        @NotNull
        public static final Parameters INSTANCE = new Parameters();

        @NotNull
        public static final String OAuthCallback = "oauth_callback";

        @NotNull
        public static final String OAuthCallbackConfirmed = "oauth_callback_confirmed";

        @NotNull
        public static final String OAuthConsumerKey = "oauth_consumer_key";

        @NotNull
        public static final String OAuthNonce = "oauth_nonce";

        @NotNull
        public static final String OAuthSignature = "oauth_signature";

        @NotNull
        public static final String OAuthSignatureMethod = "oauth_signature_method";

        @NotNull
        public static final String OAuthTimestamp = "oauth_timestamp";

        @NotNull
        public static final String OAuthToken = "oauth_token";

        @NotNull
        public static final String OAuthTokenSecret = "oauth_token_secret";

        @NotNull
        public static final String OAuthVerifier = "oauth_verifier";

        @NotNull
        public static final String OAuthVersion = "oauth_version";

        @NotNull
        public static final String Realm = "realm";
    }

    public /* synthetic */ HttpAuthHeader(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public abstract String render();

    @NotNull
    public abstract String render(@NotNull HeaderValueEncoding encoding);

    public HttpAuthHeader(String str) {
        this.authScheme = str;
        if (HttpAuthHeaderKt.token68Pattern.matches(str)) {
            return;
        }
        throw new ParseException("Invalid authScheme value: it should be token, but instead it is " + str, null, 2, null);
    }

    @NotNull
    public final String getAuthScheme() {
        return this.authScheme;
    }

    /* compiled from: HttpAuthHeader.kt */
    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m7105d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Single;", "Lio/ktor/http/auth/HttpAuthHeader;", "authScheme", "", "blob", "(Ljava/lang/String;Ljava/lang/String;)V", "getBlob", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "render", "encoding", "Lio/ktor/http/auth/HeaderValueEncoding;", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class Single extends HttpAuthHeader {

        @NotNull
        public final String blob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Single(@NotNull String authScheme, @NotNull String blob) {
            super(authScheme, null);
            Intrinsics.checkNotNullParameter(authScheme, "authScheme");
            Intrinsics.checkNotNullParameter(blob, "blob");
            this.blob = blob;
            if (!HttpAuthHeaderKt.token68Pattern.matches(blob)) {
                throw new ParseException("Invalid blob value: it should be token68", null, 2, null);
            }
        }

        @NotNull
        public final String getBlob() {
            return this.blob;
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        @NotNull
        public String render() {
            return getAuthScheme() + ' ' + this.blob;
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        @NotNull
        public String render(@NotNull HeaderValueEncoding encoding) {
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            return render();
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof Single)) {
                return false;
            }
            Single single = (Single) other;
            return StringsKt__StringsJVMKt.equals(single.getAuthScheme(), getAuthScheme(), true) && StringsKt__StringsJVMKt.equals(single.blob, this.blob, true);
        }

        public int hashCode() {
            Hash hash = Hash.INSTANCE;
            String authScheme = getAuthScheme();
            Locale locale = Locale.ROOT;
            String lowerCase = authScheme.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = this.blob.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return hash.combine(lowerCase, lowerCase2);
        }
    }

    /* compiled from: HttpAuthHeader.kt */
    @Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J\u0014\u0010\u001c\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m7105d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader;", "authScheme", "", "parameters", "", "encoding", "Lio/ktor/http/auth/HeaderValueEncoding;", "(Ljava/lang/String;Ljava/util/Map;Lio/ktor/http/auth/HeaderValueEncoding;)V", "", "Lio/ktor/http/HeaderValueParam;", "(Ljava/lang/String;Ljava/util/List;Lio/ktor/http/auth/HeaderValueEncoding;)V", "getEncoding", "()Lio/ktor/http/auth/HeaderValueEncoding;", "getParameters", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "parameter", "name", "render", "withParameter", "value", "withReplacedParameter", "encode", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nHttpAuthHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpAuthHeader.kt\nio/ktor/http/auth/HttpAuthHeader$Parameterized\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1855#2,2:464\n1549#2:466\n1620#2,3:467\n350#2,7:470\n1603#2,9:477\n1855#2:486\n1856#2:488\n1612#2:489\n288#2,2:490\n1#3:487\n*S KotlinDebug\n*F\n+ 1 HttpAuthHeader.kt\nio/ktor/http/auth/HttpAuthHeader$Parameterized\n*L\n278#1:464,2\n275#1:466\n275#1:467,3\n298#1:470,7\n302#1:477,9\n302#1:486\n302#1:488\n302#1:489\n325#1:490,2\n302#1:487\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Parameterized extends HttpAuthHeader {

        @NotNull
        public final HeaderValueEncoding encoding;

        @NotNull
        public final List<HeaderValueParam> parameters;

        /* compiled from: HttpAuthHeader.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HeaderValueEncoding.values().length];
                try {
                    iArr[HeaderValueEncoding.QUOTED_WHEN_REQUIRED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HeaderValueEncoding.QUOTED_ALWAYS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HeaderValueEncoding.URI_ENCODE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @NotNull
        public final List<HeaderValueParam> getParameters() {
            return this.parameters;
        }

        public /* synthetic */ Parameterized(String str, List list, HeaderValueEncoding headerValueEncoding, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (List<HeaderValueParam>) list, (i & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        @NotNull
        public final HeaderValueEncoding getEncoding() {
            return this.encoding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parameterized(@NotNull String authScheme, @NotNull List<HeaderValueParam> parameters, @NotNull HeaderValueEncoding encoding) {
            super(authScheme, null);
            Intrinsics.checkNotNullParameter(authScheme, "authScheme");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            this.parameters = parameters;
            this.encoding = encoding;
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (!HttpAuthHeaderKt.token68Pattern.matches(((HeaderValueParam) it.next()).getName())) {
                    throw new ParseException("Parameter name should be a token", null, 2, null);
                }
            }
        }

        public /* synthetic */ Parameterized(String str, Map map, HeaderValueEncoding headerValueEncoding, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (Map<String, String>) map, (i & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        public Parameterized(@NotNull String authScheme, @NotNull Map<String, String> parameters, @NotNull HeaderValueEncoding encoding) {
            Intrinsics.checkNotNullParameter(authScheme, "authScheme");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            Set<Map.Entry<String, String>> setEntrySet = parameters.entrySet();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new HeaderValueParam((String) entry.getKey(), (String) entry.getValue()));
            }
            this(authScheme, arrayList, encoding);
        }

        @NotNull
        public final Parameterized withParameter(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Parameterized(getAuthScheme(), (List<HeaderValueParam>) CollectionsKt___CollectionsKt.plus((Collection<? extends HeaderValueParam>) this.parameters, new HeaderValueParam(name, value)), this.encoding);
        }

        @NotNull
        public final Parameterized withReplacedParameter(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<HeaderValueParam> it = this.parameters.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().getName(), name)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return withParameter(name, value);
            }
            List<HeaderValueParam> list = this.parameters;
            ArrayList arrayList = new ArrayList();
            for (HeaderValueParam headerValueParam : list) {
                if (Intrinsics.areEqual(headerValueParam.getName(), name)) {
                    if (z) {
                        headerValueParam = null;
                    } else {
                        headerValueParam = new HeaderValueParam(name, value);
                        z = true;
                    }
                }
                if (headerValueParam != null) {
                    arrayList.add(headerValueParam);
                }
            }
            return new Parameterized(getAuthScheme(), arrayList, this.encoding);
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        @NotNull
        public String render(@NotNull final HeaderValueEncoding encoding) {
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            if (this.parameters.isEmpty()) {
                return getAuthScheme();
            }
            return CollectionsKt___CollectionsKt.joinToString$default(this.parameters, ", ", getAuthScheme() + ' ', null, 0, null, new Function1<HeaderValueParam, CharSequence>() { // from class: io.ktor.http.auth.HttpAuthHeader$Parameterized$render$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull HeaderValueParam it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getName() + '=' + this.this$0.encode(it.getValue(), encoding);
                }
            }, 28, null);
        }

        @Nullable
        public final String parameter(@NotNull String name) {
            Object next;
            Intrinsics.checkNotNullParameter(name, "name");
            Iterator<T> it = this.parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((HeaderValueParam) next).getName(), name)) {
                    break;
                }
            }
            HeaderValueParam headerValueParam = (HeaderValueParam) next;
            if (headerValueParam != null) {
                return headerValueParam.getValue();
            }
            return null;
        }

        public final String encode(String str, HeaderValueEncoding headerValueEncoding) {
            int i = WhenMappings.$EnumSwitchMapping$0[headerValueEncoding.ordinal()];
            if (i == 1) {
                return HeaderValueWithParametersKt.escapeIfNeeded(str);
            }
            if (i == 2) {
                return HeaderValueWithParametersKt.quote(str);
            }
            if (i == 3) {
                return CodecsKt.encodeURLParameter$default(str, false, 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        @NotNull
        public String render() {
            return render(this.encoding);
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof Parameterized)) {
                return false;
            }
            Parameterized parameterized = (Parameterized) other;
            return StringsKt__StringsJVMKt.equals(parameterized.getAuthScheme(), getAuthScheme(), true) && Intrinsics.areEqual(parameterized.parameters, this.parameters);
        }

        public int hashCode() {
            Hash hash = Hash.INSTANCE;
            String lowerCase = getAuthScheme().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return hash.combine(lowerCase, this.parameters);
        }
    }

    @NotNull
    public String toString() {
        return render();
    }

    /* compiled from: HttpAuthHeader.kt */
    @Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006JO\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m7105d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Companion;", "", "()V", "basicAuthChallenge", "Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", Parameters.Realm, "", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "bearerAuthChallenge", "Lio/ktor/http/auth/HttpAuthHeader;", "scheme", "digestAuthChallenge", "nonce", ClientCookie.DOMAIN_ATTR, "", "opaque", "stale", "", "algorithm", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Parameterized basicAuthChallenge(@NotNull String str, @Nullable Charset charset) {
            Intrinsics.checkNotNullParameter(str, "realm");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Parameters.Realm, str);
            if (charset != null) {
                linkedHashMap.put("charset", CharsetJVMKt.getName(charset));
            }
            return new Parameterized("Basic", linkedHashMap, (HeaderValueEncoding) null, 4, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ HttpAuthHeader bearerAuthChallenge$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.bearerAuthChallenge(str, str2);
        }

        @NotNull
        public final HttpAuthHeader bearerAuthChallenge(@NotNull String scheme, @Nullable String str) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            return new Parameterized(scheme, str == null ? MapsKt__MapsKt.emptyMap() : MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(Parameters.Realm, str)), (HeaderValueEncoding) null, 4, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Parameterized digestAuthChallenge$default(Companion companion, String str, String str2, List list, String str3, Boolean bool, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = CryptoKt.generateNonce();
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            List list2 = list;
            String str6 = (i & 8) != 0 ? null : str3;
            Boolean bool2 = (i & 16) != 0 ? null : bool;
            if ((i & 32) != 0) {
                str4 = "MD5";
            }
            return companion.digestAuthChallenge(str, str5, list2, str6, bool2, str4);
        }

        @NotNull
        public final Parameterized digestAuthChallenge(@NotNull String str, @NotNull String nonce, @NotNull List<String> list, @Nullable String opaque, @Nullable Boolean stale, @NotNull String algorithm) {
            Intrinsics.checkNotNullParameter(str, "realm");
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(list, "domain");
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Parameters.Realm, str);
            linkedHashMap.put("nonce", nonce);
            if (!list.isEmpty()) {
                linkedHashMap.put(ClientCookie.DOMAIN_ATTR, CollectionsKt___CollectionsKt.joinToString$default(list, " ", null, null, 0, null, null, 62, null));
            }
            if (opaque != null) {
                linkedHashMap.put("opaque", opaque);
            }
            if (stale != null) {
                linkedHashMap.put("stale", stale.toString());
            }
            linkedHashMap.put("algorithm", algorithm);
            return new Parameterized("Digest", linkedHashMap, HeaderValueEncoding.QUOTED_ALWAYS);
        }
    }
}
