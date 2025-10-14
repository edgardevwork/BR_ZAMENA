package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointerEvent.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H&J*\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0006R\u0017\u0010\u0014\u001a\u00020\u00158Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m7105d2 = {"Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "()V", "interceptOutOfBoundsChildEvents", "", "getInterceptOutOfBoundsChildEvents", "()Z", "isAttached", "isAttached$ui_release", "setAttached$ui_release", "(Z)V", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates$ui_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates$ui_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "shareWithSiblings", "getShareWithSiblings$annotations", "getShareWithSiblings", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "onCancel", "", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;

    @Nullable
    private LayoutCoordinates layoutCoordinates;

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY */
    public abstract void mo12508onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds);

    @Nullable
    /* renamed from: getLayoutCoordinates$ui_release, reason: from getter */
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final void setLayoutCoordinates$ui_release(@Nullable LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    /* renamed from: getSize-YbymL2g */
    public final long m12507getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo12617getSizeYbymL2g() : IntSize.INSTANCE.m13841getZeroYbymL2g();
    }

    /* renamed from: isAttached$ui_release, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public final void setAttached$ui_release(boolean z) {
        this.isAttached = z;
    }
}
