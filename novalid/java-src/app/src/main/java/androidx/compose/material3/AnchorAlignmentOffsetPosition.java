package androidx.compose.material3;

import androidx.compose.material3.MenuPosition;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuPosition.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m7105d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition;", "", "()V", "Horizontal", "Vertical", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class AnchorAlignmentOffsetPosition {
    public static final int $stable = 0;

    @NotNull
    public static final AnchorAlignmentOffsetPosition INSTANCE = new AnchorAlignmentOffsetPosition();

    private AnchorAlignmentOffsetPosition() {
    }

    /* compiled from: MenuPosition.kt */
    @Immutable
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0006HÂ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m7105d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;", "Landroidx/compose/material3/MenuPosition$Horizontal;", "menuAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "anchorAlignment", TypedValues.CycleType.S_WAVE_OFFSET, "", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "position", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "menuWidth", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "toString", "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;

        @NotNull
        private final Alignment.Horizontal anchorAlignment;

        @NotNull
        private final Alignment.Horizontal menuAlignment;
        private final int offset;

        /* renamed from: component1, reason: from getter */
        private final Alignment.Horizontal getMenuAlignment() {
            return this.menuAlignment;
        }

        /* renamed from: component2, reason: from getter */
        private final Alignment.Horizontal getAnchorAlignment() {
            return this.anchorAlignment;
        }

        /* renamed from: component3, reason: from getter */
        private final int getOffset() {
            return this.offset;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, Alignment.Horizontal horizontal3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                horizontal2 = horizontal.menuAlignment;
            }
            if ((i2 & 2) != 0) {
                horizontal3 = horizontal.anchorAlignment;
            }
            if ((i2 & 4) != 0) {
                i = horizontal.offset;
            }
            return horizontal.copy(horizontal2, horizontal3, i);
        }

        @NotNull
        public final Horizontal copy(@NotNull Alignment.Horizontal menuAlignment, @NotNull Alignment.Horizontal anchorAlignment, int i) {
            return new Horizontal(menuAlignment, anchorAlignment, i);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) other;
            return Intrinsics.areEqual(this.menuAlignment, horizontal.menuAlignment) && Intrinsics.areEqual(this.anchorAlignment, horizontal.anchorAlignment) && this.offset == horizontal.offset;
        }

        public int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
        }

        @NotNull
        public String toString() {
            return "Horizontal(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
        }

        public Horizontal(@NotNull Alignment.Horizontal horizontal, @NotNull Alignment.Horizontal horizontal2, int i) {
            this.menuAlignment = horizontal;
            this.anchorAlignment = horizontal2;
            this.offset = i;
        }

        @Override // androidx.compose.material3.MenuPosition.Horizontal
        /* renamed from: position-95KtPRI */
        public int mo9122position95KtPRI(@NotNull IntRect anchorBounds, long windowSize, int menuWidth, @NotNull LayoutDirection layoutDirection) {
            int iAlign = this.anchorAlignment.align(0, anchorBounds.getWidth(), layoutDirection);
            return anchorBounds.getLeft() + iAlign + (-this.menuAlignment.align(0, menuWidth, layoutDirection)) + (layoutDirection == LayoutDirection.Ltr ? this.offset : -this.offset);
        }
    }

    /* compiled from: MenuPosition.kt */
    @Immutable
    @Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0006HÂ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m7105d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Vertical;", "Landroidx/compose/material3/MenuPosition$Vertical;", "menuAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "anchorAlignment", TypedValues.CycleType.S_WAVE_OFFSET, "", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Vertical;I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "position", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", "toString", "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;

        @NotNull
        private final Alignment.Vertical anchorAlignment;

        @NotNull
        private final Alignment.Vertical menuAlignment;
        private final int offset;

        /* renamed from: component1, reason: from getter */
        private final Alignment.Vertical getMenuAlignment() {
            return this.menuAlignment;
        }

        /* renamed from: component2, reason: from getter */
        private final Alignment.Vertical getAnchorAlignment() {
            return this.anchorAlignment;
        }

        /* renamed from: component3, reason: from getter */
        private final int getOffset() {
            return this.offset;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, Alignment.Vertical vertical3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                vertical2 = vertical.menuAlignment;
            }
            if ((i2 & 2) != 0) {
                vertical3 = vertical.anchorAlignment;
            }
            if ((i2 & 4) != 0) {
                i = vertical.offset;
            }
            return vertical.copy(vertical2, vertical3, i);
        }

        @NotNull
        public final Vertical copy(@NotNull Alignment.Vertical menuAlignment, @NotNull Alignment.Vertical anchorAlignment, int i) {
            return new Vertical(menuAlignment, anchorAlignment, i);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) other;
            return Intrinsics.areEqual(this.menuAlignment, vertical.menuAlignment) && Intrinsics.areEqual(this.anchorAlignment, vertical.anchorAlignment) && this.offset == vertical.offset;
        }

        public int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
        }

        @NotNull
        public String toString() {
            return "Vertical(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
        }

        public Vertical(@NotNull Alignment.Vertical vertical, @NotNull Alignment.Vertical vertical2, int i) {
            this.menuAlignment = vertical;
            this.anchorAlignment = vertical2;
            this.offset = i;
        }

        @Override // androidx.compose.material3.MenuPosition.Vertical
        /* renamed from: position-JVtK1S4 */
        public int mo9123positionJVtK1S4(@NotNull IntRect anchorBounds, long windowSize, int menuHeight) {
            int iAlign = this.anchorAlignment.align(0, anchorBounds.getHeight());
            return anchorBounds.getTop() + iAlign + (-this.menuAlignment.align(0, menuHeight)) + this.offset;
        }
    }
}
