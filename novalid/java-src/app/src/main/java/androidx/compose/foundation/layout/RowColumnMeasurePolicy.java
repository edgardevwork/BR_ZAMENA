package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RowColumnImpl.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u0016\u0010\u0013\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u000bHÂ\u0003J\t\u0010\u0017\u001a\u00020\rHÂ\u0003JS\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\"\u0010#\u001a\u00020 *\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020 H\u0016J\"\u0010)\u001a\u00020 *\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010*\u001a\u00020 H\u0016J,\u0010+\u001a\u00020,*\u00020-2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020.0&2\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J\"\u00103\u001a\u00020 *\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020 H\u0016J\"\u00104\u001a\u00020 *\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010*\u001a\u00020 H\u0016R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, m7105d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "copy", "copy-gwO9Abs", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "equals", "", "other", "", "hashCode", "", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RowColumnMeasurePolicy implements MeasurePolicy {
    public static final int $stable = 0;
    private final float arrangementSpacing;

    @NotNull
    private final CrossAxisAlignment crossAxisAlignment;

    @NotNull
    private final SizeMode crossAxisSize;

    @Nullable
    private final Arrangement.Horizontal horizontalArrangement;

    @NotNull
    private final LayoutOrientation orientation;

    @Nullable
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment);
    }

    /* renamed from: component1, reason: from getter */
    private final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: component2, reason: from getter */
    private final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: component3, reason: from getter */
    private final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    private final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    /* renamed from: component5, reason: from getter */
    private final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: component6, reason: from getter */
    private final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-gwO9Abs$default, reason: not valid java name */
    public static /* synthetic */ RowColumnMeasurePolicy m8149copygwO9Abs$default(RowColumnMeasurePolicy rowColumnMeasurePolicy, LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutOrientation = rowColumnMeasurePolicy.orientation;
        }
        if ((i & 2) != 0) {
            horizontal = rowColumnMeasurePolicy.horizontalArrangement;
        }
        Arrangement.Horizontal horizontal2 = horizontal;
        if ((i & 4) != 0) {
            vertical = rowColumnMeasurePolicy.verticalArrangement;
        }
        Arrangement.Vertical vertical2 = vertical;
        if ((i & 8) != 0) {
            f = rowColumnMeasurePolicy.arrangementSpacing;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            sizeMode = rowColumnMeasurePolicy.crossAxisSize;
        }
        SizeMode sizeMode2 = sizeMode;
        if ((i & 32) != 0) {
            crossAxisAlignment = rowColumnMeasurePolicy.crossAxisAlignment;
        }
        return rowColumnMeasurePolicy.m8150copygwO9Abs(layoutOrientation, horizontal2, vertical2, f2, sizeMode2, crossAxisAlignment);
    }

    @NotNull
    /* renamed from: copy-gwO9Abs, reason: not valid java name */
    public final RowColumnMeasurePolicy m8150copygwO9Abs(@NotNull LayoutOrientation orientation, @Nullable Arrangement.Horizontal horizontalArrangement, @Nullable Arrangement.Vertical verticalArrangement, float arrangementSpacing, @NotNull SizeMode crossAxisSize, @NotNull CrossAxisAlignment crossAxisAlignment) {
        return new RowColumnMeasurePolicy(orientation, horizontalArrangement, verticalArrangement, arrangementSpacing, crossAxisSize, crossAxisAlignment, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnMeasurePolicy)) {
            return false;
        }
        RowColumnMeasurePolicy rowColumnMeasurePolicy = (RowColumnMeasurePolicy) other;
        return this.orientation == rowColumnMeasurePolicy.orientation && Intrinsics.areEqual(this.horizontalArrangement, rowColumnMeasurePolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, rowColumnMeasurePolicy.verticalArrangement) && C2046Dp.m13671equalsimpl0(this.arrangementSpacing, rowColumnMeasurePolicy.arrangementSpacing) && this.crossAxisSize == rowColumnMeasurePolicy.crossAxisSize && Intrinsics.areEqual(this.crossAxisAlignment, rowColumnMeasurePolicy.crossAxisAlignment);
    }

    public int hashCode() {
        int iHashCode = this.orientation.hashCode() * 31;
        Arrangement.Horizontal horizontal = this.horizontalArrangement;
        int iHashCode2 = (iHashCode + (horizontal == null ? 0 : horizontal.hashCode())) * 31;
        Arrangement.Vertical vertical = this.verticalArrangement;
        return ((((((iHashCode2 + (vertical != null ? vertical.hashCode() : 0)) * 31) + C2046Dp.m13672hashCodeimpl(this.arrangementSpacing)) * 31) + this.crossAxisSize.hashCode()) * 31) + this.crossAxisAlignment.hashCode();
    }

    @NotNull
    public String toString() {
        return "RowColumnMeasurePolicy(orientation=" + this.orientation + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", arrangementSpacing=" + ((Object) C2046Dp.m13677toStringimpl(this.arrangementSpacing)) + ", crossAxisSize=" + this.crossAxisSize + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    private RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7599measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
        int crossAxisSize;
        int mainAxisSize;
        final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.arrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new Placeable[list.size()], null);
        final RowColumnMeasureHelperResult rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m8152measureWithoutPlacing_EkL_Y(measureScope, j, 0, list.size());
        if (this.orientation == LayoutOrientation.Horizontal) {
            crossAxisSize = rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y.getMainAxisSize();
            mainAxisSize = rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y.getCrossAxisSize();
        } else {
            crossAxisSize = rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            mainAxisSize = rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y.getMainAxisSize();
        }
        return MeasureScope.layout$default(measureScope, crossAxisSize, mainAxisSize, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RowColumnMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                rowColumnMeasurementHelper.placeHelper(placementScope, rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y, 0, measureScope.getLayoutDirection());
            }
        }, 4, null);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return ((Number) RowColumnImplKt.MinIntrinsicWidthMeasureBlock(this.orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo7868roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return ((Number) RowColumnImplKt.MinIntrinsicHeightMeasureBlock(this.orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo7868roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return ((Number) RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(this.orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo7868roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return ((Number) RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(this.orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo7868roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }
}
