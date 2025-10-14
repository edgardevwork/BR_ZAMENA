package com.blackhub.bronline.game.core.extension;

import android.content.Context;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FloatExtension.kt */
@SourceDebugExtension({"SMAP\nFloatExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatExtension.kt\ncom/blackhub/bronline/game/core/extension/FloatExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/* loaded from: classes2.dex */
public final class FloatExtensionKt {
    public static final float getOrZero(@Nullable Float f) {
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public static final float getOrOne(@Nullable Float f) {
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public static final boolean isZero(@Nullable Float f) {
        Boolean boolValueOf;
        if (f != null) {
            boolValueOf = Boolean.valueOf(f.floatValue() == 0.0f);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final boolean isOne(@Nullable Float f) {
        Boolean boolValueOf;
        if (f != null) {
            boolValueOf = Boolean.valueOf(f.floatValue() == 1.0f);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    public static final int dpToPx(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return roundToIntSafely(f * context.getResources().getDisplayMetrics().density);
    }

    public static final int roundToIntSafely(float f) {
        try {
            return MathKt__MathJVMKt.roundToInt(f);
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("Float.roundToIntSafely exception: " + e);
            return 0;
        }
    }
}

