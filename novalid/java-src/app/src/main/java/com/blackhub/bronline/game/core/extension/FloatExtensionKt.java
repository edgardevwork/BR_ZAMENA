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
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\f\u001a\u00020\r\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0002\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0017\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0017\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000f"}, m7105d2 = {"isOne", "", "", "(Ljava/lang/Float;)Z", "isZero", "orOne", "getOrOne", "(Ljava/lang/Float;)F", "orZero", "getOrZero", "dpToPx", "", "context", "Landroid/content/Context;", "roundToIntSafely", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
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
