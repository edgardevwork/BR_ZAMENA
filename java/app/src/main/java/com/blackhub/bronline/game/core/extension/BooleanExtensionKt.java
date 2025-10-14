package com.blackhub.bronline.game.core.extension;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BooleanExtension.kt */
/* loaded from: classes2.dex */
public final class BooleanExtensionKt {
    public static final boolean getOrFalse(@Nullable Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean getOrTrue(@Nullable Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean isTrue(@Nullable Boolean bool) {
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public static final void ifTrue(@Nullable Boolean bool, @NotNull Function0<Unit> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            func.invoke();
        }
    }

    public static final void ifFalse(@Nullable Boolean bool, @NotNull Function0<Unit> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            func.invoke();
        }
    }
}

