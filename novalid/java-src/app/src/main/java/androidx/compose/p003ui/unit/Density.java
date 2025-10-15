package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Density.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0017J\u0016\u0010 \u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001a\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, m7105d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,141:1\n1#2:142\n174#3:143\n174#3:144\n473#3:145\n152#4:146\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n92#1:143\n102#1:144\n125#1:145\n135#1:146\n*E\n"})
/* loaded from: classes4.dex */
public interface Density extends FontScaling {
    float getDensity();

    /* compiled from: Density.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA */
        public static float m13654toDpGaN1DYA(@NotNull Density density, long j) {
            return Density.super.mo7869toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do */
        public static long m13661toSp0xMU5do(@NotNull Density density, float f) {
            return Density.super.mo7876toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4 */
        public static float m13659toPx0680j_4(@NotNull Density density, float f) {
            return Density.super.mo7874toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4 */
        public static int m13653roundToPx0680j_4(@NotNull Density density, float f) {
            return Density.super.mo7868roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o */
        public static float m13658toPxR2X_6o(@NotNull Density density, long j) {
            return Density.super.mo7873toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o */
        public static int m13652roundToPxR2X_6o(@NotNull Density density, long j) {
            return Density.super.mo7867roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m13656toDpu2uoSUM(@NotNull Density density, int i) {
            return Density.super.mo7871toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m13663toSpkPz2Gy4(@NotNull Density density, int i) {
            return Density.super.mo7878toSpkPz2Gy4(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m13655toDpu2uoSUM(@NotNull Density density, float f) {
            return Density.super.mo7870toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m13662toSpkPz2Gy4(@NotNull Density density, float f) {
            return Density.super.mo7877toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull Density density, @NotNull DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ */
        public static long m13660toSizeXkaWNTQ(@NotNull Density density, long j) {
            return Density.super.mo7875toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM */
        public static long m13657toDpSizekrfVVM(@NotNull Density density, long j) {
            return Density.super.mo7872toDpSizekrfVVM(j);
        }
    }

    @Stable
    /* renamed from: toPx-0680j_4 */
    default float mo7874toPx0680j_4(float f) {
        return f * getDensity();
    }

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    default int mo7868roundToPx0680j_4(float f) {
        float fMo7874toPx0680j_4 = mo7874toPx0680j_4(f);
        if (Float.isInfinite(fMo7874toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return MathKt__MathJVMKt.roundToInt(fMo7874toPx0680j_4);
    }

    @Stable
    /* renamed from: toPx--R2X_6o */
    default float mo7873toPxR2X_6o(long j) {
        if (!TextUnitType.m13885equalsimpl0(TextUnit.m13856getTypeUIouoOA(j), TextUnitType.INSTANCE.m13890getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return mo7874toPx0680j_4(mo7869toDpGaN1DYA(j));
    }

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    default int mo7867roundToPxR2X_6o(long j) {
        return MathKt__MathJVMKt.roundToInt(mo7873toPxR2X_6o(j));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo7871toDpu2uoSUM(int i) {
        return C2046Dp.m13666constructorimpl(i / getDensity());
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo7878toSpkPz2Gy4(int i) {
        return mo7876toSp0xMU5do(mo7871toDpu2uoSUM(i));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo7870toDpu2uoSUM(float f) {
        return C2046Dp.m13666constructorimpl(f / getDensity());
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo7877toSpkPz2Gy4(float f) {
        return mo7876toSp0xMU5do(mo7870toDpu2uoSUM(f));
    }

    @Stable
    @NotNull
    default Rect toRect(@NotNull DpRect dpRect) {
        return new Rect(mo7874toPx0680j_4(dpRect.m13749getLeftD9Ej5fM()), mo7874toPx0680j_4(dpRect.m13751getTopD9Ej5fM()), mo7874toPx0680j_4(dpRect.m13750getRightD9Ej5fM()), mo7874toPx0680j_4(dpRect.m13748getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo7875toSizeXkaWNTQ(long j) {
        if (j != DpSize.INSTANCE.m13773getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(mo7874toPx0680j_4(DpSize.m13764getWidthD9Ej5fM(j)), mo7874toPx0680j_4(DpSize.m13762getHeightD9Ej5fM(j)));
        }
        return Size.INSTANCE.m11176getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo7872toDpSizekrfVVM(long j) {
        if (j != Size.INSTANCE.m11176getUnspecifiedNHjbRc()) {
            return DpKt.m13688DpSizeYgX7TsA(mo7870toDpu2uoSUM(Size.m11168getWidthimpl(j)), mo7870toDpu2uoSUM(Size.m11165getHeightimpl(j)));
        }
        return DpSize.INSTANCE.m13773getUnspecifiedMYxV2XQ();
    }
}
