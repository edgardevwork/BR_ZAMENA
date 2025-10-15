package androidx.compose.material;

import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InteractiveComponentSize.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J&\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/material/MinimumInteractiveComponentSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "size", "Landroidx/compose/ui/unit/DpSize;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSize-MYxV2XQ", "()J", "J", "equals", "", "other", "", "hashCode", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {
    public final long size;

    public /* synthetic */ MinimumInteractiveComponentSizeModifier(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public MinimumInteractiveComponentSizeModifier(long j) {
        this.size = j;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7625measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
        final int iMax = Math.max(placeableMo12610measureBRTryo0.getWidth(), measureScope.mo7868roundToPx0680j_4(DpSize.m13764getWidthD9Ej5fM(this.size)));
        final int iMax2 = Math.max(placeableMo12610measureBRTryo0.getHeight(), measureScope.mo7868roundToPx0680j_4(DpSize.m13762getHeightD9Ej5fM(this.size)));
        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.MinimumInteractiveComponentSizeModifier$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, MathKt__MathJVMKt.roundToInt((iMax - placeableMo12610measureBRTryo0.getWidth()) / 2.0f), MathKt__MathJVMKt.roundToInt((iMax2 - placeableMo12610measureBRTryo0.getHeight()) / 2.0f), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public boolean equals(@Nullable Object other) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier = other instanceof MinimumInteractiveComponentSizeModifier ? (MinimumInteractiveComponentSizeModifier) other : null;
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return DpSize.m13761equalsimpl0(this.size, minimumInteractiveComponentSizeModifier.size);
    }

    public int hashCode() {
        return DpSize.m13766hashCodeimpl(this.size);
    }
}
