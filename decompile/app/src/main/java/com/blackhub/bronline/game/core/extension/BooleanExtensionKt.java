package com.blackhub.bronline.game.core.extension;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BooleanExtension.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000b\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002\"\u0017\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0002\"\u0017\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0002¨\u0006\r"}, m7105d2 = {"isTrue", "", "(Ljava/lang/Boolean;)Z", "orFalse", "getOrFalse", "orTrue", "getOrTrue", "ifFalse", "", "func", "Lkotlin/Function0;", "(Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;)V", "ifTrue", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
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
