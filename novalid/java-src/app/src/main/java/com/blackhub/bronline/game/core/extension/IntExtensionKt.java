package com.blackhub.bronline.game.core.extension;

import android.content.Context;
import androidx.compose.p003ui.text.intl.Locale;
import androidx.compose.p003ui.unit.C2046Dp;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntExtension.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010\u0015\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0002\u001a\n\u0010\u0018\u001a\u00020\u0011*\u00020\u0002\u001a\u0017\u0010\u0019\u001a\u00020\u001a*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u001b\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0017\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0017\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u001c"}, m7105d2 = {"isNegativeCommand", "", "", "(Ljava/lang/Integer;)Z", "isNotNegativeCommand", "isNotZero", "isOne", "isZero", "orOne", "getOrOne", "(Ljava/lang/Integer;)I", "orZero", "getOrZero", "dpToPx", "context", "Landroid/content/Context;", "formatDurationNoSecondsWithHoursWithLocale", "", "locale", "Landroidx/compose/ui/text/intl/Locale;", "formatDurationWithLocale", "formatDurationWithLocaleNoSecondsIfHoursMoreThanZero", "isEven", "parseTimeToStringHMS", "parseTimeToStringWithFormat", "pxToDp", "Landroidx/compose/ui/unit/Dp;", "(ILandroid/content/Context;)F", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nIntExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntExtension.kt\ncom/blackhub/bronline/game/core/extension/IntExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,153:1\n1#2:154\n154#3:155\n*S KotlinDebug\n*F\n+ 1 IntExtension.kt\ncom/blackhub/bronline/game/core/extension/IntExtensionKt\n*L\n145#1:155\n*E\n"})
/* loaded from: classes2.dex */
public final class IntExtensionKt {
    public static final boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static final int getOrZero(@Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int getOrOne(@Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final boolean isZero(@Nullable Integer num) {
        Boolean boolValueOf;
        if (num != null) {
            boolValueOf = Boolean.valueOf(num.intValue() == 0);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final boolean isOne(@Nullable Integer num) {
        Boolean boolValueOf;
        if (num != null) {
            boolValueOf = Boolean.valueOf(num.intValue() == 1);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final boolean isNotZero(@Nullable Integer num) {
        Boolean boolValueOf;
        if (num != null) {
            boolValueOf = Boolean.valueOf(num.intValue() != 0);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final boolean isNegativeCommand(@Nullable Integer num) {
        Boolean boolValueOf;
        if (num != null) {
            boolValueOf = Boolean.valueOf(num.intValue() == -1);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final boolean isNotNegativeCommand(@Nullable Integer num) {
        Boolean boolValueOf;
        if (num != null) {
            boolValueOf = Boolean.valueOf(num.intValue() != -1);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    @NotNull
    public static final String parseTimeToStringWithFormat(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String parseTimeToStringHMS(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String formatDurationWithLocale(int i, @NotNull Locale locale) {
        String str;
        Intrinsics.checkNotNullParameter(locale, "locale");
        long duration = DurationKt.toDuration(i, DurationUnit.SECONDS);
        long jM17041getInWholeHoursimpl = Duration.m17041getInWholeHoursimpl(duration);
        DurationUnit durationUnit = DurationUnit.HOURS;
        long jM17044getInWholeMinutesimpl = Duration.m17044getInWholeMinutesimpl(Duration.m17060minusLRDsOJo(duration, DurationKt.toDuration(jM17041getInWholeHoursimpl, durationUnit)));
        long jM17046getInWholeSecondsimpl = Duration.m17046getInWholeSecondsimpl(Duration.m17060minusLRDsOJo(Duration.m17060minusLRDsOJo(duration, DurationKt.toDuration(jM17041getInWholeHoursimpl, durationUnit)), DurationKt.toDuration(jM17044getInWholeMinutesimpl, DurationUnit.MINUTES)));
        List listListOf = Intrinsics.areEqual(locale.getLanguage(), "ru") ? CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" ч ", " мин ", " сек"}) : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" h ", " min ", " sec"});
        Long lValueOf = Long.valueOf(jM17041getInWholeHoursimpl);
        String str2 = null;
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue), CollectionsKt___CollectionsKt.getOrNull(listListOf, 0)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        Long lValueOf2 = Long.valueOf(jM17044getInWholeMinutesimpl);
        if (lValueOf2.longValue() <= 0) {
            lValueOf2 = null;
        }
        if (lValueOf2 != null) {
            long jLongValue2 = lValueOf2.longValue();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str2 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue2), CollectionsKt___CollectionsKt.getOrNull(listListOf, 1)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jM17046getInWholeSecondsimpl), CollectionsKt___CollectionsKt.getOrNull(listListOf, 2)}, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2, str3}), AnyExtensionKt.empty(stringCompanionObject3), null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String formatDurationWithLocaleNoSecondsIfHoursMoreThanZero(int i, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        long duration = DurationKt.toDuration(i, DurationUnit.SECONDS);
        long jM17040getInWholeDaysimpl = Duration.m17040getInWholeDaysimpl(duration);
        long jM17041getInWholeHoursimpl = Duration.m17041getInWholeHoursimpl(Duration.m17060minusLRDsOJo(duration, DurationKt.toDuration(jM17040getInWholeDaysimpl, DurationUnit.DAYS)));
        DurationUnit durationUnit = DurationUnit.HOURS;
        long jM17044getInWholeMinutesimpl = Duration.m17044getInWholeMinutesimpl(Duration.m17060minusLRDsOJo(duration, DurationKt.toDuration(jM17041getInWholeHoursimpl, durationUnit)));
        long jM17046getInWholeSecondsimpl = Duration.m17046getInWholeSecondsimpl(Duration.m17060minusLRDsOJo(Duration.m17060minusLRDsOJo(duration, DurationKt.toDuration(jM17041getInWholeHoursimpl, durationUnit)), DurationKt.toDuration(jM17044getInWholeMinutesimpl, DurationUnit.MINUTES)));
        List listListOf = Intrinsics.areEqual(locale.getLanguage(), "ru") ? CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" д. ", " ч. ", " м. ", " с."}) : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" d. ", " h. ", " m. ", " s."});
        if (jM17040getInWholeDaysimpl > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jM17040getInWholeDaysimpl), listListOf.get(0)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            String str2 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jM17041getInWholeHoursimpl), listListOf.get(1)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2}), AnyExtensionKt.empty(stringCompanionObject), null, null, 0, null, null, 62, null);
        }
        if (jM17041getInWholeHoursimpl > 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jM17041getInWholeHoursimpl), listListOf.get(1)}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            String str4 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jM17044getInWholeMinutesimpl), listListOf.get(2)}, 2));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{str3, str4}), AnyExtensionKt.empty(stringCompanionObject2), null, null, 0, null, null, 62, null);
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str5 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jM17044getInWholeMinutesimpl), listListOf.get(2)}, 2));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        String str6 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jM17046getInWholeSecondsimpl), listListOf.get(3)}, 2));
        Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{str5, str6}), AnyExtensionKt.empty(stringCompanionObject3), null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String formatDurationNoSecondsWithHoursWithLocale(int i, @NotNull Locale locale) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(locale, "locale");
        long duration = DurationKt.toDuration(i, DurationUnit.SECONDS);
        long jM17041getInWholeHoursimpl = Duration.m17041getInWholeHoursimpl(duration);
        DurationUnit durationUnit = DurationUnit.HOURS;
        long jM17044getInWholeMinutesimpl = Duration.m17044getInWholeMinutesimpl(Duration.m17060minusLRDsOJo(duration, DurationKt.toDuration(jM17041getInWholeHoursimpl, durationUnit)));
        long jM17046getInWholeSecondsimpl = Duration.m17046getInWholeSecondsimpl(Duration.m17060minusLRDsOJo(Duration.m17060minusLRDsOJo(duration, DurationKt.toDuration(jM17041getInWholeHoursimpl, durationUnit)), DurationKt.toDuration(jM17044getInWholeMinutesimpl, DurationUnit.MINUTES)));
        List listListOf = Intrinsics.areEqual(locale.getLanguage(), "ru") ? CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" ч ", " мин ", " сек"}) : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" h ", " min ", " sec"});
        Long lValueOf = Long.valueOf(jM17041getInWholeHoursimpl);
        String str3 = null;
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue), CollectionsKt___CollectionsKt.getOrNull(listListOf, 0)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        Long lValueOf2 = Long.valueOf(jM17044getInWholeMinutesimpl);
        if (lValueOf2.longValue() <= 0) {
            lValueOf2 = null;
        }
        if (lValueOf2 != null) {
            long jLongValue2 = lValueOf2.longValue();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str2 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue2), CollectionsKt___CollectionsKt.getOrNull(listListOf, 1)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        } else {
            str2 = null;
        }
        Long lValueOf3 = Long.valueOf(jM17046getInWholeSecondsimpl);
        if (jM17041getInWholeHoursimpl != 0) {
            lValueOf3 = null;
        }
        if (lValueOf3 != null) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            str3 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(jM17046getInWholeSecondsimpl), CollectionsKt___CollectionsKt.getOrNull(listListOf, 2)}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2, str3}), AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 0, null, null, 62, null);
    }

    public static final int dpToPx(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FloatExtensionKt.roundToIntSafely(i * context.getResources().getDisplayMetrics().density);
    }

    public static final float pxToDp(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C2046Dp.m13666constructorimpl(FloatExtensionKt.roundToIntSafely(i / context.getResources().getDisplayMetrics().density));
    }
}
