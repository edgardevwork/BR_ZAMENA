package io.ktor.http;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.util.Base64Kt;
import io.ktor.util.TextKt;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Cookie.kt */
@Metadata(m7104d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082\b\u001a\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0082\b\u001a\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0082\b\u001a\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082\b\u001a\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0006\u001a\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0019\u001a\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0019\u001a\u0084\u0001\u0010\u001c\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u000f2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00152\b\b\u0002\u0010&\u001a\u00020\u000f\u001a\f\u0010'\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\f\u0010(\u001a\u00020\u000f*\u00020\u0004H\u0002\u001a\f\u0010)\u001a\u00020\u001e*\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m7105d2 = {"clientCookieHeaderPattern", "Lkotlin/text/Regex;", "cookieCharsShouldBeEscaped", "", "", "loweredPartNames", "", "cookiePart", "name", "value", "", "encoding", "Lio/ktor/http/CookieEncoding;", "cookiePartExt", "cookiePartFlag", "", "cookiePartUnencoded", "decodeCookieValue", "encodedValue", "encodeCookieValue", "parseClientCookiesHeader", "", "cookiesHeader", "skipEscaped", "parseServerSetCookieHeader", "Lio/ktor/http/Cookie;", "renderCookieHeader", "cookie", "renderSetCookieHeader", "maxAge", "", ClientCookie.EXPIRES_ATTR, "Lio/ktor/util/date/GMTDate;", ClientCookie.DOMAIN_ATTR, "path", ClientCookie.SECURE_ATTR, "httpOnly", "extensions", "includeEncoding", "assertCookieName", "shouldEscapeInCookies", "toIntClamping", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nio/ktor/http/CookieKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,228:1\n213#1:245\n217#1:246\n217#1:247\n213#1:248\n213#1:249\n221#1:250\n221#1:251\n225#1:255\n221#1:256\n213#1:257\n225#1:259\n221#1:260\n213#1:261\n221#1:271\n213#1:272\n223#2,2:229\n1238#2,4:234\n766#2:262\n857#2,2:263\n1#3:231\n457#4:232\n403#4:233\n467#4,7:238\n125#5:252\n152#5,2:253\n154#5:258\n1083#6,2:265\n1083#6,2:267\n1083#6,2:269\n*S KotlinDebug\n*F\n+ 1 Cookie.kt\nio/ktor/http/CookieKt\n*L\n152#1:245\n153#1:246\n154#1:247\n155#1:248\n156#1:249\n158#1:250\n159#1:251\n160#1:255\n160#1:256\n160#1:257\n161#1:259\n161#1:260\n161#1:261\n225#1:271\n225#1:272\n72#1:229,2\n74#1:234,4\n162#1:262\n162#1:263,2\n74#1:232\n74#1:233\n86#1:238,7\n160#1:252\n160#1:253,2\n160#1:258\n170#1:265,2\n182#1:267,2\n203#1:269,2\n*E\n"})
/* loaded from: classes5.dex */
public final class CookieKt {

    @NotNull
    public static final Set<String> loweredPartNames = SetsKt__SetsKt.setOf((Object[]) new String[]{"max-age", ClientCookie.EXPIRES_ATTR, ClientCookie.DOMAIN_ATTR, "path", ClientCookie.SECURE_ATTR, "httponly", "$x-enc"});

    @NotNull
    public static final Regex clientCookieHeaderPattern = new Regex("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    @NotNull
    public static final Set<Character> cookieCharsShouldBeEscaped = SetsKt__SetsKt.setOf((Object[]) new Character[]{';', ',', '\"'});

    /* compiled from: Cookie.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CookieEncoding.values().length];
            try {
                iArr[CookieEncoding.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CookieEncoding.DQUOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CookieEncoding.URI_ENCODING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Cookie parseServerSetCookieHeader(@NotNull String cookiesHeader) {
        CookieEncoding cookieEncodingValueOf;
        Intrinsics.checkNotNullParameter(cookiesHeader, "cookiesHeader");
        Map<String, String> clientCookiesHeader = parseClientCookiesHeader(cookiesHeader, false);
        Iterator<T> it = clientCookiesHeader.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!StringsKt__StringsJVMKt.startsWith$default((String) entry.getKey(), "$", false, 2, null)) {
                String str = clientCookiesHeader.get("$x-enc");
                if (str == null || (cookieEncodingValueOf = CookieEncoding.valueOf(str)) == null) {
                    cookieEncodingValueOf = CookieEncoding.RAW;
                }
                CookieEncoding cookieEncoding = cookieEncodingValueOf;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(clientCookiesHeader.size()));
                Iterator<T> it2 = clientCookiesHeader.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap.put(TextKt.toLowerCasePreservingASCIIRules((String) entry2.getKey()), entry2.getValue());
                }
                String str2 = (String) entry.getKey();
                String strDecodeCookieValue = decodeCookieValue((String) entry.getValue(), cookieEncoding);
                String str3 = (String) linkedHashMap.get("max-age");
                int intClamping = str3 != null ? toIntClamping(str3) : 0;
                String str4 = (String) linkedHashMap.get(ClientCookie.EXPIRES_ATTR);
                GMTDate gMTDateFromCookieToGmtDate = str4 != null ? DateUtilsKt.fromCookieToGmtDate(str4) : null;
                String str5 = (String) linkedHashMap.get(ClientCookie.DOMAIN_ATTR);
                String str6 = (String) linkedHashMap.get("path");
                boolean zContainsKey = linkedHashMap.containsKey(ClientCookie.SECURE_ATTR);
                boolean zContainsKey2 = linkedHashMap.containsKey("httponly");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry3 : clientCookiesHeader.entrySet()) {
                    String key = entry3.getKey();
                    if (!loweredPartNames.contains(TextKt.toLowerCasePreservingASCIIRules(key)) && !Intrinsics.areEqual(key, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new Cookie(str2, strDecodeCookieValue, cookieEncoding, intClamping, gMTDateFromCookieToGmtDate, str5, str6, zContainsKey, zContainsKey2, linkedHashMap2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ Map parseClientCookiesHeader$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return parseClientCookiesHeader(str, z);
    }

    /* compiled from: Cookie.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "Lkotlin/Pair;", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.http.CookieKt$parseClientCookiesHeader$1 */
    /* loaded from: classes6.dex */
    public static final class C103051 extends Lambda implements Function1<MatchResult, Pair<? extends String, ? extends String>> {
        public static final C103051 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Pair<String, String> invoke(@NotNull MatchResult it) {
            String value;
            String value2;
            Intrinsics.checkNotNullParameter(it, "it");
            MatchGroup matchGroup = it.getGroups().get(2);
            String str = "";
            if (matchGroup == null || (value = matchGroup.getValue()) == null) {
                value = "";
            }
            MatchGroup matchGroup2 = it.getGroups().get(4);
            if (matchGroup2 != null && (value2 = matchGroup2.getValue()) != null) {
                str = value2;
            }
            return TuplesKt.m7112to(value, str);
        }
    }

    @NotNull
    public static final Map<String, String> parseClientCookiesHeader(@NotNull String cookiesHeader, boolean z) {
        Intrinsics.checkNotNullParameter(cookiesHeader, "cookiesHeader");
        return MapsKt__MapsKt.toMap(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.map(Regex.findAll$default(clientCookieHeaderPattern, cookiesHeader, 0, 2, null), C103051.INSTANCE), new Function1<Pair<? extends String, ? extends String>, Boolean>() { // from class: io.ktor.http.CookieKt.parseClientCookiesHeader.2
            public final /* synthetic */ boolean $skipEscaped;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C103062(boolean z2) {
                super(1);
                z = z2;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
            @NotNull
            /* renamed from: invoke */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke2(@NotNull Pair<String, String> it) {
                boolean z2;
                Intrinsics.checkNotNullParameter(it, "it");
                if (z) {
                    z2 = StringsKt__StringsJVMKt.startsWith$default(it.getFirst(), "$", false, 2, null) ? false : true;
                }
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends String, ? extends String> pair) {
                return invoke2((Pair<String, String>) pair);
            }
        }), C103073.INSTANCE));
    }

    /* compiled from: Cookie.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.http.CookieKt$parseClientCookiesHeader$2 */
    /* loaded from: classes6.dex */
    public static final class C103062 extends Lambda implements Function1<Pair<? extends String, ? extends String>, Boolean> {
        public final /* synthetic */ boolean $skipEscaped;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103062(boolean z2) {
            super(1);
            z = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
        @NotNull
        /* renamed from: invoke */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke2(@NotNull Pair<String, String> it) {
            boolean z2;
            Intrinsics.checkNotNullParameter(it, "it");
            if (z) {
                z2 = StringsKt__StringsJVMKt.startsWith$default(it.getFirst(), "$", false, 2, null) ? false : true;
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends String, ? extends String> pair) {
            return invoke2((Pair<String, String>) pair);
        }
    }

    /* compiled from: Cookie.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "Lkotlin/Pair;", "", "cookie", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.http.CookieKt$parseClientCookiesHeader$3 */
    /* loaded from: classes6.dex */
    public static final class C103073 extends Lambda implements Function1<Pair<? extends String, ? extends String>, Pair<? extends String, ? extends String>> {
        public static final C103073 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends String, ? extends String> invoke(Pair<? extends String, ? extends String> pair) {
            return invoke2((Pair<String, String>) pair);
        }

        @NotNull
        /* renamed from: invoke */
        public final Pair<String, String> invoke2(@NotNull Pair<String, String> cookie) {
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            return (StringsKt__StringsJVMKt.startsWith$default(cookie.getSecond(), "\"", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(cookie.getSecond(), "\"", false, 2, null)) ? Pair.copy$default(cookie, null, StringsKt__StringsKt.removeSurrounding(cookie.getSecond(), (CharSequence) "\""), 1, null) : cookie;
        }
    }

    @NotNull
    public static final String renderSetCookieHeader(@NotNull Cookie cookie) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return renderSetCookieHeader$default(cookie.getName(), cookie.getValue(), cookie.getEncoding(), cookie.getMaxAgeInt(), cookie.getExpires(), cookie.getDomain(), cookie.getPath(), cookie.getSecure(), cookie.getHttpOnly(), cookie.getExtensions(), false, 1024, null);
    }

    @NotNull
    public static final String renderCookieHeader(@NotNull Cookie cookie) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return cookie.getName() + '=' + encodeCookieValue(cookie.getValue(), cookie.getEncoding());
    }

    public static /* synthetic */ String renderSetCookieHeader$default(String str, String str2, CookieEncoding cookieEncoding, int i, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map map, boolean z3, int i2, Object obj) {
        return renderSetCookieHeader(str, str2, (i2 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : gMTDate, (i2 & 32) != 0 ? null : str3, (i2 & 64) == 0 ? str4 : null, (i2 & 128) != 0 ? false : z, (i2 & 256) == 0 ? z2 : false, (i2 & 512) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i2 & 1024) != 0 ? true : z3);
    }

    @NotNull
    public static final String renderSetCookieHeader(@NotNull String name, @NotNull String value, @NotNull CookieEncoding encoding, int i, @Nullable GMTDate gMTDate, @Nullable String str, @Nullable String str2, boolean z, boolean z2, @NotNull Map<String, String> extensions, boolean z3) {
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        String str5 = assertCookieName(name) + '=' + encodeCookieValue(value.toString(), encoding);
        Integer numValueOf = i > 0 ? Integer.valueOf(i) : null;
        String str6 = "";
        String str7 = numValueOf != null ? "Max-Age=" + numValueOf : "";
        String httpDate = gMTDate != null ? DateUtilsKt.toHttpDate(gMTDate) : null;
        String str8 = httpDate == null ? "" : "Expires=" + ((Object) httpDate);
        CookieEncoding cookieEncoding = CookieEncoding.RAW;
        String str9 = str == null ? "" : "Domain=" + encodeCookieValue(str.toString(), cookieEncoding);
        String str10 = str2 == null ? "" : "Path=" + encodeCookieValue(str2.toString(), cookieEncoding);
        if (!z) {
            str3 = "";
        } else {
            str3 = "Secure";
        }
        if (!z2) {
            str4 = "";
        } else {
            str4 = "HttpOnly";
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str5, str7, str8, str9, str10, str3, str4});
        ArrayList arrayList = new ArrayList(extensions.size());
        for (Map.Entry<String, String> entry : extensions.entrySet()) {
            String strAssertCookieName = assertCookieName(entry.getKey());
            String value2 = entry.getValue();
            if (value2 != null) {
                strAssertCookieName = strAssertCookieName + '=' + encodeCookieValue(value2.toString(), CookieEncoding.RAW);
            }
            arrayList.add(strAssertCookieName);
        }
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
        if (z3) {
            String strName = encoding.name();
            str6 = strName == null ? "$x-enc" : "$x-enc=" + encodeCookieValue(strName.toString(), CookieEncoding.RAW);
        }
        List listPlus2 = CollectionsKt___CollectionsKt.plus((Collection<? extends String>) listPlus, str6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listPlus2) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "; ", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String encodeCookieValue(@NotNull String value, @NotNull CookieEncoding encoding) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        int i = WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        int i2 = 0;
        if (i == 1) {
            while (i2 < value.length()) {
                if (shouldEscapeInCookies(value.charAt(i2))) {
                    throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in RAW format.  Consider URL_ENCODING mode");
                }
                i2++;
            }
            return value;
        }
        if (i != 2) {
            if (i == 3) {
                return Base64Kt.encodeBase64(value);
            }
            if (i == 4) {
                return CodecsKt.encodeURLParameter(value, true);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) value, '\"', false, 2, (Object) null)) {
            throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
        }
        while (i2 < value.length()) {
            if (shouldEscapeInCookies(value.charAt(i2))) {
                return '\"' + value + '\"';
            }
            i2++;
        }
        return value;
    }

    @NotNull
    public static final String decodeCookieValue(@NotNull String encodedValue, @NotNull CookieEncoding encoding) {
        Intrinsics.checkNotNullParameter(encodedValue, "encodedValue");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        int i = WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i == 1 || i == 2) {
            return (StringsKt__StringsJVMKt.startsWith$default(StringsKt__StringsKt.trimStart((CharSequence) encodedValue).toString(), "\"", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(StringsKt__StringsKt.trimEnd((CharSequence) encodedValue).toString(), "\"", false, 2, null)) ? StringsKt__StringsKt.removeSurrounding(StringsKt__StringsKt.trim((CharSequence) encodedValue).toString(), (CharSequence) "\"") : encodedValue;
        }
        if (i == 3) {
            return Base64Kt.decodeBase64String(encodedValue);
        }
        if (i == 4) {
            return CodecsKt.decodeURLQueryComponent$default(encodedValue, 0, 0, true, null, 11, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean shouldEscapeInCookies(char c) {
        return CharsKt__CharJVMKt.isWhitespace(c) || Intrinsics.compare((int) c, 32) < 0 || cookieCharsShouldBeEscaped.contains(Character.valueOf(c));
    }

    public static final String cookiePart(String str, Object obj, CookieEncoding cookieEncoding) {
        if (obj == null) {
            return "";
        }
        return str + '=' + encodeCookieValue(obj.toString(), cookieEncoding);
    }

    public static final String cookiePartUnencoded(String str, Object obj) {
        if (obj == null) {
            return "";
        }
        return str + '=' + obj;
    }

    public static final String cookiePartFlag(String str, boolean z) {
        return z ? str : "";
    }

    public static final String cookiePartExt(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + '=' + encodeCookieValue(str2.toString(), CookieEncoding.RAW);
    }

    public static final int toIntClamping(String str) {
        return (int) RangesKt___RangesKt.coerceIn(Long.parseLong(str), 0L, ParserMinimalBase.MAX_INT_L);
    }

    public static final String assertCookieName(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (shouldEscapeInCookies(str.charAt(i))) {
                throw new IllegalArgumentException("Cookie name is not valid: " + str);
            }
        }
        return str;
    }
}
