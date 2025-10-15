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
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FlowLayout.kt */
@Metadata(m7104d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÂ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u0016\u0010\"\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\u000bHÂ\u0003J\t\u0010&\u001a\u00020\rHÂ\u0003J\u0016\u0010'\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010$J\t\u0010)\u001a\u00020\u0010HÂ\u0003Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0010HÖ\u0001J,\u00102\u001a\u00020\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010J$\u00108\u001a\u00020\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010J,\u0010;\u001a\u00020\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u0010<\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010J\t\u0010=\u001a\u00020>HÖ\u0001J\"\u0010?\u001a\u00020\u0010*\u00020@2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u0010A\u001a\u00020\u0010H\u0016J\"\u0010B\u001a\u00020\u0010*\u00020@2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00109\u001a\u00020\u0010H\u0016J,\u0010C\u001a\u00020D*\u00020E2\f\u00103\u001a\b\u0012\u0004\u0012\u00020F042\u0006\u0010G\u001a\u00020HH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\"\u0010K\u001a\u00020\u0010*\u00020@2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u0010A\u001a\u00020\u0010H\u0016J\"\u0010L\u001a\u00020\u0010*\u00020@2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015042\u0006\u00109\u001a\u00020\u0010H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012R.\u0010\u0013\u001a\u001f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0019\u001a\u001f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R.\u0010\u001b\u001a\u001f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R.\u0010\u001d\u001a\u001f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, m7105d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "mainAxisArrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangementSpacing", "maxItemsInMainAxis", "", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "maxCrossAxisIntrinsicItemSize", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "Lkotlin/ExtensionFunctionType;", "getMaxCrossAxisIntrinsicItemSize", "()Lkotlin/jvm/functions/Function3;", "maxMainAxisIntrinsicItemSize", "getMaxMainAxisIntrinsicItemSize", "minCrossAxisIntrinsicItemSize", "getMinCrossAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "getMinMainAxisIntrinsicItemSize", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "component7", "component7-D9Ej5fM", "component8", "copy", "copy-cBR-a5Y", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;FI)Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "equals", "", "other", "", "hashCode", "intrinsicCrossAxisSize", "measurables", "", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "maxIntrinsicMainAxisSize", "height", "arrangementSpacing", "minIntrinsicMainAxisSize", "crossAxisAvailable", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,757:1\n523#2:758\n1#3:759\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n*L\n235#1:758\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class FlowMeasurePolicy implements MeasurePolicy {

    @NotNull
    public final CrossAxisAlignment crossAxisAlignment;
    public final float crossAxisArrangementSpacing;

    @NotNull
    public final SizeMode crossAxisSize;

    @Nullable
    public final Arrangement.Horizontal horizontalArrangement;
    public final float mainAxisArrangementSpacing;

    @NotNull
    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
    public final int maxItemsInMainAxis;

    @NotNull
    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;

    @NotNull
    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;

    @NotNull
    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

    @NotNull
    public final LayoutOrientation orientation;

    @Nullable
    public final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment, f2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: component2, reason: from getter */
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: component3, reason: from getter */
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMainAxisArrangementSpacing() {
        return this.mainAxisArrangementSpacing;
    }

    /* renamed from: component5, reason: from getter */
    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: component6, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCrossAxisArrangementSpacing() {
        return this.crossAxisArrangementSpacing;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMaxItemsInMainAxis() {
        return this.maxItemsInMainAxis;
    }

    @NotNull
    /* renamed from: copy-cBR-a5Y, reason: not valid java name */
    public final FlowMeasurePolicy m8072copycBRa5Y(@NotNull LayoutOrientation orientation, @Nullable Arrangement.Horizontal horizontalArrangement, @Nullable Arrangement.Vertical verticalArrangement, float mainAxisArrangementSpacing, @NotNull SizeMode crossAxisSize, @NotNull CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int maxItemsInMainAxis) {
        return new FlowMeasurePolicy(orientation, horizontalArrangement, verticalArrangement, mainAxisArrangementSpacing, crossAxisSize, crossAxisAlignment, crossAxisArrangementSpacing, maxItemsInMainAxis, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.orientation == flowMeasurePolicy.orientation && Intrinsics.areEqual(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && C2046Dp.m13671equalsimpl0(this.mainAxisArrangementSpacing, flowMeasurePolicy.mainAxisArrangementSpacing) && this.crossAxisSize == flowMeasurePolicy.crossAxisSize && Intrinsics.areEqual(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && C2046Dp.m13671equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis;
    }

    public int hashCode() {
        int iHashCode = this.orientation.hashCode() * 31;
        Arrangement.Horizontal horizontal = this.horizontalArrangement;
        int iHashCode2 = (iHashCode + (horizontal == null ? 0 : horizontal.hashCode())) * 31;
        Arrangement.Vertical vertical = this.verticalArrangement;
        return ((((((((((iHashCode2 + (vertical != null ? vertical.hashCode() : 0)) * 31) + C2046Dp.m13672hashCodeimpl(this.mainAxisArrangementSpacing)) * 31) + this.crossAxisSize.hashCode()) * 31) + this.crossAxisAlignment.hashCode()) * 31) + C2046Dp.m13672hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis);
    }

    @NotNull
    public String toString() {
        return "FlowMeasurePolicy(orientation=" + this.orientation + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisArrangementSpacing=" + ((Object) C2046Dp.m13677toStringimpl(this.mainAxisArrangementSpacing)) + ", crossAxisSize=" + this.crossAxisSize + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) C2046Dp.m13677toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ')';
    }

    public FlowMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, float f2, int i) {
        Function3<IntrinsicMeasurable, Integer, Integer, Integer> function3;
        Function3<IntrinsicMeasurable, Integer, Integer, Integer> function32;
        Function3<IntrinsicMeasurable, Integer, Integer, Integer> function33;
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisArrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f2;
        this.maxItemsInMainAxis = i;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        this.maxMainAxisIntrinsicItemSize = layoutOrientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
            }
        } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
            }
        };
        if (layoutOrientation == layoutOrientation2) {
            function3 = new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            };
        } else {
            function3 = new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            };
        }
        this.maxCrossAxisIntrinsicItemSize = function3;
        if (layoutOrientation == layoutOrientation2) {
            function32 = new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
                }
            };
        } else {
            function32 = new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
                }
            };
        }
        this.minCrossAxisIntrinsicItemSize = function32;
        if (layoutOrientation == layoutOrientation2) {
            function33 = new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
                }
            };
        } else {
            function33 = new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
                }
            };
        }
        this.minMainAxisIntrinsicItemSize = function33;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7599measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
        int mainAxisTotalSize;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.mainAxisArrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new Placeable[list.size()], null);
        final FlowResult flowResultM8067breakDownItemsw1Onq5I = FlowLayoutKt.m8067breakDownItemsw1Onq5I(measureScope, rowColumnMeasurementHelper, this.orientation, OrientationIndependentConstraints.m8092constructorimpl(j, this.orientation), this.maxItemsInMainAxis);
        MutableVector<RowColumnMeasureHelperResult> items = flowResultM8067breakDownItemsw1Onq5I.getItems();
        int size = items.getSize();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = items.getContent()[i].getCrossAxisSize();
        }
        final int[] iArr2 = new int[size];
        int crossAxisTotalSize = flowResultM8067breakDownItemsw1Onq5I.getCrossAxisTotalSize() + (measureScope.mo7868roundToPx0680j_4(this.crossAxisArrangementSpacing) * (items.getSize() - 1));
        LayoutOrientation layoutOrientation = this.orientation;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            Arrangement.Vertical vertical = this.verticalArrangement;
            if (vertical == null) {
                throw new IllegalArgumentException("null verticalArrangement".toString());
            }
            vertical.arrange(measureScope, crossAxisTotalSize, iArr, iArr2);
        } else {
            Arrangement.Horizontal horizontal = this.horizontalArrangement;
            if (horizontal == null) {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            }
            horizontal.arrange(measureScope, crossAxisTotalSize, iArr, measureScope.getLayoutDirection(), iArr2);
        }
        if (this.orientation == layoutOrientation2) {
            crossAxisTotalSize = flowResultM8067breakDownItemsw1Onq5I.getMainAxisTotalSize();
            mainAxisTotalSize = crossAxisTotalSize;
        } else {
            mainAxisTotalSize = flowResultM8067breakDownItemsw1Onq5I.getMainAxisTotalSize();
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m13636constrainWidthK40F9xA(j, crossAxisTotalSize), ConstraintsKt.m13635constrainHeightK40F9xA(j, mainAxisTotalSize), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$6
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
                MutableVector<RowColumnMeasureHelperResult> items2 = flowResultM8067breakDownItemsw1Onq5I.getItems();
                RowColumnMeasurementHelper rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
                int[] iArr3 = iArr2;
                MeasureScope measureScope2 = measureScope;
                int size2 = items2.getSize();
                if (size2 > 0) {
                    RowColumnMeasureHelperResult[] content = items2.getContent();
                    int i2 = 0;
                    do {
                        rowColumnMeasurementHelper2.placeHelper(placementScope, content[i2], iArr3[i2], measureScope2.getLayoutDirection());
                        i2++;
                    } while (i2 < size2);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo7868roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo7868roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo7868roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo7868roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo7868roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo7868roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo7868roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo7868roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo7868roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo7868roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo7868roundToPx0680j_4(this.mainAxisArrangementSpacing));
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo7868roundToPx0680j_4(this.mainAxisArrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo7868roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo7868roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    public final int minIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing) {
        return FlowLayoutKt.minIntrinsicMainAxisSize(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, crossAxisAvailable, mainAxisSpacing, crossAxisSpacing, this.maxItemsInMainAxis);
    }

    public final int maxIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
        return FlowLayoutKt.maxIntrinsicMainAxisSize(measurables, this.maxMainAxisIntrinsicItemSize, height, arrangementSpacing, this.maxItemsInMainAxis);
    }

    public final int intrinsicCrossAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing) {
        return FlowLayoutKt.intrinsicCrossAxisSize((List<? extends IntrinsicMeasurable>) measurables, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minMainAxisIntrinsicItemSize, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minCrossAxisIntrinsicItemSize, mainAxisAvailable, mainAxisSpacing, crossAxisSpacing, this.maxItemsInMainAxis);
    }

    @NotNull
    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
        return this.maxMainAxisIntrinsicItemSize;
    }

    @NotNull
    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
        return this.maxCrossAxisIntrinsicItemSize;
    }

    @NotNull
    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
        return this.minCrossAxisIntrinsicItemSize;
    }

    @NotNull
    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
        return this.minMainAxisIntrinsicItemSize;
    }
}
