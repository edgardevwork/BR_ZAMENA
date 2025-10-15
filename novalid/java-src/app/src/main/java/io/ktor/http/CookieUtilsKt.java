package io.ktor.http;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.util.date.Month;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: CookieUtils.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\t\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\n\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0080\bø\u0001\u0000\u001a$\u0010\u000f\u001a\u00020\u0001*\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0080\bø\u0001\u0000\u001a$\u0010\u0013\u001a\u00020\u0001*\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0011H\u0080\bø\u0001\u0000\u001a0\u0010\u0015\u001a\u00020\u0001*\u00020\u00042\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\bø\u0001\u0000\u001a$\u0010\u0017\u001a\u00020\u0001*\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m7105d2 = {"handleToken", "", "Lio/ktor/http/CookieDateBuilder;", "token", "", "isDelimiter", "", "", "isDigit", "isNonDelimiter", "isNonDigit", "isOctet", "otherwise", "block", "Lkotlin/Function0;", "tryParseDayOfMonth", FirebaseAnalytics.Param.SUCCESS, "Lkotlin/Function1;", "", "tryParseMonth", "Lio/ktor/util/date/Month;", "tryParseTime", "Lkotlin/Function3;", "tryParseYear", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt\n+ 2 CookieUtils.kt\nio/ktor/http/StringLexer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n106#1,2:352\n106#1,2:355\n106#1,2:359\n106#1,2:362\n106#1,2:366\n106#1,2:371\n106#1,2:377\n115#1,3:380\n118#1:385\n106#1,2:386\n119#1,2:388\n122#1:391\n106#1,2:392\n124#1,2:394\n106#1,2:396\n126#1,4:398\n106#1,2:402\n131#1,2:404\n106#1,2:406\n133#1,9:408\n168#1,3:417\n171#1:422\n106#1,2:423\n172#1,2:425\n175#1,6:428\n149#1,12:434\n188#1,3:446\n191#1:451\n106#1,2:453\n192#1,2:455\n195#1,6:458\n56#2,2:350\n58#2:354\n56#2,2:357\n58#2:361\n56#2,2:364\n58#2:368\n56#2,2:369\n58#2:373\n56#2,2:374\n58#2:379\n56#2,2:383\n58#2:390\n56#2,2:420\n58#2:427\n56#2,2:449\n58#2:457\n1#3:376\n1#3:452\n*S KotlinDebug\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt\n*L\n118#1:352,2\n122#1:355,2\n125#1:359,2\n129#1:362,2\n132#1:366,2\n171#1:371,2\n191#1:377,2\n209#1:380,3\n209#1:385\n209#1:386,2\n209#1:388,2\n209#1:391\n209#1:392,2\n209#1:394,2\n209#1:396,2\n209#1:398,4\n209#1:402,2\n209#1:404,2\n209#1:406,2\n209#1:408,9\n220#1:417,3\n220#1:422\n220#1:423,2\n220#1:425,2\n220#1:428,6\n229#1:434,12\n238#1:446,3\n238#1:451\n238#1:453,2\n238#1:455,2\n238#1:458,6\n117#1:350,2\n117#1:354\n124#1:357,2\n124#1:361\n131#1:364,2\n131#1:368\n170#1:369,2\n170#1:373\n190#1:374,2\n190#1:379\n209#1:383,2\n209#1:390\n220#1:420,2\n220#1:427\n238#1:449,2\n238#1:457\n238#1:452\n*E\n"})
/* loaded from: classes5.dex */
public final class CookieUtilsKt {
    public static final boolean isDelimiter(char c) {
        return c == '\t' || (' ' <= c && c < '0') || ((';' <= c && c < 'A') || (('[' <= c && c < 'a') || ('{' <= c && c < 127)));
    }

    public static final boolean isDigit(char c) {
        return '0' <= c && c < ':';
    }

    public static final boolean isNonDelimiter(char c) {
        return (c >= 0 && c < '\t') || ('\n' <= c && c < ' ') || (('0' <= c && c < ':') || c == ':' || (('a' <= c && c < '{') || (('A' <= c && c < '[') || (127 <= c && c < 256))));
    }

    public static final boolean isNonDigit(char c) {
        return (c >= 0 && c < '0') || ('J' <= c && c < 256);
    }

    public static final boolean isOctet(char c) {
        return c >= 0 && c < 256;
    }

    public static final void otherwise(boolean z, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            return;
        }
        block.invoke();
    }

    public static final void tryParseTime(@NotNull String str, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Unit> success) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
            stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
            String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int i = Integer.parseInt(strSubstring);
            if (stringLexer.accept(C103101.INSTANCE)) {
                int index2 = stringLexer.getIndex();
                if (stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                    stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                    String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int i2 = Integer.parseInt(strSubstring2);
                    if (stringLexer.accept(C103113.INSTANCE)) {
                        int index3 = stringLexer.getIndex();
                        if (stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                            stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                            String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                            int i3 = Integer.parseInt(strSubstring3);
                            if (stringLexer.accept(C103125.INSTANCE)) {
                                stringLexer.acceptWhile(C103136.INSTANCE);
                            }
                            success.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                        }
                    }
                }
            }
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseTime$1\n*L\n1#1,349:1\n*E\n"})
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$1 */
    /* loaded from: classes6.dex */
    public static final class C103101 extends Lambda implements Function1<Character, Boolean> {
        public static final C103101 INSTANCE = new C103101();

        public C103101() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(char c) {
            return Boolean.valueOf(c == ':');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
            return invoke(ch.charValue());
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseTime$3\n*L\n1#1,349:1\n*E\n"})
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$3 */
    /* loaded from: classes6.dex */
    public static final class C103113 extends Lambda implements Function1<Character, Boolean> {
        public static final C103113 INSTANCE = new C103113();

        public C103113() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(char c) {
            return Boolean.valueOf(c == ':');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
            return invoke(ch.charValue());
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseTime$5\n*L\n1#1,349:1\n*E\n"})
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$5 */
    /* loaded from: classes6.dex */
    public static final class C103125 extends Lambda implements Function1<Character, Boolean> {
        public static final C103125 INSTANCE = new C103125();

        public C103125() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(char c) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
            return invoke(ch.charValue());
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseTime$6\n*L\n1#1,349:1\n*E\n"})
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$6 */
    /* loaded from: classes6.dex */
    public static final class C103136 extends Lambda implements Function1<Character, Boolean> {
        public static final C103136 INSTANCE = new C103136();

        public C103136() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(char c) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
            return invoke(ch.charValue());
        }
    }

    public static final void tryParseMonth(@NotNull String str, @NotNull Function1<? super Month, Unit> success) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(success, "success");
        if (str.length() < 3) {
            return;
        }
        for (Month month : Month.values()) {
            if (StringsKt__StringsJVMKt.startsWith(str, month.getValue(), true)) {
                success.invoke(month);
                return;
            }
        }
    }

    public static final void tryParseDayOfMonth(@NotNull String str, @NotNull Function1<? super Integer, Unit> success) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
            stringLexer.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
            String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int i = Integer.parseInt(strSubstring);
            if (stringLexer.accept(C103081.INSTANCE)) {
                stringLexer.acceptWhile(C103092.INSTANCE);
            }
            success.invoke(Integer.valueOf(i));
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseDayOfMonth$1\n*L\n1#1,349:1\n*E\n"})
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$1 */
    /* loaded from: classes6.dex */
    public static final class C103081 extends Lambda implements Function1<Character, Boolean> {
        public static final C103081 INSTANCE = new C103081();

        public C103081() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(char c) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
            return invoke(ch.charValue());
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseDayOfMonth$2\n*L\n1#1,349:1\n*E\n"})
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$2 */
    /* loaded from: classes6.dex */
    public static final class C103092 extends Lambda implements Function1<Character, Boolean> {
        public static final C103092 INSTANCE = new C103092();

        public C103092() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(char c) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
            return invoke(ch.charValue());
        }
    }

    public static final void tryParseYear(@NotNull String str, @NotNull Function1<? super Integer, Unit> success) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        for (int i = 0; i < 2; i++) {
            if (!stringLexer.accept(CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                return;
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            stringLexer.accept(CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
        }
        String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        int i3 = Integer.parseInt(strSubstring);
        if (stringLexer.accept(C103141.INSTANCE)) {
            stringLexer.acceptWhile(C103152.INSTANCE);
        }
        success.invoke(Integer.valueOf(i3));
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseYear$1\n*L\n1#1,349:1\n*E\n"})
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseYear$1 */
    /* loaded from: classes6.dex */
    public static final class C103141 extends Lambda implements Function1<Character, Boolean> {
        public static final C103141 INSTANCE = new C103141();

        public C103141() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(char c) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
            return invoke(ch.charValue());
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt$tryParseYear$2\n*L\n1#1,349:1\n*E\n"})
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseYear$2 */
    /* loaded from: classes6.dex */
    public static final class C103152 extends Lambda implements Function1<Character, Boolean> {
        public static final C103152 INSTANCE = new C103152();

        public C103152() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(char c) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
            return invoke(ch.charValue());
        }
    }

    public static final void handleToken(@NotNull CookieDateBuilder cookieDateBuilder, @NotNull String token) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(cookieDateBuilder, "<this>");
        Intrinsics.checkNotNullParameter(token, "token");
        if (cookieDateBuilder.getHours() == null || cookieDateBuilder.getMinutes() == null || cookieDateBuilder.getSeconds() == null) {
            StringLexer stringLexer = new StringLexer(token);
            int index = stringLexer.getIndex();
            if (stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
                stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
                String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                int i = Integer.parseInt(strSubstring);
                if (stringLexer.accept(C103101.INSTANCE)) {
                    int index2 = stringLexer.getIndex();
                    if (stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                        stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                        String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        int i2 = Integer.parseInt(strSubstring2);
                        if (stringLexer.accept(C103113.INSTANCE)) {
                            int index3 = stringLexer.getIndex();
                            if (stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                                stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                                String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                int i3 = Integer.parseInt(strSubstring3);
                                if (stringLexer.accept(C103125.INSTANCE)) {
                                    stringLexer.acceptWhile(C103136.INSTANCE);
                                }
                                cookieDateBuilder.setHours(Integer.valueOf(i));
                                cookieDateBuilder.setMinutes(Integer.valueOf(i2));
                                cookieDateBuilder.setSeconds(Integer.valueOf(i3));
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (cookieDateBuilder.getDayOfMonth() == null) {
            StringLexer stringLexer2 = new StringLexer(token);
            int index4 = stringLexer2.getIndex();
            if (stringLexer2.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
                stringLexer2.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
                String strSubstring4 = stringLexer2.getSource().substring(index4, stringLexer2.getIndex());
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                int i4 = Integer.parseInt(strSubstring4);
                if (stringLexer2.accept(C103081.INSTANCE)) {
                    stringLexer2.acceptWhile(C103092.INSTANCE);
                }
                cookieDateBuilder.setDayOfMonth(Integer.valueOf(i4));
                return;
            }
        }
        if (cookieDateBuilder.getMonth() == null && token.length() >= 3) {
            for (Month month : Month.values()) {
                if (StringsKt__StringsJVMKt.startsWith(token, month.getValue(), true)) {
                    cookieDateBuilder.setMonth(month);
                    return;
                }
            }
        }
        if (cookieDateBuilder.getYear() == null) {
            StringLexer stringLexer3 = new StringLexer(token);
            int index5 = stringLexer3.getIndex();
            for (int i5 = 0; i5 < 2; i5++) {
                if (!stringLexer3.accept(CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                    return;
                }
            }
            for (int i6 = 0; i6 < 2; i6++) {
                stringLexer3.accept(CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
            }
            String strSubstring5 = stringLexer3.getSource().substring(index5, stringLexer3.getIndex());
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            int i7 = Integer.parseInt(strSubstring5);
            if (stringLexer3.accept(C103141.INSTANCE)) {
                stringLexer3.acceptWhile(C103152.INSTANCE);
            }
            cookieDateBuilder.setYear(Integer.valueOf(i7));
        }
    }
}
