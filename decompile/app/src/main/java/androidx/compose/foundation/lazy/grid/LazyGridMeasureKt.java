package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridMeasure.kt */
@Metadata(m7104d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\bH\u0083\b\u001a\u008c\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001aõ\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042/\u00105\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002080\b¢\u0006\u0002\b9\u0012\u0004\u0012\u00020:06H\u0000ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, m7105d2 = {"calculateExtraItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "pinnedItems", "", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "itemConstraints", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Constraints;", "filter", "", "calculateItemsOffsets", "", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "itemsCount", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", TtmlNode.TAG_LAYOUT, "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-W2FL7xs", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,440:1\n334#1,3:442\n337#1,12:449\n350#1:462\n334#1,3:463\n337#1,12:470\n350#1:483\n1#2:441\n33#3,4:445\n38#3:461\n33#3,4:466\n38#3:482\n235#3,3:484\n33#3,4:487\n238#3,2:491\n38#3:493\n240#3:494\n33#3,6:495\n132#3,3:501\n33#3,4:504\n135#3,2:508\n38#3:510\n137#3:511\n51#3,6:512\n33#3,6:518\n33#3,6:524\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n230#1:442,3\n230#1:449,12\n230#1:462\n237#1:463,3\n237#1:470,12\n237#1:483\n230#1:445,4\n230#1:461\n237#1:466,4\n237#1:482\n313#1:484,3\n313#1:487,4\n313#1:491,2\n313#1:493\n313#1:494\n336#1:495,6\n377#1:501,3\n377#1:504,4\n377#1:508,2\n377#1:510\n377#1:511\n420#1:512,6\n427#1:518,6\n432#1:524,6\n*E\n"})
/* loaded from: classes3.dex */
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    @NotNull
    /* renamed from: measureLazyGrid-W2FL7xs, reason: not valid java name */
    public static final LazyGridMeasureResult m8261measureLazyGridW2FL7xs(int i, @NotNull LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, @NotNull LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z2, @NotNull Density density, @NotNull LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, @NotNull LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, @NotNull List<Integer> list, @NotNull CoroutineScope coroutineScope, @NotNull final MutableState<Unit> mutableState, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        boolean z3;
        boolean z4;
        int i8;
        int index;
        int i9;
        int mainAxisSizeWithSpacings;
        int i10;
        LazyGridMeasuredLine lazyGridMeasuredLine;
        int iM13636constrainWidthK40F9xA;
        int iM13621getMaxHeightimpl;
        int i11;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i12;
        int i13;
        boolean z5;
        int i14;
        List<Integer> list2 = list;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding".toString());
        }
        if (i <= 0) {
            return new LazyGridMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(Constraints.m13624getMinWidthimpl(j)), Integer.valueOf(Constraints.m13623getMinHeightimpl(j)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, CollectionsKt__CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(f);
        int i15 = i7 - iRoundToInt;
        if (i6 == 0 && i15 < 0) {
            iRoundToInt += i15;
            i15 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i16 = -i3;
        int i17 = (i5 < 0 ? i5 : 0) + i16;
        int mainAxisSizeWithSpacings2 = i15 + i17;
        int i18 = i6;
        while (mainAxisSizeWithSpacings2 < 0 && i18 > 0) {
            i18--;
            LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(i18);
            arrayDeque.add(0, andMeasure);
            mainAxisSizeWithSpacings2 += andMeasure.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings2 < i17) {
            iRoundToInt += mainAxisSizeWithSpacings2;
            mainAxisSizeWithSpacings2 = i17;
        }
        int i19 = mainAxisSizeWithSpacings2 - i17;
        int i20 = i2 + i4;
        int i21 = i18;
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i20, 0);
        int mainAxisSizeWithSpacings3 = -i19;
        int i22 = i21;
        int mainAxisSizeWithSpacings4 = i19;
        int i23 = 0;
        boolean z6 = false;
        while (true) {
            z3 = true;
            if (i23 >= arrayDeque.size()) {
                break;
            }
            if (mainAxisSizeWithSpacings3 >= iCoerceAtLeast) {
                arrayDeque.remove(i23);
                z6 = true;
            } else {
                i22++;
                mainAxisSizeWithSpacings3 += ((LazyGridMeasuredLine) arrayDeque.get(i23)).getMainAxisSizeWithSpacings();
                i23++;
            }
        }
        int i24 = mainAxisSizeWithSpacings3;
        int i25 = i22;
        boolean z7 = z6;
        while (i25 < i && (i24 < iCoerceAtLeast || i24 <= 0 || arrayDeque.isEmpty())) {
            int i26 = iCoerceAtLeast;
            LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(i25);
            if (andMeasure2.isEmpty()) {
                break;
            }
            int mainAxisSizeWithSpacings5 = i24 + andMeasure2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings5 <= i17) {
                i12 = i17;
                i13 = mainAxisSizeWithSpacings5;
                if (((LazyGridMeasuredItem) ArraysKt___ArraysKt.last(andMeasure2.getItems())).getIndex() != i - 1) {
                    i14 = i25 + 1;
                    mainAxisSizeWithSpacings4 -= andMeasure2.getMainAxisSizeWithSpacings();
                    z5 = true;
                }
                i25++;
                i21 = i14;
                i24 = i13;
                i17 = i12;
                z7 = z5;
                iCoerceAtLeast = i26;
            } else {
                i12 = i17;
                i13 = mainAxisSizeWithSpacings5;
            }
            arrayDeque.add(andMeasure2);
            z5 = z7;
            i14 = i21;
            i25++;
            i21 = i14;
            i24 = i13;
            i17 = i12;
            z7 = z5;
            iCoerceAtLeast = i26;
        }
        if (i24 < i2) {
            int i27 = i2 - i24;
            int i28 = i24 + i27;
            int i29 = i21;
            mainAxisSizeWithSpacings = mainAxisSizeWithSpacings4 - i27;
            while (mainAxisSizeWithSpacings < i3 && i29 > 0) {
                i29--;
                int i30 = i16;
                LazyGridMeasuredLine andMeasure3 = lazyGridMeasuredLineProvider.getAndMeasure(i29);
                arrayDeque.add(0, andMeasure3);
                mainAxisSizeWithSpacings += andMeasure3.getMainAxisSizeWithSpacings();
                z7 = z7;
                i16 = i30;
            }
            z4 = z7;
            i8 = i16;
            index = 0;
            iRoundToInt += i27;
            if (mainAxisSizeWithSpacings < 0) {
                iRoundToInt += mainAxisSizeWithSpacings;
                i28 += mainAxisSizeWithSpacings;
                mainAxisSizeWithSpacings = 0;
            }
            i9 = i28;
        } else {
            z4 = z7;
            i8 = i16;
            index = 0;
            i9 = i24;
            mainAxisSizeWithSpacings = mainAxisSizeWithSpacings4;
        }
        float f2 = (MathKt__MathJVMKt.getSign(MathKt__MathJVMKt.roundToInt(f)) != MathKt__MathJVMKt.getSign(iRoundToInt) || Math.abs(MathKt__MathJVMKt.roundToInt(f)) < Math.abs(iRoundToInt)) ? f : iRoundToInt;
        if (mainAxisSizeWithSpacings < 0) {
            throw new IllegalArgumentException("negative initial offset".toString());
        }
        int i31 = -mainAxisSizeWithSpacings;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredLine2.getItems());
        int index2 = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : index;
        LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
        if (lazyGridMeasuredLine3 != null && (items = lazyGridMeasuredLine3.getItems()) != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt___ArraysKt.lastOrNull(items)) != null) {
            index = lazyGridMeasuredItem.getIndex();
        }
        int i32 = mainAxisSizeWithSpacings;
        int size = list.size();
        List listEmptyList = null;
        List listEmptyList2 = null;
        int i33 = 0;
        while (i33 < size) {
            int i34 = size;
            int iIntValue = list2.get(i33).intValue();
            if (iIntValue < 0 || iIntValue >= index2) {
                i11 = index2;
            } else {
                LazyGridMeasuredItem lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m8264getAndMeasure3p2s80s$default(lazyGridMeasuredItemProvider, iIntValue, 0, lazyGridMeasuredLineProvider.m8267itemConstraintsOenEA2s(iIntValue), 2, null);
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                i11 = index2;
                List list3 = listEmptyList2;
                list3.add(lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default);
                listEmptyList2 = list3;
            }
            i33++;
            index2 = i11;
            size = i34;
        }
        int i35 = index2;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list4 = listEmptyList2;
        int size2 = list.size();
        int i36 = 0;
        while (i36 < size2) {
            int iIntValue2 = list2.get(i36).intValue();
            if (index + 1 <= iIntValue2 && iIntValue2 < i) {
                LazyGridMeasuredItem lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default2 = LazyGridMeasuredItemProvider.m8264getAndMeasure3p2s80s$default(lazyGridMeasuredItemProvider, iIntValue2, 0, lazyGridMeasuredLineProvider.m8267itemConstraintsOenEA2s(iIntValue2), 2, null);
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                List list5 = listEmptyList;
                list5.add(lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default2);
                listEmptyList = list5;
            }
            i36++;
            list2 = list;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list6 = listEmptyList;
        if (i3 > 0 || i5 < 0) {
            int size3 = arrayDeque.size();
            LazyGridMeasuredLine lazyGridMeasuredLine4 = lazyGridMeasuredLine2;
            int i37 = i32;
            int i38 = 0;
            while (i38 < size3) {
                int mainAxisSizeWithSpacings6 = ((LazyGridMeasuredLine) arrayDeque.get(i38)).getMainAxisSizeWithSpacings();
                if (i37 == 0 || mainAxisSizeWithSpacings6 > i37) {
                    break;
                }
                int i39 = size3;
                if (i38 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                i37 -= mainAxisSizeWithSpacings6;
                i38++;
                lazyGridMeasuredLine4 = (LazyGridMeasuredLine) arrayDeque.get(i38);
                size3 = i39;
            }
            i10 = i37;
            lazyGridMeasuredLine = lazyGridMeasuredLine4;
        } else {
            lazyGridMeasuredLine = lazyGridMeasuredLine2;
            i10 = i32;
        }
        if (z) {
            iM13636constrainWidthK40F9xA = Constraints.m13622getMaxWidthimpl(j);
        } else {
            iM13636constrainWidthK40F9xA = ConstraintsKt.m13636constrainWidthK40F9xA(j, i9);
        }
        int i40 = iM13636constrainWidthK40F9xA;
        if (z) {
            iM13621getMaxHeightimpl = ConstraintsKt.m13635constrainHeightK40F9xA(j, i9);
        } else {
            iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
        }
        int i41 = i8;
        List<LazyGridMeasuredItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayDeque, list4, list6, i40, iM13621getMaxHeightimpl, i9, i2, i31, z, vertical, horizontal, z2, density);
        lazyGridItemPlacementAnimator.onMeasured((int) f2, i40, iM13621getMaxHeightimpl, listCalculateItemsOffsets, lazyGridMeasuredItemProvider, lazyGridSpanLayoutProvider, z, coroutineScope);
        if (index == i - 1 && i9 <= i2) {
            z3 = false;
        }
        final List<LazyGridMeasuredItem> list7 = listCalculateItemsOffsets;
        MeasureResult measureResultInvoke = function3.invoke(Integer.valueOf(i40), Integer.valueOf(iM13621getMaxHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$5
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
                List<LazyGridMeasuredItem> list8 = list7;
                int size4 = list8.size();
                for (int i42 = 0; i42 < size4; i42++) {
                    list8.get(i42).place(placementScope);
                }
                ObservableScopeInvalidator.m8291attachToScopeimpl(mutableState);
            }
        });
        if (!list4.isEmpty() || !list6.isEmpty()) {
            ArrayList arrayList = new ArrayList(list7.size());
            int size4 = list7.size();
            for (int i42 = 0; i42 < size4; i42++) {
                LazyGridMeasuredItem lazyGridMeasuredItem3 = list7.get(i42);
                int index3 = lazyGridMeasuredItem3.getIndex();
                if (i35 <= index3 && index3 <= index) {
                    arrayList.add(lazyGridMeasuredItem3);
                }
            }
            list7 = arrayList;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine, i10, z3, f2, measureResultInvoke, z4, list7, i41, i20, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset".toString());
        }
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += list.get(i7).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = list.get(calculateItemsOffsets$reverseAware(i8, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr2[i9] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalArrangement".toString());
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntProgression indices = ArraysKt___ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt___RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z2, size2));
                    if (z2) {
                        mainAxisSize = (i6 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, lazyGridMeasuredLine.position(mainAxisSize, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i10 = i5;
                while (true) {
                    int i11 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    int mainAxisSizeWithSpacings = i10 - lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i, i2, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i11 < 0) {
                        break;
                    }
                    size3 = i11;
                    i10 = mainAxisSizeWithSpacings;
                }
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i12 = 0; i12 < size4; i12++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i12);
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings2, i, i2));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int mainAxisSizeWithSpacings3 = mainAxisSizeWithSpacings2;
            int i13 = 0;
            for (int size5 = list3.size(); i13 < size5; size5 = size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i13);
                lazyGridMeasuredItem2.position(mainAxisSizeWithSpacings3, 0, i, i2, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings3 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
                i13++;
            }
        }
        return arrayList;
    }

    @ExperimentalFoundationApi
    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, Function1<? super Integer, Constraints> function1, Function1<? super Integer, Boolean> function12) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int iIntValue = list.get(i).intValue();
            if (function12.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                LazyGridMeasuredItem lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m8264getAndMeasure3p2s80s$default(lazyGridMeasuredItemProvider, iIntValue, 0, function1.invoke(Integer.valueOf(iIntValue)).getValue(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default);
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}
