package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConstraintLayoutBaseScope.kt */
@Stable
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u000f"}, m7105d2 = {"Landroidx/constraintlayout/compose/VerticalChainReference;", "", "id", "(Ljava/lang/Object;)V", "bottom", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getBottom$annotations", "()V", "getBottom", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getId$compose_release", "()Ljava/lang/Object;", "top", "getTop$annotations", "getTop", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class VerticalChainReference {

    @NotNull
    public final ConstraintLayoutBaseScope.HorizontalAnchor bottom;

    @NotNull
    public final Object id;

    @NotNull
    public final ConstraintLayoutBaseScope.HorizontalAnchor top;

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    public VerticalChainReference(@NotNull Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(id, 0);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(id, 1);
    }

    @NotNull
    /* renamed from: getId$compose_release, reason: from getter */
    public final Object getId() {
        return this.id;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }
}
