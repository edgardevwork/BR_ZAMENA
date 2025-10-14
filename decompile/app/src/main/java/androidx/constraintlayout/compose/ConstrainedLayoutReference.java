package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConstraintLayoutBaseScope.kt */
@Stable
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\u0016¨\u0006\""}, m7105d2 = {"Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "", "id", "(Ljava/lang/Object;)V", "absoluteLeft", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getAbsoluteLeft$annotations", "()V", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "absoluteRight", "getAbsoluteRight$annotations", "getAbsoluteRight", "baseline", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "getBaseline$annotations", "getBaseline", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "bottom", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getBottom$annotations", "getBottom", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "end", "getEnd$annotations", "getEnd", "getId", "()Ljava/lang/Object;", TtmlNode.START, "getStart$annotations", "getStart", "top", "getTop$annotations", "getTop", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ConstrainedLayoutReference {

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;

    @NotNull
    public final ConstraintLayoutBaseScope.BaselineAnchor baseline;

    @NotNull
    public final ConstraintLayoutBaseScope.HorizontalAnchor bottom;

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor end;

    @NotNull
    public final Object id;

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor start;

    @NotNull
    public final ConstraintLayoutBaseScope.HorizontalAnchor top;

    @Stable
    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBaseline$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    public ConstrainedLayoutReference(@NotNull Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(id, -2);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(id, 0);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(id, 0);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(id, -1);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(id, 1);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(id, 1);
        this.baseline = new ConstraintLayoutBaseScope.BaselineAnchor(id);
    }

    @NotNull
    public final Object getId() {
        return this.id;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteRight() {
        return this.absoluteRight;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    @NotNull
    public final ConstraintLayoutBaseScope.BaselineAnchor getBaseline() {
        return this.baseline;
    }
}
