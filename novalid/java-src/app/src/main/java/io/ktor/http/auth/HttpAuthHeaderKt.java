package io.ktor.http.auth;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.CookieUtilsKt;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.parsing.ParseException;
import io.ktor.util.InternalAPI;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpAuthHeader.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a,\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a5\u0010\u0010\u001a\u0004\u0018\u00010\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0016\u001a\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\n\u001a&\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002\u001a\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0002H\u0002\u001a\f\u0010\u001c\u001a\u00020\u001b*\u00020\u0002H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002\u001a\u0014\u0010\u001f\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\f\u0010 \u001a\u00020\n*\u00020\nH\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m7105d2 = {"TOKEN68_EXTRA", "", "", "TOKEN_EXTRA", "escapeRegex", "Lkotlin/text/Regex;", "token68Pattern", "matchParameter", "", "headerValue", "", "startIndex", "parameters", "", "matchParameters", "matchToken68", "nextChallengeIndex", "headers", "", "Lio/ktor/http/auth/HttpAuthHeader;", "header", FirebaseAnalytics.Param.INDEX, "(Ljava/util/List;Lio/ktor/http/auth/HttpAuthHeader;ILjava/lang/String;)Ljava/lang/Integer;", "parseAuthorizationHeader", "parseAuthorizationHeaders", "", "isToken", "", "isToken68", "skipDelimiter", TtmlNode.RUBY_DELIMITER, "skipSpaces", "unescaped", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class HttpAuthHeaderKt {

    @NotNull
    public static final Set<Character> TOKEN68_EXTRA;

    @NotNull
    public static final Set<Character> TOKEN_EXTRA;

    @NotNull
    public static final Regex escapeRegex;

    @NotNull
    public static final Regex token68Pattern;

    static {
        Character chValueOf = Character.valueOf(PublicSuffixDatabase.EXCEPTION_MARKER);
        Character chValueOf2 = Character.valueOf(ExtendedMessageFormat.QUOTE);
        Character chValueOf3 = Character.valueOf(GMTDateParser.ANY);
        Character chValueOf4 = Character.valueOf(LauncherConstants.UNDERSCORE_CHAR);
        TOKEN_EXTRA = SetsKt__SetsKt.setOf((Object[]) new Character[]{chValueOf, '#', '$', '%', '&', chValueOf2, chValueOf3, '+', '-', '.', '^', chValueOf4, '`', '|', '~'});
        TOKEN68_EXTRA = SetsKt__SetsKt.setOf((Object[]) new Character[]{'-', '.', chValueOf4, '~', '+', '/'});
        token68Pattern = new Regex("[a-zA-Z0-9\\-._~+/]+=*");
        escapeRegex = new Regex("\\\\.");
    }

    @Nullable
    public static final HttpAuthHeader parseAuthorizationHeader(@NotNull String headerValue) {
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        int iSkipSpaces = skipSpaces(headerValue, 0);
        int i = iSkipSpaces;
        while (i < headerValue.length() && isToken(headerValue.charAt(i))) {
            i++;
        }
        String strSubstring = StringsKt__StringsKt.substring(headerValue, RangesKt___RangesKt.until(iSkipSpaces, i));
        int iSkipSpaces2 = skipSpaces(headerValue, i);
        if (StringsKt__StringsJVMKt.isBlank(strSubstring)) {
            return null;
        }
        if (headerValue.length() == iSkipSpaces2) {
            return new HttpAuthHeader.Parameterized(strSubstring, CollectionsKt__CollectionsKt.emptyList(), (HeaderValueEncoding) null, 4, (DefaultConstructorMarker) null);
        }
        int iMatchToken68 = matchToken68(headerValue, iSkipSpaces2);
        String string = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.substring(headerValue, RangesKt___RangesKt.until(iSkipSpaces2, iMatchToken68))).toString();
        if (string.length() > 0 && iMatchToken68 == headerValue.length()) {
            return new HttpAuthHeader.Single(strSubstring, string);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (matchParameters(headerValue, iSkipSpaces2, linkedHashMap) == -1) {
            return new HttpAuthHeader.Parameterized(strSubstring, linkedHashMap, (HeaderValueEncoding) null, 4, (DefaultConstructorMarker) null);
        }
        throw new ParseException("Function parseAuthorizationHeader can parse only one header", null, 2, null);
    }

    @InternalAPI
    @NotNull
    public static final List<HttpAuthHeader> parseAuthorizationHeaders(@NotNull String headerValue) {
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        ArrayList arrayList = new ArrayList();
        int authorizationHeader = 0;
        while (authorizationHeader != -1) {
            authorizationHeader = parseAuthorizationHeader(headerValue, authorizationHeader, arrayList);
        }
        return arrayList;
    }

    public static final int parseAuthorizationHeader(String str, int i, List<HttpAuthHeader> list) {
        Integer numNextChallengeIndex;
        int iSkipSpaces = skipSpaces(str, i);
        int i2 = iSkipSpaces;
        while (i2 < str.length() && isToken(str.charAt(i2))) {
            i2++;
        }
        String strSubstring = StringsKt__StringsKt.substring(str, RangesKt___RangesKt.until(iSkipSpaces, i2));
        if (StringsKt__StringsJVMKt.isBlank(strSubstring)) {
            throw new ParseException("Invalid authScheme value: it should be token, can't be blank", null, 2, null);
        }
        int iSkipSpaces2 = skipSpaces(str, i2);
        Integer numNextChallengeIndex2 = nextChallengeIndex(list, new HttpAuthHeader.Parameterized(strSubstring, CollectionsKt__CollectionsKt.emptyList(), (HeaderValueEncoding) null, 4, (DefaultConstructorMarker) null), iSkipSpaces2, str);
        if (numNextChallengeIndex2 != null) {
            return numNextChallengeIndex2.intValue();
        }
        int iMatchToken68 = matchToken68(str, iSkipSpaces2);
        String string = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.substring(str, RangesKt___RangesKt.until(iSkipSpaces2, iMatchToken68))).toString();
        if (string.length() > 0 && (numNextChallengeIndex = nextChallengeIndex(list, new HttpAuthHeader.Single(strSubstring, string), iMatchToken68, str)) != null) {
            return numNextChallengeIndex.intValue();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iMatchParameters = matchParameters(str, iSkipSpaces2, linkedHashMap);
        list.add(new HttpAuthHeader.Parameterized(strSubstring, linkedHashMap, (HeaderValueEncoding) null, 4, (DefaultConstructorMarker) null));
        return iMatchParameters;
    }

    public static final Integer nextChallengeIndex(List<HttpAuthHeader> list, HttpAuthHeader httpAuthHeader, int i, String str) {
        if (i != str.length() && str.charAt(i) != ',') {
            return null;
        }
        list.add(httpAuthHeader);
        if (i == str.length()) {
            return -1;
        }
        if (str.charAt(i) == ',') {
            return Integer.valueOf(i + 1);
        }
        throw new IllegalStateException("".toString());
    }

    public static final int matchParameters(String str, int i, Map<String, String> map) {
        while (i > 0 && i < str.length()) {
            int iMatchParameter = matchParameter(str, i, map);
            if (iMatchParameter == i) {
                return i;
            }
            i = skipDelimiter(str, iMatchParameter, ',');
        }
        return i;
    }

    public static final int matchParameter(String str, int i, Map<String, String> map) {
        int i2;
        int iSkipSpaces = skipSpaces(str, i);
        int i3 = iSkipSpaces;
        while (i3 < str.length() && isToken(str.charAt(i3))) {
            i3++;
        }
        String strSubstring = StringsKt__StringsKt.substring(str, RangesKt___RangesKt.until(iSkipSpaces, i3));
        int iSkipSpaces2 = skipSpaces(str, i3);
        if (iSkipSpaces2 == str.length() || str.charAt(iSkipSpaces2) != '=') {
            return i;
        }
        boolean z = true;
        int iSkipSpaces3 = skipSpaces(str, iSkipSpaces2 + 1);
        if (str.charAt(iSkipSpaces3) == '\"') {
            iSkipSpaces3++;
            i2 = iSkipSpaces3;
            boolean z2 = false;
            while (i2 < str.length() && (str.charAt(i2) != '\"' || z2)) {
                z2 = !z2 && str.charAt(i2) == '\\';
                i2++;
            }
            if (i2 == str.length()) {
                throw new ParseException("Expected closing quote'\"' in parameter", null, 2, null);
            }
        } else {
            i2 = iSkipSpaces3;
            while (i2 < str.length() && str.charAt(i2) != ' ' && str.charAt(i2) != ',') {
                i2++;
            }
            z = false;
        }
        String strSubstring2 = StringsKt__StringsKt.substring(str, RangesKt___RangesKt.until(iSkipSpaces3, i2));
        if (z) {
            strSubstring2 = unescaped(strSubstring2);
        }
        map.put(strSubstring, strSubstring2);
        return z ? i2 + 1 : i2;
    }

    public static final int matchToken68(String str, int i) {
        int iSkipSpaces = skipSpaces(str, i);
        while (iSkipSpaces < str.length() && isToken68(str.charAt(iSkipSpaces))) {
            iSkipSpaces++;
        }
        while (iSkipSpaces < str.length() && str.charAt(iSkipSpaces) == '=') {
            iSkipSpaces++;
        }
        return skipSpaces(str, iSkipSpaces);
    }

    public static final String unescaped(String str) {
        return escapeRegex.replace(str, new Function1<MatchResult, CharSequence>() { // from class: io.ktor.http.auth.HttpAuthHeaderKt.unescaped.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull MatchResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt___StringsKt.takeLast(it.getValue(), 1);
            }
        });
    }

    public static final int skipDelimiter(String str, int i, char c) {
        int iSkipSpaces = skipSpaces(str, i);
        if (iSkipSpaces == str.length()) {
            return -1;
        }
        if (str.charAt(iSkipSpaces) != c) {
            throw new ParseException("Expected delimiter " + c + " at position " + iSkipSpaces, null, 2, null);
        }
        return skipSpaces(str, iSkipSpaces + 1);
    }

    public static final int skipSpaces(String str, int i) {
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        return i;
    }

    public static final boolean isToken68(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[') || CookieUtilsKt.isDigit(c) || TOKEN68_EXTRA.contains(Character.valueOf(c));
    }

    public static final boolean isToken(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[') || CookieUtilsKt.isDigit(c) || TOKEN_EXTRA.contains(Character.valueOf(c));
    }
}
