package androidx.compose.p003ui.window;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Popup.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "alignment", "Landroidx/compose/ui/Alignment;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getOffset-nOcc-ac", "()J", "J", "calculatePosition", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,89:1\n92#2:90\n86#2:91\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n73#1:90\n83#1:91\n*E\n"})
/* loaded from: classes4.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @NotNull
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j);
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j) {
        this.alignment = alignment;
        this.offset = j;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.p003ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo8548calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.INSTANCE;
        long jMo10976alignKFBX0sM = alignment.mo10976alignKFBX0sM(companion.m13841getZeroYbymL2g(), anchorBounds.m13820getSizeYbymL2g(), layoutDirection);
        long jMo10976alignKFBX0sM2 = this.alignment.mo10976alignKFBX0sM(companion.m13841getZeroYbymL2g(), popupContentSize, layoutDirection);
        long jIntOffset = IntOffsetKt.IntOffset(-IntOffset.m13794getXimpl(jMo10976alignKFBX0sM2), -IntOffset.m13795getYimpl(jMo10976alignKFBX0sM2));
        long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), IntOffset.m13795getYimpl(this.offset));
        long jM13822getTopLeftnOccac = anchorBounds.m13822getTopLeftnOccac();
        long jIntOffset3 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM13822getTopLeftnOccac) + IntOffset.m13794getXimpl(jMo10976alignKFBX0sM), IntOffset.m13795getYimpl(jM13822getTopLeftnOccac) + IntOffset.m13795getYimpl(jMo10976alignKFBX0sM));
        long jIntOffset4 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset3) + IntOffset.m13794getXimpl(jIntOffset), IntOffset.m13795getYimpl(jIntOffset3) + IntOffset.m13795getYimpl(jIntOffset));
        return IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset4) + IntOffset.m13794getXimpl(jIntOffset2), IntOffset.m13795getYimpl(jIntOffset4) + IntOffset.m13795getYimpl(jIntOffset2));
    }
}
