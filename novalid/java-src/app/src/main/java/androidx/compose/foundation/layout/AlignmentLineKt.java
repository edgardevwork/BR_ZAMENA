package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.HorizontalAlignmentLine;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlignmentLine.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m7105d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", TtmlNode.ANNOTATION_POSITION_BEFORE, "Landroidx/compose/ui/unit/Dp;", TtmlNode.ANNOTATION_POSITION_AFTER, "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,366:1\n135#2:367\n135#2:368\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:367\n121#1:368\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* renamed from: paddingFrom-4j6BHR0$default */
    public static /* synthetic */ Modifier m8003paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM();
        }
        return m8002paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-4j6BHR0 */
    public static final Modifier m8002paddingFrom4j6BHR0(@NotNull Modifier modifier, @NotNull final AlignmentLine alignmentLine, final float f, final float f2) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_BEFORE, C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_AFTER, C2046Dp.m13664boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default */
    public static /* synthetic */ Modifier m8005paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE();
        }
        return m8004paddingFromY_r0B1c(modifier, alignmentLine, j3, j2);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-Y_r0B1c */
    public static final Modifier m8004paddingFromY_r0B1c(@NotNull Modifier modifier, @NotNull final AlignmentLine alignmentLine, final long j, final long j2) {
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine, j, j2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_BEFORE, TextUnit.m13847boximpl(j));
                inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_AFTER, TextUnit.m13847boximpl(j2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default */
    public static /* synthetic */ Modifier m8007paddingFromBaselineVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM();
        }
        return m8006paddingFromBaselineVpY3zN4(modifier, f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-VpY3zN4 */
    public static final Modifier m8006paddingFromBaselineVpY3zN4(@NotNull Modifier modifier, float f, float f2) {
        Modifier modifierM8003paddingFrom4j6BHR0$default;
        Modifier modifierM8003paddingFrom4j6BHR0$default2;
        C2046Dp.Companion companion = C2046Dp.INSTANCE;
        if (!C2046Dp.m13671equalsimpl0(f, companion.m13686getUnspecifiedD9Ej5fM())) {
            modifierM8003paddingFrom4j6BHR0$default = m8003paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p003ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null);
        } else {
            modifierM8003paddingFrom4j6BHR0$default = Modifier.INSTANCE;
        }
        Modifier modifierThen = modifier.then(modifierM8003paddingFrom4j6BHR0$default);
        if (!C2046Dp.m13671equalsimpl0(f2, companion.m13686getUnspecifiedD9Ej5fM())) {
            modifierM8003paddingFrom4j6BHR0$default2 = m8003paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.p003ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null);
        } else {
            modifierM8003paddingFrom4j6BHR0$default2 = Modifier.INSTANCE;
        }
        return modifierThen.then(modifierM8003paddingFrom4j6BHR0$default2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default */
    public static /* synthetic */ Modifier m8009paddingFromBaselinewCyjxdI$default(Modifier modifier, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE();
        }
        if ((i & 2) != 0) {
            j2 = TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE();
        }
        return m8008paddingFromBaselinewCyjxdI(modifier, j, j2);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-wCyjxdI */
    public static final Modifier m8008paddingFromBaselinewCyjxdI(@NotNull Modifier modifier, long j, long j2) {
        return modifier.then(!TextUnitKt.m13875isUnspecifiedR2X_6o(j) ? m8005paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p003ui.layout.AlignmentLineKt.getFirstBaseline(), j, 0L, 4, null) : Modifier.INSTANCE).then(!TextUnitKt.m13875isUnspecifiedR2X_6o(j2) ? m8005paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.p003ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j2, 2, null) : Modifier.INSTANCE);
    }

    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA */
    public static final MeasureResult m8001alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f, float f2, Measurable measurable, long j) {
        int iMax;
        int height;
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null) : Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        int i = placeableMo12610measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height2 = getHorizontal(alignmentLine) ? placeableMo12610measureBRTryo0.getHeight() : placeableMo12610measureBRTryo0.getWidth();
        int iM13621getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m13621getMaxHeightimpl(j) : Constraints.m13622getMaxWidthimpl(j);
        C2046Dp.Companion companion = C2046Dp.INSTANCE;
        int i2 = iM13621getMaxHeightimpl - height2;
        final int iCoerceIn = RangesKt___RangesKt.coerceIn((!C2046Dp.m13671equalsimpl0(f, companion.m13686getUnspecifiedD9Ej5fM()) ? measureScope.mo7868roundToPx0680j_4(f) : 0) - i, 0, i2);
        final int iCoerceIn2 = RangesKt___RangesKt.coerceIn(((!C2046Dp.m13671equalsimpl0(f2, companion.m13686getUnspecifiedD9Ej5fM()) ? measureScope.mo7868roundToPx0680j_4(f2) : 0) - height2) + i, 0, i2 - iCoerceIn);
        if (getHorizontal(alignmentLine)) {
            iMax = placeableMo12610measureBRTryo0.getWidth();
        } else {
            iMax = Math.max(placeableMo12610measureBRTryo0.getWidth() + iCoerceIn + iCoerceIn2, Constraints.m13624getMinWidthimpl(j));
        }
        final int i3 = iMax;
        if (getHorizontal(alignmentLine)) {
            height = Math.max(placeableMo12610measureBRTryo0.getHeight() + iCoerceIn + iCoerceIn2, Constraints.m13623getMinHeightimpl(j));
        } else {
            height = placeableMo12610measureBRTryo0.getHeight();
        }
        final int i4 = height;
        return MeasureScope.layout$default(measureScope, i3, i4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
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
                int width;
                int height3 = 0;
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width = 0;
                } else {
                    width = !C2046Dp.m13671equalsimpl0(f, C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM()) ? iCoerceIn : (i3 - iCoerceIn2) - placeableMo12610measureBRTryo0.getWidth();
                }
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    height3 = !C2046Dp.m13671equalsimpl0(f, C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM()) ? iCoerceIn : (i4 - iCoerceIn2) - placeableMo12610measureBRTryo0.getHeight();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, width, height3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }
}
