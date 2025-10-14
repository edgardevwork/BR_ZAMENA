package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RowColumnMeasurementHelper.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0002\u0010\u0014J2\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010&2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020+H\u0002J(\u00102\u001a\u0002032\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u0002032\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u000207H\u0002J0\u00108\u001a\u0002092\u0006\u00106\u001a\u0002072\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020+ø\u0001\u0000¢\u0006\u0004\b>\u0010?J&\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020+2\u0006\u0010/\u001a\u000200J\n\u0010\n\u001a\u00020+*\u00020\u0013J\n\u0010F\u001a\u00020+*\u00020\u0013R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001b\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0018\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, m7105d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrangementSpacing-D9Ej5fM", "()F", "F", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getMeasurables", "()Ljava/util/List;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getCrossAxisPosition", "", "placeable", "parentData", "crossAxisLayoutSize", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "", "mainAxisLayoutSize", "childrenMainAxisSize", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measureWithoutPlacing", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "startIndex", "endIndex", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "placeHelper", "", "placeableScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measureResult", "crossAxisOffset", "mainAxisSize", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n322#2:344\n322#2:345\n322#2:346\n321#2:347\n324#2:349\n322#2:350\n321#2:351\n324#2:352\n324#2:353\n323#2:354\n1#3:348\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n*L\n111#1:344\n143#1:345\n144#1:346\n146#1:347\n181#1:349\n191#1:350\n230#1:351\n232#1:352\n235#1:353\n240#1:354\n*E\n"})
/* loaded from: classes.dex */
public final class RowColumnMeasurementHelper {
    public static final int $stable = 8;
    private final float arrangementSpacing;

    @NotNull
    private final CrossAxisAlignment crossAxisAlignment;

    @NotNull
    private final SizeMode crossAxisSize;

    @Nullable
    private final Arrangement.Horizontal horizontalArrangement;

    @NotNull
    private final List<Measurable> measurables;

    @NotNull
    private final LayoutOrientation orientation;

    @NotNull
    private final Placeable[] placeables;

    @NotNull
    private final RowColumnParentData[] rowColumnParentData;

    @Nullable
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i = 0; i < size; i++) {
            rowColumnParentDataArr[i] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }

    @NotNull
    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Nullable
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    @NotNull
    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @NotNull
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @NotNull
    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    @NotNull
    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(@NotNull Placeable placeable) {
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public final int crossAxisSize(@NotNull Placeable placeable) {
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    @NotNull
    /* renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m8152measureWithoutPlacing_EkL_Y(@NotNull MeasureScope measureScope, long constraints, int startIndex, int endIndex) {
        int iM13624getMinWidthimpl;
        int i;
        int i2;
        int iCoerceIn;
        int i3;
        float f;
        int iMax;
        int i4;
        int iMax2;
        int i5;
        int i6;
        int i7;
        long j;
        int i8 = endIndex;
        long jM8092constructorimpl = OrientationIndependentConstraints.m8092constructorimpl(constraints, this.orientation);
        long jMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(this.arrangementSpacing);
        int i9 = i8 - startIndex;
        long j2 = 0;
        int i10 = startIndex;
        long jMainAxisSize = 0;
        float f2 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i10 >= i8) {
                break;
            }
            Measurable measurable = this.measurables.get(i10);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i10];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > 0.0f) {
                f2 += weight;
                i13++;
                i6 = i10;
                j = j2;
            } else {
                int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(jM8092constructorimpl);
                Placeable placeableMo12610measureBRTryo0 = this.placeables[i10];
                if (placeableMo12610measureBRTryo0 == null) {
                    i5 = i12;
                    i6 = i10;
                    i7 = iM13622getMaxWidthimpl;
                    placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(OrientationIndependentConstraints.m8105toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m8094copyyUG9Ft0$default(jM8092constructorimpl, 0, iM13622getMaxWidthimpl == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) RangesKt___RangesKt.coerceAtLeast(iM13622getMaxWidthimpl - jMainAxisSize, j2), 0, 0, 8, null), this.orientation));
                } else {
                    i5 = i12;
                    i6 = i10;
                    i7 = iM13622getMaxWidthimpl;
                }
                j = 0;
                int iMin = Math.min((int) jMo7868roundToPx0680j_4, (int) RangesKt___RangesKt.coerceAtLeast((i7 - jMainAxisSize) - mainAxisSize(placeableMo12610measureBRTryo0), 0L));
                jMainAxisSize += mainAxisSize(placeableMo12610measureBRTryo0) + iMin;
                int iMax3 = Math.max(i5, crossAxisSize(placeableMo12610measureBRTryo0));
                if (!z && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                    z2 = false;
                }
                this.placeables[i6] = placeableMo12610measureBRTryo0;
                i11 = iMin;
                i12 = iMax3;
                z = z2;
            }
            j2 = j;
            i10 = i6 + 1;
        }
        long j3 = j2;
        if (i13 == 0) {
            jMainAxisSize -= i11;
            i = i9;
            i2 = 0;
            iCoerceIn = 0;
        } else {
            if (f2 > 0.0f && Constraints.m13622getMaxWidthimpl(jM8092constructorimpl) != Integer.MAX_VALUE) {
                iM13624getMinWidthimpl = Constraints.m13622getMaxWidthimpl(jM8092constructorimpl);
            } else {
                iM13624getMinWidthimpl = Constraints.m13624getMinWidthimpl(jM8092constructorimpl);
            }
            long j4 = jMo7868roundToPx0680j_4 * (i13 - 1);
            long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((iM13624getMinWidthimpl - jMainAxisSize) - j4, j3);
            float f3 = f2 > 0.0f ? jCoerceAtLeast / f2 : 0.0f;
            Iterator<Integer> it = RangesKt___RangesKt.until(startIndex, endIndex).iterator();
            int iRoundToInt = 0;
            while (it.hasNext()) {
                iRoundToInt += MathKt__MathJVMKt.roundToInt(RowColumnImplKt.getWeight(this.rowColumnParentData[((IntIterator) it).nextInt()]) * f3);
            }
            long j5 = jCoerceAtLeast - iRoundToInt;
            int i14 = startIndex;
            int iMainAxisSize = 0;
            while (i14 < i8) {
                if (this.placeables[i14] == null) {
                    Measurable measurable2 = this.measurables.get(i14);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i14];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (weight2 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = MathKt__MathJVMKt.getSign(j5);
                    i3 = i9;
                    j5 -= sign;
                    int iMax4 = Math.max(0, MathKt__MathJVMKt.roundToInt(weight2 * f3) + sign);
                    f = f3;
                    Placeable placeableMo12610measureBRTryo02 = measurable2.mo12610measureBRTryo0(OrientationIndependentConstraints.m8105toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m8090constructorimpl((!RowColumnImplKt.getFill(rowColumnParentData2) || iMax4 == Integer.MAX_VALUE) ? 0 : iMax4, iMax4, 0, Constraints.m13621getMaxHeightimpl(jM8092constructorimpl)), this.orientation));
                    iMainAxisSize += mainAxisSize(placeableMo12610measureBRTryo02);
                    int iMax5 = Math.max(i12, crossAxisSize(placeableMo12610measureBRTryo02));
                    boolean z3 = z || RowColumnImplKt.isRelative(rowColumnParentData2);
                    this.placeables[i14] = placeableMo12610measureBRTryo02;
                    i12 = iMax5;
                    z = z3;
                } else {
                    i3 = i9;
                    f = f3;
                }
                i14++;
                i9 = i3;
                i8 = endIndex;
                f3 = f;
            }
            i = i9;
            i2 = 0;
            iCoerceIn = (int) RangesKt___RangesKt.coerceIn(iMainAxisSize + j4, 0L, Constraints.m13622getMaxWidthimpl(jM8092constructorimpl) - jMainAxisSize);
        }
        if (z) {
            int iMax6 = i2;
            iMax = iMax6;
            for (int i15 = startIndex; i15 < endIndex; i15++) {
                Placeable placeable = this.placeables[i15];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i15]);
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = i2;
                    }
                    iMax6 = Math.max(iMax6, iIntValue);
                    int iCrossAxisSize = crossAxisSize(placeable);
                    int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = crossAxisSize(placeable);
                    }
                    iMax = Math.max(iMax, iCrossAxisSize - iIntValue2);
                }
            }
            i4 = iMax6;
        } else {
            iMax = i2;
            i4 = iMax;
        }
        int iMax7 = Math.max((int) RangesKt___RangesKt.coerceAtLeast(jMainAxisSize + iCoerceIn, 0L), Constraints.m13624getMinWidthimpl(jM8092constructorimpl));
        if (Constraints.m13621getMaxHeightimpl(jM8092constructorimpl) == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) {
            iMax2 = Math.max(i12, Math.max(Constraints.m13623getMinHeightimpl(jM8092constructorimpl), iMax + i4));
        } else {
            iMax2 = Constraints.m13621getMaxHeightimpl(jM8092constructorimpl);
        }
        int i16 = i;
        int[] iArr = new int[i16];
        for (int i17 = i2; i17 < i16; i17++) {
            iArr[i17] = i2;
        }
        int[] iArr2 = new int[i16];
        for (int i18 = i2; i18 < i16; i18++) {
            Placeable placeable2 = this.placeables[i18 + startIndex];
            Intrinsics.checkNotNull(placeable2);
            iArr2[i18] = mainAxisSize(placeable2);
        }
        return new RowColumnMeasureHelperResult(iMax2, iMax7, startIndex, endIndex, i4, mainAxisPositions(iMax7, iArr2, iArr, measureScope));
    }

    private final int[] mainAxisPositions(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, MeasureScope measureScope) {
        if (this.orientation == LayoutOrientation.Vertical) {
            Arrangement.Vertical vertical = this.verticalArrangement;
            if (vertical == null) {
                throw new IllegalArgumentException("null verticalArrangement in Column".toString());
            }
            vertical.arrange(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
        } else {
            Arrangement.Horizontal horizontal = this.horizontalArrangement;
            if (horizontal == null) {
                throw new IllegalArgumentException("null horizontalArrangement in Row".toString());
            }
            horizontal.arrange(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
        }
        return mainAxisPositions;
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData parentData, int crossAxisLayoutSize, LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        CrossAxisAlignment crossAxisAlignment;
        if (parentData == null || (crossAxisAlignment = parentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int iCrossAxisSize = crossAxisLayoutSize - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(iCrossAxisSize, layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    public final void placeHelper(@NotNull Placeable.PlacementScope placeableScope, @NotNull RowColumnMeasureHelperResult measureResult, int crossAxisOffset, @NotNull LayoutDirection layoutDirection) {
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + crossAxisOffset;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }
}
