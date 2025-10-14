package com.blackhub.bronline.game.core.extension;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LongExtension.kt */
/* loaded from: classes2.dex */
public final class LongExtensionKt {
    public static final long getOrZero(@Nullable Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final boolean isIntegralNumber(@Nullable Long l) {
        Boolean boolValueOf;
        if (l != null) {
            boolValueOf = Boolean.valueOf(l.longValue() % ((long) 100) == 0);
        } else {
            boolValueOf = null;
        }
        return BooleanExtensionKt.getOrFalse(boolValueOf);
    }

    @NotNull
    public static final String parseTimeToStringWithFormat(long j) {
        long j2 = j / 1000;
        long j3 = 60;
        long j4 = j2 / j3;
        long j5 = j2 % j3;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}

