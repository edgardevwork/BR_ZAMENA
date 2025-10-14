package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutId.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0000\u001a\u00020\u0001H\u0007\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m7105d2 = {"layoutId", "", "Landroidx/compose/ui/layout/Measurable;", "getLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class LayoutIdKt {
    @Stable
    @NotNull
    public static final Modifier layoutId(@NotNull Modifier modifier, @NotNull Object obj) {
        return modifier.then(new LayoutIdElement(obj));
    }

    @Nullable
    public static final Object getLayoutId(@NotNull Measurable measurable) {
        Object parentData = measurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }
}
