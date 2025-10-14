package com.blackhub.bronline.game.core.extension;

import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ListExtension.kt */
@SourceDebugExtension({"SMAP\nListExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListExtension.kt\ncom/blackhub/bronline/game/core/extension/ListExtensionKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,37:1\n254#2:38\n*S KotlinDebug\n*F\n+ 1 ListExtension.kt\ncom/blackhub/bronline/game/core/extension/ListExtensionKt\n*L\n8#1:38\n*E\n"})

public final class ListExtensionKt {
    public static final boolean checkAllItemsInvisible(@NotNull List<? extends View> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getVisibility() == 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isHasDuplicates(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends Object> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.add(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final void ifNotEmpty(@NotNull List<? extends Object> list, @NotNull Function0<Unit> func) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        if (!list.isEmpty()) {
            func.invoke();
        }
    }

    public static final void ifEmpty(@NotNull List<? extends Object> list, @NotNull Function0<Unit> func) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        if (list.isEmpty()) {
            func.invoke();
        }
    }
}

