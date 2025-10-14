package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Layout.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JE\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u00182\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0002\b\u001eH\u0016J\u0017\u0010\u001f\u001a\u00020\u0015*\u00020 H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u001f\u001a\u00020\u0015*\u00020#H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020 *\u00020#H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010&\u001a\u00020 *\u00020\bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010&\u001a\u00020 *\u00020\u0015H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010+J\u0017\u0010,\u001a\u00020-*\u00020.H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b*\u00020 H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010*J\u0017\u00101\u001a\u00020\b*\u00020#H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010(J\r\u00104\u001a\u000205*\u000206H\u0097\u0001J\u0017\u00107\u001a\u00020.*\u00020-H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00100J\u0017\u00109\u001a\u00020#*\u00020 H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001a\u00109\u001a\u00020#*\u00020\bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010;J\u001a\u00109\u001a\u00020#*\u00020\u0015H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, m7105d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "isLookingAhead", "", "()Z", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", TtmlNode.TAG_LAYOUT, "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/IntrinsicsMeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,390:1\n120#2,5:391\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/IntrinsicsMeasureScope\n*L\n375#1:391,5\n*E\n"})
/* loaded from: classes2.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ IntrinsicMeasureScope $$delegate_0;

    @NotNull
    private final LayoutDirection layoutDirection;

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p003ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo7867roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo7867roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo7868roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo7868roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo7869toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo7869toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo7870toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo7870toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo7871toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo7871toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo7872toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo7872toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo7873toPxR2X_6o(long j) {
        return this.$$delegate_0.mo7873toPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo7874toPx0680j_4(float f) {
        return this.$$delegate_0.mo7874toPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo7875toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo7875toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p003ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo7876toSp0xMU5do(float f) {
        return this.$$delegate_0.mo7876toSp0xMU5do(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo7877toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo7877toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo7878toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo7878toSpkPz2Gy4(i);
    }

    public IntrinsicsMeasureScope(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = intrinsicMeasureScope;
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.p003ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int i, int i2, @NotNull Map<AlignmentLine, Integer> map, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1) {
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 0);
        int iCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(i2, 0);
        if ((iCoerceAtLeast & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & iCoerceAtLeast2) == 0) {
            return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope.layout.1
                final /* synthetic */ Map<AlignmentLine, Integer> $alignmentLines;

                /* renamed from: $h */
                final /* synthetic */ int f164$h;

                /* renamed from: $w */
                final /* synthetic */ int f165$w;

                @Override // androidx.compose.p003ui.layout.MeasureResult
                public void placeChildren() {
                }

                public C18821(int iCoerceAtLeast3, int iCoerceAtLeast22, Map<AlignmentLine, Integer> map2) {
                    i = iCoerceAtLeast3;
                    i = iCoerceAtLeast22;
                    map = map2;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                /* renamed from: getWidth, reason: from getter */
                public int getF165$w() {
                    return i;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                /* renamed from: getHeight, reason: from getter */
                public int getF164$h() {
                    return i;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                @NotNull
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }
            };
        }
        throw new IllegalStateException(("Size(" + iCoerceAtLeast3 + " x " + iCoerceAtLeast22 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    /* compiled from: Layout.kt */
    @Metadata(m7104d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, m7105d2 = {"androidx/compose/ui/layout/IntrinsicsMeasureScope$layout$1", "Landroidx/compose/ui/layout/MeasureResult;", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getAlignmentLines", "()Ljava/util/Map;", "height", "getHeight", "()I", "width", "getWidth", "placeChildren", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.ui.layout.IntrinsicsMeasureScope$layout$1 */
    /* loaded from: classes.dex */
    public static final class C18821 implements MeasureResult {
        final /* synthetic */ Map<AlignmentLine, Integer> $alignmentLines;

        /* renamed from: $h */
        final /* synthetic */ int f164$h;

        /* renamed from: $w */
        final /* synthetic */ int f165$w;

        @Override // androidx.compose.p003ui.layout.MeasureResult
        public void placeChildren() {
        }

        public C18821(int iCoerceAtLeast3, int iCoerceAtLeast22, Map<AlignmentLine, Integer> map2) {
            i = iCoerceAtLeast3;
            i = iCoerceAtLeast22;
            map = map2;
        }

        @Override // androidx.compose.p003ui.layout.MeasureResult
        /* renamed from: getWidth, reason: from getter */
        public int getF165$w() {
            return i;
        }

        @Override // androidx.compose.p003ui.layout.MeasureResult
        /* renamed from: getHeight, reason: from getter */
        public int getF164$h() {
            return i;
        }

        @Override // androidx.compose.p003ui.layout.MeasureResult
        @NotNull
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return map;
        }
    }
}
