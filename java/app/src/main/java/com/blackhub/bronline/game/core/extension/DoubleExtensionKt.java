package com.blackhub.bronline.game.core.extension;

import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.google.android.material.timepicker.TimeModel;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt__MathJVMKt;
import org.apache.commons.lang3.text.FormattableUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DoubleExtension.kt */
@SourceDebugExtension({"SMAP\nDoubleExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleExtension.kt\ncom/blackhub/bronline/game/core/extension/DoubleExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: classes2.dex */
public final class DoubleExtensionKt {
    public static final double getOrZero(@Nullable Double d) {
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public static final boolean isZero(@Nullable Double d) {
        Boolean boolValueOf;
        if (d != null) {
            boolValueOf = Boolean.valueOf(d.doubleValue() == 0.0d);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static /* synthetic */ double roundOffDecimal$default(double d, String str, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.UP;
        }
        return roundOffDecimal(d, str, roundingMode);
    }

    public static final double roundOffDecimal(double d, @NotNull String pattern, @NotNull RoundingMode roundingMode) throws ParseException {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        decimalFormat.setRoundingMode(roundingMode);
        Number number = NumberFormat.getNumberInstance(Locale.getDefault()).parse(decimalFormat.format(d));
        return getOrZero(number != null ? Double.valueOf(number.doubleValue()) : null);
    }

    @NotNull
    public static final String dropZeros(@Nullable Double d) {
        if (d == null) {
            return "0";
        }
        if (Intrinsics.areEqual(d, (long) d.doubleValue())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf((long) d.doubleValue())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(FormattableUtils.SIMPLEST_FORMAT, Arrays.copyOf(new Object[]{d}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    public static final boolean isDecimal(@Nullable Double d) {
        Boolean boolValueOf;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            boolValueOf = Boolean.valueOf(dDoubleValue == ((double) ((long) dDoubleValue)));
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final boolean isInt(@Nullable Double d) {
        Boolean boolValueOf;
        if (d != null) {
            boolValueOf = Boolean.valueOf(d.doubleValue() % ((double) 1) == 0.0d);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final int roundToIntSafely(double d) {
        try {
            return MathKt__MathJVMKt.roundToInt(d);
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("Double.roundToIntSafely exception: " + e);
            return 0;
        }
    }
}

