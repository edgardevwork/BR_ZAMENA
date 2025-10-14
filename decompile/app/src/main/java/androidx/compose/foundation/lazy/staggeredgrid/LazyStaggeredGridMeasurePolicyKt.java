package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
@Metadata(m7104d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aw\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001a\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001d\u001a!\u0010\u001f\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, m7105d2 = {"rememberStaggeredGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberStaggeredGridMeasurePolicy-1tP8Re8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "afterPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,167:1\n83#2,3:168\n1116#3,6:171\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n49#1:168,3\n49#1:171,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Composable
    @NotNull
    /* renamed from: rememberStaggeredGridMeasurePolicy-1tP8Re8, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m8325rememberStaggeredGridMeasurePolicy1tP8Re8(@NotNull final LazyStaggeredGridState lazyStaggeredGridState, @NotNull final Function0<? extends LazyStaggeredGridItemProvider> function0, @NotNull final PaddingValues paddingValues, final boolean z, @NotNull final Orientation orientation, final float f, float f2, @NotNull final CoroutineScope coroutineScope, @NotNull final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-72951591);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-72951591, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:48)");
        }
        Object[] objArr = {lazyStaggeredGridState, function0, paddingValues, Boolean.valueOf(z), orientation, C2046Dp.m13664boximpl(f), C2046Dp.m13664boximpl(f2), lazyGridStaggeredGridSlotsProvider};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i2 = 0; i2 < 8; i2++) {
            zChanged |= composer.changed(objArr[i2]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m8326invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridMeasureResult m8326invoke0kLqBqw(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                    long jIntOffset;
                    CheckScrollableContainerConstraintsKt.m7799checkScrollableContainerConstraintsK40F9xA(j, orientation);
                    LazyStaggeredGridSlots lazyStaggeredGridSlotsMo8308invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo8308invoke0kLqBqw(lazyLayoutMeasureScope, j);
                    boolean z2 = orientation == Orientation.Vertical;
                    LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = function0.invoke();
                    lazyStaggeredGridState.setSlots$foundation_release(lazyStaggeredGridSlotsMo8308invoke0kLqBqw);
                    lazyStaggeredGridState.setVertical$foundation_release(z2);
                    lazyStaggeredGridState.setSpanProvider$foundation_release(lazyStaggeredGridItemProviderInvoke.getSpanProvider());
                    int iMo7868roundToPx0680j_4 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo7868roundToPx0680j_42 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo7868roundToPx0680j_43 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iM13621getMaxHeightimpl = ((z2 ? Constraints.m13621getMaxHeightimpl(j) : Constraints.m13622getMaxWidthimpl(j)) - iMo7868roundToPx0680j_4) - iMo7868roundToPx0680j_42;
                    if (z2) {
                        jIntOffset = IntOffsetKt.IntOffset(iMo7868roundToPx0680j_43, iMo7868roundToPx0680j_4);
                    } else {
                        jIntOffset = IntOffsetKt.IntOffset(iMo7868roundToPx0680j_4, iMo7868roundToPx0680j_43);
                    }
                    long j2 = jIntOffset;
                    PaddingValues paddingValues2 = paddingValues;
                    int iMo7868roundToPx0680j_44 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(C2046Dp.m13666constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                    PaddingValues paddingValues3 = paddingValues;
                    boolean z3 = z2;
                    LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM8324measureStaggeredGridsdzDtKU = LazyStaggeredGridMeasureKt.m8324measureStaggeredGridsdzDtKU(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridSlotsMo8308invoke0kLqBqw, Constraints.m13613copyZbe2FdA$default(j, ConstraintsKt.m13636constrainWidthK40F9xA(j, iMo7868roundToPx0680j_44), 0, ConstraintsKt.m13635constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo7868roundToPx0680j_4(C2046Dp.m13666constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z3, z, j2, iM13621getMaxHeightimpl, lazyLayoutMeasureScope.mo7868roundToPx0680j_4(f), iMo7868roundToPx0680j_4, iMo7868roundToPx0680j_42, coroutineScope);
                    LazyStaggeredGridState.applyMeasureResult$foundation_release$default(lazyStaggeredGridState, lazyStaggeredGridMeasureResultM8324measureStaggeredGridsdzDtKU, false, 2, null);
                    return lazyStaggeredGridMeasureResultM8324measureStaggeredGridsdzDtKU;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i == 2) {
            return paddingValues.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
    }
}
