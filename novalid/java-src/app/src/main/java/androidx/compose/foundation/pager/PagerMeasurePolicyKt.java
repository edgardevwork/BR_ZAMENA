package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerMeasurePolicy.kt */
@Metadata(m7104d1 = {"\u0000n\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b\u001a\u0099\u0001\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\u0017*\u00020\u00102\u0006\u0010&\u001a\u00020\u0017H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m7105d2 = {"DEBUG", "", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondBoundsPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPositionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "pageCount", "rememberPagerMeasurePolicy-121YqSk", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "calculateCurrentPageLayoutOffset", "pageSizeWithSpacing", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,221:1\n195#1,4:240\n83#2,3:222\n1116#3,6:225\n116#4,2:231\n33#4,6:233\n118#4:239\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n213#1:240,4\n57#1:222,3\n57#1:225,6\n203#1:231,2\n203#1:233,6\n203#1:239\n*E\n"})
/* loaded from: classes2.dex */
public final class PagerMeasurePolicyKt {
    private static final boolean DEBUG = false;

    private static final void debugLog(Function0<String> function0) {
    }

    @Composable
    @NotNull
    /* renamed from: rememberPagerMeasurePolicy-121YqSk, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m8356rememberPagerMeasurePolicy121YqSk(@NotNull final Function0<PagerLazyLayoutItemProvider> function0, @NotNull final PagerState pagerState, @NotNull final PaddingValues paddingValues, final boolean z, @NotNull final Orientation orientation, final int i, final float f, @NotNull final PageSize pageSize, @Nullable final Alignment.Horizontal horizontal, @Nullable final Alignment.Vertical vertical, @NotNull final SnapPositionInLayout snapPositionInLayout, @NotNull final Function0<Integer> function02, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1615726010);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1615726010, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        Object[] objArr = {pagerState, paddingValues, Boolean.valueOf(z), orientation, horizontal, vertical, C2046Dp.m13664boximpl(f), pageSize, snapPositionInLayout, function02};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i4 = 0; i4 < 10; i4++) {
            zChanged |= composer.changed(objArr[i4]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m8357invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final PagerMeasureResult m8357invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int iMo7868roundToPx0680j_4;
                    int iMo7868roundToPx0680j_42;
                    int i5;
                    int iM13622getMaxWidthimpl;
                    long jIntOffset;
                    Orientation orientation2 = orientation;
                    Orientation orientation3 = Orientation.Vertical;
                    boolean z2 = orientation2 == orientation3;
                    CheckScrollableContainerConstraintsKt.m7799checkScrollableContainerConstraintsK40F9xA(j, z2 ? orientation3 : Orientation.Horizontal);
                    if (z2) {
                        iMo7868roundToPx0680j_4 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(paddingValues.mo8074calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        iMo7868roundToPx0680j_4 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        iMo7868roundToPx0680j_42 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(paddingValues.mo8075calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        iMo7868roundToPx0680j_42 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int iMo7868roundToPx0680j_43 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(paddingValues.getTop());
                    int iMo7868roundToPx0680j_44 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(paddingValues.getBottom());
                    final int i6 = iMo7868roundToPx0680j_43 + iMo7868roundToPx0680j_44;
                    final int i7 = iMo7868roundToPx0680j_4 + iMo7868roundToPx0680j_42;
                    int i8 = z2 ? i6 : i7;
                    if (z2 && !z) {
                        i5 = iMo7868roundToPx0680j_43;
                    } else if (z2 && z) {
                        i5 = iMo7868roundToPx0680j_44;
                    } else {
                        i5 = (z2 || z) ? iMo7868roundToPx0680j_42 : iMo7868roundToPx0680j_4;
                    }
                    int i9 = i8 - i5;
                    long jM13638offsetNN6EwU = ConstraintsKt.m13638offsetNN6EwU(j, -i7, -i6);
                    pagerState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    int iMo7868roundToPx0680j_45 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(f);
                    if (z2) {
                        iM13622getMaxWidthimpl = Constraints.m13621getMaxHeightimpl(j) - i6;
                    } else {
                        iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j) - i7;
                    }
                    if (!z || iM13622getMaxWidthimpl > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(iMo7868roundToPx0680j_4, iMo7868roundToPx0680j_43);
                    } else {
                        if (!z2) {
                            iMo7868roundToPx0680j_4 += iM13622getMaxWidthimpl;
                        }
                        if (z2) {
                            iMo7868roundToPx0680j_43 += iM13622getMaxWidthimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(iMo7868roundToPx0680j_4, iMo7868roundToPx0680j_43);
                    }
                    long j2 = jIntOffset;
                    int iCalculateMainAxisPageSize = pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope, iM13622getMaxWidthimpl, iMo7868roundToPx0680j_45);
                    pagerState.m8361setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == orientation3 ? Constraints.m13622getMaxWidthimpl(jM13638offsetNN6EwU) : iCalculateMainAxisPageSize, 0, orientation != orientation3 ? Constraints.m13621getMaxHeightimpl(jM13638offsetNN6EwU) : iCalculateMainAxisPageSize, 5, null));
                    PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = function0.invoke();
                    int i10 = iCalculateMainAxisPageSize + iMo7868roundToPx0680j_45;
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    PagerState pagerState2 = pagerState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            int iMatchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProviderInvoke, pagerState2.getCurrentPage());
                            int iCalculateCurrentPageLayoutOffset = PagerMeasurePolicyKt.calculateCurrentPageLayoutOffset(pagerState2, i10);
                            Unit unit = Unit.INSTANCE;
                            snapshotCreateNonObservableSnapshot.dispose();
                            int i11 = iM13622getMaxWidthimpl;
                            int i12 = i5;
                            PagerMeasureResult pagerMeasureResultM8355measurePager_JDW0YA = PagerMeasureKt.m8355measurePager_JDW0YA(lazyLayoutMeasureScope, function02.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, i11, i12, i9, iMo7868roundToPx0680j_45, iMatchScrollPositionWithKey$foundation_release, iCalculateCurrentPageLayoutOffset, jM13638offsetNN6EwU, orientation, vertical, horizontal, z, j2, iCalculateMainAxisPageSize, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPositionInLayout, pagerState.m8358getPlacementScopeInvalidatorzYiylxw$foundation_release(), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i13, int i14, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1) {
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m13636constrainWidthK40F9xA(j, i13 + i7), ConstraintsKt.m13635constrainHeightK40F9xA(j, i14 + i6), MapsKt__MapsKt.emptyMap(), function1);
                                }
                            });
                            PagerState.applyMeasureResult$foundation_release$default(pagerState, pagerMeasureResultM8355measurePager_JDW0YA, false, 2, null);
                            return pagerMeasureResultM8355measurePager_JDW0YA;
                        } finally {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        }
                    } catch (Throwable th) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    public static final int calculateCurrentPageLayoutOffset(@NotNull PagerState pagerState, int i) {
        PageInfo pageInfo;
        List<PageInfo> visiblePagesInfo = pagerState.getLayoutInfo().getVisiblePagesInfo();
        int size = visiblePagesInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pageInfo = null;
                break;
            }
            pageInfo = visiblePagesInfo.get(i2);
            if (pageInfo.getIndex() == pagerState.getCurrentPage()) {
                break;
            }
            i2++;
        }
        PageInfo pageInfo2 = pageInfo;
        int offset = pageInfo2 != null ? pageInfo2.getOffset() : 0;
        return -MathKt__MathJVMKt.roundToInt(((pagerState.getCurrentPageOffsetFraction() - (i == 0 ? pagerState.getCurrentPageOffsetFraction() : (-offset) / i)) * i) - offset);
    }
}
