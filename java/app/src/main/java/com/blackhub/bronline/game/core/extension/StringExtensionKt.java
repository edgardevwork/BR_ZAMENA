package com.blackhub.bronline.game.core.extension;

import android.text.Html;
import android.text.Spanned;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.text.AnnotatedString;
import com.blackhub.bronline.game.core.constants.FilePrefix;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.DateFormatter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringExtension.kt */
@SourceDebugExtension({"SMAP\nStringExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtension.kt\ncom/blackhub/bronline/game/core/extension/StringExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,246:1\n1#2:247\n470#3:248\n*S KotlinDebug\n*F\n+ 1 StringExtension.kt\ncom/blackhub/bronline/game/core/extension/StringExtensionKt\n*L\n222#1:248\n*E\n"})
/* loaded from: classes2.dex */
public final class StringExtensionKt {
    @NotNull
    public static final CharSequence getOrEmpty(@Nullable CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    @NotNull
    public static final String formattedUnit(@Nullable String str, @NotNull Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value + " " + ((Object) getOrEmpty(str));
    }

    public static final int toIntOrZero(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    public static final long toLongOrZero(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(str);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    public static final double toDoubleOrZero(@Nullable String str) {
        Double doubleOrNull;
        if (str == null || (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str)) == null) {
            return 0.0d;
        }
        return doubleOrNull.doubleValue();
    }

    public static final float toFloatOrZero(@Nullable String str) {
        Float floatOrNull;
        if (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) {
            return 0.0f;
        }
        return floatOrNull.floatValue();
    }

    @NotNull
    public static final String removeAllSpace(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("\\s").replace(str, "");
    }

    public static final long removeAllSpaceToLong(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(removeAllSpace(str));
    }

    public static final double removeAllSpaceToDouble(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(removeAllSpace(StringsKt__StringsJVMKt.replace$default(str, ",", ".", false, 4, (Object) null)));
    }

    @NotNull
    public static final String removeAfterFirstDot(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final String addCharAtIndex(@NotNull String str, char c, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            StringBuilder sb = new StringBuilder(str);
            sb.insert(i, c);
            str = sb.toString();
        } catch (IndexOutOfBoundsException unused) {
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public static final double toDoubleAmount(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (listSplit$default.size() == 2) {
            return toDoubleOrZero((String) listSplit$default.get(0)) + (toDoubleOrZero((String) listSplit$default.get(1)) / 100);
        }
        return toDoubleOrZero(str);
    }

    public static final DecimalFormat getBalanceFormatWithDot(boolean z) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormatSymbols.setDecimalSeparator('.');
        return getDecimalFormat(z, decimalFormatSymbols);
    }

    public static final DecimalFormat getBalanceFormatWithComma(boolean z) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormatSymbols.setDecimalSeparator(',');
        return getDecimalFormat(z, decimalFormatSymbols);
    }

    public static final DecimalFormat getDecimalFormat(boolean z, DecimalFormatSymbols decimalFormatSymbols) {
        if (z) {
            return new DecimalFormat("###,##0.00", decimalFormatSymbols);
        }
        return new DecimalFormat("###,###", decimalFormatSymbols);
    }

    public static final double toDoubleOrZeroIfEmpty(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return 0.0d;
        }
        return Double.parseDouble(str);
    }

    @NotNull
    public static final String toFilterKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "filter[" + str + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isValid(@Nullable String str) {
        Boolean boolValueOf;
        if (str == null) {
            boolValueOf = null;
        } else if (str.length() > 0) {
            boolean z = StringsKt__StringsJVMKt.isBlank(str) ^ true;
            boolValueOf = Boolean.valueOf(z);
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final boolean isNotValid(@Nullable String str) {
        return !isValid(str);
    }

    @NotNull
    public static final String capitalizeWords(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return CollectionsKt___CollectionsKt.joinToString$default(new Regex("\\s+").split(str, 0), " ", null, null, 0, null, C35341.INSTANCE, 30, null);
    }

    /* compiled from: StringExtension.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "word", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.StringExtensionKt$capitalizeWords$1 */
    public static final class C35341 extends Lambda implements Function1<String, CharSequence> {
        public static final C35341 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull String word) {
            String strValueOf;
            Intrinsics.checkNotNullParameter(word, "word");
            if (word.length() <= 0) {
                return word;
            }
            StringBuilder sb = new StringBuilder();
            char cCharAt = word.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                strValueOf = CharsKt__CharJVMKt.titlecase(cCharAt, locale);
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb.append((Object) strValueOf);
            String strSubstring = word.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb.append(strSubstring);
            return sb.toString();
        }
    }

    @NotNull
    public static final String toFormatNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return new Regex("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})").replace(str, "+$1 $2 $3 $4 $5");
        } catch (RuntimeException unused) {
            return AnyExtensionKt.empty(str);
        }
    }

    public static final boolean validateEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,64}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile.matcher(str).matches() && StringsKt__StringsKt.substringAfter$default(str, "@", (String) null, 2, (Object) null).length() <= 255;
    }

    public static final boolean validateNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern patternCompile = Pattern.compile("[a-zA-Z0-9\\+\\!\\#\\.\\,\\_\\%\\-\\$\\€\\^\\+\\&\\*\\(\\)\\~\\?\\:\\;\\/\\']{1,50}+");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile.matcher(str).matches();
    }

    public static final long parseDateToLongWithPattern(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return LongExtensionKt.getOrZero(DateFormatter.INSTANCE.parseToLong(str, DateFormatter.DD_MM_YYYY));
    }

    @NotNull
    public static final String splitLinkForYouTubeVideoId(@Nullable String str) {
        String strEmpty;
        if (str != null) {
            if (str.length() > 0 && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) URLEncodedUtils.NAME_VALUE_SEPARATOR, false, 2, (Object) null)) {
                strEmpty = (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{URLEncodedUtils.NAME_VALUE_SEPARATOR}, false, 0, 6, (Object) null).get(1);
            } else {
                strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            if (strEmpty != null) {
                return strEmpty;
            }
        }
        return AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
    }

    @NotNull
    public static final String formatMoneyDropZeros(long j) {
        String str = getBalanceFormatWithDot(!DoubleExtensionKt.isDecimal(Double.valueOf(r2))).format(j / 100);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ String formatMoneyAmount$default(long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return formatMoneyAmount(j, z, z2);
    }

    @NotNull
    public static final String formatMoneyAmount(long j, boolean z, boolean z2) {
        String str = getBalanceFormatWithDot(z).format(j / (z2 ? 100 : 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ String formatMoneyAmount$default(float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return formatMoneyAmount(f, z, z2);
    }

    @NotNull
    public static final String formatMoneyAmount(float f, boolean z, boolean z2) {
        String str = getBalanceFormatWithDot(z).format(Float.valueOf(f / (z2 ? 100 : 1)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String formatMoneyAmount(float f) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%,.0f ₽", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final Spanned htmlStringToSpanned(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        Intrinsics.checkNotNull(spannedFromHtml);
        return spannedFromHtml;
    }

    @NotNull
    public static final AnnotatedString htmlTextToAnnotatedString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return ComposeExtensionKt.toAnnotatedString(htmlStringToSpanned(str));
    }

    /* renamed from: tryToColorInt-0Yiz4hI$default */
    public static /* synthetic */ long m14414tryToColorInt0Yiz4hI$default(String str, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            color = null;
        }
        return m14413tryToColorInt0Yiz4hI(str, color);
    }

    public static /* synthetic */ ImageTypePathInCDNEnum getImageTypePathInCDN$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return getImageTypePathInCDN(str, i, i2);
    }

    @NotNull
    public static final ImageTypePathInCDNEnum getImageTypePathInCDN(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt__StringsJVMKt.startsWith$default(str, FilePrefix.IC_PREFIX, false, 2, null)) {
            return ImageTypePathInCDNEnum.ICON;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(str, FilePrefix.BG_PREFIX, false, 2, null)) {
            return ImageTypePathInCDNEnum.BACKGROUND;
        }
        if (i == 5) {
            return ImageTypePathInCDNEnum.VEHICLE;
        }
        if (i != 11) {
            return ImageTypePathInCDNEnum.IMAGE;
        }
        if (i2 == 134) {
            return ImageTypePathInCDNEnum.SKIN;
        }
        return ImageTypePathInCDNEnum.ACCESSORY;
    }

    /* renamed from: tryToColorInt-0Yiz4hI */
    public static final long m14413tryToColorInt0Yiz4hI(@NotNull String tryToColorInt, @Nullable Color color) {
        Intrinsics.checkNotNullParameter(tryToColorInt, "$this$tryToColorInt");
        try {
            return ColorKt.Color(android.graphics.Color.parseColor(tryToColorInt));
        } catch (Exception unused) {
            return color != null ? color.m11350unboximpl() : Color.INSTANCE.m11377getWhite0d7_KjU();
        }
    }
}

