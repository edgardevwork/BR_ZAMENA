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
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u001a\u001e\u0010\t\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u001a\u0010\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0002¨\u0006\u000b"}, m7105d2 = {"checkAllItemsInvisible", "", "", "Landroid/view/View;", "ifEmpty", "", "", "func", "Lkotlin/Function0;", "ifNotEmpty", "isHasDuplicates", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nListExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListExtension.kt\ncom/blackhub/bronline/game/core/extension/ListExtensionKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,37:1\n254#2:38\n*S KotlinDebug\n*F\n+ 1 ListExtension.kt\ncom/blackhub/bronline/game/core/extension/ListExtensionKt\n*L\n8#1:38\n*E\n"})
/* loaded from: classes2.dex */
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
